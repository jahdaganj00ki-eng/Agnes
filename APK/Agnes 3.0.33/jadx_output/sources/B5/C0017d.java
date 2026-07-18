package B5;

/* JADX INFO: renamed from: B5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0017d implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f776a;

    public C0017d(Object obj) {
        this.f776a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0017d) && kotlin.jvm.internal.l.b(this.f776a, ((C0017d) obj).f776a);
    }

    public final int hashCode() {
        return this.f776a.hashCode();
    }

    public final String toString() {
        return "DeleteAndLeaveConversation(value=" + this.f776a + ")";
    }
}
