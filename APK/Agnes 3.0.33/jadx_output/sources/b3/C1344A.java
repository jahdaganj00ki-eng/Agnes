package b3;

/* JADX INFO: renamed from: b3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1344A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20451e;

    public C1344A(Object obj) {
        this(-1L, obj);
    }

    public final C1344A a(Object obj) {
        if (this.f20447a.equals(obj)) {
            return this;
        }
        return new C1344A(obj, this.f20448b, this.f20449c, this.f20450d, this.f20451e);
    }

    public final boolean b() {
        return this.f20448b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1344A)) {
            return false;
        }
        C1344A c1344a = (C1344A) obj;
        return this.f20447a.equals(c1344a.f20447a) && this.f20448b == c1344a.f20448b && this.f20449c == c1344a.f20449c && this.f20450d == c1344a.f20450d && this.f20451e == c1344a.f20451e;
    }

    public final int hashCode() {
        return ((((((((this.f20447a.hashCode() + 527) * 31) + this.f20448b) * 31) + this.f20449c) * 31) + ((int) this.f20450d)) * 31) + this.f20451e;
    }

    public C1344A(long j4, Object obj) {
        this(obj, -1, -1, j4, -1);
    }

    public C1344A(Object obj, long j4, int i6) {
        this(obj, -1, -1, j4, i6);
    }

    public C1344A(Object obj, int i6, int i10, long j4, int i11) {
        this.f20447a = obj;
        this.f20448b = i6;
        this.f20449c = i10;
        this.f20450d = j4;
        this.f20451e = i11;
    }
}
