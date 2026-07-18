package E6;

/* JADX INFO: renamed from: E6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0290d implements InterfaceC0292f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.a f3820a;

    public C0290d(G6.a aVar) {
        this.f3820a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0290d) && kotlin.jvm.internal.l.b(this.f3820a, ((C0290d) obj).f3820a);
    }

    public final int hashCode() {
        return this.f3820a.hashCode();
    }

    public final String toString() {
        return "AvatarClick(avatar=" + this.f3820a + ")";
    }
}
