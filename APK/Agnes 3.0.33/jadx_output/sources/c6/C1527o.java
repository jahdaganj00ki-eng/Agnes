package c6;

import java.util.ArrayList;

/* JADX INFO: renamed from: c6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1527o implements InterfaceC1528p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21466a;

    public C1527o(ArrayList arrayList) {
        this.f21466a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1527o) && this.f21466a.equals(((C1527o) obj).f21466a);
    }

    public final int hashCode() {
        return this.f21466a.hashCode();
    }

    public final String toString() {
        return "UpDataOtherTemporaryTabs(list=" + this.f21466a + ")";
    }
}
