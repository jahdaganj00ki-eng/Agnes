package A8;

import java.util.Set;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f368c;

    public c(long j4, long j10, Set set) {
        this.f366a = j4;
        this.f367b = j10;
        this.f368c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f366a == cVar.f366a && this.f367b == cVar.f367b && this.f368c.equals(cVar.f368c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f366a;
        int i6 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f367b;
        return ((i6 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f368c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f366a + ", maxAllowedDelay=" + this.f367b + ", flags=" + this.f368c + "}";
    }
}
