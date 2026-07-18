package A8;

import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D8.a f364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f365b;

    public b(D8.a aVar, HashMap map) {
        this.f364a = aVar;
        this.f365b = map;
    }

    public final long a(r8.d dVar, long j4, int i6) {
        long jD = j4 - this.f364a.d();
        c cVar = (c) this.f365b.get(dVar);
        long j10 = cVar.f366a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i6 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r12)))), jD), cVar.f367b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f364a.equals(bVar.f364a) && this.f365b.equals(bVar.f365b);
    }

    public final int hashCode() {
        return ((this.f364a.hashCode() ^ 1000003) * 1000003) ^ this.f365b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f364a + ", values=" + this.f365b + "}";
    }
}
