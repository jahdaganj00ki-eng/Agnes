package D4;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2699e;

    public D(String str, String str2, String str3, String str4, String str5) {
        this.f2695a = str;
        this.f2696b = str2;
        this.f2697c = str3;
        this.f2698d = str4;
        this.f2699e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.l.b(((D) obj).f2695a, this.f2695a);
    }

    public final int hashCode() {
        return this.f2695a.hashCode();
    }

    public final String toString() {
        return this.f2695a;
    }
}
