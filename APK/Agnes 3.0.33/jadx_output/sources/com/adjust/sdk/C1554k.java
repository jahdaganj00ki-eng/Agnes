package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1554k implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21614c;

    public /* synthetic */ C1554k(String str, String str2, int i6) {
        this.f21612a = i6;
        this.f21613b = str;
        this.f21614c = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f21612a) {
            case 0:
                activityHandler.addGlobalPartnerParameterI(this.f21613b, this.f21614c);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.f21613b, this.f21614c);
                break;
        }
    }
}
