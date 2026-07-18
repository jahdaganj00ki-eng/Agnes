package B0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f488a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f488a == ((d) obj).f488a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f488a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.f488a + ')';
    }
}
