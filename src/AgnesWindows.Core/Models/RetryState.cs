namespace AgnesWindows.Core.Models;

public class RetryState
{
    public string OriginalPrompt { get; set; } = string.Empty;
    public string EnhancedPrompt { get; set; } = string.Empty;
    public string? InputImageBase64 { get; set; }
    public string? InputImageUrl { get; set; }
    public string AspectRatio { get; set; } = "1:1";
    public bool IsImageToImage { get; set; }
}
