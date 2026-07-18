using AgnesWindows.UI.ViewModels;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Controls;

namespace AgnesWindows.UI.Views;

public sealed partial class ChatView : UserControl
{
    public ChatView()
    {
        InitializeComponent();
    }

    private void OnRetryClick(object sender, RoutedEventArgs e)
    {
        if (DataContext is ChatViewModel vm && vm.RetryCommand.CanExecute(null))
        {
            vm.RetryCommand.Execute(null);
        }
    }
}
