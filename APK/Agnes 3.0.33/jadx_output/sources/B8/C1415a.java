package b8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: b8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1415a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f20878d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20881c;

    public C1415a(Drawable.Callback callback, Map map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.f20880b = null;
        this.f20881c = map;
        if (callback instanceof View) {
            this.f20879a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f20879a = null;
        }
    }
}
