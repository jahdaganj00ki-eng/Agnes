package c5;

import com.adjust.sdk.AdjustFactory;
import java.lang.Thread;

/* JADX INFO: renamed from: c5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1512b implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
    }
}
