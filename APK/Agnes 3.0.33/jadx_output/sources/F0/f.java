package F0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4178a;

    public static String a(int i6) {
        return i6 == 1 ? "Next" : i6 == 2 ? "Previous" : i6 == 3 ? "Left" : i6 == 4 ? "Right" : i6 == 5 ? "Up" : i6 == 6 ? "Down" : i6 == 7 ? "Enter" : i6 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4178a == ((f) obj).f4178a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4178a);
    }

    public final String toString() {
        return a(this.f4178a);
    }
}
