package A7;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f355b;

    public b(int i6, String str) {
        this.f354a = i6;
        this.f355b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f354a == bVar.f354a && l.b(this.f355b, bVar.f355b);
    }

    public final int hashCode() {
        return this.f355b.hashCode() + (Integer.hashCode(this.f354a) * 31);
    }

    public final String toString() {
        return "OnError(code=" + this.f354a + ", msg=" + this.f355b + ")";
    }
}
