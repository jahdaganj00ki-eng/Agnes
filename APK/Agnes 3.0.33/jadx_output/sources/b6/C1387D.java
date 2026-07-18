package b6;

import y1.C4345o;
import y1.C4346p;

/* JADX INFO: renamed from: b6.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1387D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20740b;

    public C1387D(long j4, int i6) {
        this.f20739a = j4;
        this.f20740b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1387D)) {
            return false;
        }
        C1387D c1387d = (C1387D) obj;
        return C4345o.a(this.f20739a, c1387d.f20739a) && this.f20740b == c1387d.f20740b;
    }

    public final int hashCode() {
        C4346p[] c4346pArr = C4345o.f40581b;
        return Integer.hashCode(this.f20740b) + (Long.hashCode(this.f20739a) * 31);
    }

    public final String toString() {
        return "TitleConfig(fontSize=" + C4345o.d(this.f20739a) + ", maxLines=" + this.f20740b + ")";
    }
}
