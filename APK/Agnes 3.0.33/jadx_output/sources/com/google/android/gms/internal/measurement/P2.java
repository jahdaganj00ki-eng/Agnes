package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class P2 extends R2 {
    @Override // com.google.android.gms.internal.measurement.R2
    public final void a(Object obj, long j4, byte b10) {
        if (S2.f22144g) {
            S2.c(obj, j4, b10);
        } else {
            S2.d(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean b(long j4, Object obj) {
        return S2.f22144g ? S2.n(j4, obj) : S2.o(j4, obj);
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final void c(Object obj, long j4, boolean z2) {
        if (S2.f22144g) {
            S2.c(obj, j4, z2 ? (byte) 1 : (byte) 0);
        } else {
            S2.d(obj, j4, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final float d(long j4, Object obj) {
        return Float.intBitsToFloat(this.f22137a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final void e(Object obj, long j4, float f10) {
        this.f22137a.putInt(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final double f(long j4, Object obj) {
        return Double.longBitsToDouble(this.f22137a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final void g(Object obj, long j4, double d5) {
        this.f22137a.putLong(obj, j4, Double.doubleToLongBits(d5));
    }
}
