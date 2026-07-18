package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1228A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1228A f19728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1228A f19729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1228A[] f19730c;

    static {
        EnumC1228A enumC1228A = new EnumC1228A("EditableText", 0);
        f19728a = enumC1228A;
        EnumC1228A enumC1228A2 = new EnumC1228A("StaticText", 1);
        f19729b = enumC1228A2;
        EnumC1228A[] enumC1228AArr = {enumC1228A, enumC1228A2};
        f19730c = enumC1228AArr;
        rc.a.o(enumC1228AArr);
    }

    public static EnumC1228A valueOf(String str) {
        return (EnumC1228A) Enum.valueOf(EnumC1228A.class, str);
    }

    public static EnumC1228A[] values() {
        return (EnumC1228A[]) f19730c.clone();
    }
}
