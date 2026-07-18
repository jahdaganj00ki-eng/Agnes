package c;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20970b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20969a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f20971c = new CopyOnWriteArrayList();

    public v(boolean z2) {
        this.f20970b = z2;
    }

    public void a() {
    }

    public abstract void b();

    public void c(C1422a c1422a) {
    }

    public void d(C1422a c1422a) {
    }

    public final void e() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20971c;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.l.e(it, "iterator(...)");
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.f20969a;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((u) obj).f();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i6 == 0) {
                                executorService.shutdownNow();
                                i6 = 1;
                            }
                        }
                    }
                    if (i6 != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    public final void f(boolean z2) {
        this.f20970b = z2;
        ArrayList arrayList = this.f20969a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            u uVar = (u) obj;
            uVar.g(uVar.f20968i && z2);
        }
    }
}
