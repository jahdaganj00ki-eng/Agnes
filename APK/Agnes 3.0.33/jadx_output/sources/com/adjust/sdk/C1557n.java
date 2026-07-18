package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1557n implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21622b;

    public /* synthetic */ C1557n(int i6, boolean z2) {
        this.f21621a = i6;
        this.f21622b = z2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f21621a) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(this.f21622b);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(this.f21622b);
                break;
        }
    }
}
