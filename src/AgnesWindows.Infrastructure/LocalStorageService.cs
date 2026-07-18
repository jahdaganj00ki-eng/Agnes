using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System;
using System.IO;
using Windows.Security.Credentials;

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
        if (OperatingSystem.IsWindows())
        {
            try
            {
                var vault = new Windows.Security.Credentials.PasswordVault();
                var credential = vault.Retrieve("AgnesWindows.ApiKey", "AgnesWindowsUser");
                return Task.FromResult<string?>(credential?.Password);
            }
            catch
            {
                return Task.FromResult<string?>(null);
            }
        }

        // On non-Windows, fall back to environment variable
        return Task.FromResult<string?>(Environment.GetEnvironmentVariable("AGNES_API_KEY"));
    }

    public Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default)
    {
        if (OperatingSystem.IsWindows())
        {
            try
            {
                var vault = new Windows.Security.Credentials.PasswordVault();
                vault.Add(new Windows.Security.Credentials.PasswordCredential("AgnesWindows.ApiKey", "AgnesWindowsUser", apiKey));
                return Task.CompletedTask;
            }
            catch (Exception ex)
            {
                throw;
            }
        }

        // On non-Windows, just log (user should set env var manually)
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