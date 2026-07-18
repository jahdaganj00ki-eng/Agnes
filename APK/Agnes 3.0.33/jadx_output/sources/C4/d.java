package C4;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class d implements b, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f1580b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f1581c = new d();

    @Override // C4.b
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return bounds;
    }

    @Override // C4.g
    public B4.a c(ContextWrapper contextWrapper, e eVar) {
        l.f(eVar, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f10 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        l.e(bounds, "getBounds(...)");
        return new B4.a(bounds, f10);
    }
}
