package c1;

/* JADX INFO: renamed from: c1.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1451a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21131a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1451a0) {
            return this.f21131a == ((C1451a0) obj).f21131a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21131a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.f21131a + ')';
    }
}
