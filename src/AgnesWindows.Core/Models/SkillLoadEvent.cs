namespace AgnesWindows.Core.Models;

public class SkillLoadEvent
{
    public string SkillPath { get; set; } = string.Empty;
    public int CharCount { get; set; }
    public bool IsLoaded { get; set; }
    public string? ErrorMessage { get; set; }
    public TimeSpan LoadDuration { get; set; }
}
