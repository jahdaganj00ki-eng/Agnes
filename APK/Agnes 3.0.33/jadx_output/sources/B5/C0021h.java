package B5;

/* JADX INFO: renamed from: B5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0021h implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f792b;

    public C0021h(boolean z2, String str, int i6) {
        z2 = (i6 & 1) != 0 ? true : z2;
        str = (i6 & 2) != 0 ? null : str;
        this.f791a = z2;
        this.f792b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0021h)) {
            return false;
        }
        C0021h c0021h = (C0021h) obj;
        return this.f791a == c0021h.f791a && kotlin.jvm.internal.l.b(this.f792b, c0021h.f792b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f791a) * 31;
        String str = this.f792b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Search(isShowSearchBar=" + this.f791a + ", searchText=" + this.f792b + ")";
    }
}
