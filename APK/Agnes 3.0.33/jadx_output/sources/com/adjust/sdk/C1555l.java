package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1555l implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustThirdPartySharing f21616b;

    public /* synthetic */ C1555l(AdjustThirdPartySharing adjustThirdPartySharing, int i6) {
        this.f21615a = i6;
        this.f21616b = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f21615a) {
            case 0:
                activityHandler.tryTrackThirdPartySharingI(this.f21616b);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(this.f21616b);
                break;
        }
    }
}
