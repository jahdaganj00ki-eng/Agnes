package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC0164h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0164h0 f2499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0164h0[] f2500b;

    static {
        EnumC0164h0 enumC0164h0 = new EnumC0164h0("Horizontal", 0);
        f2499a = enumC0164h0;
        EnumC0164h0[] enumC0164h0Arr = {enumC0164h0, new EnumC0164h0("Vertical", 1)};
        f2500b = enumC0164h0Arr;
        rc.a.o(enumC0164h0Arr);
    }

    public static EnumC0164h0 valueOf(String str) {
        return (EnumC0164h0) Enum.valueOf(EnumC0164h0.class, str);
    }

    public static EnumC0164h0[] values() {
        return (EnumC0164h0[]) f2500b.clone();
    }
}
