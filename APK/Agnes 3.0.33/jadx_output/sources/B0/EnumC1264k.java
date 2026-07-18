package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1264k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1264k f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1264k f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1264k f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1264k f19964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1264k[] f19965e;

    static {
        EnumC1264k enumC1264k = new EnumC1264k("Up", 0);
        f19961a = enumC1264k;
        EnumC1264k enumC1264k2 = new EnumC1264k("Drag", 1);
        f19962b = enumC1264k2;
        EnumC1264k enumC1264k3 = new EnumC1264k("Timeout", 2);
        f19963c = enumC1264k3;
        EnumC1264k enumC1264k4 = new EnumC1264k("Cancel", 3);
        f19964d = enumC1264k4;
        EnumC1264k[] enumC1264kArr = {enumC1264k, enumC1264k2, enumC1264k3, enumC1264k4};
        f19965e = enumC1264kArr;
        rc.a.o(enumC1264kArr);
    }

    public static EnumC1264k valueOf(String str) {
        return (EnumC1264k) Enum.valueOf(EnumC1264k.class, str);
    }

    public static EnumC1264k[] values() {
        return (EnumC1264k[]) f19965e.clone();
    }
}
