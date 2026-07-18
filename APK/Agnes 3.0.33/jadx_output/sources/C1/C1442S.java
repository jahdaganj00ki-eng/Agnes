package c1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: c1.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1442S extends Ac.x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ac.q f21094m = bc.G.B(C1435K.f21060g);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final P8.B f21095n = new P8.B(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f21096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f21097d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21103j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1444U f21104l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f21098e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bc.k f21099f = new bc.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f21100g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f21101h = new ArrayList();
    public final ChoreographerFrameCallbackC1441Q k = new ChoreographerFrameCallbackC1441Q(this);

    public C1442S(Choreographer choreographer, Handler handler) {
        this.f21096c = choreographer;
        this.f21097d = handler;
        this.f21104l = new C1444U(choreographer, this);
    }

    public static final void k0(C1442S c1442s) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (c1442s.f21098e) {
                bc.k kVar = c1442s.f21099f;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c1442s.f21098e) {
                    bc.k kVar2 = c1442s.f21099f;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (c1442s.f21098e) {
                if (c1442s.f21099f.isEmpty()) {
                    z2 = false;
                    c1442s.f21102i = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    public final void g0(ec.h hVar, Runnable runnable) {
        synchronized (this.f21098e) {
            this.f21099f.addLast(runnable);
            if (!this.f21102i) {
                this.f21102i = true;
                this.f21097d.post(this.k);
                if (!this.f21103j) {
                    this.f21103j = true;
                    this.f21096c.postFrameCallback(this.k);
                }
            }
        }
    }
}
