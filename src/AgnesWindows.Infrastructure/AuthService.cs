using AgnesWindows.Core.Services;
using Microsoft.Extensions.Logging;
using System;
using System.Reflection;

namespace AgnesWindows.Infrastructure;

public class AuthService : IAuthService
{
    private readonly ILogger<AuthService> _logger;
    private const string CredentialResource = "AgnesWindows.ApiKey";
    private const string CredentialUserName = "AgnesWindowsUser";
    private static readonly Type? PasswordVaultType;
    private static readonly MethodInfo? RetrieveMethod;
    private static readonly MethodInfo? AddMethod;

    static AuthService()
    {
        // Use reflection to load Windows.Security.Credentials types at runtime
        try
        {
            var windowsAssembly = Assembly.Load("Windows, Version=255.255.255.255, Culture=neutral, PublicKeyToken=null, ContentType=WindowsRuntime");
            var passwordVaultType = windowsAssembly.GetType("Windows.Security.Credentials.PasswordVault");

            if (passwordVaultType != null)
            {
                var retrieveMethod = passwordVaultType.GetMethod("Retrieve", new[] { typeof(string), typeof(string) });
                var addMethod = passwordVaultType.GetMethod("Add", new[] { typeof(object) });

                PasswordVaultType = passwordVaultType;
                RetrieveMethod = retrieveMethod;
                AddMethod = addMethod;
            }
        }
        catch
        {
            // Windows.Security.Credentials not available on this platform
        }
}

	public AuthService(ILogger<AuthService> logger)
    {
        _logger = logger;
    }

    public async Task<string?> GetApiKeyAsync(CancellationToken ct = default)
    {
        if (OperatingSystem.IsWindows() && RetrieveMethod != null)
        {
            try
            {
                var vault = Activator.CreateInstance(PasswordVaultType!);
                var credential = RetrieveMethod!.Invoke(Activator.CreateInstance(PasswordVaultType!), new object[] { CredentialResource, CredentialUserName });
                
                if (credential != null)
                {
                    var passwordProperty = credential.GetType().GetProperty("Password");
                    return await Task.FromResult(passwordProperty?.GetValue(credential) as string);
                }
            }
            catch (Exception ex)
            {
                _logger.LogWarning(ex, "Failed to retrieve API key from Credential Manager");
            }
        }

        // On non-Windows platforms, fall back to environment variable
        return await Task.FromResult(Environment.GetEnvironmentVariable("AGNES_API_KEY"));
    }

    public async Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default)
    {
        try
        {
            if (OperatingSystem.IsWindows() && AddMethod != null)
            {
                var vault = Activator.CreateInstance(PasswordVaultType!);
                
                // Use reflection to create PasswordCredential
                var windowsAssembly = Assembly.Load("Windows, Version=255.255.255.255, Culture=neutral, PublicKeyToken=null, ContentType=WindowsRuntime");
                var credentialType = windowsAssembly.GetType("Windows.Security.Credentials.PasswordCredential");
                
                if (credentialType != null)
                {
                    var credential = Activator.CreateInstance(credentialType, CredentialResource, CredentialUserName, apiKey);
                    AddMethod!.Invoke(vault, new[] { credential! });
                    await Task.CompletedTask;
                    return;
                }
            }

            // On non-Windows, just log (user should set env var manually)
            _logger.LogInformation("API key saved (non-Windows: set AGNES_API_KEY env var manually)");
        }
        catch (Exception ex)
        {
            _logger.LogError(ex, "Failed to save API key to Credential Manager");
            throw;
        }
    }
}