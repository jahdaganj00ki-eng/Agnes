package D7;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f3422b;

    public o(String str, Long l2) {
        kotlin.jvm.internal.l.f(str, "conversationId");
        this.f3421a = str;
        this.f3422b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.b(this.f3421a, oVar.f3421a) && kotlin.jvm.internal.l.b(this.f3422b, oVar.f3422b);
    }

    public final int hashCode() {
        int iHashCode = this.f3421a.hashCode() * 31;
        Long l2 = this.f3422b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        return "MessageTimeSource(conversationId=" + this.f3421a + ", createTimeEpochMs=" + this.f3422b + ")";
    }
}
