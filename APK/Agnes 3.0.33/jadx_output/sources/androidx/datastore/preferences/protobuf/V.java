package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1175a f19327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f19329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19330d;

    public V(AbstractC1194u abstractC1194u, String str, Object[] objArr) {
        this.f19327a = abstractC1194u;
        this.f19328b = str;
        this.f19329c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19330d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f19330d = i6 | (cCharAt2 << i10);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i6 = this.f19330d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }
}
