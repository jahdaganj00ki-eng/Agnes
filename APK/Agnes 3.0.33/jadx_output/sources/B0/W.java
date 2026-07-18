package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f19858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f19859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f19860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ W[] f19861d;

    static {
        W w4 = new W("Left", 0);
        f19858a = w4;
        W w10 = new W("Middle", 1);
        f19859b = w10;
        W w11 = new W("Right", 2);
        f19860c = w11;
        W[] wArr = {w4, w10, w11};
        f19861d = wArr;
        rc.a.o(wArr);
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f19861d.clone();
    }
}
