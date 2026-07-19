using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using AgnesWindows.App.Services;

namespace AgnesWindows.App.ViewModels;

public partial class HistoryViewModel : ObservableObject
{
    private readonly HistoryService _historyService;

    public HistoryViewModel(HistoryService historyService)
    {
        _historyService = historyService;
    }

    public ObservableCollection<HistoryEntry> Entries => _historyService.Entries;

    [RelayCommand]
    private void DeleteEntry(Guid id)
    {
        _historyService.RemoveEntry(id);
    }

    [RelayCommand]
    private void ClearHistory()
    {
        _historyService.Clear();
    }
}