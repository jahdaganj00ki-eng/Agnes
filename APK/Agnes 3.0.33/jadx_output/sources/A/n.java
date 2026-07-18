package A;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class n implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f42b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f43c = new n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    public /* synthetic */ n(int i6) {
        this.f44a = i6;
    }

    @Override // A.o
    public final int a(int i6, int i10, int i11, int i12) {
        switch (this.f44a) {
            case 0:
                return (((i6 - i11) - i12) / 2) - (i10 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f44a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
