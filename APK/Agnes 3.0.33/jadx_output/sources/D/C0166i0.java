package D;

import b1.AbstractC1308Z;

/* JADX INFO: renamed from: D.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0166i0 extends AbstractC1308Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2503b;

    public C0166i0(float f10, boolean z2) {
        this.f2502a = f10;
        this.f2503b = z2;
    }

    @Override // b1.AbstractC1308Z
    public final A0.q b() {
        C0168j0 c0168j0 = new C0168j0();
        c0168j0.f2507o = this.f2502a;
        c0168j0.f2506L = this.f2503b;
        return c0168j0;
    }

    @Override // b1.AbstractC1308Z
    public final void c(A0.q qVar) {
        C0168j0 c0168j0 = (C0168j0) qVar;
        c0168j0.f2507o = this.f2502a;
        c0168j0.f2506L = this.f2503b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0166i0 c0166i0 = obj instanceof C0166i0 ? (C0166i0) obj : null;
        return c0166i0 != null && this.f2502a == c0166i0.f2502a && this.f2503b == c0166i0.f2503b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2503b) + (Float.hashCode(this.f2502a) * 31);
    }
}
