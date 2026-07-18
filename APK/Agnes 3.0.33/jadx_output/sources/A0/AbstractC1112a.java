package a0;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1112a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f18655a = a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18656b = 0;

    public static long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static String b(long j4) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j4 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j4 & 4294967295L)) + ')';
    }
}
