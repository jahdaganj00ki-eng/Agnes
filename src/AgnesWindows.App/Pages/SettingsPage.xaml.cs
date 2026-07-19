using Microsoft.UI.Xaml.Controls;
using Microsoft.UI.Xaml;

namespace AgnesWindows.App.Pages;

public sealed partial class SettingsPage : Page
{
    public SettingsPage()
    {
        this.InitializeComponent();
    }

    private void OnSaveClick(object sender, RoutedEventArgs e)
    {
        // Settings are saved via ViewModel binding
        // Show a brief confirmation
        var tooltip = new ToolTip { Content = "Saved!", Placement = Microsoft.UI.Xaml.Controls.Primitives.PlacementMode.Bottom };
        ToolTipService.SetToolTip((Button)sender, tooltip);
        tooltip.IsOpen = true;
        
        // Auto-close after 1.5s
        var timer = new DispatcherTimer { Interval = TimeSpan.FromSeconds(1.5) };
        timer.Tick += (s, e) => { tooltip.IsOpen = false; timer.Stop(); };
        timer.Start();
    }
}