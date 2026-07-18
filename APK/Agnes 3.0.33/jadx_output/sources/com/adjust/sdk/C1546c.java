package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1546c implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21590a;

    public /* synthetic */ C1546c(int i6) {
        this.f21590a = i6;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f21590a) {
            case 0:
                activityHandler.removeGlobalCallbackParametersI();
                break;
            default:
                activityHandler.removeGlobalPartnerParametersI();
                break;
        }
    }
}
