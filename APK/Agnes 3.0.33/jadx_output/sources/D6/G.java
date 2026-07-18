package D6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f3002a;

    public G(B b10) {
        kotlin.jvm.internal.l.f(b10, "selectedMode");
        this.f3002a = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && this.f3002a == ((G) obj).f3002a;
    }

    public final int hashCode() {
        return this.f3002a.hashCode();
    }

    public final String toString() {
        return "State(selectedMode=" + this.f3002a + ")";
    }
}
