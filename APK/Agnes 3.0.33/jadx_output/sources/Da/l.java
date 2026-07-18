package da;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class l implements Da.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23574c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f23575a = f23574c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Da.b f23576b;

    public l(Da.b bVar) {
        this.f23576b = bVar;
    }

    @Override // Da.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f23575a;
        Object obj3 = f23574c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f23575a;
                if (obj == obj3) {
                    obj = this.f23576b.get();
                    this.f23575a = obj;
                    this.f23576b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
