package c8;

import android.graphics.PointF;

/* JADX INFO: renamed from: c8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1538a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f21488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f21489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f21490c;

    public C1538a() {
        this.f21488a = new PointF();
        this.f21489b = new PointF();
        this.f21490c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f21490c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f21488a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f21489b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C1538a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f21488a = pointF;
        this.f21489b = pointF2;
        this.f21490c = pointF3;
    }
}
