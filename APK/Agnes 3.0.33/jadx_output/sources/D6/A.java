package D6;

import p2.C3379i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0219d f2920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f2921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f2922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f2923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ hc.b f2924f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2925a;

    static {
        A a10 = new A("EN", 0, "en");
        f2921c = a10;
        A a11 = new A("ES", 1, "es");
        A a12 = new A("FIL", 2, "fil");
        A a13 = new A("FR", 3, "fr");
        A a14 = new A("AR", 4, "ar");
        A a15 = new A("HI", 5, "hi");
        A a16 = new A("ID", 6, "id");
        A a17 = new A("JA", 7, "ja");
        A a18 = new A("KO", 8, "ko");
        A a19 = new A("MS", 9, "ms");
        A a20 = new A("PT", 10, "pt");
        A a21 = new A("TH", 11, "th");
        A a22 = new A("TR", 12, "tr");
        A a23 = new A("VI", 13, "vi");
        A a24 = new A("ZH", 14, "zh");
        f2922d = a24;
        A[] aArr = {a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24};
        f2923e = aArr;
        f2924f = rc.a.o(aArr);
        f2920b = new C0219d();
    }

    public A(String str, int i6, String str2) {
        this.f2925a = str2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f2923e.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final String a() throws Ac.v {
        switch (ordinal()) {
            case 0:
                return "English";
            case 1:
                return "Español";
            case 2:
                return "Filipino";
            case 3:
                return "Français";
            case 4:
                return "العربية";
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                return "हिन्दी";
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "Bahasa Indonesia";
            case C3379i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "日本語";
            case 8:
                return "한국어";
            case 9:
                return "Bahasa Melayu";
            case 10:
                return "Português";
            case 11:
                return "ภาษาไทย";
            case 12:
                return "Türkçe";
            case 13:
                return "Tiếng Việt";
            case 14:
                return "简体中文";
            default:
                throw new Ac.v();
        }
    }
}
