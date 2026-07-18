package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f22664a;

    public Y0(Unsafe unsafe) {
        this.f22664a = unsafe;
    }

    public abstract double a(long j4, Object obj);

    public abstract float b(long j4, Object obj);

    public abstract void c(Object obj, long j4, boolean z2);

    public abstract void d(Object obj, long j4, byte b10);

    public abstract void e(Object obj, long j4, double d5);

    public abstract void f(Object obj, long j4, float f10);

    public abstract boolean g(long j4, Object obj);
}
