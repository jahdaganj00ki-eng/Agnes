using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;

namespace AgnesWindows.Infrastructure;

public class LocalStorageService : IStorageService
{
    private readonly ILogger<LocalStorageService> _logger;
    private readonly string _appDataPath;

    public LocalStorageService(ILogger<LocalStorageService> logger)
    {
        _logger = logger;
        _appDataPath = Path.Combine(
            Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData),
            "AgnesWindows");
        
        Directory.CreateDirectory(_appDataPath);
        Directory.CreateDirectory(Path.Combine(_appDataPath, "images"));
    }

    public Task<string?> GetApiKeyAsync(CancellationToken ct = default)
    {
        var vault = new Windows.Security.Credentials.PasswordVault();
        try
        {
            var credential = vault.Retrieve("AgnesWindows.ApiKey", "AgnesWindowsUser");
            return Task.FromResult<string?>(credential?.Password);
        }
        catch
        {
            return Task.FromResult<string?>(null);
        }
    }

    public Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default)
    {
        var vault = new Windows.Security.Credentials.PasswordVault();
        vault.Add(new Windows.Security.Credentials.PasswordCredential("AgnesWindows.ApiKey", "AgnesWindowsUser", apiKey));
        return Task.CompletedTask;
    }

    public Task<string> GetImagesDirectoryAsync(CancellationToken ct = default)
    {
        var imagesDir = Path.Combine(_appDataPath, "images");
        Directory.CreateDirectory(imagesDir);
        return Task.FromResult(imagesDir);
    }

    public async Task SaveGeneratedImageAsync(string fileName, byte[] imageData, CancellationToken ct = default)
    {
        var imagesDir = await GetImagesDirectoryAsync(ct);
        var filePath = Path.Combine(imagesDir, fileName);
        await File.WriteAllBytesAsync(filePath, imageData, ct);
    }

    public async Task<string?> LoadSettingsAsync(CancellationToken ct = default)
    {
        var settingsPath = Path.Combine(_appDataPath, "settings.json");
        if (!File.Exists(settingsPath)) return null;
        return await File.ReadAllTextAsync(settingsPath, ct);
    }

    public async Task SaveSettingsAsync(string settingsJson, CancellationToken ct = default)
    {
        var settingsPath = Path.Combine(_appDataPath, "settings.json");
        await File.WriteAllTextAsync(settingsPath, settingsJson, ct);
    }
}
