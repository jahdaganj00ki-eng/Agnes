package a7;

import ac.B;

/* JADX INFO: renamed from: a7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1150g implements Dc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dc.f f18849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18850c;

    public /* synthetic */ C1150g(Dc.f fVar, String str, int i6) {
        this.f18848a = i6;
        this.f18849b = fVar;
        this.f18850c = str;
    }

    public final Object b(Dc.g gVar, ec.c cVar) {
        switch (this.f18848a) {
            case 0:
                Object objB = this.f18849b.b(new C1149f(gVar, this.f18850c, 0), cVar);
                if (objB != fc.a.a) {
                    break;
                }
                break;
            case 1:
                Object objB2 = this.f18849b.b(new C1149f(gVar, this.f18850c, 1), cVar);
                if (objB2 != fc.a.a) {
                    break;
                }
                break;
            case 2:
                Object objB3 = this.f18849b.b(new C1149f(gVar, this.f18850c, 2), cVar);
                if (objB3 != fc.a.a) {
                    break;
                }
                break;
            case 3:
                Object objB4 = this.f18849b.b(new C1149f(gVar, this.f18850c, 3), cVar);
                if (objB4 != fc.a.a) {
                    break;
                }
                break;
            default:
                Object objB5 = this.f18849b.b(new C1149f(gVar, this.f18850c, 4), cVar);
                if (objB5 != fc.a.a) {
                    break;
                }
                break;
        }
        return B.a;
    }
}
