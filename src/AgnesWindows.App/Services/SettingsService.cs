using Microsoft.Extensions.Configuration;
using System.IO;

namespace AgnesWindows.App;

public class SettingsService
{
    private readonly IConfiguration _configuration;
    private readonly string _settingsFilePath;

    public string ApiKey
    {
        get => _configuration["Agnes:ApiKey"] ?? Environment.GetEnvironmentVariable("AGNES_API_KEY") ?? string.Empty;
        set
        {
            _configuration["Agnes:ApiKey"] = value;
            Save();
        }
    }

    public string SelectedAspectRatio
    {
        get => _configuration["UI:AspectRatio"] ?? "1:1";
        set
        {
            _configuration["UI:AspectRatio"] = value;
            Save();
        }
    }

    public string Theme
    {
        get => _configuration["UI:Theme"] ?? "Dark";
        set
        {
            _configuration["UI:Theme"] = value;
            Save();
        }
    }

    public bool AutoSaveResults
    {
        get => bool.TryParse(_configuration["UI:AutoSaveResults"], out var v) && v;
        set
        {
            _configuration["UI:AutoSaveResults"] = value.ToString();
            Save();
        }
    }

    public SettingsService(IConfiguration configuration)
    {
        _configuration = configuration;
        _settingsFilePath = Path.Combine(
            Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData),
            "AgnesWindows",
            "settings.json");

        Load();
    }

    private void Load()
    {
        if (File.Exists(_settingsFilePath))
        {
            var json = File.ReadAllText(_settingsFilePath);
            var dict = System.Text.Json.JsonSerializer.Deserialize<Dictionary<string, string>>(json);
            if (dict != null)
            {
                foreach (var kvp in dict)
                {
                    _configuration[kvp.Key] = kvp.Value;
                }
            }
        }
    }

    public void Save()
    {
        var dict = new Dictionary<string, string>
        {
            ["Agnes:ApiKey"] = ApiKey,
            ["UI:AspectRatio"] = SelectedAspectRatio,
            ["UI:Theme"] = Theme,
            ["UI:AutoSaveResults"] = AutoSaveResults.ToString()
        };

        var dir = Path.GetDirectoryName(_settingsFilePath);
        if (!string.IsNullOrEmpty(dir))
            Directory.CreateDirectory(dir);

        var json = System.Text.Json.JsonSerializer.Serialize(dict, new System.Text.Json.JsonSerializerOptions
        {
            WriteIndented = true
        });
        File.WriteAllText(_settingsFilePath, json);
    }
}