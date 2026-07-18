package C1;

import T9.X;
import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract /* synthetic */ class I {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder i(X x10) {
        return new RouteDiscoveryPreference.Builder(x10, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds l(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation m(int i6, Interpolator interpolator, long j4) {
        return new WindowInsetsAnimation(i6, interpolator, j4);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation n(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void q() {
    }
}
