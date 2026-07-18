package B3;

import L2.F;
import java.util.Objects;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f658c;

    public g(float f10, f fVar, f fVar2) {
        this.f656a = f10;
        this.f657b = fVar;
        this.f658c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f656a, gVar.f656a) == 0 && Objects.equals(this.f657b, gVar.f657b) && Objects.equals(this.f658c, gVar.f658c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f656a) * 31;
        f fVar = this.f657b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        f fVar2 = this.f658c;
        return iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f656a + ", field 1=" + this.f657b + ", field 2=" + this.f658c;
    }
}
