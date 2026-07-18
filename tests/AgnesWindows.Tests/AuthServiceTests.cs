using AgnesWindows.Core.Services;
using Xunit;

namespace AgnesWindows.Tests;

public class AuthServiceTests
{
    [Fact]
    public async Task GetApiKeyAsync_ReturnsNonEmptyString_WhenEnvironmentVariableSet()
    {
        // Set environment variable for test
        Environment.SetEnvironmentVariable("AGNES_API_KEY", "test-key-12345");

        var service = new MockAuthService();

        var result = await service.GetApiKeyAsync();

        Assert.NotNull(result);
        Assert.Equal("test-key-12345", result);

        // Cleanup
        Environment.SetEnvironmentVariable("AGNES_API_KEY", null);
    }

    [Fact]
    public async Task GetApiKeyAsync_ReturnsNull_WhenEnvironmentVariableNotSet()
    {
        Environment.SetEnvironmentVariable("AGNES_API_KEY", null);

        var service = new MockAuthService();

        var result = await service.GetApiKeyAsync();

        Assert.Null(result);
    }

    [Fact]
    public async Task SaveApiKeyAsync_SetsEnvironmentVariable()
    {
        var service = new MockAuthService();
        Environment.SetEnvironmentVariable("AGNES_API_KEY", null);

        await service.SaveApiKeyAsync("saved-key-67890");

        var stored = Environment.GetEnvironmentVariable("AGNES_API_KEY");
        Assert.Equal("saved-key-67890", stored);

        // Cleanup
        Environment.SetEnvironmentVariable("AGNES_API_KEY", null);
    }
}

/// <summary>
/// Mock implementation of IAuthService for testing without Windows dependencies.
/// </summary>
public class MockAuthService : IAuthService
{
    public Task<string?> GetApiKeyAsync(CancellationToken ct = default)
    {
        var key = Environment.GetEnvironmentVariable("AGNES_API_KEY");
        return Task.FromResult<string?>(key);
    }

    public Task SaveApiKeyAsync(string apiKey, CancellationToken ct = default)
    {
        Environment.SetEnvironmentVariable("AGNES_API_KEY", apiKey);
        return Task.CompletedTask;
    }
}