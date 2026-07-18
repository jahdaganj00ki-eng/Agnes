package androidx.lifecycle;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface d0 {
    default b0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default b0 b(kotlin.jvm.internal.e eVar, E2.d dVar) {
        return c(n0.O.e(eVar), dVar);
    }

    default b0 c(Class cls, E2.d dVar) {
        return a(cls);
    }
}
