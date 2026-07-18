package d2;

import Y1.M;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;
import n.AbstractC3043W;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f23232N = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f23233L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final AbstractC3043W f23234M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1794a f23235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f23236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3043W f23237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A9.g f23238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f23239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f23240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f23243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f23244j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23248o;

    public d(AbstractC3043W abstractC3043W) {
        C1794a c1794a = new C1794a();
        c1794a.f23227e = Long.MIN_VALUE;
        c1794a.f23229g = -1L;
        c1794a.f23228f = 0L;
        this.f23235a = c1794a;
        this.f23236b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f23239e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f23240f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f23243i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f23244j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.f23237c = abstractC3043W;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f23241g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f23242h = f23232N;
        c1794a.f23223a = 500;
        c1794a.f23224b = 500;
        this.f23234M = abstractC3043W;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i6, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.f23239e[i6] * f11, 0.0f, this.f23240f[i6]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f23236b;
        if (fC < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= 0.0f) {
                fB = 0.0f;
                if (fB != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f23243i[i6];
                float f14 = this.f23244j[i6];
                float f15 = this.k[i6];
                float f16 = f13 * f12;
                return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i6 = this.f23241g;
            if (i6 == 0 || i6 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f23248o && i6 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i6 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i6 = 0;
        if (this.f23246m) {
            this.f23248o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1794a c1794a = this.f23235a;
        int i10 = (int) (jCurrentAnimationTimeMillis - c1794a.f23227e);
        int i11 = c1794a.f23224b;
        if (i10 > i11) {
            i6 = i11;
        } else if (i10 >= 0) {
            i6 = i10;
        }
        c1794a.f23231i = i6;
        c1794a.f23230h = c1794a.a(jCurrentAnimationTimeMillis);
        c1794a.f23229g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC3043W abstractC3043W;
        int count;
        C1794a c1794a = this.f23235a;
        float f10 = c1794a.f23226d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c1794a.f23225c);
        if (iAbs != 0 && (count = (abstractC3043W = this.f23234M).getCount()) != 0) {
            int childCount = abstractC3043W.getChildCount();
            int firstVisiblePosition = abstractC3043W.getFirstVisiblePosition();
            int i6 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && abstractC3043W.getChildAt(0).getTop() >= 0)) : !(i6 >= count && abstractC3043W.getChildAt(childCount - 1).getBottom() <= abstractC3043W.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i6;
        if (this.f23233L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f23247n = true;
            this.f23245l = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            AbstractC3043W abstractC3043W = this.f23237c;
            float fA = a(0, x10, width, abstractC3043W.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), abstractC3043W.getHeight());
            C1794a c1794a = this.f23235a;
            c1794a.f23225c = fA;
            c1794a.f23226d = fA2;
            if (!this.f23248o && e()) {
                if (this.f23238d == null) {
                    this.f23238d = new A9.g(9, this);
                }
                this.f23248o = true;
                this.f23246m = true;
                if (this.f23245l || (i6 = this.f23242h) <= 0) {
                    this.f23238d.run();
                } else {
                    A9.g gVar = this.f23238d;
                    long j4 = i6;
                    Field field = M.f17205a;
                    abstractC3043W.postOnAnimationDelayed(gVar, j4);
                }
                this.f23245l = true;
            }
        }
        return false;
    }
}
