using AgnesWindows.Core.Enums;
using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Media.Imaging;
using Windows.Storage.Pickers;

namespace AgnesWindows.UI.ViewModels;

public partial class ImageEditViewModel : ObservableObject
{
    private readonly ChatViewModel _chatViewModel;

    [ObservableProperty]
    private BitmapImage? _sourceImage;

    [ObservableProperty]
    private bool _hasSourceImage;

    public ImageEditViewModel(ChatViewModel chatViewModel)
    {
        _chatViewModel = chatViewModel;
    }

    [RelayCommand]
    private async Task PickImageAsync()
    {
        var picker = new FileOpenPicker();
        picker.FileTypeFilter.Add(".jpg");
        picker.FileTypeFilter.Add(".jpeg");
        picker.FileTypeFilter.Add(".png");
        picker.FileTypeFilter.Add(".bmp");

        var window = new Window();
        var hwnd = WinRT.Interop.WindowNative.GetWindowHandle(window);
        WinRT.Interop.InitializeWithWindow.Initialize(picker, hwnd);

        var file = await picker.PickSingleFileAsync();
        if (file != null)
        {
            var bitmap = new BitmapImage();
            using var stream = await file.OpenReadAsync();
            await bitmap.SetSourceAsync(stream);
            
            SourceImage = bitmap;
            HasSourceImage = true;
            _chatViewModel.InputImagePath = file.Path;
        }
    }

    [RelayCommand]
    private void ClearImage()
    {
        SourceImage = null;
        HasSourceImage = false;
        _chatViewModel.InputImagePath = null;
    }
}
