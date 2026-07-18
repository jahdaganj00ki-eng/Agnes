package B6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class K implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f962a;
    private static final Mc.g descriptor;

    static {
        K k = new K();
        f962a = k;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.LegalWeb", k, 3);
        t10.k("url", false);
        t10.k("title", false);
        t10.k("showsMainBottomBar", true);
        descriptor = t10;
    }

    public final Kc.a[] childSerializers() {
        Oc.f0 f0Var = Oc.f0.a;
        return new Kc.a[]{f0Var, f0Var, Oc.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        String strC = null;
        boolean z2 = true;
        int i6 = 0;
        boolean zF = false;
        String strC2 = null;
        while (z2) {
            int iQ = aVarB.q(gVar);
            if (iQ == -1) {
                z2 = false;
            } else if (iQ == 0) {
                strC = aVarB.C(gVar, 0);
                i6 |= 1;
            } else if (iQ == 1) {
                strC2 = aVarB.C(gVar, 1);
                i6 |= 2;
            } else {
                if (iQ != 2) {
                    throw new Kc.i(iQ);
                }
                zF = aVarB.f(gVar, 2);
                i6 |= 4;
            }
        }
        aVarB.c(gVar);
        return new M(i6, strC, strC2, zF);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        M m3 = (M) obj;
        kotlin.jvm.internal.l.f(m3, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        String str = m3.f963a;
        boolean z2 = m3.f965c;
        Y9.b bVar = (Y9.b) bVarB;
        bVar.Y(gVar, 0, str);
        bVar.Y(gVar, 1, m3.f964b);
        if (bVar.n(gVar) || z2) {
            bVar.S(gVar, 2, z2);
        }
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Oc.Q.b;
    }
}
