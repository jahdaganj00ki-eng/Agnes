package com.adjust.sdk;

import android.content.Context;
import d4.ExecutorC1809c;
import e4.AbstractC1863c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f21537b;

    public /* synthetic */ E(Context context, int i6) {
        this.f21536a = i6;
        this.f21537b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21536a) {
            case 0:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.f21537b);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new E(this.f21537b, 2));
                break;
            default:
                AbstractC1863c.t(this.f21537b, new ExecutorC1809c(0), AbstractC1863c.f23703a, false);
                break;
        }
    }
}
