package C7;

import K7.W;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f2307a;

    public c(W w4) {
        this.f2307a = w4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && l.b(this.f2307a, ((c) obj).f2307a);
    }

    public final int hashCode() {
        return this.f2307a.hashCode();
    }

    public final String toString() {
        return "AudioSegment(audio=" + this.f2307a + ")";
    }
}
