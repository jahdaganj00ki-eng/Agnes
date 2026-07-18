package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f4219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f4220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f4221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f4222d;

    static {
        z zVar = new z("Active", 0);
        f4219a = zVar;
        z zVar2 = new z("ActiveParent", 1);
        f4220b = zVar2;
        z zVar3 = new z("Captured", 2);
        z zVar4 = new z("Inactive", 3);
        f4221c = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f4222d = zVarArr;
        rc.a.o(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f4222d.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final boolean a() throws Ac.v {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new Ac.v();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final boolean b() throws Ac.v {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new Ac.v();
            }
        }
        return true;
    }
}
