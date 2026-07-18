using AgnesWindows.Core.Services;
using AgnesWindows.Infrastructure;
using AgnesWindows.UI.ViewModels;
using CommunityToolkit.Mvvm.DependencyInjection;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Controls;
using Microsoft.Windows.AppLifecycle;
using Windows.Win32;
using Windows.Win32.Foundation;
using Windows.Win32.UI.WindowsAndMessaging;

namespace AgnesWindows.App;

public partial class MainWindow : Window
{
    private readonly ChatViewModel _chatViewModel;

    public MainWindow()
    {
        InitializeComponent();
        
        _chatViewModel = new ChatViewModel(
            new AgnesPublicApiClient(
                GetConfiguration(),
                new Infrastructure.LoggerFactory().CreateLogger<AgnesPublicApiClient>()),
            new LocalStorageService(
                new Infrastructure.LoggerFactory().CreateLogger<LocalStorageService>()));

        DataContext = _chatViewModel;
    }

    private static Microsoft.Extensions.Configuration.IConfiguration GetConfiguration()
    {
        return new Microsoft.Extensions.Configuration.ConfigurationBuilder()
            .AddJsonFile("appsettings.json", optional: true)
            .AddEnvironmentVariables()
            .Build();
    }

    private void OnSendClick(object sender, RoutedEventArgs e)
    {
        if (_chatViewModel.SubmitCommand.CanExecute(null))
        {
            _chatViewModel.SubmitCommand.Execute(null);
        }
    }

    private async void OnAttachImageClick(object sender, RoutedEventArgs e)
    {
        var picker = new FileOpenPicker();
        picker.FileTypeFilter.Add(".jpg");
        picker.FileTypeFilter.Add(".jpeg");
        picker.FileTypeFilter.Add(".png");
        picker.FileTypeFilter.Add(".bmp");

        var hwnd = Win32Interop.GetWindowFromWindowId(AppInstance.GetCurrent().GetWindow().Id);
        InitializeWithWindow.Initialize(picker, hwnd);

        var file = await picker.PickSingleFileAsync();
        if (file != null)
        {
            _chatViewModel.InputImagePath = file.Path;
        }
    }
}
