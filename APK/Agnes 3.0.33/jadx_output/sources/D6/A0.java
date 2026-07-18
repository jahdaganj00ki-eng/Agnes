package D6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2927b;

    public A0(String str, String str2) {
        this.f2926a = str;
        this.f2927b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return kotlin.jvm.internal.l.b(this.f2926a, a02.f2926a) && kotlin.jvm.internal.l.b(this.f2927b, a02.f2927b);
    }

    public final int hashCode() {
        return this.f2927b.hashCode() + (this.f2926a.hashCode() * 31);
    }

    public final String toString() {
        return T0.a.p("State(baselineLanguageTag=", this.f2926a, ", highlightedLanguageTag=", this.f2927b, ")");
    }
}
