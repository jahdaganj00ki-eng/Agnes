package com.adjust.sdk;

import com.adjust.sdk.AdjustLinkResolution;
import java.net.URL;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustLinkResolution.AdjustLinkResolutionCallback f21555b;

    public L(URL url, AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        this.f21554a = url;
        this.f21555b = adjustLinkResolutionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustLinkResolution.requestAndResolve(this.f21554a, 0, this.f21555b);
    }
}
