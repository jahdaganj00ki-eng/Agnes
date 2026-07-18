namespace AgnesWindows.Core.Services;

public class UploadResult
{
    public bool Succeeded { get; set; }
    public string? Base64Data { get; set; }
    public string? TempUrl { get; set; }
    public string? MimeType { get; set; }
    public string? Reason { get; set; }
}
