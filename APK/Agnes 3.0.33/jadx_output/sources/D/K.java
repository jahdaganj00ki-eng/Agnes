package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f2381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K[] f2382b;

    static {
        K k = new K("Visible", 0);
        K k10 = new K("Clip", 1);
        f2381a = k10;
        K[] kArr = {k, k10, new K("ExpandIndicator", 2), new K("ExpandOrCollapseIndicator", 3)};
        f2382b = kArr;
        rc.a.o(kArr);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f2382b.clone();
    }
}
