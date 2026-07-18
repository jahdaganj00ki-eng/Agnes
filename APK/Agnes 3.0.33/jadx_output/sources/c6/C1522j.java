package c6;

import java.util.List;

/* JADX INFO: renamed from: c6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1522j implements InterfaceC1528p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21461b;

    public C1522j(List list, List list2) {
        kotlin.jvm.internal.l.f(list, "myCategories");
        kotlin.jvm.internal.l.f(list2, "otherCategories");
        this.f21460a = list;
        this.f21461b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1522j)) {
            return false;
        }
        C1522j c1522j = (C1522j) obj;
        return kotlin.jvm.internal.l.b(this.f21460a, c1522j.f21460a) && kotlin.jvm.internal.l.b(this.f21461b, c1522j.f21461b);
    }

    public final int hashCode() {
        return this.f21461b.hashCode() + (this.f21460a.hashCode() * 31);
    }

    public final String toString() {
        return "SetTab(myCategories=" + this.f21460a + ", otherCategories=" + this.f21461b + ")";
    }
}
