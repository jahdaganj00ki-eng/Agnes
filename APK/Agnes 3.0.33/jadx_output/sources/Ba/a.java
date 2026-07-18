package Ba;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1152b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f1151a = str;
        this.f1152b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1151a.equals(aVar.f1151a) && this.f1152b.equals(aVar.f1152b);
    }

    public final int hashCode() {
        return ((this.f1151a.hashCode() ^ 1000003) * 1000003) ^ this.f1152b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f1151a + ", usedDates=" + this.f1152b + "}";
    }
}
