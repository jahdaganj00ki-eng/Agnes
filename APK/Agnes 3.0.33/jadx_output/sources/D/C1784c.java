package d;

/* JADX INFO: renamed from: d.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1784c extends Y3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23206b;

    public C1784c(long j4, Object obj) {
        this.f23205a = obj;
        this.f23206b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1784c)) {
            return false;
        }
        C1784c c1784c = (C1784c) obj;
        return kotlin.jvm.internal.l.b(this.f23205a, c1784c.f23205a) && this.f23206b == c1784c.f23206b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23206b) + (this.f23205a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f23205a + ", compositeKey=" + this.f23206b + ')';
    }
}
