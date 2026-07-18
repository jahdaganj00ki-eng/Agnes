package B3;

import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f655c;

    public f(float f10, int i6, int i10) {
        this.f653a = i6;
        this.f654b = i10;
        this.f655c = f10;
    }

    public static f a(int i6) {
        int i10 = (i6 >> 13) & 7;
        if (i10 == 0) {
            return null;
        }
        return new f(((i6 & 511) * ((i6 & 512) != 0 ? -1 : 1)) / 10.0f, i10, (i6 >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f653a == fVar.f653a && this.f654b == fVar.f654b && Float.compare(this.f655c, fVar.f655c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f655c) + (((this.f653a * 31) + this.f654b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.f653a);
        sb.append(", originator=");
        sb.append(this.f654b);
        sb.append(", gain=");
        return o0.n(sb, this.f655c, '}');
    }
}
