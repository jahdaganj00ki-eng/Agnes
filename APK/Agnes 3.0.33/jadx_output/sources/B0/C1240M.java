package b0;

/* JADX INFO: renamed from: b0.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1240M implements InterfaceC1274p, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc.a f19821a;

    public C1240M(pc.a aVar) {
        this.f19821a = aVar;
    }

    @Override // b0.InterfaceC1274p
    public final /* synthetic */ long a() {
        return ((G0.b) this.f19821a.invoke()).f4780a;
    }

    public final ac.e b() {
        return this.f19821a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1274p) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return kotlin.jvm.internal.l.b(this.f19821a, ((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.f19821a.hashCode();
    }
}
