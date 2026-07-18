package com.google.android.gms.internal.measurement;

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
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class V2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V2 f22162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V2 f22163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ V2[] f22164e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W2 f22165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22166b;

    /* JADX INFO: Fake field, exist only in values array */
    V2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    V2 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    V2 EF0;

    static {
        V2 v22 = new V2("DOUBLE", 0, W2.f22177d, 1);
        V2 v23 = new V2("FLOAT", 1, W2.f22176c, 5);
        W2 w22 = W2.f22175b;
        V2 v24 = new V2("INT64", 2, w22, 0);
        V2 v25 = new V2("UINT64", 3, w22, 0);
        W2 w23 = W2.f22174a;
        V2 v26 = new V2("INT32", 4, w23, 0);
        V2 v27 = new V2("FIXED64", 5, w22, 1);
        V2 v28 = new V2("FIXED32", 6, w23, 5);
        V2 v29 = new V2("BOOL", 7, W2.f22178e, 0);
        V2 v210 = new V2("STRING", 8, W2.f22179f, 2);
        f22162c = v210;
        W2 w24 = W2.f22182i;
        V2 v211 = new V2("GROUP", 9, w24, 3);
        f22163d = v211;
        f22164e = new V2[]{v22, v23, v24, v25, v26, v27, v28, v29, v210, v211, new V2("MESSAGE", 10, w24, 2), new V2("BYTES", 11, W2.f22180g, 2), new V2("UINT32", 12, w23, 0), new V2("ENUM", 13, W2.f22181h, 0), new V2("SFIXED32", 14, w23, 5), new V2("SFIXED64", 15, w22, 1), new V2("SINT32", 16, w23, 0), new V2("SINT64", 17, w22, 0)};
    }

    public V2(String str, int i6, W2 w22, int i10) {
        this.f22165a = w22;
        this.f22166b = i10;
    }

    public static V2[] values() {
        return (V2[]) f22164e.clone();
    }
}
