package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22037a;

    static {
        f22037a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
