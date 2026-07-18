namespace AgnesWindows.Core.Services;

public interface IStorageService
{
    Task<string?> GetApiKeyAsync(CancellationToken ct = default);
    Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default);
    Task<string> GetImagesDirectoryAsync(CancellationToken ct = default);
    Task SaveGeneratedImageAsync(string fileName, byte[] imageData, CancellationToken ct = default);
    Task<string?> LoadSettingsAsync(CancellationToken ct = default);
    Task SaveSettingsAsync(string settingsJson, CancellationToken ct = default);
}
