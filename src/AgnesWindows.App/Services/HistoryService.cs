using System.Collections.ObjectModel;
using AgnesWindows.Core.Models;
using System.Text.Json;

namespace AgnesWindows.App;

public class HistoryService
{
    private readonly string _historyFilePath;
    private readonly ObservableCollection<HistoryEntry> _entries = new();

    public ObservableCollection<HistoryEntry> Entries => _entries;

    public HistoryService()
    {
        _historyFilePath = Path.Combine(
            Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData),
            "AgnesWindows",
            "history.json");

        Load();
    }

    public void AddEntry(string prompt, string? enhancedPrompt, string? imageUrl, string aspectRatio, bool isImageToImage, TimeSpan generationTime)
    {
        var entry = new HistoryEntry
        {
            Id = Guid.NewGuid(),
            Timestamp = DateTime.UtcNow,
            OriginalPrompt = prompt,
            EnhancedPrompt = enhancedPrompt,
            ImageUrl = imageUrl,
            AspectRatio = aspectRatio,
            IsImageToImage = isImageToImage,
            GenerationTime = generationTime
        };

        _entries.Insert(0, entry);
        TrimToMaxEntries(100);
        Save();
    }

    public void RemoveEntry(Guid id)
    {
        var entry = _entries.FirstOrDefault(e => e.Id == id);
        if (entry != null)
        {
            _entries.Remove(entry);
            Save();
        }
    }

    public void Clear()
    {
        _entries.Clear();
        Save();
    }

    private void Load()
    {
        if (!File.Exists(_historyFilePath))
            return;

        try
        {
            var json = File.ReadAllText(_historyFilePath);
            var entries = JsonSerializer.Deserialize<List<HistoryEntry>>(json);
            if (entries != null)
            {
                _entries.Clear();
                foreach (var entry in entries.OrderByDescending(e => e.Timestamp))
                {
                    _entries.Add(entry);
                }
            }
        }
        catch
        {
            // Ignore corrupt history file
        }
    }

    private void Save()
    {
        var dir = Path.GetDirectoryName(_historyFilePath);
        if (!string.IsNullOrEmpty(dir))
            Directory.CreateDirectory(dir);

        var json = JsonSerializer.Serialize(_entries, new JsonSerializerOptions { WriteIndented = true });
        File.WriteAllText(_historyFilePath, json);
    }

    private void TrimToMaxEntries(int max)
    {
        while (_entries.Count > max)
        {
            _entries.RemoveAt(_entries.Count - 1);
        }
    }
}

public record HistoryEntry
{
    public Guid Id { get; init; }
    public DateTime Timestamp { get; init; }
    public string OriginalPrompt { get; init; } = string.Empty;
    public string? EnhancedPrompt { get; init; }
    public string? ImageUrl { get; init; }
    public string AspectRatio { get; init; } = "1:1";
    public bool IsImageToImage { get; init; }
    public TimeSpan GenerationTime { get; init; }
}