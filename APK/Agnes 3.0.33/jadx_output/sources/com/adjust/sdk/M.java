package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionHandler f21557b;

    public /* synthetic */ M(AttributionHandler attributionHandler, int i6) {
        this.f21556a = i6;
        this.f21557b = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21556a) {
            case 0:
                this.f21557b.sendAttributionRequest();
                break;
            case 1:
                AttributionHandler attributionHandler = this.f21557b;
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                this.f21557b.sendAttributionRequestI();
                break;
        }
    }
}
