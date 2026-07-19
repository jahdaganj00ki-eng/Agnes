using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Data;
using System;

namespace AgnesWindows.App.Converters;

public class CountToVisibilityConverter : IValueConverter
{
    public object Convert(object value, Type targetType, object parameter, string language)
    {
        if (value is int count)
        {
            var inverse = parameter?.ToString()?.Equals("inverse", StringComparison.OrdinalIgnoreCase) ?? false;
            var visible = count > 0;
            return inverse ? (visible ? Visibility.Collapsed : Visibility.Visible) : (visible ? Visibility.Visible : Visibility.Collapsed);
        }
        return Visibility.Collapsed;
    }

    public object ConvertBack(object value, Type targetType, object parameter, string language)
    {
        throw new NotImplementedException();
    }
}

public class BoolToStringConverter : IValueConverter
{
    public object Convert(object value, Type targetType, object parameter, string language)
    {
        if (value is bool b && parameter is string param)
        {
            var parts = param.Split('|');
            return b ? (parts.Length > 0 ? parts[0] : "Yes") : (parts.Length > 1 ? parts[1] : "No");
        }
        return string.Empty;
    }

    public object ConvertBack(object value, Type targetType, object parameter, string language)
    {
        throw new NotImplementedException();
    }
}

public class EnumToBoolConverter : IValueConverter
{
    public object Convert(object value, Type targetType, object parameter, string language)
    {
        if (value is Enum enumValue && parameter is string enumString)
        {
            return enumValue.ToString() == enumString;
        }
        return false;
    }

    public object ConvertBack(object value, Type targetType, object parameter, string language)
    {
        if (value is bool b && b && parameter is string enumString)
        {
            return Enum.Parse(typeof(AppTheme), enumString);
        }
        return null!;
    }
}

public enum AppTheme
{
    Light,
    Dark,
    System
}