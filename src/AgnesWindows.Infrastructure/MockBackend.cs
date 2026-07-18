using AgnesWindows.Core.Models;
using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System.Runtime.CompilerServices;

namespace AgnesWindows.Infrastructure;

public class MockBackend : IImageGenerationBackend
{
    private readonly ILogger<MockBackend> _logger;

    public MockBackend(ILogger<MockBackend> logger)
    {
        _logger = logger;
    }

    public async Task<ImageGenerationResult> GenerateImageAsync(
        ImageGenerationRequest request,
        CancellationToken ct = default)
    {
        _logger.LogInformation("Mock generating image for prompt: {Prompt}", request.Prompt);
        await Task.Delay(2000, ct);
        
        return new ImageGenerationResult
        {
            Success = true,
            ImageUrl = "https://placehold.co/1024x1024/000000/FFF?text=Mock+Result",
            RevisedPrompt = "Enhanced: " + request.Prompt
        };
    }

    public async Task<string> EnhancePromptAsync(
        string originalPrompt,
        IReadOnlyList<string> skillContents,
        bool isImageToImage,
        CancellationToken ct = default)
    {
        _logger.LogInformation("Mock enhancing prompt: {Prompt}", originalPrompt);
        await Task.Delay(500, ct);
        return $"[Enhanced] {originalPrompt}";
    }

    public async IAsyncEnumerable<SkillLoadEvent> LoadSkillsAsync([EnumeratorCancellation] CancellationToken ct = default)
    {
        var skills = new[]
        {
            ("aigc-model-guide", 8748),
            ("image-prompt-craft", 15387),
            ("image-generation", 8078)
        };

        foreach (var (name, chars) in skills)
        {
            ct.ThrowIfCancellationRequested();
            await Task.Delay(100, ct);
            yield return new SkillLoadEvent
            {
                SkillPath = name,
                CharCount = chars,
                IsLoaded = true,
                LoadDuration = TimeSpan.FromMilliseconds(100)
            };
        }
    }
}
