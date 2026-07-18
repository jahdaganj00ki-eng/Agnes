package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class X0 extends Y0 {
    @Override // com.google.android.gms.internal.play_billing.Y0
    public final double a(long j4, Object obj) {
        return Double.longBitsToDouble(this.f22664a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final float b(long j4, Object obj) {
        return Float.intBitsToFloat(this.f22664a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final void c(Object obj, long j4, boolean z2) {
        if (Z0.f22673g) {
            Z0.c(obj, j4, z2 ? (byte) 1 : (byte) 0);
        } else {
            Z0.d(obj, j4, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final void d(Object obj, long j4, byte b10) {
        if (Z0.f22673g) {
            Z0.c(obj, j4, b10);
        } else {
            Z0.d(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final void e(Object obj, long j4, double d5) {
        this.f22664a.putLong(obj, j4, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final void f(Object obj, long j4, float f10) {
        this.f22664a.putInt(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final boolean g(long j4, Object obj) {
        return Z0.f22673g ? Z0.m(j4, obj) : Z0.n(j4, obj);
    }
}
