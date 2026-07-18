package a7;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18873b;

    public l(int i6, boolean z2) {
        this.f18872a = i6;
        this.f18873b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f18872a == lVar.f18872a && this.f18873b == lVar.f18873b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18873b) + (Integer.hashCode(this.f18872a) * 31);
    }

    public final String toString() {
        return "ImageDecodeProfile(maxDimensionPx=" + this.f18872a + ", isLowRamDevice=" + this.f18873b + ")";
    }
}
