using AgnesWindows.Core.Enums;
using AgnesWindows.Core.Models;
using AgnesWindows.Core.Services;
using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;

namespace AgnesWindows.UI.ViewModels;

public partial class ChatViewModel : ObservableObject
{
    private readonly IImageGenerationBackend _backend;
    private readonly IStorageService _storageService;
    private CancellationTokenSource? _cts;

    [ObservableProperty]
    private EditImageState _state = EditImageState.Idle;

    [ObservableProperty]
    private string _userPrompt = string.Empty;

    [ObservableProperty]
    private string? _inputImagePath;

    [ObservableProperty]
    private string _enhancedPrompt = string.Empty;

    [ObservableProperty]
    private ImageGenerationResult? _lastResult;

    [ObservableProperty]
    private RetryState? _retryState;

    [ObservableProperty]
    private string _selectedAspectRatio = "1:1";

    public ObservableCollection<SkillLoadEvent> SkillLoads { get; } = new();

    public ChatViewModel(
        IImageGenerationBackend backend,
        IStorageService storageService)
    {
        _backend = backend;
        _storageService = storageService;
    }

    [RelayCommand]
    private async Task SubmitAsync()
    {
        if (string.IsNullOrWhiteSpace(UserPrompt)) return;

        try
        {
            _cts?.Cancel();
            _cts = new CancellationTokenSource();
            var ct = _cts.Token;

            State = EditImageState.ThinkingBasic;
            SkillLoads.Clear();

            await foreach (var skillEvent in _backend.LoadSkillsAsync(ct))
            {
                SkillLoads.Add(skillEvent);
            }

            State = EditImageState.PromptEnhanced;
            EnhancedPrompt = await _backend.EnhancePromptAsync(
                UserPrompt, 
                SkillLoads.Where(s => s.IsLoaded).Select(s => s.SkillPath).ToList(),
                !string.IsNullOrEmpty(InputImagePath),
                ct);

            RetryState = new RetryState
            {
                OriginalPrompt = UserPrompt,
                EnhancedPrompt = EnhancedPrompt,
                InputImageUrl = InputImagePath,
                AspectRatio = SelectedAspectRatio,
                IsImageToImage = !string.IsNullOrEmpty(InputImagePath)
            };

            State = EditImageState.Generating;

            var request = new ImageGenerationRequest
            {
                Prompt = EnhancedPrompt,
                InputImageUrl = InputImagePath,
                AspectRatio = SelectedAspectRatio
            };

            LastResult = await _backend.GenerateImageAsync(request, ct);

            if (LastResult.Success)
            {
                State = EditImageState.ResultReady;
            }
            else
            {
                State = EditImageState.Error;
            }
        }
        catch (OperationCanceledException)
        {
            State = EditImageState.Idle;
        }
        catch (Exception ex)
        {
            State = EditImageState.Error;
            LastResult = new ImageGenerationResult 
            { 
                Success = false, 
                ErrorMessage = ex.Message 
            };
        }
    }

    [RelayCommand]
    private async Task RetryAsync()
    {
        if (RetryState == null) return;

        try
        {
            _cts?.Cancel();
            _cts = new CancellationTokenSource();
            var ct = _cts.Token;

            State = EditImageState.Retrying;

            var request = new ImageGenerationRequest
            {
                Prompt = RetryState.EnhancedPrompt,
                InputImageUrl = RetryState.InputImageUrl,
                AspectRatio = RetryState.AspectRatio
            };

            LastResult = await _backend.GenerateImageAsync(request, ct);

            if (LastResult.Success)
            {
                State = EditImageState.ResultReady;
            }
            else
            {
                State = EditImageState.Error;
            }
        }
        catch (OperationCanceledException)
        {
            State = EditImageState.Idle;
        }
        catch (Exception ex)
        {
            State = EditImageState.Error;
            LastResult = new ImageGenerationResult 
            { 
                Success = false, 
                ErrorMessage = ex.Message 
            };
        }
    }

    [RelayCommand]
    private void Cancel()
    {
        _cts?.Cancel();
        State = EditImageState.Idle;
    }
}
