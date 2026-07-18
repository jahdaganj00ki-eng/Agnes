package c1;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: c1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1466i implements InterfaceC1463g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1468j f21178a;

    public C1466i(C1468j c1468j) {
        this.f21178a = c1468j;
    }

    public final void a(C1459e0 c1459e0) {
        C1468j c1468j = this.f21178a;
        if (c1459e0 != null) {
            c1468j.a().setPrimaryClip(c1459e0.f21158a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c1468j.a().clearPrimaryClip();
        } else {
            c1468j.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
