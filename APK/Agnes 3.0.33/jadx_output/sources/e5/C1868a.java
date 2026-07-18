package e5;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1868a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("image")
    private final C1875h f23723a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("video")
    private final l f23724b = null;

    public final C1875h a() {
        return this.f23723a;
    }

    public final l b() {
        return this.f23724b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868a)) {
            return false;
        }
        C1868a c1868a = (C1868a) obj;
        return kotlin.jvm.internal.l.b(this.f23723a, c1868a.f23723a) && kotlin.jvm.internal.l.b(this.f23724b, c1868a.f23724b);
    }

    public final int hashCode() {
        C1875h c1875h = this.f23723a;
        int iHashCode = (c1875h == null ? 0 : c1875h.hashCode()) * 31;
        l lVar = this.f23724b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "AssetData(image=" + this.f23723a + ", video=" + this.f23724b + ")";
    }
}
