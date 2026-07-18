package b0;

/* JADX INFO: renamed from: b0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1229B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.j f19738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19740c;

    public C1229B(x1.j jVar, int i6, long j4) {
        this.f19738a = jVar;
        this.f19739b = i6;
        this.f19740c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229B)) {
            return false;
        }
        C1229B c1229b = (C1229B) obj;
        return this.f19738a == c1229b.f19738a && this.f19739b == c1229b.f19739b && this.f19740c == c1229b.f19740c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19740c) + o8.o0.f(this.f19739b, this.f19738a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f19738a + ", offset=" + this.f19739b + ", selectableId=" + this.f19740c + ')';
    }
}
