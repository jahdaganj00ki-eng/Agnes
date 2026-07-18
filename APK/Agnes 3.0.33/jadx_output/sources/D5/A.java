package D5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f2767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f2768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f2769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ A[] f2770d;

    static {
        A a10 = new A("MD", 0);
        f2767a = a10;
        A a11 = new A("PDF", 1);
        f2768b = a11;
        A a12 = new A("PPTX", 2);
        A a13 = new A("ORIGINAL", 3);
        f2769c = a13;
        A[] aArr = {a10, a11, a12, a13};
        f2770d = aArr;
        rc.a.o(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f2770d.clone();
    }
}
