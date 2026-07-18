package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPPRESS(8);

    final int androidLogLevel;

    LogLevel(int i6) {
        this.androidLogLevel = i6;
    }

    public int getAndroidLogLevel() {
        return this.androidLogLevel;
    }
}
