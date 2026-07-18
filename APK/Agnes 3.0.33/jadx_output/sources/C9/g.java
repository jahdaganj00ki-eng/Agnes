package C9;

import s.AbstractC3751b;
import s.V;
import s.W;
import t.InterfaceC3833E;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g implements InterfaceC3833E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2328b;

    public g(int i6) {
        switch (i6) {
            case 3:
                this.f2327a = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f2328b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    public V a(float f10) {
        double dB = b(f10);
        double d5 = W.f37564a;
        double d10 = d5 - 1.0d;
        return new V(f10, (float) (Math.exp((d5 / d10) * dB) * ((double) (this.f2327a * this.f2328b))), (long) (Math.exp(dB / d10) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = AbstractC3751b.f37574a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f2327a * this.f2328b)));
    }

    @Override // t.InterfaceC3833E
    public float c() {
        return this.f2327a;
    }

    @Override // t.InterfaceC3833E
    public float d(float f10, long j4) {
        return f10 * ((float) Math.exp(((j4 / 1000000) / 1000.0f) * this.f2328b));
    }

    @Override // t.InterfaceC3833E
    public float e(float f10, float f11, long j4) {
        float f12 = this.f2328b;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j4 / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // t.InterfaceC3833E
    public long g(float f10) {
        return ((long) ((((float) Math.log(this.f2327a / Math.abs(f10))) * 1000.0f) / this.f2328b)) * 1000000;
    }

    @Override // t.InterfaceC3833E
    public float h(float f10, float f11) {
        if (Math.abs(f11) <= this.f2327a) {
            return f10;
        }
        double dLog = Math.log(Math.abs(r1 / f11));
        float f12 = this.f2328b;
        return ((f11 / f12) * ((float) Math.exp((((double) f12) * ((dLog / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f)))) + (f10 - (f11 / f12));
    }
}
