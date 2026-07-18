package B5;

/* JADX INFO: renamed from: B5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0019f implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f783a;

    public C0019f(Object obj) {
        this.f783a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0019f) && kotlin.jvm.internal.l.b(this.f783a, ((C0019f) obj).f783a);
    }

    public final int hashCode() {
        return this.f783a.hashCode();
    }

    public final String toString() {
        return "PinConversation(value=" + this.f783a + ")";
    }
}
