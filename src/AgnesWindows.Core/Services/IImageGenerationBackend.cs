using AgnesWindows.Core.Models;

namespace AgnesWindows.Core.Services;

public interface IImageGenerationBackend
{
    Task<ImageGenerationResult> GenerateImageAsync(
        ImageGenerationRequest request,
        CancellationToken ct = default);

    Task<string> EnhancePromptAsync(
        string originalPrompt,
        IReadOnlyList<string> skillContents,
        bool isImageToImage,
        CancellationToken ct = default);

    IAsyncEnumerable<SkillLoadEvent> LoadSkillsAsync(CancellationToken ct = default);
}
