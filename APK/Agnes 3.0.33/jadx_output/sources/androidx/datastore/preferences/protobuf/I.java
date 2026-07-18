package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class I {
    public static H a(Object obj, Object obj2) {
        H hB = (H) obj;
        H h10 = (H) obj2;
        if (!h10.isEmpty()) {
            if (!hB.f19298a) {
                hB = hB.b();
            }
            hB.a();
            if (!h10.isEmpty()) {
                hB.putAll(h10);
            }
        }
        return hB;
    }
}
