namespace AgnesWindows.Core.Services;

public interface IImageUploadService
{
    Task<UploadResult> TryConvertToBase64Async(string filePath, CancellationToken ct = default);
    Task<string?> UploadToTempUrlAsync(string filePath, CancellationToken ct = default);
}
