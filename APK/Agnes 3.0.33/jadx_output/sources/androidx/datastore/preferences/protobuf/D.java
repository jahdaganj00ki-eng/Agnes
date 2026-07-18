package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class D implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f19289a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final V a(Class cls) {
        for (K k : this.f19289a) {
            if (k.b(cls)) {
                return k.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        for (K k : this.f19289a) {
            if (k.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
