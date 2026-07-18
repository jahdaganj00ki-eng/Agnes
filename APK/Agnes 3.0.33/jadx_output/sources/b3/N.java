package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f20492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f20493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f20494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ N[] f20495d;

    static {
        N n2 = new N("PASS_THROUGH", 0);
        f20492a = n2;
        N n10 = new N("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f20493b = n10;
        N n11 = new N("DISCARDING", 2);
        f20494c = n11;
        f20495d = new N[]{n2, n10, n11};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f20495d.clone();
    }
}
