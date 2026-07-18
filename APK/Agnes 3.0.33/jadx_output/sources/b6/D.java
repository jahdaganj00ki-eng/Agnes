package B6;

import java.util.List;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class D implements Oc.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f954a;
    private static final Mc.g descriptor;

    static {
        D d5 = new D();
        f954a = d5;
        Oc.T t10 = new Oc.T("com.agnes.bundle_agnes.ui.me.navi.MeNavKey.ImportMemoryReview", d5, 2);
        t10.k("items", false);
        t10.k("showsMainBottomBar", true);
        descriptor = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Kc.a[] childSerializers() {
        return new Kc.a[]{F.f955c[0].getValue(), Oc.g.a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        ac.i[] iVarArr = F.f955c;
        List list = null;
        boolean z2 = true;
        int i6 = 0;
        boolean zF = false;
        while (z2) {
            int iQ = aVarB.q(gVar);
            if (iQ == -1) {
                z2 = false;
            } else if (iQ == 0) {
                list = (List) aVarB.j(gVar, 0, (Kc.a) iVarArr[0].getValue(), list);
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
        return new F(i6, list, zF);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        F f10 = (F) obj;
        kotlin.jvm.internal.l.f(f10, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        Kc.a aVar = (Kc.a) F.f955c[0].getValue();
        List list = f10.f956a;
        boolean z2 = f10.f957b;
        Y9.b bVar = (Y9.b) bVarB;
        bVar.X(gVar, 0, aVar, list);
        if (bVar.n(gVar) || z2) {
            bVar.S(gVar, 1, z2);
        }
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Oc.Q.b;
    }
}
