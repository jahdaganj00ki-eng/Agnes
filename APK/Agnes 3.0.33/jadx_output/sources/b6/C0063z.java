package B6;

/* JADX INFO: renamed from: B6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C0063z implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0063z f1075a;
    private static final Mc.g descriptor;

    static {
        C0063z c0063z = new C0063z();
        f1075a = c0063z;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.EditUsername", c0063z, 2);
        t10.k("initialName", false);
        t10.k("showsMainBottomBar", true);
        descriptor = t10;
    }

    public final Kc.a[] childSerializers() {
        return new Kc.a[]{Oc.f0.a, Oc.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        String strC = null;
        boolean z2 = true;
        int i6 = 0;
        boolean zF = false;
        while (z2) {
            int iQ = aVarB.q(gVar);
            if (iQ == -1) {
                z2 = false;
            } else if (iQ == 0) {
                strC = aVarB.C(gVar, 0);
                i6 |= 1;
            } else {
                if (iQ != 1) {
                    throw new Kc.i(iQ);
                }
                zF = aVarB.f(gVar, 1);
                i6 |= 2;
            }
        }
        aVarB.c(gVar);
        return new B(i6, strC, zF);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        B b10 = (B) obj;
        kotlin.jvm.internal.l.f(b10, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        String str = b10.f951a;
        boolean z2 = b10.f952b;
        Y9.b bVar = (Y9.b) bVarB;
        bVar.Y(gVar, 0, str);
        if (bVar.n(gVar) || z2) {
            bVar.S(gVar, 1, z2);
        }
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Oc.Q.b;
    }
}
