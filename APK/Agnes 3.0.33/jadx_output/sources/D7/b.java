package D7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f3399d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3400a;

    static {
        b bVar = new b("LONG", 0, 1);
        f3397b = bVar;
        b bVar2 = new b("NORMAL", 1, 0);
        f3398c = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f3399d = bVarArr;
        rc.a.o(bVarArr);
    }

    public b(String str, int i6, int i10) {
        this.f3400a = i10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3399d.clone();
    }
}
