package B8;

import android.content.Context;
import w8.InterfaceC4250b;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class e implements InterfaceC4250b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zb.a f1092b;

    public /* synthetic */ e(Zb.a aVar, int i6) {
        this.f1091a = i6;
        this.f1092b = aVar;
    }

    public final Object get() {
        switch (this.f1091a) {
            case 0:
                String packageName = ((Context) this.f1092b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new m(Integer.valueOf(m.f1112d).intValue(), (Context) this.f1092b.get(), "com.google.android.datatransport.events");
        }
    }
}
