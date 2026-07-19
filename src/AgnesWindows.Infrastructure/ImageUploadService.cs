using System.Drawing;
using System.Drawing.Imaging;
using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System.Runtime.Versioning;

namespace AgnesWindows.Infrastructure;

[SupportedOSPlatform("windows")]
public class ImageUploadService : IImageUploadService
{
    private readonly ILogger<ImageUploadService> _logger;
    private const long MaxBase64SizeBytes = 4 * 1024 * 1024; // 4MB

    public ImageUploadService(ILogger<ImageUploadService> logger)
    {
        _logger = logger;
    }

    public Task<UploadResult> TryConvertToBase64Async(string filePath, CancellationToken ct = default)
    {
        try
        {
            var fileInfo = new FileInfo(filePath);
            if (fileInfo.Length > MaxBase64SizeBytes)
            {
                return Task.FromResult(new UploadResult { Succeeded = false, Reason = "File too large for Base64" });
            }

            byte[] imageBytes;
            using (var stream = new MemoryStream())
            using (var image = Image.FromFile(filePath))
            {
                image.Save(stream, ImageFormat.Png);
                imageBytes = stream.ToArray();
            }

            var base64 = Convert.ToBase64String(imageBytes);
            return Task.FromResult(new UploadResult
            {
                Succeeded = true,
                Base64Data = base64,
                MimeType = "image/png"
            });
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Failed to convert image to Base64");
            return Task.FromResult(new UploadResult { Succeeded = false, Reason = ex.Message });
        }
    }

    public async Task<string?> UploadToTempUrlAsync(string filePath, CancellationToken ct = default)
    {
        _logger.LogWarning("Temp URL upload not yet implemented. Consider implementing with Azure Blob Storage or similar.");
        await Task.CompletedTask;
        return null;
    }
}