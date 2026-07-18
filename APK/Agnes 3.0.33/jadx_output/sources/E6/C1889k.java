package e6;

import Oc.A;
import Oc.Q;
import Oc.T;
import Oc.f0;
import com.android.installreferrer.api.InstallReferrerClient;
import p2.C3379i;

/* JADX INFO: renamed from: e6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1889k implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1889k f23803a;
    private static final Mc.g descriptor;

    static {
        C1889k c1889k = new C1889k();
        f23803a = c1889k;
        T t10 = new T("com.agnes.bundle_agnes.ui.explore.model.VideoItem", c1889k, 8);
        t10.k("url", true);
        t10.k("title", true);
        t10.k("type", true);
        t10.k("thumbnail", true);
        t10.k("imageUrlAigcFallback", true);
        t10.k("originalUrl", true);
        t10.k("source", true);
        t10.k("sourceUrl", true);
        descriptor = t10;
    }

    public final Kc.a[] childSerializers() {
        f0 f0Var = f0.a;
        return new Kc.a[]{M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var), M2.f.I(f0Var)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Kc.i */
    public final Object deserialize(Nc.c cVar) throws Kc.i {
        Mc.g gVar = descriptor;
        Nc.a aVarB = cVar.b(gVar);
        int i6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z2 = true;
        while (z2) {
            int iQ = aVarB.q(gVar);
            switch (iQ) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z2 = false;
                    break;
                case 0:
                    str = (String) aVarB.t(gVar, 0, f0.a, str);
                    i6 |= 1;
                    break;
                case 1:
                    str2 = (String) aVarB.t(gVar, 1, f0.a, str2);
                    i6 |= 2;
                    break;
                case 2:
                    str3 = (String) aVarB.t(gVar, 2, f0.a, str3);
                    i6 |= 4;
                    break;
                case 3:
                    str4 = (String) aVarB.t(gVar, 3, f0.a, str4);
                    i6 |= 8;
                    break;
                case 4:
                    str5 = (String) aVarB.t(gVar, 4, f0.a, str5);
                    i6 |= 16;
                    break;
                case C3379i.STRING_FIELD_NUMBER /* 5 */:
                    str6 = (String) aVarB.t(gVar, 5, f0.a, str6);
                    i6 |= 32;
                    break;
                case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str7 = (String) aVarB.t(gVar, 6, f0.a, str7);
                    i6 |= 64;
                    break;
                case C3379i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str8 = (String) aVarB.t(gVar, 7, f0.a, str8);
                    i6 |= 128;
                    break;
                default:
                    throw new Kc.i(iQ);
            }
        }
        aVarB.c(gVar);
        return new C1891m(i6, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final Mc.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(Nc.d dVar, Object obj) {
        C1891m c1891m = (C1891m) obj;
        kotlin.jvm.internal.l.f(c1891m, "value");
        Mc.g gVar = descriptor;
        Nc.b bVarB = dVar.b(gVar);
        C1891m.e(c1891m, bVarB, gVar);
        bVarB.c(gVar);
    }

    public final Kc.a[] typeParametersSerializers() {
        return Q.b;
    }
}
