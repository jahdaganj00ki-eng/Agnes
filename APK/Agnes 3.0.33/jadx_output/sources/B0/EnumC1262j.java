package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1262j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1262j f19934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1262j f19935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1262j f19936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1262j[] f19937d;

    static {
        EnumC1262j enumC1262j = new EnumC1262j("BEFORE", 0);
        f19934a = enumC1262j;
        EnumC1262j enumC1262j2 = new EnumC1262j("ON", 1);
        f19935b = enumC1262j2;
        EnumC1262j enumC1262j3 = new EnumC1262j("AFTER", 2);
        f19936c = enumC1262j3;
        EnumC1262j[] enumC1262jArr = {enumC1262j, enumC1262j2, enumC1262j3};
        f19937d = enumC1262jArr;
        rc.a.o(enumC1262jArr);
    }

    public static EnumC1262j valueOf(String str) {
        return (EnumC1262j) Enum.valueOf(EnumC1262j.class, str);
    }

    public static EnumC1262j[] values() {
        return (EnumC1262j[]) f19937d.clone();
    }
}
