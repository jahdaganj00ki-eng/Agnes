namespace AgnesWindows.Core.Enums;

public enum EditImageState
{
    Idle,
    InputReady,
    ThinkingBasic,
    ThinkingEnhanced,
    PromptEnhanced,
    Generating,
    ResultReady,
    Error,
    Retrying
}
