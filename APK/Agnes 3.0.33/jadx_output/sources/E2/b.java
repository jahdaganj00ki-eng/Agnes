package E2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3579a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.b(this.f3579a, ((b) obj).f3579a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3579a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f3579a + ')';
    }
}
