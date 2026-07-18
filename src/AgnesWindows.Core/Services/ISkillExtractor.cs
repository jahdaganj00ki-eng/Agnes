namespace AgnesWindows.Core.Services;

public interface ISkillExtractor
{
    Task ExtractAsync(CancellationToken ct = default);
}
