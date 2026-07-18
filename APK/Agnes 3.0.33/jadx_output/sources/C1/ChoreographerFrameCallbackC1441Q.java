package c1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: c1.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ChoreographerFrameCallbackC1441Q implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1442S f21092a;

    public ChoreographerFrameCallbackC1441Q(C1442S c1442s) {
        this.f21092a = c1442s;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f21092a.f21097d.removeCallbacks(this);
        C1442S.k0(this.f21092a);
        C1442S c1442s = this.f21092a;
        synchronized (c1442s.f21098e) {
            if (c1442s.f21103j) {
                c1442s.f21103j = false;
                ArrayList arrayList = c1442s.f21100g;
                c1442s.f21100g = c1442s.f21101h;
                c1442s.f21101h = arrayList;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((Choreographer.FrameCallback) arrayList.get(i6)).doFrame(j4);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1442S.k0(this.f21092a);
        C1442S c1442s = this.f21092a;
        synchronized (c1442s.f21098e) {
            if (c1442s.f21100g.isEmpty()) {
                c1442s.f21096c.removeFrameCallback(this);
                c1442s.f21103j = false;
            }
        }
    }
}
