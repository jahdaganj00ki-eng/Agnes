package C5;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class X0 implements Dc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc.c f1863b;

    public /* synthetic */ X0(int i6, pc.c cVar) {
        this.f1862a = i6;
        this.f1863b = cVar;
    }

    public final Object i(Object obj, ec.c cVar) {
        switch (this.f1862a) {
            case 0:
                this.f1863b.invoke(((CharSequence) obj).toString());
                break;
            default:
                this.f1863b.invoke((String) obj);
                break;
        }
        return ac.B.a;
    }
}
