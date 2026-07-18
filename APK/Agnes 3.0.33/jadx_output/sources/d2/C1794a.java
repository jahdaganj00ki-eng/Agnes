package d2;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1794a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23231i;

    public final float a(long j4) {
        if (j4 < this.f23227e) {
            return 0.0f;
        }
        long j10 = this.f23229g;
        if (j10 < 0 || j4 < j10) {
            return d.b((j4 - r0) / this.f23223a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f23230h;
        return (d.b((j4 - j10) / this.f23231i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
