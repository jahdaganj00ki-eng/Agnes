package b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b6.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1385B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1385B f20732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1385B f20733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1385B f20734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1385B[] f20735d;

    static {
        EnumC1385B enumC1385B = new EnumC1385B("NORMAL", 0);
        f20732a = enumC1385B;
        EnumC1385B enumC1385B2 = new EnumC1385B("BOLD", 1);
        f20733b = enumC1385B2;
        EnumC1385B enumC1385B3 = new EnumC1385B("LINK", 2);
        f20734c = enumC1385B3;
        EnumC1385B[] enumC1385BArr = {enumC1385B, enumC1385B2, enumC1385B3};
        f20735d = enumC1385BArr;
        rc.a.o(enumC1385BArr);
    }

    public static EnumC1385B valueOf(String str) {
        return (EnumC1385B) Enum.valueOf(EnumC1385B.class, str);
    }

    public static EnumC1385B[] values() {
        return (EnumC1385B[]) f20735d.clone();
    }
}
