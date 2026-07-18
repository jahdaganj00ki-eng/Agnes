package b7;

import com.agnes.feature_billing.net.model.CurrentSubscription;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrentSubscription f20870b;

    public i(CurrentSubscription currentSubscription, List list) {
        this.f20869a = list;
        this.f20870b = currentSubscription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.b(this.f20869a, iVar.f20869a) && kotlin.jvm.internal.l.b(this.f20870b, iVar.f20870b);
    }

    public final int hashCode() {
        int iHashCode = this.f20869a.hashCode() * 31;
        CurrentSubscription currentSubscription = this.f20870b;
        return iHashCode + (currentSubscription == null ? 0 : currentSubscription.hashCode());
    }

    public final String toString() {
        return "PlansLoaded(plans=" + this.f20869a + ", currentSubscription=" + this.f20870b + ")";
    }
}
