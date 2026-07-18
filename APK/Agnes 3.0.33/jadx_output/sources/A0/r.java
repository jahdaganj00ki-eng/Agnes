package A0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface r {
    Object d(Object obj, pc.e eVar);

    boolean e(pc.c cVar);

    default r w0(r rVar) {
        return rVar == o.f78a ? this : new k(this, rVar);
    }
}
