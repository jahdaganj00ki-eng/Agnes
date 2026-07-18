package A3;

import i3.p;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f242d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f243a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f245c;

    public static long a(int i6, boolean z2, byte[] bArr) {
        long j4 = ((long) bArr[0]) & 255;
        if (z2) {
            j4 &= ~f242d[i6 - 1];
        }
        for (int i10 = 1; i10 < i6; i10++) {
            j4 = (j4 << 8) | (((long) bArr[i10]) & 255);
        }
        return j4;
    }

    public final long b(p pVar, boolean z2, boolean z7, int i6) {
        int i10;
        int i11 = this.f244b;
        byte[] bArr = this.f243a;
        if (i11 == 0) {
            if (!pVar.a(bArr, 0, 1, z2)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 >= 8) {
                    i10 = -1;
                    break;
                }
                if ((f242d[i13] & ((long) i12)) != 0) {
                    i10 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f245c = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f244b = 1;
        }
        int i14 = this.f245c;
        if (i14 > i6) {
            this.f244b = 0;
            return -2L;
        }
        if (i14 != 1) {
            pVar.readFully(bArr, 1, i14 - 1);
        }
        this.f244b = 0;
        return a(this.f245c, z7, bArr);
    }
}
