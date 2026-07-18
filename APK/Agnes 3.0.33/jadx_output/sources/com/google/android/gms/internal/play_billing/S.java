package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class S implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f22647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ S[] f22648b;

    static {
        S s10 = new S("INSTANCE", 0);
        f22647a = s10;
        f22648b = new S[]{s10};
    }

    public static S[] values() {
        return (S[]) f22648b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
