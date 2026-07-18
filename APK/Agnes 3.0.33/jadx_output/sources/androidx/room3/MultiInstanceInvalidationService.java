package androidx.room3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import h4.BinderC2295w;
import h4.RemoteCallbackListC2296x;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19721b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC2296x f19722c = new RemoteCallbackListC2296x(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BinderC2295w f19723d = new BinderC2295w(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f19723d;
    }
}
