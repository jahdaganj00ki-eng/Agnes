package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f2181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f2182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z1[] f2183c;

    static {
        z1 z1Var = new z1("Auto", 0);
        f2181a = z1Var;
        z1 z1Var2 = new z1("Keyboard", 1);
        f2182b = z1Var2;
        z1[] z1VarArr = {z1Var, z1Var2};
        f2183c = z1VarArr;
        rc.a.o(z1VarArr);
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f2183c.clone();
    }
}
