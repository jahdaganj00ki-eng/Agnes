package androidx.lifecycle;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f19460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19462c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f19463d;

    public D(E e10, F f10) {
        this.f19463d = e10;
        this.f19460a = f10;
    }

    public final void a(boolean z2) {
        if (z2 == this.f19461b) {
            return;
        }
        this.f19461b = z2;
        int i6 = z2 ? 1 : -1;
        E e10 = this.f19463d;
        int i10 = e10.f19466c;
        e10.f19466c = i6 + i10;
        if (!e10.f19467d) {
            e10.f19467d = true;
            while (true) {
                try {
                    int i11 = e10.f19466c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z7 = i10 == 0 && i11 > 0;
                    boolean z10 = i10 > 0 && i11 == 0;
                    if (z7) {
                        e10.e();
                    } else if (z10) {
                        e10.f();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    e10.f19467d = false;
                    throw th;
                }
            }
            e10.f19467d = false;
        }
        if (this.f19461b) {
            e10.c(this);
        }
    }

    public void c() {
    }

    public boolean f(InterfaceC1221w interfaceC1221w) {
        return false;
    }

    public abstract boolean g();
}
