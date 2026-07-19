using AgnesWindows.UI.ViewModels;
using CommunityToolkit.Mvvm.DependencyInjection;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using Microsoft.UI.Xaml;

namespace AgnesWindows.App;

public partial class App : Application
{
    private Window? _window;
    public static IServiceProvider Services { get; private set; } = null!;
    public static IConfiguration Configuration { get; private set; } = null!;

    public App()
    {
        InitializeComponent();
        InitializeServices();
    }

    private void InitializeServices()
    {
        var serviceCollection = new ServiceCollection();

        // Configuration
        var configBuilder = new ConfigurationBuilder()
            .AddJsonFile("appsettings.json", optional: true, reloadOnChange: true)
            .AddEnvironmentVariables();

        Configuration = configBuilder.Build();
        serviceCollection.AddSingleton(Configuration);
        serviceCollection.AddSingleton<IConfiguration>(Configuration);

        // Logging
        serviceCollection.AddLogging(builder =>
        {
            builder.AddDebug();
            builder.AddConsole();
        });

        // Core services
        serviceCollection.AddSingleton<IStorageService, LocalStorageService>();
        serviceCollection.AddSingleton<IAuthService, AuthService>();
        serviceCollection.AddSingleton<IImageUploadService, ImageUploadService>();
        serviceCollection.AddSingleton<ISkillExtractor, SkillExtractor>();

        // Backend selection based on API key availability
        serviceCollection.AddSingleton<IImageGenerationBackend>(sp =>
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

        // ViewModels
        serviceCollection.AddTransient<MainViewModel>();
        serviceCollection.AddTransient<ChatViewModel>();
        serviceCollection.AddTransient<ImageEditViewModel>();
        serviceCollection.AddTransient<SkillLoadViewModel>();

        // Settings & History
        serviceCollection.AddSingleton<SettingsService>();
        serviceCollection.AddSingleton<HistoryService>();

        // Build provider
        Services = serviceCollection.BuildServiceProvider();
        Ioc.Default.ConfigureServices(Services);
    }

    protected override void OnLaunched(Microsoft.UI.Xaml.LaunchActivatedEventArgs args)
    {
        _window = Services.GetRequiredService<MainWindow>();
        _window.Activate();
    }
}