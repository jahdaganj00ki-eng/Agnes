package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f2335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f2336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f2337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ D[] f2338d;

    static {
        D d5 = new D("Vertical", 0);
        f2335a = d5;
        D d10 = new D("Horizontal", 1);
        f2336b = d10;
        D d11 = new D("Both", 2);
        f2337c = d11;
        D[] dArr = {d5, d10, d11};
        f2338d = dArr;
        rc.a.o(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f2338d.clone();
    }
}
