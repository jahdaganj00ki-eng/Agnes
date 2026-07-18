package B8;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8.i f1089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u8.h f1090c;

    public b(long j4, u8.i iVar, u8.h hVar) {
        this.f1088a = j4;
        this.f1089b = iVar;
        this.f1090c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f1088a == bVar.f1088a && this.f1089b.equals(bVar.f1089b) && this.f1090c.equals(bVar.f1090c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1088a;
        return ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f1089b.hashCode()) * 1000003) ^ this.f1090c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f1088a + ", transportContext=" + this.f1089b + ", event=" + this.f1090c + "}";
    }
}
