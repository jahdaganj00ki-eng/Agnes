namespace AgnesWindows.Core.Models;

public class ImageGenerationResult
{
    public bool Success { get; set; }
    public string? ImageUrl { get; set; }
    public string? Base64Data { get; set; }
    public string? RevisedPrompt { get; set; }
    public string? ErrorMessage { get; set; }
    public DateTime CreatedAt { get; set; } = DateTime.UtcNow;
}
