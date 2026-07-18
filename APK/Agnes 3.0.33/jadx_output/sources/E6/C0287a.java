package E6;

/* JADX INFO: renamed from: E6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0287a implements InterfaceC0289c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.f f3817a;

    public C0287a(G6.f fVar) {
        this.f3817a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0287a) && kotlin.jvm.internal.l.b(this.f3817a, ((C0287a) obj).f3817a);
    }

    public final int hashCode() {
        G6.f fVar = this.f3817a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "ConfirmFinished(result=" + this.f3817a + ")";
    }
}
