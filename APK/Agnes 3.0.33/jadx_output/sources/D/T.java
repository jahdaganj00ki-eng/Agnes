package D;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class T implements pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f2436b;

    public /* synthetic */ T(U u7, int i6) {
        this.f2435a = i6;
        this.f2436b = u7;
    }

    public final Object invoke(Object obj) {
        b1.F0 f02 = (b1.F0) obj;
        switch (this.f2435a) {
            case 0:
                kotlin.jvm.internal.l.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                U u7 = (U) f02;
                Q0 q02 = this.f2436b.f2442L;
                if (!kotlin.jvm.internal.l.b(u7.f2443o, q02)) {
                    u7.f2443o = q02;
                    u7.h1();
                }
                return b1.E0.f20094b;
            default:
                kotlin.jvm.internal.l.d(f02, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.f2436b.f2443o = ((U) f02).f2442L;
                return Boolean.FALSE;
        }
    }
}
