package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0219d f2929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f2930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f2931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f2932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B[] f2933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ hc.b f2934g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2935a;

    static {
        B b10 = new B("SYSTEM", 0, "system");
        f2930c = b10;
        B b11 = new B("LIGHT", 1, "light");
        f2931d = b11;
        B b12 = new B("DARK", 2, "dark");
        f2932e = b12;
        B[] bArr = {b10, b11, b12};
        f2933f = bArr;
        f2934g = rc.a.o(bArr);
        f2929b = new C0219d();
    }

    public B(String str, int i6, String str2) {
        this.f2935a = str2;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f2933f.clone();
    }
}
