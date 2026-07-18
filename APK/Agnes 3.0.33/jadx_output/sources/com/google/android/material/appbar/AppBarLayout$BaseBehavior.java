package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import x9.AbstractC4313a;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC4313a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22772b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22774d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VelocityTracker f22776f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22773c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22775e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // L1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f22775e < 0) {
            this.f22775e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f22772b) {
            int i6 = this.f22773c;
            if (i6 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i6)) != -1) {
                int y8 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y8 - this.f22774d) > this.f22775e) {
                    this.f22774d = y8;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f22773c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            VelocityTracker velocityTracker = this.f22776f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // x9.AbstractC4313a, L1.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i6) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10, int[] iArr, int i11) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final boolean o(View view, int i6, int i10) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final void p(View view, View view2, int i6) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // L1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f22773c);
                if (iFindPointerIndex != -1) {
                    this.f22774d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i6 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f22773c = motionEvent.getPointerId(i6);
                    this.f22774d = (int) (motionEvent.getY(i6) + 0.5f);
                }
            }
            velocityTracker = this.f22776f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f22772b;
        }
        VelocityTracker velocityTracker2 = this.f22776f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f22776f.computeCurrentVelocity(1000);
            this.f22776f.getYVelocity(this.f22773c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f22772b = false;
        this.f22773c = -1;
        VelocityTracker velocityTracker3 = this.f22776f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f22776f = null;
        }
        velocityTracker = this.f22776f;
        if (velocityTracker != null) {
        }
        if (!this.f22772b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
