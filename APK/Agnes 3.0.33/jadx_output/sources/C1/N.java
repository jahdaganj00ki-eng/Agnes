package C1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f1260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f1261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ N[] f1262c;

    static {
        N n2 = new N("Inherit", 0);
        f1260a = n2;
        N n10 = new N("SecureOn", 1);
        f1261b = n10;
        N[] nArr = {n2, n10, new N("SecureOff", 2)};
        f1262c = nArr;
        rc.a.o(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f1262c.clone();
    }
}
