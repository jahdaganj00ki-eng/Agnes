namespace AgnesWindows.Core.Models;

public class PromptEnhancement
{
    public string OriginalPrompt { get; set; } = string.Empty;
    public string EnhancedPrompt { get; set; } = string.Empty;
    public string? EstimatedTime { get; set; }
}
