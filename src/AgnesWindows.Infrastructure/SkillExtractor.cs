using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;

namespace AgnesWindows.Infrastructure;

public class SkillExtractor : ISkillExtractor
{
    private readonly ILogger<SkillExtractor> _logger;
    private readonly string _rawPath;
    private readonly string _extractedPath;

    public SkillExtractor(ILogger<SkillExtractor> logger)
    {
        _logger = logger;
        _rawPath = Path.Combine(AppContext.BaseDirectory, "AgnesWindows.Skills", "raw");
        _extractedPath = Path.Combine(AppContext.BaseDirectory, "AgnesWindows.Skills", "extracted");
    }

    public async Task ExtractAsync(CancellationToken ct = default)
    {
        Directory.CreateDirectory(_extractedPath);

        var skillFiles = Directory.GetFiles(_rawPath, "*.md");
        if (skillFiles.Length == 0)
        {
            _logger.LogWarning("No raw skill files found in {Path}", _rawPath);
            return;
        }

        foreach (var rawFile in skillFiles)
        {
            ct.ThrowIfCancellationRequested();
            var fileName = Path.GetFileName(rawFile);
            var extractedFile = Path.Combine(_extractedPath, Path.GetFileNameWithoutExtension(fileName) + ".extracted.md");

            var content = await File.ReadAllTextAsync(rawFile, ct);
            var extracted = ExtractPromptSections(content);
            
            await File.WriteAllTextAsync(extractedFile, extracted, ct);
            _logger.LogInformation("Extracted {File} -> {Extracted} ({Chars} chars)", 
                fileName, Path.GetFileName(extractedFile), extracted.Length);
        }
    }

    private static string ExtractPromptSections(string content)
    {
        var lines = content.Split('\n');
        var relevant = new List<string>();
        var capture = false;
        var headingDepth = 0;

        foreach (var line in lines)
        {
            if (line.StartsWith("#"))
            {
                var heading = line.TrimStart('#').Trim().ToLowerInvariant();
                capture = heading.Contains("prompt") 
                          || heading.Contains("image")
                          || heading.Contains("video")
                          || heading.Contains("skill")
                          || heading.Contains("workflow")
                          || heading.Contains("guide")
                          || heading.Contains("best practice")
                          || heading.Contains("structure");
                headingDepth = line.TakeWhile(c => c == '#').Count();
            }
            else if (capture && line.StartsWith("#"))
            {
                var newHeadingDepth = line.TakeWhile(c => c == '#').Count();
                if (newHeadingDepth <= headingDepth)
                {
                    capture = false;
                }
            }

            if (capture && !string.IsNullOrWhiteSpace(line))
            {
                relevant.Add(line);
            }
        }

        return string.Join('\n', relevant);
    }
}
