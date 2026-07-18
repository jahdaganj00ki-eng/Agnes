package c1;

import j1.InterfaceC2505A;

/* JADX INFO: renamed from: c1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1500z implements InterfaceC2505A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0.T f21413b;

    public C1500z(H0.T t10) {
        this.f21413b = t10;
    }

    @Override // j1.InterfaceC2505A
    public final void b(j1.z zVar, Object obj) {
        if (obj == this.f21413b) {
            this.f21412a = true;
        }
    }
}
