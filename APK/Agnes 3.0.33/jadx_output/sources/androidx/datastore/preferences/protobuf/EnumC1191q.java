package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1191q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1191q f19414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1191q f19415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1191q[] f19416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1191q[] f19417e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19418a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1191q EF0;

    static {
        EnumC1199z enumC1199z = EnumC1199z.DOUBLE;
        EnumC1191q enumC1191q = new EnumC1191q("DOUBLE", 0, 0, 1, enumC1199z);
        EnumC1199z enumC1199z2 = EnumC1199z.FLOAT;
        EnumC1191q enumC1191q2 = new EnumC1191q("FLOAT", 1, 1, 1, enumC1199z2);
        EnumC1199z enumC1199z3 = EnumC1199z.LONG;
        EnumC1191q enumC1191q3 = new EnumC1191q("INT64", 2, 2, 1, enumC1199z3);
        EnumC1191q enumC1191q4 = new EnumC1191q("UINT64", 3, 3, 1, enumC1199z3);
        EnumC1199z enumC1199z4 = EnumC1199z.INT;
        EnumC1191q enumC1191q5 = new EnumC1191q("INT32", 4, 4, 1, enumC1199z4);
        EnumC1191q enumC1191q6 = new EnumC1191q("FIXED64", 5, 5, 1, enumC1199z3);
        EnumC1191q enumC1191q7 = new EnumC1191q("FIXED32", 6, 6, 1, enumC1199z4);
        EnumC1199z enumC1199z5 = EnumC1199z.BOOLEAN;
        EnumC1191q enumC1191q8 = new EnumC1191q("BOOL", 7, 7, 1, enumC1199z5);
        EnumC1199z enumC1199z6 = EnumC1199z.STRING;
        EnumC1191q enumC1191q9 = new EnumC1191q("STRING", 8, 8, 1, enumC1199z6);
        EnumC1199z enumC1199z7 = EnumC1199z.MESSAGE;
        EnumC1191q enumC1191q10 = new EnumC1191q("MESSAGE", 9, 9, 1, enumC1199z7);
        EnumC1199z enumC1199z8 = EnumC1199z.BYTE_STRING;
        EnumC1191q enumC1191q11 = new EnumC1191q("BYTES", 10, 10, 1, enumC1199z8);
        EnumC1191q enumC1191q12 = new EnumC1191q("UINT32", 11, 11, 1, enumC1199z4);
        EnumC1199z enumC1199z9 = EnumC1199z.ENUM;
        EnumC1191q enumC1191q13 = new EnumC1191q("ENUM", 12, 12, 1, enumC1199z9);
        EnumC1191q enumC1191q14 = new EnumC1191q("SFIXED32", 13, 13, 1, enumC1199z4);
        EnumC1191q enumC1191q15 = new EnumC1191q("SFIXED64", 14, 14, 1, enumC1199z3);
        EnumC1191q enumC1191q16 = new EnumC1191q("SINT32", 15, 15, 1, enumC1199z4);
        EnumC1191q enumC1191q17 = new EnumC1191q("SINT64", 16, 16, 1, enumC1199z3);
        EnumC1191q enumC1191q18 = new EnumC1191q("GROUP", 17, 17, 1, enumC1199z7);
        EnumC1191q enumC1191q19 = new EnumC1191q("DOUBLE_LIST", 18, 18, 2, enumC1199z);
        EnumC1191q enumC1191q20 = new EnumC1191q("FLOAT_LIST", 19, 19, 2, enumC1199z2);
        EnumC1191q enumC1191q21 = new EnumC1191q("INT64_LIST", 20, 20, 2, enumC1199z3);
        EnumC1191q enumC1191q22 = new EnumC1191q("UINT64_LIST", 21, 21, 2, enumC1199z3);
        EnumC1191q enumC1191q23 = new EnumC1191q("INT32_LIST", 22, 22, 2, enumC1199z4);
        EnumC1191q enumC1191q24 = new EnumC1191q("FIXED64_LIST", 23, 23, 2, enumC1199z3);
        EnumC1191q enumC1191q25 = new EnumC1191q("FIXED32_LIST", 24, 24, 2, enumC1199z4);
        EnumC1191q enumC1191q26 = new EnumC1191q("BOOL_LIST", 25, 25, 2, enumC1199z5);
        EnumC1191q enumC1191q27 = new EnumC1191q("STRING_LIST", 26, 26, 2, enumC1199z6);
        EnumC1191q enumC1191q28 = new EnumC1191q("MESSAGE_LIST", 27, 27, 2, enumC1199z7);
        EnumC1191q enumC1191q29 = new EnumC1191q("BYTES_LIST", 28, 28, 2, enumC1199z8);
        EnumC1191q enumC1191q30 = new EnumC1191q("UINT32_LIST", 29, 29, 2, enumC1199z4);
        EnumC1191q enumC1191q31 = new EnumC1191q("ENUM_LIST", 30, 30, 2, enumC1199z9);
        EnumC1191q enumC1191q32 = new EnumC1191q("SFIXED32_LIST", 31, 31, 2, enumC1199z4);
        EnumC1191q enumC1191q33 = new EnumC1191q("SFIXED64_LIST", 32, 32, 2, enumC1199z3);
        EnumC1191q enumC1191q34 = new EnumC1191q("SINT32_LIST", 33, 33, 2, enumC1199z4);
        EnumC1191q enumC1191q35 = new EnumC1191q("SINT64_LIST", 34, 34, 2, enumC1199z3);
        EnumC1191q enumC1191q36 = new EnumC1191q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1199z);
        f19414b = enumC1191q36;
        EnumC1191q enumC1191q37 = new EnumC1191q("FLOAT_LIST_PACKED", 36, 36, 3, enumC1199z2);
        EnumC1191q enumC1191q38 = new EnumC1191q("INT64_LIST_PACKED", 37, 37, 3, enumC1199z3);
        EnumC1191q enumC1191q39 = new EnumC1191q("UINT64_LIST_PACKED", 38, 38, 3, enumC1199z3);
        EnumC1191q enumC1191q40 = new EnumC1191q("INT32_LIST_PACKED", 39, 39, 3, enumC1199z4);
        EnumC1191q enumC1191q41 = new EnumC1191q("FIXED64_LIST_PACKED", 40, 40, 3, enumC1199z3);
        EnumC1191q enumC1191q42 = new EnumC1191q("FIXED32_LIST_PACKED", 41, 41, 3, enumC1199z4);
        EnumC1191q enumC1191q43 = new EnumC1191q("BOOL_LIST_PACKED", 42, 42, 3, enumC1199z5);
        EnumC1191q enumC1191q44 = new EnumC1191q("UINT32_LIST_PACKED", 43, 43, 3, enumC1199z4);
        EnumC1191q enumC1191q45 = new EnumC1191q("ENUM_LIST_PACKED", 44, 44, 3, enumC1199z9);
        EnumC1191q enumC1191q46 = new EnumC1191q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1199z4);
        EnumC1191q enumC1191q47 = new EnumC1191q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1199z3);
        EnumC1191q enumC1191q48 = new EnumC1191q("SINT32_LIST_PACKED", 47, 47, 3, enumC1199z4);
        EnumC1191q enumC1191q49 = new EnumC1191q("SINT64_LIST_PACKED", 48, 48, 3, enumC1199z3);
        f19415c = enumC1191q49;
        f19417e = new EnumC1191q[]{enumC1191q, enumC1191q2, enumC1191q3, enumC1191q4, enumC1191q5, enumC1191q6, enumC1191q7, enumC1191q8, enumC1191q9, enumC1191q10, enumC1191q11, enumC1191q12, enumC1191q13, enumC1191q14, enumC1191q15, enumC1191q16, enumC1191q17, enumC1191q18, enumC1191q19, enumC1191q20, enumC1191q21, enumC1191q22, enumC1191q23, enumC1191q24, enumC1191q25, enumC1191q26, enumC1191q27, enumC1191q28, enumC1191q29, enumC1191q30, enumC1191q31, enumC1191q32, enumC1191q33, enumC1191q34, enumC1191q35, enumC1191q36, enumC1191q37, enumC1191q38, enumC1191q39, enumC1191q40, enumC1191q41, enumC1191q42, enumC1191q43, enumC1191q44, enumC1191q45, enumC1191q46, enumC1191q47, enumC1191q48, enumC1191q49, new EnumC1191q("GROUP_LIST", 49, 49, 2, enumC1199z7), new EnumC1191q("MAP", 50, 50, 4, EnumC1199z.VOID)};
        EnumC1191q[] enumC1191qArrValues = values();
        f19416d = new EnumC1191q[enumC1191qArrValues.length];
        for (EnumC1191q enumC1191q50 : enumC1191qArrValues) {
            f19416d[enumC1191q50.f19418a] = enumC1191q50;
        }
    }

    public EnumC1191q(String str, int i6, int i10, int i11, EnumC1199z enumC1199z) {
        this.f19418a = i10;
        int iB = E1.g.b(i11);
        if (iB == 1 || iB == 3) {
            enumC1199z.getClass();
        }
        if (i11 == 1) {
            enumC1199z.ordinal();
        }
    }

    public static EnumC1191q valueOf(String str) {
        return (EnumC1191q) Enum.valueOf(EnumC1191q.class, str);
    }

    public static EnumC1191q[] values() {
        return (EnumC1191q[]) f19417e.clone();
    }
}
