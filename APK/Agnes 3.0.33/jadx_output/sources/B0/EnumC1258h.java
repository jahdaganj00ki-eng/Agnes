package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1258h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1258h f19920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1258h f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1258h f19922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1258h[] f19923d;

    static {
        EnumC1258h enumC1258h = new EnumC1258h("CROSSED", 0);
        f19920a = enumC1258h;
        EnumC1258h enumC1258h2 = new EnumC1258h("NOT_CROSSED", 1);
        f19921b = enumC1258h2;
        EnumC1258h enumC1258h3 = new EnumC1258h("COLLAPSED", 2);
        f19922c = enumC1258h3;
        EnumC1258h[] enumC1258hArr = {enumC1258h, enumC1258h2, enumC1258h3};
        f19923d = enumC1258hArr;
        rc.a.o(enumC1258hArr);
    }

    public static EnumC1258h valueOf(String str) {
        return (EnumC1258h) Enum.valueOf(EnumC1258h.class, str);
    }

    public static EnumC1258h[] values() {
        return (EnumC1258h[]) f19923d.clone();
    }
}
