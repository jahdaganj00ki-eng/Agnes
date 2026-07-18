package a7;

import Ac.j0;
import Dc.T;
import Dc.k0;
import bc.A;
import bc.v;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1151h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1151h f18851d = new C1151h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f18852a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f18853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f18854c;

    public C1151h() {
        k0 k0VarC = Dc.j.c(v.a);
        this.f18853b = k0VarC;
        this.f18854c = new T(k0VarC);
    }

    public final void a(String str) {
        k0 k0Var;
        Object value;
        v vVarA0;
        kotlin.jvm.internal.l.f(str, "id");
        j0 j0Var = (j0) this.f18852a.remove(str);
        if (j0Var != null) {
            j0Var.d((CancellationException) null);
        }
        do {
            k0Var = this.f18853b;
            value = k0Var.getValue();
            Map map = (Map) value;
            kotlin.jvm.internal.l.f(map, "<this>");
            vVarA0 = A.a0(map);
            vVarA0.remove(str);
            int size = vVarA0.size();
            if (size == 0) {
                vVarA0 = v.a;
            } else if (size == 1) {
                vVarA0 = A.b0(vVarA0);
            }
        } while (!k0Var.k(value, vVarA0));
    }
}
