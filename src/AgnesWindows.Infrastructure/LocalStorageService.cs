using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System;
using System.IO;
using System.Reflection;

namespace AgnesWindows.Infrastructure;

public class LocalStorageService : IStorageService
{
    private readonly ILogger<LocalStorageService> _logger;
    private readonly string _appDataPath;
    private static readonly Type? PasswordVaultType;
    private static readonly Type? PasswordCredentialType;
    private static readonly MethodInfo? RetrieveMethod;
    private static readonly MethodInfo? AddMethod;

    static LocalStorageService()
    {
        // Use reflection to load Windows.Security.Credentials types at runtime
        try
        {
            var windowsAssembly = Assembly.Load("Windows, Version=255.255.255.255, Culture=neutral, PublicKeyToken=null, ContentType=WindowsRuntime");
            var passwordVaultType = windowsAssembly.GetType("Windows.Security.Credentials.PasswordVault");
            var passwordCredentialType = windowsAssembly.GetType("Windows.Security.Credentials.PasswordCredential");

            if (passwordVaultType != null)
            {
                var retrieveMethod = passwordVaultType.GetMethod("Retrieve", new[] { typeof(string), typeof(string) });
                var addMethod = passwordVaultType.GetMethod("Add", new[] { typeof(object) });
                
                PasswordVaultType = passwordVaultType;
                PasswordCredentialType = null; // We'll use reflection for this too
                RetrieveMethod = retrieveMethod;
                AddMethod = addMethod;
            }
        }
        catch
        {
            // Windows.Security.Credentials not available on this platform
        }
    }

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
        if (OperatingSystem.IsWindows() && RetrieveMethod != null)
        {
            try
            {
                var vault = Activator.CreateInstance(PasswordVaultType!);
                var credential = RetrieveMethod!.Invoke(Activator.CreateInstance(PasswordVaultType!), new object[] { "AgnesWindows.ApiKey", "AgnesWindowsUser" });
                
                if (credential != null)
                {
                    var passwordProperty = credential.GetType().GetProperty("Password");
                    return Task.FromResult<string?>(passwordProperty?.GetValue(credential) as string);
                }
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
        // Use environment variable as fallback (user should set AGNES_API_KEY env var manually)
        // Windows Credential Manager integration is complex without Windows SDK reference
        // For now, just log - user should set AGNES_API_KEY env var manually
        _logger.LogInformation("API key save requested (use AGNES_API_KEY env var on non-Windows)");
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