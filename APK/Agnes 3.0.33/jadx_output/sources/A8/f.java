package A8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f378d;

    static {
        f fVar = new f("NETWORK_UNMETERED", 0);
        f375a = fVar;
        f fVar2 = new f("DEVICE_IDLE", 1);
        f376b = fVar2;
        f fVar3 = new f("DEVICE_CHARGING", 2);
        f377c = fVar3;
        f378d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f378d.clone();
    }
}
