package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1556m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustDeeplink f21619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f21620d;

    public /* synthetic */ RunnableC1556m(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j4, int i6) {
        this.f21617a = i6;
        this.f21618b = activityHandler;
        this.f21619c = adjustDeeplink;
        this.f21620d = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21617a) {
            case 0:
                this.f21618b.lambda$processDeeplink$13(this.f21619c, this.f21620d);
                break;
            case 1:
                this.f21618b.lambda$processDeeplink$12(this.f21619c, this.f21620d);
                break;
            case 2:
                this.f21618b.lambda$processAndResolveDeeplink$14(this.f21619c, this.f21620d);
                break;
            default:
                this.f21618b.lambda$processAndResolveDeeplink$15(this.f21619c, this.f21620d);
                break;
        }
    }
}
