package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface ILogger {
    void Assert(String str, Object... objArr);

    void debug(String str, Object... objArr);

    void error(String str, Object... objArr);

    void info(String str, Object... objArr);

    void lockLogLevel();

    void setLogLevel(LogLevel logLevel, boolean z2);

    void setLogLevelString(String str, boolean z2);

    void verbose(String str, Object... objArr);

    void warn(String str, Object... objArr);

    void warnInProduction(String str, Object... objArr);
}
