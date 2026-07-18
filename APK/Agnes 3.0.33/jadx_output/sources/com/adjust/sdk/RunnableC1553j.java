package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1553j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStorePurchase f21610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f21611d;

    public /* synthetic */ RunnableC1553j(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i6) {
        this.f21608a = i6;
        this.f21609b = activityHandler;
        this.f21610c = adjustPlayStorePurchase;
        this.f21611d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21608a) {
            case 0:
                this.f21609b.lambda$verifyPlayStorePurchase$44(this.f21610c, this.f21611d);
                break;
            default:
                this.f21609b.lambda$verifyPlayStorePurchase$45(this.f21610c, this.f21611d);
                break;
        }
    }
}
