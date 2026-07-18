package e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1869b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1869b f23725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1869b f23726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1869b[] f23727d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23728a;

    static {
        EnumC1869b enumC1869b = new EnumC1869b("Template", 0, "template");
        EnumC1869b enumC1869b2 = new EnumC1869b("AiArt", 1, "ai_design");
        f23725b = enumC1869b2;
        EnumC1869b enumC1869b3 = new EnumC1869b("RolePlay", 2, "game");
        f23726c = enumC1869b3;
        EnumC1869b[] enumC1869bArr = {enumC1869b, enumC1869b2, enumC1869b3};
        f23727d = enumC1869bArr;
        rc.a.o(enumC1869bArr);
    }

    public EnumC1869b(String str, int i6, String str2) {
        this.f23728a = str2;
    }

    public static EnumC1869b valueOf(String str) {
        return (EnumC1869b) Enum.valueOf(EnumC1869b.class, str);
    }

    public static EnumC1869b[] values() {
        return (EnumC1869b[]) f23727d.clone();
    }
}
