package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1551h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStoreSubscription f21604c;

    public /* synthetic */ RunnableC1551h(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i6) {
        this.f21602a = i6;
        this.f21603b = activityHandler;
        this.f21604c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21602a) {
            case 0:
                this.f21603b.lambda$trackPlayStoreSubscription$42(this.f21604c);
                break;
            default:
                this.f21603b.lambda$trackPlayStoreSubscription$43(this.f21604c);
                break;
        }
    }
}
