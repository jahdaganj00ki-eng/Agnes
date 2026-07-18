package C1;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class w implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1331b;

    public /* synthetic */ w(int i6, Object obj) {
        this.f1330a = i6;
        this.f1331b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1330a) {
            case 0:
                pc.a aVar = (pc.a) this.f1331b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                ((Y3.n) this.f1331b).a();
                break;
            default:
                ((Runnable) this.f1331b).run();
                break;
        }
    }
}
