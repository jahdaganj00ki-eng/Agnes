package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1560q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f21637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f21638d;

    public /* synthetic */ RunnableC1560q(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i6) {
        this.f21635a = i6;
        this.f21636b = activityHandler;
        this.f21637c = adjustEvent;
        this.f21638d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21635a) {
            case 0:
                this.f21636b.lambda$verifyAndTrackPlayStorePurchase$46(this.f21637c, this.f21638d);
                break;
            default:
                this.f21636b.lambda$verifyAndTrackPlayStorePurchase$47(this.f21637c, this.f21638d);
                break;
        }
    }
}
