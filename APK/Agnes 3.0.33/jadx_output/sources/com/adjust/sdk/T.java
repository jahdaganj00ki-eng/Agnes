package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class T implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseVerificationHandler f21575b;

    public /* synthetic */ T(PurchaseVerificationHandler purchaseVerificationHandler, int i6) {
        this.f21574a = i6;
        this.f21575b = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21574a) {
            case 0:
                this.f21575b.sendNextPurchaseVerificationPackageI();
                break;
            default:
                PurchaseVerificationHandler purchaseVerificationHandler = this.f21575b;
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
