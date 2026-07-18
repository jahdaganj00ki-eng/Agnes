package B6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class S implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f970a;
    private static final Mc.g descriptor;

    static {
        S s10 = new S();
        f970a = s10;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.TeenModeFlow", s10, 2);
        t10.k("targetEnable", false);
        t10.k("showsMainBottomBar", true);
        descriptor = t10;
    }

    public final Kc.a[] childSerializers() {
        Oc.g gVar = Oc.g.a;
        return new Kc.a[]{gVar, gVar};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        boolean z2 = true;
        int i6 = 0;
        boolean zF = false;
        boolean zF2 = false;
        while (z2) {
            int iQ = aVarB.q(gVar);
            if (iQ == -1) {
                z2 = false;
            } else if (iQ == 0) {
                zF = aVarB.f(gVar, 0);
                i6 |= 1;
            } else {
                if (iQ != 1) {
                    throw new Kc.i(iQ);
                }
                zF2 = aVarB.f(gVar, 1);
                i6 |= 2;
            }
        }
        aVarB.c(gVar);
        return new U(i6, zF, zF2);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        U u7 = (U) obj;
        kotlin.jvm.internal.l.f(u7, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        boolean z2 = u7.f971a;
        boolean z7 = u7.f972b;
        Y9.b bVar = (Y9.b) bVarB;
        bVar.S(gVar, 0, z2);
        if (bVar.n(gVar) || z7) {
            bVar.S(gVar, 1, z7);
        }
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Oc.Q.b;
    }
}
