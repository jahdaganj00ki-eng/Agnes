package da;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f23566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23567b;

    public g(p pVar, boolean z2) {
        this.f23566a = pVar;
        this.f23567b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f23566a.equals(this.f23566a) && gVar.f23567b == this.f23567b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23566a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f23567b).hashCode();
    }
}
