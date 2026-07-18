package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.I;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class H {
    public static final void a(Activity activity, I.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
