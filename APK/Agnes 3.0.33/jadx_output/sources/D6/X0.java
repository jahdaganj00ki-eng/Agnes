package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f3137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X0 f3138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ X0[] f3139c;

    static {
        X0 x0 = new X0("Email", 0);
        f3137a = x0;
        X0 x02 = new X0("Phone", 1);
        f3138b = x02;
        X0[] x0Arr = {x0, x02};
        f3139c = x0Arr;
        rc.a.o(x0Arr);
    }

    public static X0 valueOf(String str) {
        return (X0) Enum.valueOf(X0.class, str);
    }

    public static X0[] values() {
        return (X0[]) f3139c.clone();
    }
}
