package C1;

import B1.RunnableC0007a;
import Z0.InterfaceC1084y;
import android.os.Handler;
import android.os.Looper;
import y1.C4342l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class o extends kotlin.jvm.internal.m implements pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f1316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(G g10, int i6) {
        super(1);
        this.f1315a = i6;
        this.f1316b = g10;
    }

    public final Object invoke(Object obj) {
        switch (this.f1315a) {
            case 0:
                InterfaceC1084y interfaceC1084yF = ((InterfaceC1084y) obj).F();
                kotlin.jvm.internal.l.c(interfaceC1084yF);
                this.f1316b.p(interfaceC1084yF);
                break;
            case 1:
                C4342l c4342l = new C4342l(((C4342l) obj).f40576a);
                G g10 = this.f1316b;
                g10.m1setPopupContentSizefhxjrPA(c4342l);
                g10.q();
                break;
            default:
                pc.a aVar = (pc.a) obj;
                G g11 = this.f1316b;
                Handler handler = g11.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = g11.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0007a(2, aVar));
                    }
                }
                break;
        }
        return ac.B.a;
    }
}
