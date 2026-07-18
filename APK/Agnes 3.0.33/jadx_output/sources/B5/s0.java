package B5;

import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dc.k0 f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dc.T f894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Dc.X f895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dc.S f896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dc.k0 f897e;

    public s0() {
        Dc.k0 k0VarC = Dc.j.c(bc.v.a);
        this.f893a = k0VarC;
        this.f894b = new Dc.T(k0VarC);
        Dc.X xB = Dc.j.b(0, 1, (Cc.a) null, 5);
        this.f895c = xB;
        this.f896d = new Dc.S(xB);
        this.f897e = Dc.j.c((Object) null);
    }

    public final void a(String str) {
        Dc.k0 k0Var;
        Object value;
        Map mapW;
        do {
            k0Var = this.f893a;
            value = k0Var.getValue();
            mapW = (Map) value;
            if (kotlin.jvm.internal.l.b(mapW.get(str), Boolean.TRUE)) {
                mapW = bc.A.W(mapW, new ac.l(str, Boolean.FALSE));
            }
        } while (!k0Var.k(value, mapW));
    }
}
