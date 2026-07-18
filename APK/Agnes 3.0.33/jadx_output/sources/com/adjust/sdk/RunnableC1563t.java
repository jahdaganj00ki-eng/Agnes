package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class RunnableC1563t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAttributionReadListener f21652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21653c;

    public /* synthetic */ RunnableC1563t(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i6) {
        this.f21651a = i6;
        this.f21653c = activityHandler;
        this.f21652b = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21651a) {
            case 0:
                this.f21652b.onAttributionRead(this.f21653c.attribution);
                break;
            default:
                this.f21652b.onAttributionRead(this.f21653c.attribution);
                break;
        }
    }
}
