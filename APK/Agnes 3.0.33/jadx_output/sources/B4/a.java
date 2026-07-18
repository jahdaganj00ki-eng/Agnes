package B4;

import android.graphics.Rect;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A4.a f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f672b;

    public a(A4.a aVar, float f10) {
        this.f671a = aVar;
        this.f672b = f10;
    }

    public final Rect a() {
        A4.a aVar = this.f671a;
        aVar.getClass();
        return new Rect(aVar.f246a, aVar.f247b, aVar.f248c, aVar.f249d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        a aVar = (a) obj;
        return l.b(this.f671a, aVar.f671a) && this.f672b == aVar.f672b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f672b) + (this.f671a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f671a);
        sb.append(", density=");
        return o0.n(sb, this.f672b, ')');
    }

    public a(Rect rect, float f10) {
        this.f671a = new A4.a(rect);
        this.f672b = f10;
    }
}
