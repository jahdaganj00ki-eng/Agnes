package D4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class l extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2721b;

    public /* synthetic */ l(int i6, Object obj) {
        this.f2720a = i6;
        this.f2721b = obj;
    }

    private final void a(int i6) {
    }

    private final void b(int i6) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f2720a) {
            case 0:
                ((k) this.f2721b).e(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2721b;
                if (actionBarContainer.f19050g) {
                    Drawable drawable = actionBarContainer.f19049f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f19047d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f19048e;
                    if (drawable3 != null && actionBarContainer.f19051h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f2720a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f2720a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2721b;
                if (!actionBarContainer.f19050g) {
                    Drawable drawable = actionBarContainer.f19047d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f19049f != null) {
                    actionBarContainer.f19047d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        int i10 = this.f2720a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i6 = this.f2720a;
    }
}
