package E4;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3595a = new b();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof T4.h) || !(obj2 instanceof T4.h)) {
            return kotlin.jvm.internal.l.b(obj, obj2);
        }
        T4.h hVar = (T4.h) obj;
        T4.h hVar2 = (T4.h) obj2;
        return kotlin.jvm.internal.l.b(hVar.f13532a, hVar2.f13532a) && kotlin.jvm.internal.l.b(hVar.f13533b, hVar2.f13533b) && kotlin.jvm.internal.l.b(hVar.f13536e, hVar2.f13536e) && kotlin.jvm.internal.l.b(hVar.f13537f, hVar2.f13537f) && kotlin.jvm.internal.l.b(hVar.f13538g, hVar2.f13538g) && kotlin.jvm.internal.l.b(hVar.f13548r, hVar2.f13548r) && hVar.f13549s == hVar2.f13549s && hVar.f13550t == hVar2.f13550t;
    }

    public final int b(Object obj) {
        if (!(obj instanceof T4.h)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        T4.h hVar = (T4.h) obj;
        int iHashCode = (hVar.f13533b.hashCode() + (hVar.f13532a.hashCode() * 31)) * 31;
        String str = hVar.f13536e;
        int iHashCode2 = (hVar.f13537f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        String str2 = hVar.f13538g;
        return hVar.f13550t.hashCode() + ((hVar.f13549s.hashCode() + ((hVar.f13548r.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
