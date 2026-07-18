package b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1414a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1414a f20858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1414a f20859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1414a f20860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1414a[] f20861d;

    static {
        EnumC1414a enumC1414a = new EnumC1414a("LevelFree", 0);
        f20858a = enumC1414a;
        EnumC1414a enumC1414a2 = new EnumC1414a("LevelOther", 1);
        f20859b = enumC1414a2;
        EnumC1414a enumC1414a3 = new EnumC1414a("LevelMax", 2);
        f20860c = enumC1414a3;
        EnumC1414a[] enumC1414aArr = {enumC1414a, enumC1414a2, enumC1414a3};
        f20861d = enumC1414aArr;
        rc.a.o(enumC1414aArr);
    }

    public static EnumC1414a valueOf(String str) {
        return (EnumC1414a) Enum.valueOf(EnumC1414a.class, str);
    }

    public static EnumC1414a[] values() {
        return (EnumC1414a[]) f20861d.clone();
    }
}
