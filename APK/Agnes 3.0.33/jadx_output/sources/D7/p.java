package D7;

import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f3423c = new p(true, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f3424d = new p(false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3426b;

    public p(boolean z2, boolean z7) {
        this.f3425a = z2;
        this.f3426b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        pVar.getClass();
        return this.f3425a == pVar.f3425a && this.f3426b == pVar.f3426b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3426b) + o0.i(this.f3425a, o0.i(true, Boolean.hashCode(true) * 31, 31), 31);
    }

    public final String toString() {
        return "StreamStopSideEffects(closeLocalStream=true, clearLoading=true, clearSearchLoading=" + this.f3425a + ", setRunningFalse=" + this.f3426b + ")";
    }
}
