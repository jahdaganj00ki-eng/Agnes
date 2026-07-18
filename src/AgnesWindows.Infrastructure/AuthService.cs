using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System;
using Windows.Security.Credentials;

namespace AgnesWindows.Infrastructure;

public class AuthService : IAuthService
{
    private readonly ILogger<AuthService> _logger;
    private const string CredentialResource = "AgnesWindows.ApiKey";
    private const string CredentialUserName = "AgnesWindowsUser";

    public AuthService(ILogger<AuthService> logger)
    {
        _logger = logger;
    }

    public async Task<string?> GetApiKeyAsync(CancellationToken ct = default)
    {
        try
        {
            if (OperatingSystem.IsWindows())
            {
                var vault = new Windows.Security.Credentials.PasswordVault();
                var credentials = vault.Retrieve(Resource: CredentialResource, UserName: CredentialUserName);
                return await Task.FromResult(credentials?.Password);
            }
            
            // On non-Windows platforms, fall back to environment variable
            return await Task.FromResult(Environment.GetEnvironmentVariable("AGNES_API_KEY"));
        }
        catch (Exception ex)
        {
            _logger.LogWarning(ex, "Failed to retrieve API key from Credential Manager");
            return null;
        }
    }

    public async Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default)
    {
        try
        {
            if (OperatingSystem.IsWindows())
            {
                var vault = new Windows.Security.Credentials.PasswordVault();
                vault.Add(new Windows.Security.Credentials.PasswordCredential(Resource: CredentialResource, UserName: CredentialUserName, Password: apiKey));
                await Task.CompletedTask;
            }
            else
            {
                // On non-Windows, just log (user should set env var manually)
                _logger.LogInformation("API key saved (non-Windows: set AGNES_API_KEY env var manually)");
                await Task.CompletedTask;
            }
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Failed to save API key to Credential Manager");
            throw;
        }
    }
}