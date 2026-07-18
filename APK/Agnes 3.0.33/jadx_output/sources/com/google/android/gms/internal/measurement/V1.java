package com.google.android.gms.internal.measurement;

import D.AbstractC0151b;
import q.C3588k;
import y1.C4331a;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22161d;

    public V1(D.L l2, long j4, int i6, int i10) {
        this.f22160c = l2;
        this.f22159b = j4;
        this.f22158a = i6;
        this.f22161d = i10;
    }

    public static /* synthetic */ String c(int i6, int i10, byte b10, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + b10 + String.valueOf(i6).length());
        sb.append(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i6);
        return sb.toString();
    }

    public AbstractC0151b a(D.I i6, boolean z2, int i10, int i11, int i12, int i13) {
        if (!i6.f2369b) {
            return null;
        }
        ((D.L) this.f22160c).getClass();
        D.K k = D.K.f2381a;
        return null;
    }

    public D.I b(boolean z2, int i6, long j4, C3588k c3588k, int i10, int i11, int i12, boolean z7, boolean z10) {
        int i13 = this.f22158a;
        int i14 = this.f22161d;
        long j10 = this.f22159b;
        D.L l2 = (D.L) this.f22160c;
        int i15 = i11 + i12;
        if (c3588k == null) {
            return new D.I(true, true);
        }
        long j11 = c3588k.f36538a;
        l2.getClass();
        D.K k = D.K.f2381a;
        D.K k10 = D.K.f2381a;
        if (i10 >= Integer.MAX_VALUE || ((int) (j4 & 4294967295L)) - ((int) (j11 & 4294967295L)) < 0) {
            return new D.I(true, true);
        }
        if (i6 != 0 && (i6 >= Integer.MAX_VALUE || ((int) (j4 >> 32)) - ((int) (j11 >> 32)) < 0)) {
            return z7 ? new D.I(true, true) : new D.I(true, b(z2, 0, C3588k.a(C4331a.h(j10), (((int) (j4 & 4294967295L)) - i14) - i12), new C3588k(C3588k.a(((int) (j11 >> 32)) - i13, (int) (j11 & 4294967295L))), i10 + 1, i15, 0, true, false).f2369b);
        }
        Math.max(i12, (int) (j11 & 4294967295L));
        return new D.I(false, false);
    }
}
