package D4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: D4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0195a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f2700a;

    public C0195a(Bitmap bitmap) {
        this.f2700a = bitmap;
    }

    @Override // D4.k
    public final int a() {
        return this.f2700a.getHeight();
    }

    @Override // D4.k
    public final int b() {
        return this.f2700a.getWidth();
    }

    @Override // D4.k
    public final long c() {
        int allocationByteCount;
        Bitmap bitmap = this.f2700a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // D4.k
    public final boolean d() {
        return true;
    }

    @Override // D4.k
    public final void e(Canvas canvas) {
        canvas.drawBitmap(this.f2700a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0195a) && kotlin.jvm.internal.l.b(this.f2700a, ((C0195a) obj).f2700a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f2700a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f2700a + ", shareable=true)";
    }
}
