package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1550g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21601c;

    public /* synthetic */ RunnableC1550g(ActivityHandler activityHandler, String str, int i6) {
        this.f21599a = i6;
        this.f21600b = activityHandler;
        this.f21601c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21599a) {
            case 0:
                this.f21600b.lambda$setExternalDeviceIdInDelay$51(this.f21601c);
                break;
            case 1:
                this.f21600b.lambda$removeGlobalPartnerParameter$27(this.f21601c);
                break;
            default:
                this.f21600b.lambda$removeGlobalCallbackParameter$25(this.f21601c);
                break;
        }
    }
}
