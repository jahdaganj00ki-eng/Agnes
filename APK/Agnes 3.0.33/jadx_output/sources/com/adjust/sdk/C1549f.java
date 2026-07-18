package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1549f implements IRunActivityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21598b;

    public /* synthetic */ C1549f(String str, int i6) {
        this.f21597a = i6;
        this.f21598b = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.f21597a) {
            case 0:
                activityHandler.removeGlobalPartnerParameterI(this.f21598b);
                break;
            default:
                activityHandler.removeGlobalCallbackParameterI(this.f21598b);
                break;
        }
    }
}
