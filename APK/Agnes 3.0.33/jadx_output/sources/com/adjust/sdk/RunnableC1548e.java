package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1548e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f21596c;

    public /* synthetic */ RunnableC1548e(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i6) {
        this.f21594a = i6;
        this.f21595b = activityHandler;
        this.f21596c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21594a) {
            case 0:
                this.f21595b.lambda$trackEvent$3(this.f21596c);
                break;
            default:
                this.f21595b.lambda$trackEvent$4(this.f21596c);
                break;
        }
    }
}
