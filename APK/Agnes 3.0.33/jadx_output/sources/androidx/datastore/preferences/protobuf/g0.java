package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19370b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i6) {
        super(unsafe);
        this.f19370b = i6;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j4, Object obj) {
        switch (this.f19370b) {
            case 0:
                if (!j0.f19397g) {
                }
                break;
            default:
                if (!j0.f19397g) {
                }
                break;
        }
        return j0.c(j4, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j4, Object obj) {
        switch (this.f19370b) {
        }
        return Double.longBitsToDouble(g(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j4, Object obj) {
        switch (this.f19370b) {
        }
        return Float.intBitsToFloat(f(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j4, boolean z2) {
        switch (this.f19370b) {
            case 0:
                if (!j0.f19397g) {
                    j0.l(obj, j4, z2 ? (byte) 1 : (byte) 0);
                } else {
                    j0.k(obj, j4, z2 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!j0.f19397g) {
                    j0.l(obj, j4, z2 ? (byte) 1 : (byte) 0);
                } else {
                    j0.k(obj, j4, z2 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j4, byte b10) {
        switch (this.f19370b) {
            case 0:
                if (!j0.f19397g) {
                    j0.l(obj, j4, b10);
                } else {
                    j0.k(obj, j4, b10);
                }
                break;
            default:
                if (!j0.f19397g) {
                    j0.l(obj, j4, b10);
                } else {
                    j0.k(obj, j4, b10);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j4, double d5) {
        switch (this.f19370b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j4, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j4, float f10) {
        switch (this.f19370b) {
            case 0:
                n(j4, obj, Float.floatToIntBits(f10));
                break;
            default:
                n(j4, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f19370b) {
        }
        return false;
    }
}
