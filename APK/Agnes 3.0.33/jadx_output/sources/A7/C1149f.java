package a7;

import ac.B;
import java.util.Map;
import n5.AbstractC3136e;
import q2.C3623b;
import wb.E;
import wb.F;
import wb.G;
import wb.M0;
import wb.N;

/* JADX INFO: renamed from: a7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1149f implements Dc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dc.g f18846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18847c;

    public /* synthetic */ C1149f(Dc.g gVar, String str, int i6) {
        this.f18845a = i6;
        this.f18846b = gVar;
        this.f18847c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, ec.c cVar) {
        C1148e c1148e;
        E e10;
        F f10;
        G g10;
        N n2;
        switch (this.f18845a) {
            case 0:
                if (cVar instanceof C1148e) {
                    c1148e = (C1148e) cVar;
                    int i6 = c1148e.f18843b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c1148e.f18843b = i6 - Integer.MIN_VALUE;
                    } else {
                        c1148e = new C1148e(this, cVar);
                    }
                }
                Object obj2 = c1148e.f18842a;
                fc.a aVar = fc.a.a;
                int i10 = c1148e.f18843b;
                if (i10 == 0) {
                    X8.a.n0(obj2);
                    C1153j c1153j = (C1153j) ((Map) obj).get(this.f18847c);
                    if (c1153j == null) {
                        c1153j = C1153j.f18857e;
                    }
                    c1148e.f18843b = 1;
                    if (this.f18846b.i(c1153j, c1148e) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X8.a.n0(obj2);
                }
                return B.a;
            case 1:
                if (cVar instanceof E) {
                    e10 = (E) cVar;
                    int i11 = e10.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        e10.b = i11 - Integer.MIN_VALUE;
                    } else {
                        e10 = new E(this, cVar);
                    }
                }
                Object obj3 = e10.a;
                fc.a aVar2 = fc.a.a;
                int i12 = e10.b;
                if (i12 == 0) {
                    X8.a.n0(obj3);
                    Object objC = ((C3623b) obj).c(AbstractC3136e.j(M0.x + "_" + this.f18847c));
                    e10.b = 1;
                    if (this.f18846b.i(objC, e10) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X8.a.n0(obj3);
                }
                return B.a;
            case 2:
                if (cVar instanceof F) {
                    f10 = (F) cVar;
                    int i13 = f10.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        f10.b = i13 - Integer.MIN_VALUE;
                    } else {
                        f10 = new F(this, cVar);
                    }
                }
                Object obj4 = f10.a;
                fc.a aVar3 = fc.a.a;
                int i14 = f10.b;
                if (i14 == 0) {
                    X8.a.n0(obj4);
                    Object objC2 = ((C3623b) obj).c(AbstractC3136e.j(M0.y + "_" + this.f18847c));
                    f10.b = 1;
                    if (this.f18846b.i(objC2, f10) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X8.a.n0(obj4);
                }
                return B.a;
            case 3:
                if (cVar instanceof G) {
                    g10 = (G) cVar;
                    int i15 = g10.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        g10.b = i15 - Integer.MIN_VALUE;
                    } else {
                        g10 = new G(this, cVar);
                    }
                }
                Object obj5 = g10.a;
                fc.a aVar4 = fc.a.a;
                int i16 = g10.b;
                if (i16 == 0) {
                    X8.a.n0(obj5);
                    Object objC3 = ((C3623b) obj).c(AbstractC3136e.j(this.f18847c));
                    g10.b = 1;
                    if (this.f18846b.i(objC3, g10) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X8.a.n0(obj5);
                }
                return B.a;
            default:
                if (cVar instanceof N) {
                    n2 = (N) cVar;
                    int i17 = n2.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        n2.b = i17 - Integer.MIN_VALUE;
                    } else {
                        n2 = new N(this, cVar);
                    }
                }
                Object obj6 = n2.a;
                fc.a aVar5 = fc.a.a;
                int i18 = n2.b;
                if (i18 == 0) {
                    X8.a.n0(obj6);
                    Object objC4 = ((C3623b) obj).c(AbstractC3136e.b("human_review_is_confirm_" + this.f18847c));
                    n2.b = 1;
                    if (this.f18846b.i(objC4, n2) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X8.a.n0(obj6);
                }
                return B.a;
        }
    }
}
