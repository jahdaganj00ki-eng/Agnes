package d;

import g.AbstractC1938d;
import g.C1942h;

/* JADX INFO: renamed from: d.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1793l extends AbstractC1938d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1782a f23222a;

    public C1793l(C1782a c1782a) {
        this.f23222a = c1782a;
    }

    @Override // g.AbstractC1938d
    public final void a(Object obj) throws Exception {
        C1942h c1942h = this.f23222a.f23203a;
        if (c1942h == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        c1942h.a(obj);
    }

    @Override // g.AbstractC1938d
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
