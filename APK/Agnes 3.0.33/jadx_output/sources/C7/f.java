package C7;

import b4.AbstractC1380a;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2317f;

    public f(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str2, "data");
        l.f(str4, "role");
        this.f2312a = str;
        this.f2313b = str2;
        this.f2314c = str3;
        this.f2315d = str4;
        this.f2316e = str5;
        this.f2317f = str6;
    }

    public static f a(f fVar, String str, String str2, int i6) {
        String str3 = fVar.f2312a;
        String str4 = fVar.f2313b;
        if ((i6 & 4) != 0) {
            str = fVar.f2314c;
        }
        String str5 = str;
        String str6 = fVar.f2315d;
        if ((i6 & 16) != 0) {
            str2 = fVar.f2316e;
        }
        String str7 = fVar.f2317f;
        fVar.getClass();
        l.f(str3, "event");
        l.f(str4, "data");
        l.f(str6, "role");
        return new f(str3, str4, str5, str6, str2, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.b(this.f2312a, fVar.f2312a) && l.b(this.f2313b, fVar.f2313b) && l.b(this.f2314c, fVar.f2314c) && l.b(this.f2315d, fVar.f2315d) && l.b(this.f2316e, fVar.f2316e) && l.b(this.f2317f, fVar.f2317f);
    }

    public final int hashCode() {
        int iH = T0.a.h(this.f2312a.hashCode() * 31, 31, this.f2313b);
        String str = this.f2314c;
        int iH2 = T0.a.h((iH + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2315d);
        String str2 = this.f2316e;
        int iHashCode = (iH2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2317f;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return T0.a.s(AbstractC1380a.j("SseEvent(event='", this.f2312a, "', data='", this.f2313b, "', traceId="), this.f2314c, ", role='", this.f2315d, "')");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(int i6, String str, String str2, String str3, String str4) {
        String str5;
        if ((i6 & 8) != 0) {
            str5 = "assistant";
        } else {
            str5 = "user";
        }
        this(str, str2, str3, str5, null, (i6 & 32) != 0 ? null : str4);
    }
}
