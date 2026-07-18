package a5;

import Uc.K;
import Uc.N;
import Uc.l;
import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: a5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1140b implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaDataSource f18815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18817c;

    public C1140b(MediaDataSource mediaDataSource) {
        this.f18815a = mediaDataSource;
        this.f18816b = mediaDataSource.getSize();
    }

    public final void close() throws IOException {
        this.f18815a.close();
    }

    public final long read(l lVar, long j4) throws IOException {
        long j10 = this.f18817c;
        long j11 = this.f18816b;
        if (j10 >= j11) {
            return -1L;
        }
        int iMin = (int) Math.min(j4, j11 - j10);
        byte[] bArr = new byte[iMin];
        int at = this.f18815a.readAt(this.f18817c, bArr, 0, iMin);
        long j12 = at;
        this.f18817c += j12;
        lVar.write(bArr, 0, at);
        return j12;
    }

    public final N timeout() {
        return N.NONE;
    }
}
