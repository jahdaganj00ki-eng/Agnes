package A0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface p extends r {
    @Override // A0.r
    default Object d(Object obj, pc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // A0.r
    default boolean e(pc.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }
}
