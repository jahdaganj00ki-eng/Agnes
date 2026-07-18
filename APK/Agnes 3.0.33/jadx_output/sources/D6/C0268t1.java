package D6;

/* JADX INFO: renamed from: D6.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0268t1 implements InterfaceC0271u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0242k1 f3325a;

    public C0268t1(EnumC0242k1 enumC0242k1) {
        kotlin.jvm.internal.l.f(enumC0242k1, "action");
        this.f3325a = enumC0242k1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0268t1) && this.f3325a == ((C0268t1) obj).f3325a;
    }

    public final int hashCode() {
        return this.f3325a.hashCode();
    }

    public final String toString() {
        return "ItemClick(action=" + this.f3325a + ")";
    }
}
