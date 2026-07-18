package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1748i0 f22643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f22645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22646d;

    public Q0(AbstractC1748i0 abstractC1748i0, String str, Object[] objArr) {
        this.f22643a = abstractC1748i0;
        this.f22644b = str;
        this.f22645c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22646d = cCharAt;
            return;
        }
        int i6 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f22646d = i6 | (cCharAt2 << i11);
                return;
            } else {
                i6 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i6 = this.f22646d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        return (i6 & 4) == 4 ? 3 : 2;
    }
}
