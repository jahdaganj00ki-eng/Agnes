using AgnesWindows.Core.Enums;
using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;

namespace AgnesWindows.UI.ViewModels;

public partial class MainViewModel : ObservableObject
{
    [ObservableProperty]
    private EditImageState _currentState = EditImageState.Idle;

    [ObservableProperty]
    private string _statusText = "Ready";

    [ObservableProperty]
    private bool _isLoading;

    [ObservableProperty]
    private string _apiKey = string.Empty;

    public MainViewModel()
    {
    }

    [RelayCommand]
    private async Task InitializeAsync()
    {
        IsLoading = true;
        StatusText = "Initializing...";
        
        await Task.Delay(100);
        
        IsLoading = false;
        StatusText = "Ready";
        CurrentState = EditImageState.Idle;
    }
}
