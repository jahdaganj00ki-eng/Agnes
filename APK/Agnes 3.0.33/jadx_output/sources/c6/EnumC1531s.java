package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c6.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1531s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1531s f21478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1531s f21479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1531s[] f21480c;

    static {
        EnumC1531s enumC1531s = new EnumC1531s("likes", 0);
        f21478a = enumC1531s;
        EnumC1531s enumC1531s2 = new EnumC1531s("love", 1);
        EnumC1531s enumC1531s3 = new EnumC1531s("found_funny", 2);
        EnumC1531s enumC1531s4 = new EnumC1531s("were_surprised", 3);
        EnumC1531s enumC1531s5 = new EnumC1531s("were_sad", 4);
        EnumC1531s enumC1531s6 = new EnumC1531s("were_angry", 5);
        EnumC1531s enumC1531s7 = new EnumC1531s("unselected", 6);
        f21479b = enumC1531s7;
        EnumC1531s[] enumC1531sArr = {enumC1531s, enumC1531s2, enumC1531s3, enumC1531s4, enumC1531s5, enumC1531s6, enumC1531s7};
        f21480c = enumC1531sArr;
        rc.a.o(enumC1531sArr);
    }

    public static EnumC1531s valueOf(String str) {
        return (EnumC1531s) Enum.valueOf(EnumC1531s.class, str);
    }

    public static EnumC1531s[] values() {
        return (EnumC1531s[]) f21480c.clone();
    }
}
