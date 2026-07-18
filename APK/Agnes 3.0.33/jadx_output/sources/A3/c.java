package A3;

import java.util.Objects;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120c;

    public c(long j4, long j10, long j11) {
        this.f118a = j4;
        this.f119b = j10;
        this.f120c = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f118a, ((c) obj).f118a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f118a == cVar.f118a && this.f119b == cVar.f119b && this.f120c == cVar.f120c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f118a), Long.valueOf(this.f119b), Long.valueOf(this.f120c));
    }
}
