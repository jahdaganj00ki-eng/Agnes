package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: C5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC0080a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0080a f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0080a f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0080a[] f1877c;

    static {
        EnumC0080a enumC0080a = new EnumC0080a("Start", 0);
        f1875a = enumC0080a;
        EnumC0080a enumC0080a2 = new EnumC0080a("End", 1);
        f1876b = enumC0080a2;
        EnumC0080a[] enumC0080aArr = {enumC0080a, enumC0080a2};
        f1877c = enumC0080aArr;
        rc.a.o(enumC0080aArr);
    }

    public static EnumC0080a valueOf(String str) {
        return (EnumC0080a) Enum.valueOf(EnumC0080a.class, str);
    }

    public static EnumC0080a[] values() {
        return (EnumC0080a[]) f1877c.clone();
    }
}
