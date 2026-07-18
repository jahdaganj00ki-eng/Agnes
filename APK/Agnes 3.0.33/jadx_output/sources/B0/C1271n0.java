package b0;

/* JADX INFO: renamed from: b0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1271n0 implements pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc.a f19983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pc.a f19984c;

    public /* synthetic */ C1271n0(pc.a aVar, pc.a aVar2, int i6) {
        this.f19982a = i6;
        this.f19983b = aVar;
        this.f19984c = aVar2;
    }

    public final Object invoke(Object obj) {
        Q.g gVar = (Q.g) obj;
        switch (this.f19982a) {
            case 0:
                this.f19983b.invoke();
                pc.a aVar = this.f19984c;
                if (aVar != null ? ((Boolean) aVar.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
            default:
                this.f19983b.invoke();
                pc.a aVar2 = this.f19984c;
                if (aVar2 != null ? ((Boolean) aVar2.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
        }
        return ac.B.a;
    }
}
