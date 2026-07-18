package E6;

import e5.AbstractC1874g;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class x implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3890a;

    public x(int i6) {
        this.f3890a = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f3890a == ((x) obj).f3890a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3890a);
    }

    public final String toString() {
        return AbstractC1874g.g(this.f3890a, "LoadMore(categoryId=", ")");
    }
}
