package b0;

/* JADX INFO: renamed from: b0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1283z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.M f20076f;

    public C1283z(long j4, int i6, int i10, int i11, int i12, m1.M m3) {
        this.f20071a = j4;
        this.f20072b = i6;
        this.f20073c = i10;
        this.f20074d = i11;
        this.f20075e = i12;
        this.f20076f = m3;
    }

    public final C1229B a(int i6) {
        return new C1229B(AbstractC1267l0.v(this.f20076f, i6), i6, this.f20071a);
    }

    public final EnumC1258h b() {
        int i6 = this.f20073c;
        int i10 = this.f20074d;
        return i6 < i10 ? EnumC1258h.f19921b : i6 > i10 ? EnumC1258h.f19920a : EnumC1258h.f19922c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f20071a);
        sb.append(", range=(");
        int i6 = this.f20073c;
        sb.append(i6);
        sb.append('-');
        m1.M m3 = this.f20076f;
        sb.append(AbstractC1267l0.v(m3, i6));
        sb.append(',');
        int i10 = this.f20074d;
        sb.append(i10);
        sb.append('-');
        sb.append(AbstractC1267l0.v(m3, i10));
        sb.append("), prevOffset=");
        return o8.o0.o(sb, this.f20075e, ')');
    }
}
