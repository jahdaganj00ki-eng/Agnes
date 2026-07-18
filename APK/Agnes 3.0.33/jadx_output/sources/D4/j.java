package D4;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f2718b = new j(M2.f.Z(new LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2719a;

    public j(Map map) {
        this.f2719a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.l.b(this.f2719a, ((j) obj).f2719a);
    }

    public final int hashCode() {
        return this.f2719a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f2719a + ")";
    }
}
