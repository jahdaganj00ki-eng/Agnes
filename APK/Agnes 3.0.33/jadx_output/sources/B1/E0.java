package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f20093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E0 f20094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E0 f20095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E0[] f20096d;

    static {
        E0 e0 = new E0("ContinueTraversal", 0);
        f20093a = e0;
        E0 e02 = new E0("SkipSubtreeAndContinueTraversal", 1);
        f20094b = e02;
        E0 e03 = new E0("CancelTraversal", 2);
        f20095c = e03;
        E0[] e0Arr = {e0, e02, e03};
        f20096d = e0Arr;
        rc.a.o(e0Arr);
    }

    public static E0 valueOf(String str) {
        return (E0) Enum.valueOf(E0.class, str);
    }

    public static E0[] values() {
        return (E0[]) f20096d.clone();
    }
}
