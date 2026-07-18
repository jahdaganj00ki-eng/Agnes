package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b1.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1300Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1300Q f20200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1300Q f20201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1300Q f20202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1300Q[] f20203d;

    static {
        EnumC1300Q enumC1300Q = new EnumC1300Q("IsPlacedInLookahead", 0);
        f20200a = enumC1300Q;
        EnumC1300Q enumC1300Q2 = new EnumC1300Q("IsPlacedInApproach", 1);
        f20201b = enumC1300Q2;
        EnumC1300Q enumC1300Q3 = new EnumC1300Q("IsNotPlaced", 2);
        f20202c = enumC1300Q3;
        EnumC1300Q[] enumC1300QArr = {enumC1300Q, enumC1300Q2, enumC1300Q3};
        f20203d = enumC1300QArr;
        rc.a.o(enumC1300QArr);
    }

    public static EnumC1300Q valueOf(String str) {
        return (EnumC1300Q) Enum.valueOf(EnumC1300Q.class, str);
    }

    public static EnumC1300Q[] values() {
        return (EnumC1300Q[]) f20203d.clone();
    }
}
