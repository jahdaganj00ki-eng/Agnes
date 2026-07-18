package d3;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1796a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23257b;

    public C1796a(long j4, long j10) {
        this.f23256a = j4;
        this.f23257b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1796a)) {
            return false;
        }
        C1796a c1796a = (C1796a) obj;
        return this.f23256a == c1796a.f23256a && this.f23257b == c1796a.f23257b;
    }

    public final int hashCode() {
        return (((int) this.f23256a) * 31) + ((int) this.f23257b);
    }
}
