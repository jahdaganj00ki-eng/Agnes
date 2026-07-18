package c;

import Y1.t0;
import Y1.u0;
import Y1.v0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import bc.G;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class o {
    public void a(Window window) {
    }

    public void b(C1421C c1421c, C1421C c1421c2, Window window, View view, boolean z2, boolean z7) {
        kotlin.jvm.internal.l.f(c1421c, "statusBarStyle");
        kotlin.jvm.internal.l.f(c1421c2, "navigationBarStyle");
        kotlin.jvm.internal.l.f(window, "window");
        kotlin.jvm.internal.l.f(view, "view");
        G.P(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        Xb.C c2 = new Xb.C(view);
        int i6 = Build.VERSION.SDK_INT;
        Y9.b v0Var = i6 >= 35 ? new v0(window, c2) : i6 >= 30 ? new u0(window, c2) : new t0(window, c2);
        v0Var.l0(!z2);
        v0Var.k0(!z7);
    }
}
