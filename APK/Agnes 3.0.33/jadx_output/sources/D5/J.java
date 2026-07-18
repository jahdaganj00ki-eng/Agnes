package D5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f2808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f2809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f2810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ J[] f2811e;

    static {
        J j4 = new J("OPEN_CSV_BROWSER", 0);
        f2807a = j4;
        J j10 = new J("OPEN_HTML_PREVIEW", 1);
        f2808b = j10;
        J j11 = new J("OPEN_MARKDOWN_PREVIEW", 2);
        f2809c = j11;
        J j12 = new J("DIRECT_DOWNLOAD", 3);
        f2810d = j12;
        J[] jArr = {j4, j10, j11, j12};
        f2811e = jArr;
        rc.a.o(jArr);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f2811e.clone();
    }
}
