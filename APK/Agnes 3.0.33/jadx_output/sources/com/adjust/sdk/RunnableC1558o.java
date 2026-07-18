package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1558o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21630d;

    public /* synthetic */ RunnableC1558o(ActivityHandler activityHandler, String str, String str2, int i6) {
        this.f21627a = i6;
        this.f21628b = activityHandler;
        this.f21629c = str;
        this.f21630d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21627a) {
            case 0:
                this.f21628b.lambda$addGlobalPartnerParameter$23(this.f21629c, this.f21630d);
                break;
            default:
                this.f21628b.lambda$addGlobalCallbackParameter$21(this.f21629c, this.f21630d);
                break;
        }
    }
}
