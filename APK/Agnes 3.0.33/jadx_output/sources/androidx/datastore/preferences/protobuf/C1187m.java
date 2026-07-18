package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1187m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C1187m f19406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1187m f19407b;

    static {
        C1187m c1187m = new C1187m();
        Map map = Collections.EMPTY_MAP;
        f19407b = c1187m;
    }

    public static C1187m a() {
        C1187m c1187m;
        T t10 = T.f19321c;
        C1187m c1187m2 = f19406a;
        if (c1187m2 != null) {
            return c1187m2;
        }
        synchronized (C1187m.class) {
            try {
                c1187m = f19406a;
                if (c1187m == null) {
                    Class cls = AbstractC1186l.f19405a;
                    C1187m c1187m3 = null;
                    if (cls != null) {
                        try {
                            c1187m3 = (C1187m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1187m = c1187m3 != null ? c1187m3 : f19407b;
                    f19406a = c1187m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1187m;
    }
}
