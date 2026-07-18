package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1215p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1215p f19551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1215p f19552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1215p f19553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1215p f19554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1215p f19555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1215p[] f19556f;

    static {
        EnumC1215p enumC1215p = new EnumC1215p("DESTROYED", 0);
        f19551a = enumC1215p;
        EnumC1215p enumC1215p2 = new EnumC1215p("INITIALIZED", 1);
        f19552b = enumC1215p2;
        EnumC1215p enumC1215p3 = new EnumC1215p("CREATED", 2);
        f19553c = enumC1215p3;
        EnumC1215p enumC1215p4 = new EnumC1215p("STARTED", 3);
        f19554d = enumC1215p4;
        EnumC1215p enumC1215p5 = new EnumC1215p("RESUMED", 4);
        f19555e = enumC1215p5;
        EnumC1215p[] enumC1215pArr = {enumC1215p, enumC1215p2, enumC1215p3, enumC1215p4, enumC1215p5};
        f19556f = enumC1215pArr;
        rc.a.o(enumC1215pArr);
    }

    public static EnumC1215p valueOf(String str) {
        return (EnumC1215p) Enum.valueOf(EnumC1215p.class, str);
    }

    public static EnumC1215p[] values() {
        return (EnumC1215p[]) f19556f.clone();
    }
}
