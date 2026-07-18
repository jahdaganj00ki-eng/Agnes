package C3;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1442e;

    public boolean a() {
        int i6 = this.f1438a;
        int i10 = 2;
        if ((i6 & 7) != 0) {
            int i11 = this.f1441d;
            int i12 = this.f1439b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i13 = this.f1441d;
            int i14 = this.f1440c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i15 = this.f1442e;
            int i16 = this.f1439b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i17 = this.f1442e;
            int i18 = this.f1440c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i6 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
