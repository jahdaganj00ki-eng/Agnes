package b0;

/* JADX INFO: renamed from: b0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1231D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19750a;

    public final C1230C a(Z z2) {
        C1229B c1229bK;
        C1229B c1229bK2;
        switch (this.f19750a) {
            case 0:
                return new C1230C(z2.k().a(z2.k().f20073c), z2.h().a(z2.h().f20074d), z2.i() == EnumC1258h.f19920a);
            case 1:
                return AbstractC1267l0.r(new C1230C(z2.k().a(z2.k().f20073c), z2.h().a(z2.h().f20074d), z2.i() == EnumC1258h.f19920a), z2);
            case 2:
                return AbstractC1267l0.h(z2, C1232E.f19756c);
            case 3:
                return AbstractC1267l0.h(z2, C1232E.f19755b);
            default:
                C1230C c1230cD = z2.d();
                if (c1230cD == null) {
                    return AbstractC1267l0.h(z2, C1232E.f19756c);
                }
                C1229B c1229b = c1230cD.f19744b;
                C1229B c1229b2 = c1230cD.f19743a;
                if (z2.a()) {
                    c1229bK2 = AbstractC1267l0.k(z2, z2.k(), c1229b2);
                    c1229bK = c1229b;
                    c1229b = c1229b2;
                    c1229b2 = c1229bK2;
                } else {
                    c1229bK = AbstractC1267l0.k(z2, z2.h(), c1229b);
                    c1229bK2 = c1229bK;
                }
                if (kotlin.jvm.internal.l.b(c1229bK2, c1229b)) {
                    return c1230cD;
                }
                return AbstractC1267l0.r(new C1230C(c1229b2, c1229bK, z2.i() == EnumC1258h.f19920a || (z2.i() == EnumC1258h.f19922c && c1229b2.f19739b > c1229bK.f19739b)), z2);
        }
    }
}
