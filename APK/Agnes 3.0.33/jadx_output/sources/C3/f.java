package C3;

import W2.C0882g;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1423c;

    public /* synthetic */ f(boolean z2, boolean z7, boolean z10) {
        this.f1421a = z2;
        this.f1422b = z7;
        this.f1423c = z10;
    }

    public C0882g a() {
        if (this.f1421a || !(this.f1422b || this.f1423c)) {
            return new C0882g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
