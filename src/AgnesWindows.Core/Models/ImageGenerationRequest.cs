namespace AgnesWindows.Core.Models;

public class ImageGenerationRequest
{
    public string Prompt { get; set; } = string.Empty;
    public string? InputImageBase64 { get; set; }
    public string? InputImageUrl { get; set; }
    public string AspectRatio { get; set; } = "1:1";
    public string Model { get; set; } = "agnes-image-2.1-flash";
    public string? ResponseFormat { get; set; } = "url";
}
