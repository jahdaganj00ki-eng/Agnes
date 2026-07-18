using System.Collections.Generic;
using System.Net.Http.Headers;
using System.Text;
using System.Text.Json;
using System.Runtime.CompilerServices;
using AgnesWindows.Core.Models;
using AgnesWindows.Core.Services;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;

namespace AgnesWindows.Infrastructure;

public class AgnesPublicApiClient : IImageGenerationBackend, IDisposable
{
    private readonly HttpClient _httpClient;
    private readonly ILogger<AgnesPublicApiClient> _logger;
    private readonly string _apiKey;
    private const string BaseUrl = "https://apihub.agnes-ai.com/v1";
    private bool _disposed;

    public AgnesPublicApiClient(
        IConfiguration configuration,
        ILogger<AgnesPublicApiClient> logger)
    {
        _logger = logger ?? throw new ArgumentNullException(nameof(logger));
        _httpClient = new HttpClient();
        
        _apiKey = configuration["Agnes:ApiKey"] 
                  ?? Environment.GetEnvironmentVariable("AGNES_API_KEY") 
                  ?? throw new InvalidOperationException("Agnes API key not configured");
        
        _httpClient.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", _apiKey);
        _httpClient.Timeout = TimeSpan.FromSeconds(120);
    }

    public async Task<ImageGenerationResult> GenerateImageAsync(
        ImageGenerationRequest request,
        CancellationToken ct = default)
    {
        try
        {
            var payload = new
            {
                model = request.Model,
                prompt = request.Prompt,
                size = MapAspectRatioToSize(request.AspectRatio),
                ratio = NormalizeAspectRatio(request.AspectRatio),
                extra_body = new
                {
                    image = request.InputImageBase64 != null 
                        ? new[] { $"data:image/png;base64,{request.InputImageBase64}" } 
                        : (request.InputImageUrl != null ? new[] { request.InputImageUrl } : null),
                    response_format = request.ResponseFormat ?? "url"
                }
            };

            var json = JsonSerializer.Serialize(payload);
            using var httpContent = new StringContent(json, Encoding.UTF8, "application/json");

            using var response = await _httpClient.PostAsync($"{BaseUrl}/images/generations", httpContent, ct);
            var responseBody = await response.Content.ReadAsStringAsync(ct);

            if (!response.IsSuccessStatusCode)
            {
                _logger.LogError("Image generation failed: {Status} - {Body}", response.StatusCode, responseBody);
                return new ImageGenerationResult
                {
                    Success = false,
                    ErrorMessage = $"API error {response.StatusCode}: {responseBody}"
                };
            }

            using var doc = JsonDocument.Parse(responseBody);
            var data = doc.RootElement.GetProperty("data");
            var first = data.EnumerateArray().FirstOrDefault();
            
            var result = new ImageGenerationResult
            {
                Success = true,
                RevisedPrompt = first.TryGetProperty("revised_prompt", out var rp) ? rp.GetString() : null
            };

            if (first.TryGetProperty("url", out var url))
            {
                result.ImageUrl = url.GetString();
            }
            else if (first.TryGetProperty("b64_json", out var b64))
            {
                result.Base64Data = b64.GetString();
            }

            return result;
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Image generation exception");
            return new ImageGenerationResult
            {
                Success = false,
                ErrorMessage = ex.Message
            };
        }
    }

    public async Task<string> EnhancePromptAsync(
        string originalPrompt,
        IReadOnlyList<string> skillContents,
        bool isImageToImage,
        CancellationToken ct = default)
    {
        try
        {
            var skillContent = string.Join("\n\n", skillContents);
            var systemPrompt = $"""
                {skillContent}

                Enhance the following image edit prompt using the structures and best practices defined above.
                Follow the exact format: [Subject] + [Scene/Environment] + [Style] + [Lighting] + [Composition] + [Quality Requirements].
                For image-to-image, also include: [What to change] + [What to preserve].
                Return only the enhanced prompt, no explanations.
                """;

            var payload = new
            {
                model = "agnes-2.0-flash",
                messages = new object[]
                {
                    new { role = "system", content = systemPrompt },
                    new { role = "user", content = originalPrompt }
                }
            };

            var json = JsonSerializer.Serialize(payload);
            using var httpContent = new StringContent(json, Encoding.UTF8, "application/json");

            using var response = await _httpClient.PostAsync($"{BaseUrl}/chat/completions", httpContent, ct);
            var responseBody = await response.Content.ReadAsStringAsync(ct);

            if (!response.IsSuccessStatusCode)
            {
                _logger.LogError("Prompt enhancement failed: {Status} - {Body}", response.StatusCode, responseBody);
                return originalPrompt;
            }

            using var doc = JsonDocument.Parse(responseBody);
            var content = doc.RootElement
                .GetProperty("choices")[0]
                .GetProperty("message")
                .GetProperty("content")
                .GetString();

            return content ?? originalPrompt;
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Prompt enhancement exception");
            return originalPrompt;
        }
    }

    public async IAsyncEnumerable<SkillLoadEvent> LoadSkillsAsync([EnumeratorCancellation] CancellationToken ct = default)
    {
        var skillFiles = new[]
        {
            ("AgnesGenerationSkill.extracted.md", "aigc-model-guide"),
            ("AgnesCliSkill.extracted.md", "image-prompt-craft"),
            ("VisionCraftPromptGuide.extracted.md", "image-generation")
        };

        foreach (var (fileName, skillName) in skillFiles)
        {
            ct.ThrowIfCancellationRequested();
            var start = DateTime.UtcNow;
            
            await Task.Delay(Random.Shared.Next(50, 200), ct);
            
            SkillLoadEvent result;
            try
            {
                var content = await File.ReadAllTextAsync(Path.Combine("AgnesWindows.Skills", "extracted", fileName), ct);
                result = new SkillLoadEvent
                {
                    SkillPath = skillName,
                    CharCount = content.Length,
                    IsLoaded = true,
                    LoadDuration = DateTime.UtcNow - start
                };
            }
            catch (Exception ex)
            {
                _logger.LogWarning(ex, "Failed to load skill {Skill}", skillName);
                result = new SkillLoadEvent
                {
                    SkillPath = skillName,
                    CharCount = 0,
                    IsLoaded = false,
                    ErrorMessage = ex.Message,
                    LoadDuration = DateTime.UtcNow - start
                };
            }
            yield return result;
        }
    }

    private static string MapAspectRatioToSize(string ratio)
    {
        return ratio switch
        {
            "16:9" => "1024x576",
            "9:16" => "576x1024",
            "4:3" => "1024x768",
            "3:4" => "768x1024",
            "3:2" => "1024x683",
            "21:9" => "1024x439",
            _ => "1024x1024"
        };
    }

    private static string NormalizeAspectRatio(string ratio)
    {
        return ratio.Replace("x", ":").Replace("X", ":");
    }

    public void Dispose()
    {
        if (!_disposed)
        {
            _httpClient?.Dispose();
            _disposed = true;
        }
        GC.SuppressFinalize(this);
    }
}
