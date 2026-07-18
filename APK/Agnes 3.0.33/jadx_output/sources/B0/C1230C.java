package b0;

/* JADX INFO: renamed from: b0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1230C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1229B f19743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1229B f19744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19745c;

    public C1230C(C1229B c1229b, C1229B c1229b2, boolean z2) {
        this.f19743a = c1229b;
        this.f19744b = c1229b2;
        this.f19745c = z2;
    }

    public static C1230C a(C1230C c1230c, C1229B c1229b, C1229B c1229b2, boolean z2, int i6) {
        if ((i6 & 1) != 0) {
            c1229b = c1230c.f19743a;
        }
        if ((i6 & 2) != 0) {
            c1229b2 = c1230c.f19744b;
        }
        if ((i6 & 4) != 0) {
            z2 = c1230c.f19745c;
        }
        c1230c.getClass();
        return new C1230C(c1229b, c1229b2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230C)) {
            return false;
        }
        C1230C c1230c = (C1230C) obj;
        return kotlin.jvm.internal.l.b(this.f19743a, c1230c.f19743a) && kotlin.jvm.internal.l.b(this.f19744b, c1230c.f19744b) && this.f19745c == c1230c.f19745c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19745c) + ((this.f19744b.hashCode() + (this.f19743a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f19743a + ", end=" + this.f19744b + ", handlesCrossed=" + this.f19745c + ')';
    }
}
