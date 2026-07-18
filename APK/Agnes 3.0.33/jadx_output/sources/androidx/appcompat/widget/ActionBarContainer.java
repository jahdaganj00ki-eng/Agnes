package androidx.appcompat.widget;

import D4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import i.AbstractC2355a;
import n.AbstractC3082r0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f19046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f19047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f19048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f19049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19052i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new l(1, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2355a.f27566a);
        boolean z2 = false;
        this.f19047d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f19048e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f19052i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131362316) {
            this.f19050g = true;
            this.f19049f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f19050g ? !(this.f19047d != null || this.f19048e != null) : this.f19049f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f19047d;
        if (drawable != null && drawable.isStateful()) {
            this.f19047d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f19048e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f19048e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f19049f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f19049f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f19047d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f19048e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f19049f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f19045b = findViewById(2131361844);
        this.f19046c = findViewById(2131361852);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f19044a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i6, int i10, int i11, int i12) {
        super.onLayout(z2, i6, i10, i11, i12);
        boolean z7 = true;
        if (this.f19050g) {
            Drawable drawable = this.f19049f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f19047d == null) {
                z7 = false;
            } else if (this.f19045b.getVisibility() == 0) {
                this.f19047d.setBounds(this.f19045b.getLeft(), this.f19045b.getTop(), this.f19045b.getRight(), this.f19045b.getBottom());
            } else {
                View view = this.f19046c;
                if (view == null || view.getVisibility() != 0) {
                    this.f19047d.setBounds(0, 0, 0, 0);
                } else {
                    this.f19047d.setBounds(this.f19046c.getLeft(), this.f19046c.getTop(), this.f19046c.getRight(), this.f19046c.getBottom());
                }
            }
            this.f19051h = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        if (this.f19045b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f19052i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i10);
        if (this.f19045b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f19047d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f19047d);
        }
        this.f19047d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f19045b;
            if (view != null) {
                this.f19047d.setBounds(view.getLeft(), this.f19045b.getTop(), this.f19045b.getRight(), this.f19045b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f19050g ? !(this.f19047d != null || this.f19048e != null) : this.f19049f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f19049f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f19049f);
        }
        this.f19049f = drawable;
        boolean z2 = this.f19050g;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f19049f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f19047d != null || this.f19048e != null) : this.f19049f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f19048e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f19048e);
        }
        this.f19048e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f19051h && this.f19048e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f19050g ? !(this.f19047d != null || this.f19048e != null) : this.f19049f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC3082r0 abstractC3082r0) {
    }

    public void setTransitioning(boolean z2) {
        this.f19044a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z2 = i6 == 0;
        Drawable drawable = this.f19047d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f19048e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f19049f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f19047d;
        boolean z2 = this.f19050g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f19048e && this.f19051h) {
            return true;
        }
        return (drawable == this.f19049f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }
}
