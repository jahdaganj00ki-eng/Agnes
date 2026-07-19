using AgnesWindows.Core.Services;
using AgnesWindows.Infrastructure;
using AgnesWindows.UI.ViewModels;
using CommunityToolkit.Mvvm.DependencyInjection;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Controls;
using Microsoft.Windows.AppLifecycle;
using System;
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

        // Get ChatViewModel from DI container
        _chatViewModel = Ioc.Default.GetRequiredService<ChatViewModel>();

        // Set the frame's DataContext to the ChatViewModel for the Edit page
        ContentFrame.Navigated += ContentFrame_Navigated;

        // Navigate to Edit page by default
        ContentFrame.Navigate(typeof(Pages.EditImagePage));
    }

    private void ContentFrame_Navigated(object sender, NavigationEventArgs e)
    {
        // Pass the ChatViewModel to pages that need it
        if (e.Content is FrameworkElement element)
        {
            element.DataContext = Ioc.Default.GetRequiredService<ChatViewModel>();
        }
    }

    private void NavigationView_SelectionChanged(NavigationView sender, NavigationViewSelectionChangedEventArgs args)
    {
        if (args.SelectedItem is NavigationViewItem item)
        {
            var tag = item.Tag?.ToString();
            switch (tag)
            {
                case "Edit":
                    ContentFrame.Navigate(typeof(Pages.EditImagePage));
                    break;
                case "History":
                    ContentFrame.Navigate(typeof(Pages.HistoryPage));
                    break;
                case "Settings":
                    ContentFrame.Navigate(typeof(Pages.SettingsPage));
                    break;
            }
        }
    }

    private void OnPromptKeyDown(object sender, Microsoft.UI.Xaml.Input.KeyRoutedEventArgs e)
    {
        if (e.Key == Windows.System.VirtualKey.Enter && !e.KeyStatus.IsShiftDown)
        {
            e.Handled = true;
            OnSendClick(sender, null);
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
        WinRT.Interop.InitializeWithWindow.Initialize(picker, hwnd);

        var file = await picker.PickSingleFileAsync();
        if (file != null)
        {
            // Get the ChatViewModel from DI (same instance)
            var chatVM = Ioc.Default.GetRequiredService<ChatViewModel>();
            chatVM.InputImagePath = file.Path;
        }
    }

    private void OnSendClick(object sender, RoutedEventArgs e)
    {
        var chatVM = Ioc.Default.GetRequiredService<ChatViewModel>();
        if (chatVM.SubmitCommand.CanExecute(null))
        {
            chatVM.SubmitCommand.Execute(null);
        }
    }
}