package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class X implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21581a;

    public X(Context context) {
        this.f21581a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return Reflection.getAdvertisingInfoObject(this.f21581a);
        } catch (Exception unused) {
            return null;
        }
    }
}
