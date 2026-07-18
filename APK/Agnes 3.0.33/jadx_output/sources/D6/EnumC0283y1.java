package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D6.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC0283y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0283y1 f3372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0283y1 f3373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0283y1[] f3374c;

    static {
        EnumC0283y1 enumC0283y1 = new EnumC0283y1("Arrow", 0);
        f3372a = enumC0283y1;
        EnumC0283y1 enumC0283y12 = new EnumC0283y1("Switch", 1);
        f3373b = enumC0283y12;
        EnumC0283y1[] enumC0283y1Arr = {enumC0283y1, enumC0283y12};
        f3374c = enumC0283y1Arr;
        rc.a.o(enumC0283y1Arr);
    }

    public static EnumC0283y1 valueOf(String str) {
        return (EnumC0283y1) Enum.valueOf(EnumC0283y1.class, str);
    }

    public static EnumC0283y1[] values() {
        return (EnumC0283y1[]) f3374c.clone();
    }
}
