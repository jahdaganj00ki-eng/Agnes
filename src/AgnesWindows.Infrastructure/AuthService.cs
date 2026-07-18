using AgnesWindows.Core.Services;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
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
            var vault = new PasswordVault();
            var credentials = vault.Retrieve(Resource: CredentialResource, UserName: CredentialUserName);
            return await Task.FromResult(credentials?.Password);
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
            var vault = new PasswordVault();
            vault.Add(new PasswordCredential(Resource: CredentialResource, UserName: CredentialUserName, Password: apiKey));
            await Task.CompletedTask;
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Failed to save API key to Credential Manager");
            throw;
        }
    }
}
