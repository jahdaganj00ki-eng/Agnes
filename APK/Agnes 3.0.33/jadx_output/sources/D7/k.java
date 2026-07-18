package D7;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3414a;

    public k(p pVar) {
        this.f3414a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.l.b(this.f3414a, ((k) obj).f3414a);
    }

    public final int hashCode() {
        return this.f3414a.hashCode();
    }

    public final String toString() {
        return "Success(sideEffects=" + this.f3414a + ")";
    }
}
