package B5;

/* JADX INFO: renamed from: B5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0018e implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f780a;

    public C0018e(Object obj) {
        this.f780a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0018e) && kotlin.jvm.internal.l.b(this.f780a, ((C0018e) obj).f780a);
    }

    public final int hashCode() {
        return this.f780a.hashCode();
    }

    public final String toString() {
        return "DeleteConversation(value=" + this.f780a + ")";
    }
}
