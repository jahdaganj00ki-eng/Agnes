package D5;

import java.util.LinkedHashMap;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f2792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ic.c f2795d;

    public F(OkHttpClient okHttpClient) {
        kotlin.jvm.internal.l.f(okHttpClient, "client");
        this.f2792a = okHttpClient;
        this.f2793b = new LinkedHashMap();
        this.f2794c = new LinkedHashMap();
        this.f2795d = Ic.d.a();
    }
}
