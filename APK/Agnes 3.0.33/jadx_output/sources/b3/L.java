package b3;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f20490b;

    public /* synthetic */ L(T t10, int i6) {
        this.f20489a = i6;
        this.f20490b = t10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20489a) {
            case 0:
                this.f20490b.f20541f0 = true;
                break;
            case 1:
                this.f20490b.y();
                break;
            default:
                T t10 = this.f20490b;
                if (!t10.f20552l0) {
                    InterfaceC1377x interfaceC1377x = t10.f20520N;
                    interfaceC1377x.getClass();
                    interfaceC1377x.g(t10);
                }
                break;
        }
    }
}
