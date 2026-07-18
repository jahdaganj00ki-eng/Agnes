package c1;

import y1.C4342l;

/* JADX INFO: renamed from: c1.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1483q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1483q0 f21263c = new C1483q0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21265b;

    public C1483q0(long j4, long j10) {
        this.f21264a = j4;
        this.f21265b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1483q0) {
            C1483q0 c1483q0 = (C1483q0) obj;
            return C4342l.a(this.f21264a, c1483q0.f21264a) && this.f21265b == c1483q0.f21265b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21265b) + (Long.hashCode(this.f21264a) * 31);
    }
}
