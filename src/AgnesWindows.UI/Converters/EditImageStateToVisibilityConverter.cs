using AgnesWindows.Core.Enums;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Data;

namespace AgnesWindows.UI.Converters;

public class EditImageStateToVisibilityConverter : IValueConverter
{
    public object Convert(object value, Type targetType, object parameter, string language)
    {
        if (value is EditImageState state && parameter is string param)
        {
            return state.ToString() == param ? Visibility.Visible : Visibility.Collapsed;
        }
        return Visibility.Collapsed;
    }

    public object ConvertBack(object value, Type targetType, object parameter, string language)
    {
        throw new NotImplementedException();
    }
}
