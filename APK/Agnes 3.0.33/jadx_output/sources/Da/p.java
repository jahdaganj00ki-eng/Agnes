package da;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f23583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23584b;

    public p(Class cls, Class cls2) {
        this.f23583a = cls;
        this.f23584b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f23584b.equals(pVar.f23584b)) {
            return this.f23583a.equals(pVar.f23583a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23583a.hashCode() + (this.f23584b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f23584b;
        Class cls2 = this.f23583a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
