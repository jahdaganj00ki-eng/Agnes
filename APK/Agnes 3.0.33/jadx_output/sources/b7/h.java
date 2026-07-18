package b7;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20868a;

    public h(boolean z2) {
        this.f20868a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f20868a == ((h) obj).f20868a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20868a);
    }

    public final String toString() {
        return "PaymentVerified(success=" + this.f20868a + ")";
    }
}
