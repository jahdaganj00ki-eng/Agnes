package B5;

import K7.C0449f;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0449f f906a;

    public t0(C0449f c0449f) {
        this.f906a = c0449f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && kotlin.jvm.internal.l.b(this.f906a, ((t0) obj).f906a);
    }

    public final int hashCode() {
        return this.f906a.hashCode();
    }

    public final String toString() {
        return "ConversationPushToastEvent(message=" + this.f906a + ")";
    }
}
