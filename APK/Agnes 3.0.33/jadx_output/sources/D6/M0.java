package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ M0[] f3041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hc.b f3042d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3044b;

    static {
        M0[] m0Arr = {new M0("MALE", 0, 2131887635, "male"), new M0("FEMALE", 1, 2131887148, "female"), new M0("OTHER", 2, 2131887878, "other")};
        f3041c = m0Arr;
        f3042d = rc.a.o(m0Arr);
    }

    public M0(String str, int i6, int i10, String str2) {
        this.f3043a = str2;
        this.f3044b = i10;
    }

    public static M0 valueOf(String str) {
        return (M0) Enum.valueOf(M0.class, str);
    }

    public static M0[] values() {
        return (M0[]) f3041c.clone();
    }
}
