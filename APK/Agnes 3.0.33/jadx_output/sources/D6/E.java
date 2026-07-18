package D6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class E implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f2981a;

    public E(B b10) {
        this.f2981a = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.f2981a == ((E) obj).f2981a;
    }

    public final int hashCode() {
        return this.f2981a.hashCode();
    }

    public final String toString() {
        return "SelectMode(mode=" + this.f2981a + ")";
    }
}
