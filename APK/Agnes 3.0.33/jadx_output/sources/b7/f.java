package b7;

import com.android.billingclient.api.Purchase;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Purchase f20866a;

    public f(Purchase purchase) {
        this.f20866a = purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.l.b(this.f20866a, ((f) obj).f20866a);
    }

    public final int hashCode() {
        Purchase purchase = this.f20866a;
        if (purchase == null) {
            return 0;
        }
        return purchase.f21902a.hashCode();
    }

    public final String toString() {
        return "OldPurchaseFound(purchase=" + this.f20866a + ")";
    }
}
