package c1;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: c1.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1446W implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f21115a;

    public C1446W(ViewConfiguration viewConfiguration) {
        this.f21115a = viewConfiguration;
    }

    @Override // c1.V0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // c1.V0
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // c1.V0
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f21115a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // c1.V0
    public final float e() {
        return this.f21115a.getScaledMaximumFlingVelocity();
    }

    @Override // c1.V0
    public final float f() {
        return this.f21115a.getScaledTouchSlop();
    }

    @Override // c1.V0
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f21115a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
