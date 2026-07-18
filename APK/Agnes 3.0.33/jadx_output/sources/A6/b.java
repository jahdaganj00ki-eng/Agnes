package A6;

import Dc.k0;
import Xb.C;
import com.agnes.feature_billing.net.model.SubscribePointsBean;
import gc.c;
import kotlin.jvm.internal.l;
import n0.O;
import y6.C4389a;
import yc.g;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f352a;

    public b(C c2) {
        this.f352a = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z2, c cVar) {
        a aVar;
        y6.b bVar = y6.b.f40694a;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i6 = aVar.f351d;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f351d = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        }
        Object objY = aVar.f349b;
        fc.a aVar2 = fc.a.a;
        int i10 = aVar.f351d;
        if (i10 == 0) {
            X8.a.n0(objY);
            aVar.f348a = z2;
            aVar.f351d = 1;
            objY = this.f352a.y(aVar);
            if (objY == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = aVar.f348a;
            X8.a.n0(objY);
        }
        SubscribePointsBean subscribePointsBean = (SubscribePointsBean) objY;
        if (subscribePointsBean == null) {
            return null;
        }
        if (z2 && subscribePointsBean.getDailyFreeCredits() > 0) {
            k0 k0Var = y6.c.f40696a;
            String strValueOf = String.valueOf(subscribePointsBean.getDailyFreeCredits());
            g gVar = yc.a.b;
            long jI = O.i(3, yc.c.d);
            l.f(strValueOf, "credits");
            k0 k0Var2 = y6.c.f40696a;
            C4389a c4389a = new C4389a(strValueOf, bVar, jI, System.nanoTime());
            k0Var2.getClass();
            k0Var2.m((Object) null, c4389a);
        }
        return subscribePointsBean;
    }
}
