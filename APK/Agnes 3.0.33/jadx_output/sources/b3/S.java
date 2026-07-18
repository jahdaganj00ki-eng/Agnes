package b3;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20515b;

    public S(int i6, boolean z2) {
        this.f20514a = i6;
        this.f20515b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s10 = (S) obj;
        return this.f20514a == s10.f20514a && this.f20515b == s10.f20515b;
    }

    public final int hashCode() {
        return (this.f20514a * 31) + (this.f20515b ? 1 : 0);
    }
}
