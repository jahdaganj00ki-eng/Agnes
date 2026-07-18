package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC0316b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0316b f4171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0316b f4172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0316b f4173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0316b[] f4174d;

    static {
        EnumC0316b enumC0316b = new EnumC0316b("None", 0);
        f4171a = enumC0316b;
        EnumC0316b enumC0316b2 = new EnumC0316b("Cancelled", 1);
        f4172b = enumC0316b2;
        EnumC0316b enumC0316b3 = new EnumC0316b("Redirected", 2);
        f4173c = enumC0316b3;
        EnumC0316b[] enumC0316bArr = {enumC0316b, enumC0316b2, enumC0316b3, new EnumC0316b("RedirectCancelled", 3)};
        f4174d = enumC0316bArr;
        rc.a.o(enumC0316bArr);
    }

    public static EnumC0316b valueOf(String str) {
        return (EnumC0316b) Enum.valueOf(EnumC0316b.class, str);
    }

    public static EnumC0316b[] values() {
        return (EnumC0316b[]) f4174d.clone();
    }
}
