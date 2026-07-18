package da;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k4.V;

/* JADX INFO: renamed from: da.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1853b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f23549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f23550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f23553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f23554g;

    public C1853b(String str, Set set, Set set2, int i6, int i10, d dVar, Set set3) {
        this.f23548a = str;
        this.f23549b = Collections.unmodifiableSet(set);
        this.f23550c = Collections.unmodifiableSet(set2);
        this.f23551d = i6;
        this.f23552e = i10;
        this.f23553f = dVar;
        this.f23554g = Collections.unmodifiableSet(set3);
    }

    public static C1852a a(p pVar) {
        return new C1852a(pVar, new p[0]);
    }

    public static C1852a b(Class cls) {
        return new C1852a(cls, new Class[0]);
    }

    public static C1853b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            V.k(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new C1853b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new V2.c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f23549b.toArray()) + ">{" + this.f23551d + ", type=" + this.f23552e + ", deps=" + Arrays.toString(this.f23550c.toArray()) + "}";
    }
}
