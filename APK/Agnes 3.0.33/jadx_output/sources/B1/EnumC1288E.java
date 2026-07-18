package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1288E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1288E f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1288E f20090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1288E f20091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1288E[] f20092d;

    static {
        EnumC1288E enumC1288E = new EnumC1288E("InMeasureBlock", 0);
        f20089a = enumC1288E;
        EnumC1288E enumC1288E2 = new EnumC1288E("InLayoutBlock", 1);
        f20090b = enumC1288E2;
        EnumC1288E enumC1288E3 = new EnumC1288E("NotUsed", 2);
        f20091c = enumC1288E3;
        EnumC1288E[] enumC1288EArr = {enumC1288E, enumC1288E2, enumC1288E3};
        f20092d = enumC1288EArr;
        rc.a.o(enumC1288EArr);
    }

    public static EnumC1288E valueOf(String str) {
        return (EnumC1288E) Enum.valueOf(EnumC1288E.class, str);
    }

    public static EnumC1288E[] values() {
        return (EnumC1288E[]) f20092d.clone();
    }
}
