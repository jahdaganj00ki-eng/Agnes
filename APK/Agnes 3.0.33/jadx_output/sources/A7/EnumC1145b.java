package a7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1145b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1145b f18828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1145b f18829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1145b[] f18830c;

    static {
        EnumC1145b enumC1145b = new EnumC1145b("groupsShare", 0);
        f18828a = enumC1145b;
        EnumC1145b enumC1145b2 = new EnumC1145b("unknown", 1);
        f18829b = enumC1145b2;
        EnumC1145b[] enumC1145bArr = {enumC1145b, enumC1145b2};
        f18830c = enumC1145bArr;
        rc.a.o(enumC1145bArr);
    }

    public static EnumC1145b valueOf(String str) {
        return (EnumC1145b) Enum.valueOf(EnumC1145b.class, str);
    }

    public static EnumC1145b[] values() {
        return (EnumC1145b[]) f18830c.clone();
    }
}
