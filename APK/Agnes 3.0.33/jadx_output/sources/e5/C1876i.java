package e5;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: e5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1876i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    private final C1868a f23764a = null;

    public final C1868a a() {
        return this.f23764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1876i) && kotlin.jvm.internal.l.b(this.f23764a, ((C1876i) obj).f23764a);
    }

    public final int hashCode() {
        C1868a c1868a = this.f23764a;
        if (c1868a == null) {
            return 0;
        }
        return c1868a.hashCode();
    }

    public final String toString() {
        return "OutputParams(data=" + this.f23764a + ")";
    }
}
