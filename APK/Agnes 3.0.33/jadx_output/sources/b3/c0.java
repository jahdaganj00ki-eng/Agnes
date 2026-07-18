package b3;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f20627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f20629c;

    public c0() {
        this(new Random());
    }

    public final c0 a(int i6, int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.f20628b;
            random = this.f20627a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int iNextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[iNextInt];
            iArr3[iNextInt] = i11 + i6;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 >= i10 || i14 != iArr2[i13]) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= i6) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr3[i13];
                i13++;
            }
        }
        return new c0(iArr4, new Random(random.nextLong()));
    }

    public c0(int[] iArr, Random random) {
        this.f20628b = iArr;
        this.f20627a = random;
        this.f20629c = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f20629c[iArr[i6]] = i6;
        }
    }

    public c0(Random random) {
        this(new int[0], random);
    }
}
