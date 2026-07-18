package C0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f1210c;

    static {
        g gVar = new g("VIEW_APPEAR", 0);
        f1208a = gVar;
        g gVar2 = new g("VIEW_DISAPPEAR", 1);
        f1209b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f1210c = gVarArr;
        rc.a.o(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1210c.clone();
    }
}
