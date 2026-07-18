package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class RunnableC1561r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAdidReadListener f21640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21641c;

    public /* synthetic */ RunnableC1561r(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i6) {
        this.f21639a = i6;
        this.f21641c = activityHandler;
        this.f21640b = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21639a) {
            case 0:
                this.f21640b.onAdidRead(this.f21641c.activityState.adid);
                break;
            default:
                this.f21640b.onAdidRead(this.f21641c.activityState.adid);
                break;
        }
    }
}
