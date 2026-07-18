package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f22594d = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f22595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f22596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f22597c;

    public H() {
        this.f22595a = null;
        this.f22596b = null;
    }

    public H(Runnable runnable, Executor executor) {
        this.f22595a = runnable;
        this.f22596b = executor;
    }
}
