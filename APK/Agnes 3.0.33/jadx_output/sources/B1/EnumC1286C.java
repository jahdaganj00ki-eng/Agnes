package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1286C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1286C f20079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1286C f20080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1286C f20081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1286C f20082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1286C f20083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1286C[] f20084f;

    static {
        EnumC1286C enumC1286C = new EnumC1286C("Measuring", 0);
        f20079a = enumC1286C;
        EnumC1286C enumC1286C2 = new EnumC1286C("LookaheadMeasuring", 1);
        f20080b = enumC1286C2;
        EnumC1286C enumC1286C3 = new EnumC1286C("LayingOut", 2);
        f20081c = enumC1286C3;
        EnumC1286C enumC1286C4 = new EnumC1286C("LookaheadLayingOut", 3);
        f20082d = enumC1286C4;
        EnumC1286C enumC1286C5 = new EnumC1286C("Idle", 4);
        f20083e = enumC1286C5;
        EnumC1286C[] enumC1286CArr = {enumC1286C, enumC1286C2, enumC1286C3, enumC1286C4, enumC1286C5};
        f20084f = enumC1286CArr;
        rc.a.o(enumC1286CArr);
    }

    public static EnumC1286C valueOf(String str) {
        return (EnumC1286C) Enum.valueOf(EnumC1286C.class, str);
    }

    public static EnumC1286C[] values() {
        return (EnumC1286C[]) f20084f.clone();
    }
}
