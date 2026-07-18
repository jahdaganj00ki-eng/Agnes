package C5;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1627b;

    public D1(String str, int i6) {
        this.f1626a = str;
        this.f1627b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d1 = (D1) obj;
        return kotlin.jvm.internal.l.b(this.f1626a, d1.f1626a) && this.f1627b == d1.f1627b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1627b) + (this.f1626a.hashCode() * 31);
    }

    public final String toString() {
        return "ReadFileDisplay(path=" + this.f1626a + ", lineCount=" + this.f1627b + ")";
    }
}
