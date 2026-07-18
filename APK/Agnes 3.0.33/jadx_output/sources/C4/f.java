package C4;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f1582b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1583c = new f();

    @Override // C4.e
    public float b(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // C4.g
    public B4.a c(ContextWrapper contextWrapper, e eVar) {
        l.f(eVar, "densityCompatHelper");
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return new B4.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
