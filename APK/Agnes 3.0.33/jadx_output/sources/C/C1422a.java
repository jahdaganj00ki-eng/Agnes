package c;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1422a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20911e;

    public C1422a(Y3.b bVar) {
        kotlin.jvm.internal.l.f(bVar, "navigationEvent");
        float f10 = bVar.f17349c;
        float f11 = bVar.f17350d;
        float f12 = bVar.f17348b;
        int i6 = bVar.f17347a;
        long j4 = bVar.f17351e;
        this.f20907a = f10;
        this.f20908b = f11;
        this.f20909c = f12;
        this.f20910d = i6;
        this.f20911e = j4;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f20907a + ", touchY=" + this.f20908b + ", progress=" + this.f20909c + ", swipeEdge=" + this.f20910d + ", frameTimeMillis=" + this.f20911e + ')';
    }
}
