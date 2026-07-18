package b5;

import Uc.x;
import android.media.MediaDataSource;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1381a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f20721a;

    public C1381a(x xVar) {
        this.f20721a = xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20721a.close();
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f20721a.size();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i6, int i10) {
        x xVar = this.f20721a;
        xVar.getClass();
        l.f(bArr, "array");
        ReentrantLock reentrantLock = xVar.c;
        reentrantLock.lock();
        try {
            if (xVar.a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return xVar.b(j4, bArr, i6, i10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
