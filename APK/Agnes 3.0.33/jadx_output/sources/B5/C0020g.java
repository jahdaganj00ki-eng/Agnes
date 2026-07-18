package B5;

/* JADX INFO: renamed from: B5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0020g implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f788b;

    public C0020g(Object obj, String str) {
        kotlin.jvm.internal.l.f(str, "title");
        this.f787a = obj;
        this.f788b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0020g)) {
            return false;
        }
        C0020g c0020g = (C0020g) obj;
        return kotlin.jvm.internal.l.b(this.f787a, c0020g.f787a) && kotlin.jvm.internal.l.b(this.f788b, c0020g.f788b);
    }

    public final int hashCode() {
        return this.f788b.hashCode() + (this.f787a.hashCode() * 31);
    }

    public final String toString() {
        return "RenameConversation(value=" + this.f787a + ", title=" + this.f788b + ")";
    }
}
