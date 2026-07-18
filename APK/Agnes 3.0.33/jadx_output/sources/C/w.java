package c;

import androidx.lifecycle.InterfaceC1221w;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class w extends Y3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1221w f20973b;

    public w(InterfaceC1221w interfaceC1221w, v vVar) {
        kotlin.jvm.internal.l.f(vVar, "callback");
        this.f20972a = vVar;
        this.f20973b = interfaceC1221w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.b(this.f20972a, wVar.f20972a) && kotlin.jvm.internal.l.b(this.f20973b, wVar.f20973b);
    }

    public final int hashCode() {
        int iHashCode = this.f20972a.hashCode() * 31;
        InterfaceC1221w interfaceC1221w = this.f20973b;
        return iHashCode + (interfaceC1221w == null ? 0 : interfaceC1221w.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f20972a + ", owner=" + this.f20973b + ')';
    }
}
