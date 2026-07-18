package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1552i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnIsEnabledListener f21607c;

    public /* synthetic */ RunnableC1552i(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i6) {
        this.f21605a = i6;
        this.f21606b = activityHandler;
        this.f21607c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21605a) {
            case 0:
                this.f21606b.lambda$isEnabled$9(this.f21607c);
                break;
            case 1:
                this.f21606b.lambda$isEnabled$11(this.f21607c);
                break;
            default:
                this.f21606b.lambda$isEnabled$10(this.f21607c);
                break;
        }
    }
}
