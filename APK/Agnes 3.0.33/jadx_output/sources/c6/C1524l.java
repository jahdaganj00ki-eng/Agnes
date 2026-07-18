package c6;

/* JADX INFO: renamed from: c6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1524l implements InterfaceC1528p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21463a;

    public C1524l(boolean z2) {
        this.f21463a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1524l) && this.f21463a == ((C1524l) obj).f21463a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21463a);
    }

    public final String toString() {
        return "UpDataIsTabChange(isTabChange=" + this.f21463a + ")";
    }
}
