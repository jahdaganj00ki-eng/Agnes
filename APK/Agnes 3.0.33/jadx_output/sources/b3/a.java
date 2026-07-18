package B3;

import i3.B;
import i3.InterfaceC2402A;
import i3.z;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class a implements i, InterfaceC2402A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f627j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f629m;

    public a(long j4, long j10, int i6, int i10, boolean z2, boolean z7) {
        this.f618a = j4;
        this.f619b = j10;
        this.f620c = i10 == -1 ? 1 : i10;
        this.f622e = i6;
        this.f624g = z2;
        this.f625h = z7;
        if (j4 == -1) {
            this.f621d = -1L;
            this.f623f = -9223372036854775807L;
        } else {
            long j11 = j4 - j10;
            this.f621d = j11;
            this.f623f = (Math.max(0L, j11) * 8000000) / ((long) i6);
        }
        this.f626i = j10;
        this.f627j = i6;
        this.k = i10;
        this.f628l = z2;
        this.f629m = j4 == -1 ? -1L : j4;
    }

    @Override // B3.i
    public final long a() {
        return this.f629m;
    }

    @Override // i3.InterfaceC2402A
    public final boolean b() {
        return this.f621d != -1 || this.f624g;
    }

    @Override // B3.i
    public final long c(long j4) {
        return (Math.max(0L, j4 - this.f619b) * 8000000) / ((long) this.f622e);
    }

    @Override // i3.InterfaceC2402A
    public final boolean d() {
        return this.f625h;
    }

    @Override // i3.InterfaceC2402A
    public final z e(long j4) {
        long j10 = this.f621d;
        long j11 = this.f619b;
        if (j10 == -1 && !this.f624g) {
            B b10 = new B(0L, j11);
            return new z(b10, b10);
        }
        int i6 = this.f622e;
        long j12 = this.f620c;
        long jMin = (((((long) i6) * j4) / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i6);
        B b11 = new B(jMax2, jMax);
        if (j10 != -1 && jMax2 < j4) {
            long j13 = jMax + j12;
            if (j13 < this.f618a) {
                return new z(b11, new B((Math.max(0L, j13 - j11) * 8000000) / ((long) i6), j13));
            }
        }
        return new z(b11, b11);
    }

    @Override // B3.i
    public final int f() {
        return this.f627j;
    }

    @Override // i3.InterfaceC2402A
    public final long g() {
        return this.f623f;
    }
}
