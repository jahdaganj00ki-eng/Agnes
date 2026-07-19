using AgnesWindows.Core.Services;
using AgnesWindows.Infrastructure;
using AgnesWindows.UI.ViewModels;
using Microsoft.Extensions.DependencyInjection;

namespace AgnesWindows.App.Services;

public static class ServiceCollectionExtensions
{
    public static IServiceCollection AddAgnesWindowsServices(this IServiceCollection services)
    {
        // Core services
        services.AddSingleton<IStorageService, LocalStorageService>();

        // Backend selection: MockBackend for dev, AgnesPublicApiClient when API key configured
        services.AddSingleton<IImageGenerationBackend>(sp =>
        {
            var config = sp.GetRequiredService<IConfiguration>();
            var loggerFactory = sp.GetRequiredService<ILoggerFactory>();

            var apiKey = config["Agnes:ApiKey"]
                         ?? Environment.GetEnvironmentVariable("AGNES_API_KEY");

            if (string.IsNullOrWhiteSpace(apiKey))
            {
                return new MockBackend(loggerFactory.CreateLogger<MockBackend>());
            }

            return new AgnesPublicApiClient(config, loggerFactory.CreateLogger<AgnesPublicApiClient>());
        });

        // ViewModels (Transient so each navigation gets fresh instance where appropriate)
        services.AddTransient<MainViewModel>();
        services.AddTransient<ChatViewModel>();
        services.AddTransient<ImageEditViewModel>();
        services.AddTransient<SkillLoadViewModel>();

        // Settings & History services
        services.AddSingleton<SettingsService>();
        services.AddSingleton<HistoryService>();

        return services;
    }
}