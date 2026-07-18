package c1;

import android.view.MotionEvent;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f21036a = new H0();

    public final boolean a(MotionEvent motionEvent, int i6) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i6)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i6)) & Integer.MAX_VALUE) < 2139095040;
    }
}
