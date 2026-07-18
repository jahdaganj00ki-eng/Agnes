package e8;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f23859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23860c;

    public k(PointF pointF, boolean z2, List list) {
        this.f23859b = pointF;
        this.f23860c = z2;
        this.f23858a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f23859b == null) {
            this.f23859b = new PointF();
        }
        this.f23859b.set(f10, f11);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f23858a.size() + "closed=" + this.f23860c + '}';
    }

    public k() {
        this.f23858a = new ArrayList();
    }
}
