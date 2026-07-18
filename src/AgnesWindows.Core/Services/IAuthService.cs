namespace AgnesWindows.Core.Services;

public interface IAuthService
{
    Task<string?> GetApiKeyAsync(CancellationToken ct = default);
    Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default);
}
