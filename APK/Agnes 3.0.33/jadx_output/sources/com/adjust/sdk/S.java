package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PackageHandler f21573b;

    public /* synthetic */ S(PackageHandler packageHandler, int i6) {
        this.f21572a = i6;
        this.f21573b = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21572a) {
            case 0:
                this.f21573b.initI();
                break;
            case 1:
                this.f21573b.sendFirstI();
                break;
            case 2:
                PackageHandler packageHandler = this.f21573b;
                packageHandler.logger.verbose("Package handler can send", new Object[0]);
                packageHandler.isSending.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                this.f21573b.flushI();
                break;
            default:
                PackageHandler packageHandler2 = this.f21573b;
                packageHandler2.logger.verbose("Package handler finished waiting to continue", new Object[0]);
                packageHandler2.isSending.set(false);
                packageHandler2.sendFirstPackage();
                break;
        }
    }
}
