package D4;

import android.os.Handler;
import android.os.Looper;
import k9.AbstractC2776a;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f2716b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2717a;

    public Object a() {
        if (AbstractC2776a.f30984b == null) {
            AbstractC2776a.f30984b = new Ja.u();
        }
        synchronized (AbstractC2776a.f30983a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public i() {
        this.f2717a = new Object();
        new Handler(Looper.getMainLooper(), new M8.m(1, this));
    }
}
