package e8;

import java.util.Arrays;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f23816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f23817b;

    public c(float[] fArr, int[] iArr) {
        this.f23816a = fArr;
        this.f23817b = iArr;
    }

    public final void a(c cVar) {
        int i6 = 0;
        while (true) {
            int[] iArr = cVar.f23817b;
            if (i6 >= iArr.length) {
                return;
            }
            this.f23816a[i6] = cVar.f23816a[i6];
            this.f23817b[i6] = iArr[i6];
            i6++;
        }
    }

    public final c b(float[] fArr) {
        int iB;
        int[] iArr = new int[fArr.length];
        for (int i6 = 0; i6 < fArr.length; i6++) {
            float f10 = fArr[i6];
            float[] fArr2 = this.f23816a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f23817b;
            if (iBinarySearch >= 0) {
                iB = iArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                if (i10 == 0) {
                    iB = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    iB = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f11 = fArr2[i11];
                    iB = Kb.e.B((f10 - f11) / (fArr2[i10] - f11), iArr2[i11], iArr2[i10]);
                }
            }
            iArr[i6] = iB;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f23816a, cVar.f23816a) && Arrays.equals(this.f23817b, cVar.f23817b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23817b) + (Arrays.hashCode(this.f23816a) * 31);
    }
}
