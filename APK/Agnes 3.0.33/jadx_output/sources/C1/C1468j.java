package c1;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: c1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1468j implements InterfaceC1465h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipboardManager f21183b;

    public C1468j(Context context) {
        this.f21182a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.f21183b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f21182a.getSystemService("clipboard");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f21183b = clipboardManager2;
        return clipboardManager2;
    }
}
