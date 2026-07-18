package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1547d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAdRevenue f21593c;

    public /* synthetic */ RunnableC1547d(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i6) {
        this.f21591a = i6;
        this.f21592b = activityHandler;
        this.f21593c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21591a) {
            case 0:
                this.f21592b.lambda$trackAdRevenue$41(this.f21593c);
                break;
            default:
                this.f21592b.lambda$trackAdRevenue$40(this.f21593c);
                break;
        }
    }
}
