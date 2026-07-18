package b0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j1.z f19868c = new j1.z("SelectionHandleInfo");

    static {
        float f10 = 25;
        f19866a = f10;
        f19867b = f10;
    }

    public static final long a(long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
