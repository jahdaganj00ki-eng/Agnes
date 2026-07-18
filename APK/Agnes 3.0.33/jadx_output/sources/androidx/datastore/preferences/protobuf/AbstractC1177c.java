package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1177c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f19351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f19352b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f19351a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f19352b = cls2 != null;
    }

    public static boolean a() {
        return (f19351a == null || f19352b) ? false : true;
    }
}
