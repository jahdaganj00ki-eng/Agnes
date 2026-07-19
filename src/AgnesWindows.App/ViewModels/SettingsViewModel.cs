using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using AgnesWindows.App.Services;

namespace AgnesWindows.App.ViewModels;

public partial class SettingsViewModel : ObservableObject
{
    private readonly SettingsService _settingsService;

    [ObservableProperty]
    private bool _useMockBackend = true;

    [ObservableProperty]
    private bool _useProductionBackend;

    [ObservableProperty]
    private string _theme = "Dark";

    [ObservableProperty]
    private string _defaultAspectRatio = "1:1";

    public string[] Themes => new[] { "Light", "Dark", "System" };
    public string[] AspectRatios => new[] { "1:1 (Square)", "16:9 (Landscape)", "9:16 (Portrait)", "4:3", "3:4", "3:2", "21:9 (Ultrawide)" };

    public SettingsViewModel(SettingsService settingsService)
    {
        _settingsService = settingsService;
        LoadSettings();
    }

    partial void OnUseMockBackendChanged(bool value)
    {
        if (value) UseProductionBackend = false;
    }

    partial void OnUseProductionBackendChanged(bool value)
    {
        if (value) UseMockBackend = false;
    }

    private void LoadSettings()
    {
        UseMockBackend = string.IsNullOrWhiteSpace(_settingsService.ApiKey);
        UseProductionBackend = !UseMockBackend;
        Theme = _settingsService.Theme;
        DefaultAspectRatio = _settingsService.SelectedAspectRatio;
    }

    [RelayCommand]
    private void Save()
    {
        // Settings are saved automatically via SettingsService binding
    }
}