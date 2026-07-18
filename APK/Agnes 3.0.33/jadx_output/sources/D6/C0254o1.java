package D6;

/* JADX INFO: renamed from: D6.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0254o1 implements InterfaceC0260q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3288a;

    public C0254o1(boolean z2) {
        this.f3288a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0254o1) && this.f3288a == ((C0254o1) obj).f3288a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3288a);
    }

    public final String toString() {
        return "OpenTeenMode(targetOpen=" + this.f3288a + ")";
    }
}
