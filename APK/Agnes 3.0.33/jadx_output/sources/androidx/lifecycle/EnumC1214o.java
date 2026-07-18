package androidx.lifecycle;

import p2.C3379i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1214o {
    private static final /* synthetic */ hc.a $ENTRIES;
    private static final /* synthetic */ EnumC1214o[] $VALUES;
    public static final C1212m Companion;
    public static final EnumC1214o ON_ANY;
    public static final EnumC1214o ON_CREATE;
    public static final EnumC1214o ON_DESTROY;
    public static final EnumC1214o ON_PAUSE;
    public static final EnumC1214o ON_RESUME;
    public static final EnumC1214o ON_START;
    public static final EnumC1214o ON_STOP;

    static {
        EnumC1214o enumC1214o = new EnumC1214o("ON_CREATE", 0);
        ON_CREATE = enumC1214o;
        EnumC1214o enumC1214o2 = new EnumC1214o("ON_START", 1);
        ON_START = enumC1214o2;
        EnumC1214o enumC1214o3 = new EnumC1214o("ON_RESUME", 2);
        ON_RESUME = enumC1214o3;
        EnumC1214o enumC1214o4 = new EnumC1214o("ON_PAUSE", 3);
        ON_PAUSE = enumC1214o4;
        EnumC1214o enumC1214o5 = new EnumC1214o("ON_STOP", 4);
        ON_STOP = enumC1214o5;
        EnumC1214o enumC1214o6 = new EnumC1214o("ON_DESTROY", 5);
        ON_DESTROY = enumC1214o6;
        EnumC1214o enumC1214o7 = new EnumC1214o("ON_ANY", 6);
        ON_ANY = enumC1214o7;
        EnumC1214o[] enumC1214oArr = {enumC1214o, enumC1214o2, enumC1214o3, enumC1214o4, enumC1214o5, enumC1214o6, enumC1214o7};
        $VALUES = enumC1214oArr;
        $ENTRIES = rc.a.o(enumC1214oArr);
        Companion = new C1212m();
    }

    public static EnumC1214o valueOf(String str) {
        return (EnumC1214o) Enum.valueOf(EnumC1214o.class, str);
    }

    public static EnumC1214o[] values() {
        return (EnumC1214o[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final EnumC1215p a() throws Ac.v {
        switch (AbstractC1213n.f19550a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1215p.f19553c;
            case 3:
            case 4:
                return EnumC1215p.f19554d;
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                return EnumC1215p.f19555e;
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC1215p.f19551a;
            case C3379i.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new Ac.v();
        }
    }
}
