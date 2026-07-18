package D;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface B0 {
    static A0.r a(A0.r rVar, float f10) {
        if (f10 <= 0.0d) {
            E.a.a("invalid weight; must be greater than zero");
        }
        if (f10 > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        }
        return rVar.w0(new C0166i0(f10, true));
    }
}
