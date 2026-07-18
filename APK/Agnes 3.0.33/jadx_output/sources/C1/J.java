package C1;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class J extends H {
    @Override // C1.K
    public final void a(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
