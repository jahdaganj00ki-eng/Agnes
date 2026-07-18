package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Y implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f21583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21584c;

    public /* synthetic */ Y(Context context, Object obj, int i6) {
        this.f21582a = i6;
        this.f21583b = context;
        this.f21584c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21582a) {
            case 0:
                return Reflection.getPlayAdId(this.f21583b, this.f21584c);
            default:
                return Reflection.isPlayTrackingEnabled(this.f21583b, this.f21584c);
        }
    }
}
