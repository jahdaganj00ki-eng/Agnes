package B6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
@Kc.g
public final class U implements Z {
    public static final T Companion = new T();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f972b;

    public /* synthetic */ U(int i6, boolean z2, boolean z7) {
        if (1 != (i6 & 1)) {
            Oc.Q.g(i6, 1, S.f970a.getDescriptor());
            throw null;
        }
        this.f971a = z2;
        if ((i6 & 2) == 0) {
            this.f972b = false;
        } else {
            this.f972b = z7;
        }
    }

    @Override // B6.Z
    public final boolean a() {
        return this.f972b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U) && this.f971a == ((U) obj).f971a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f971a);
    }

    public final String toString() {
        return "TeenModeFlow(targetEnable=" + this.f971a + ")";
    }

    public U(boolean z2) {
        this.f971a = z2;
    }
}
