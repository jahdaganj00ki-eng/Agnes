package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import n.InterfaceC3035N;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f19105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f19106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f19107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f19108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f19109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f19110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f19111g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19111g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f19109e == null) {
            this.f19109e = new TypedValue();
        }
        return this.f19109e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f19110f == null) {
            this.f19110f = new TypedValue();
        }
        return this.f19110f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f19107c == null) {
            this.f19107c = new TypedValue();
        }
        return this.f19107c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f19108d == null) {
            this.f19108d = new TypedValue();
        }
        return this.f19108d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f19105a == null) {
            this.f19105a = new TypedValue();
        }
        return this.f19105a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f19106b == null) {
            this.f19106b = new TypedValue();
        }
        return this.f19106b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f19111g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i6;
            z2 = false;
        } else {
            TypedValue typedValue = z10 ? this.f19108d : this.f19107c;
            if (typedValue != null && (i15 = typedValue.type) != 0) {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i15 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i17, i17);
                } else {
                    i16 = 0;
                    if (i16 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i6)), 1073741824);
                        z2 = true;
                    }
                }
                i16 = (int) fraction3;
                if (i16 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i10;
        } else {
            TypedValue typedValue2 = z10 ? this.f19109e : this.f19110f;
            if (typedValue2 != null && (i13 = typedValue2.type) != 0) {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i13 == 6) {
                    int i18 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i18, i18);
                } else {
                    i14 = 0;
                    if (i14 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                    }
                }
                i14 = (int) fraction2;
                if (i14 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z7 = false;
        } else {
            TypedValue typedValue3 = z10 ? this.f19106b : this.f19105a;
            if (typedValue3 != null && (i11 = typedValue3.type) != 0) {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i11 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i19, i19);
                } else {
                    i12 = 0;
                    if (i12 > 0) {
                        i12 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i12) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                }
                if (measuredWidth >= i12) {
                }
            }
        }
        if (z7) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC3035N interfaceC3035N) {
    }
}
