package a1;

import C1.L;
import y.AbstractC4316b;
import y1.C4340j;
import y1.C4341k;
import y1.EnumC4343m;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class d implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.a f18795a;

    @Override // C1.L
    public long a(C4341k c4341k, long j4, EnumC4343m enumC4343m, long j10) {
        long j11 = ((C4340j) this.f18795a.invoke()).f40570a;
        return (((long) AbstractC4316b.a(c4341k.f40572a + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j4 >> 32), enumC4343m == EnumC4343m.f40577a)) << 32) | (((long) AbstractC4316b.a(c4341k.f40573b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j4 & 4294967295L), true)) & 4294967295L);
    }
}
