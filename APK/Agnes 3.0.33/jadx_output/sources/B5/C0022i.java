package B5;

/* JADX INFO: renamed from: B5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0022i implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f796a;

    public C0022i(Object obj) {
        this.f796a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0022i) && kotlin.jvm.internal.l.b(this.f796a, ((C0022i) obj).f796a);
    }

    public final int hashCode() {
        return this.f796a.hashCode();
    }

    public final String toString() {
        return "ShareConversation(value=" + this.f796a + ")";
    }
}
