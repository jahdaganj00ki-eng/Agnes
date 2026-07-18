package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f20355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k0[] f20357c;

    static {
        k0 k0Var = new k0("Min", 0);
        f20355a = k0Var;
        k0 k0Var2 = new k0("Max", 1);
        f20356b = k0Var2;
        k0[] k0VarArr = {k0Var, k0Var2};
        f20357c = k0VarArr;
        rc.a.o(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f20357c.clone();
    }
}
