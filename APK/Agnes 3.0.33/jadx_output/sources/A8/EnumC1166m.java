package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1166m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1166m f18950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1166m f18951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1166m[] f18952c;

    static {
        EnumC1166m enumC1166m = new EnumC1166m("Immediately", 0);
        f18950a = enumC1166m;
        EnumC1166m enumC1166m2 = new EnumC1166m("OnIterationFinish", 1);
        f18951b = enumC1166m2;
        EnumC1166m[] enumC1166mArr = {enumC1166m, enumC1166m2};
        f18952c = enumC1166mArr;
        rc.a.o(enumC1166mArr);
    }

    public static EnumC1166m valueOf(String str) {
        return (EnumC1166m) Enum.valueOf(EnumC1166m.class, str);
    }

    public static EnumC1166m[] values() {
        return (EnumC1166m[]) f18952c.clone();
    }
}
