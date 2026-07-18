package b3;

import O2.AbstractC0669b;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f20660d = new h0(new L2.W[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T9.X f20662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20663c;

    static {
        O2.K.A(0);
    }

    public h0(L2.W... wArr) {
        T9.X xO = T9.G.o(wArr);
        this.f20662b = xO;
        this.f20661a = wArr.length;
        int i6 = 0;
        while (i6 < xO.f14180d) {
            int i10 = i6 + 1;
            for (int i11 = i10; i11 < xO.f14180d; i11++) {
                if (((L2.W) xO.get(i6)).equals(xO.get(i11))) {
                    AbstractC0669b.g("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i6 = i10;
        }
    }

    public final L2.W a(int i6) {
        return (L2.W) this.f20662b.get(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f20661a == h0Var.f20661a && this.f20662b.equals(h0Var.f20662b);
    }

    public final int hashCode() {
        if (this.f20663c == 0) {
            this.f20663c = this.f20662b.hashCode();
        }
        return this.f20663c;
    }

    public final String toString() {
        return this.f20662b.toString();
    }
}
