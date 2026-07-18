package A0;

import y1.EnumC4343m;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f66a;

    public f(float f10) {
        this.f66a = f10;
    }

    @Override // A0.d
    public final long a(long j4, long j10, EnumC4343m enumC4343m) {
        long j11 = (((long) (((int) (j10 >> 32)) - ((int) (j4 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j4 & 4294967295L)))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f66a + f10) * (((int) (j11 >> 32)) / 2.0f);
        return (((long) Math.round((f10 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f66a, ((f) obj).f66a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f66a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f66a + ", verticalBias=-1.0)";
    }
}
