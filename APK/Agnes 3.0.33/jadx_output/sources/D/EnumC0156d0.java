package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC0156d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0156d0 f2482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0156d0 f2483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0156d0[] f2484c;

    static {
        EnumC0156d0 enumC0156d0 = new EnumC0156d0("Min", 0);
        f2482a = enumC0156d0;
        EnumC0156d0 enumC0156d02 = new EnumC0156d0("Max", 1);
        f2483b = enumC0156d02;
        EnumC0156d0[] enumC0156d0Arr = {enumC0156d0, enumC0156d02};
        f2484c = enumC0156d0Arr;
        rc.a.o(enumC0156d0Arr);
    }

    public static EnumC0156d0 valueOf(String str) {
        return (EnumC0156d0) Enum.valueOf(EnumC0156d0.class, str);
    }

    public static EnumC0156d0[] values() {
        return (EnumC0156d0[]) f2484c.clone();
    }
}
