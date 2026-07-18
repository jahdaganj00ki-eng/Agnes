package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1337u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1337u f20386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1337u f20387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1337u f20388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1337u f20389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1337u[] f20390e;

    static {
        EnumC1337u enumC1337u = new EnumC1337u("LookaheadMeasurement", 0);
        f20386a = enumC1337u;
        EnumC1337u enumC1337u2 = new EnumC1337u("LookaheadPlacement", 1);
        f20387b = enumC1337u2;
        EnumC1337u enumC1337u3 = new EnumC1337u("Measurement", 2);
        f20388c = enumC1337u3;
        EnumC1337u enumC1337u4 = new EnumC1337u("Placement", 3);
        f20389d = enumC1337u4;
        EnumC1337u[] enumC1337uArr = {enumC1337u, enumC1337u2, enumC1337u3, enumC1337u4};
        f20390e = enumC1337uArr;
        rc.a.o(enumC1337uArr);
    }

    public static EnumC1337u valueOf(String str) {
        return (EnumC1337u) Enum.valueOf(EnumC1337u.class, str);
    }

    public static EnumC1337u[] values() {
        return (EnumC1337u[]) f20390e.clone();
    }
}
