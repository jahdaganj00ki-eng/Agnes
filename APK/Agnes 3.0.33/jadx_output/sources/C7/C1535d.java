package c7;

import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: c7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1535d extends AbstractC1537f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21486b;

    public C1535d(int i6, String str) {
        l.f(str, "debugMessage");
        this.f21485a = i6;
        this.f21486b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535d)) {
            return false;
        }
        C1535d c1535d = (C1535d) obj;
        return this.f21485a == c1535d.f21485a && l.b(this.f21486b, c1535d.f21486b);
    }

    public final int hashCode() {
        return this.f21486b.hashCode() + (Integer.hashCode(this.f21485a) * 31);
    }

    public final String toString() {
        return "Error(responseCode=" + this.f21485a + ", debugMessage=" + this.f21486b + ")";
    }
}
