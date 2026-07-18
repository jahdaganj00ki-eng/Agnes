package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ R0[] f21093a;

    static {
        R0[] r0Arr = {new R0("Shown", 0), new R0("Hidden", 1)};
        f21093a = r0Arr;
        rc.a.o(r0Arr);
    }

    public static R0 valueOf(String str) {
        return (R0) Enum.valueOf(R0.class, str);
    }

    public static R0[] values() {
        return (R0[]) f21093a.clone();
    }
}
