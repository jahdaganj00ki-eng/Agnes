using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;

namespace AgnesWindows.UI.ViewModels;

public partial class SkillLoadViewModel : ObservableObject
{
    [ObservableProperty]
    private string _skillPath = string.Empty;

    [ObservableProperty]
    private int _charCount;

    [ObservableProperty]
    private bool _isLoaded;

    [ObservableProperty]
    private string? _errorMessage;

    [ObservableProperty]
    private TimeSpan _loadDuration;

    [RelayCommand]
    private void RetryLoad()
    {
        IsLoaded = false;
        ErrorMessage = null;
    }
}
