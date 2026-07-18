package B6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class V implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f973a;
    private static final Mc.g descriptor;

    static {
        V v10 = new V();
        f973a = v10;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.UserAssetPreview", v10, 4);
        t10.k("tabIndex", false);
        t10.k("initialGroupIndex", false);
        t10.k("initialItemIndex", true);
        t10.k("showsMainBottomBar", true);
        descriptor = t10;
    }

    public final Kc.a[] childSerializers() {
        Oc.F f10 = Oc.F.a;
        return new Kc.a[]{f10, f10, f10, Oc.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        boolean z2 = true;
        int i6 = 0;
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        boolean zF = false;
        while (z2) {
            int iQ = aVarB.q(gVar);
            if (iQ == -1) {
                z2 = false;
            } else if (iQ == 0) {
                iA = aVarB.A(gVar, 0);
                i6 |= 1;
            } else if (iQ == 1) {
                iA2 = aVarB.A(gVar, 1);
                i6 |= 2;
            } else if (iQ == 2) {
                iA3 = aVarB.A(gVar, 2);
                i6 |= 4;
            } else {
                if (iQ != 3) {
                    throw new Kc.i(iQ);
                }
                zF = aVarB.f(gVar, 3);
                i6 |= 8;
            }
        }
        aVarB.c(gVar);
        return new X(i6, iA, iA2, iA3, zF);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        X x10 = (X) obj;
        kotlin.jvm.internal.l.f(x10, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        int i6 = x10.f974a;
        boolean z2 = x10.f977d;
        int i10 = x10.f976c;
        Y9.b bVar = (Y9.b) bVarB;
        bVar.V(0, i6, gVar);
        bVar.V(1, x10.f975b, gVar);
        if (bVar.n(gVar) || i10 != 0) {
            bVar.V(2, i10, gVar);
        }
        if (bVar.n(gVar) || z2) {
            bVar.S(gVar, 3, z2);
        }
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Oc.Q.b;
    }
}
