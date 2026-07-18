package D6;

import java.util.List;

/* JADX INFO: renamed from: D6.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0277w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3349b;

    public C0277w1(String str, List list) {
        this.f3348a = str;
        this.f3349b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0277w1)) {
            return false;
        }
        C0277w1 c0277w1 = (C0277w1) obj;
        return kotlin.jvm.internal.l.b(this.f3348a, c0277w1.f3348a) && kotlin.jvm.internal.l.b(this.f3349b, c0277w1.f3349b);
    }

    public final int hashCode() {
        return this.f3349b.hashCode() + (this.f3348a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuSection(id=" + this.f3348a + ", items=" + this.f3349b + ")";
    }
}
