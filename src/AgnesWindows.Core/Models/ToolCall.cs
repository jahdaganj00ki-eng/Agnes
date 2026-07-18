namespace AgnesWindows.Core.Models;

public class ToolCall
{
    public string Tool { get; set; } = string.Empty;
    public Dictionary<string, object> Parameters { get; set; } = new();
}
