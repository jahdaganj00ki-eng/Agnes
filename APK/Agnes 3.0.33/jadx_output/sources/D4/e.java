package D4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f2712a;

    public e(Drawable drawable) {
        this.f2712a = drawable;
    }

    @Override // D4.k
    public final int a() {
        return Z4.m.a(this.f2712a);
    }

    @Override // D4.k
    public final int b() {
        return Z4.m.b(this.f2712a);
    }

    @Override // D4.k
    public final long c() {
        Drawable drawable = this.f2712a;
        long jB = ((long) Z4.m.b(drawable)) * 4 * ((long) Z4.m.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // D4.k
    public final boolean d() {
        return false;
    }

    @Override // D4.k
    public final void e(Canvas canvas) {
        this.f2712a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.l.b(this.f2712a, ((e) obj).f2712a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f2712a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f2712a + ", shareable=false)";
    }
}
