package B6;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class G implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f958a;
    private static final Mc.g descriptor;

    static {
        G g10 = new G();
        f958a = g10;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.InterfaceLanguage", g10, 2);
        t10.k("baselineLanguageTag", false);
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
        return new I(i6, strC, zF);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        I i6 = (I) obj;
        kotlin.jvm.internal.l.f(i6, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        String str = i6.f959a;
        boolean z2 = i6.f960b;
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
