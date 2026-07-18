package c;

/* JADX INFO: renamed from: c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1423b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20913b;

    public /* synthetic */ RunnableC1423b(k kVar, int i6) {
        this.f20912a = i6;
        this.f20913b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20912a) {
            case 0:
                k.k(this.f20913b);
                break;
            default:
                this.f20913b.invalidateOptionsMenu();
                break;
        }
    }
}
