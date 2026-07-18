package ea;

import Xb.C;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ea.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1897d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1899f f23905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f23907d;

    public /* synthetic */ RunnableC1897d(ScheduledExecutorServiceC1899f scheduledExecutorServiceC1899f, Runnable runnable, C c2, int i6) {
        this.f23904a = i6;
        this.f23905b = scheduledExecutorServiceC1899f;
        this.f23906c = runnable;
        this.f23907d = c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23904a) {
            case 0:
                ExecutorService executorService = this.f23905b.f23911a;
                final int i6 = 0;
                final Runnable runnable = this.f23906c;
                final C c2 = this.f23907d;
                executorService.execute(new Runnable() { // from class: ea.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1901h) c2.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC1901h) c2.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC1901h scheduledFutureC1901h = (ScheduledFutureC1901h) c2.b;
                                try {
                                    runnable2.run();
                                    scheduledFutureC1901h.k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC1901h.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f23905b.f23911a;
                final int i10 = 2;
                final Runnable runnable2 = this.f23906c;
                final C c10 = this.f23907d;
                executorService2.execute(new Runnable() { // from class: ea.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1901h) c10.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC1901h) c10.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC1901h scheduledFutureC1901h = (ScheduledFutureC1901h) c10.b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1901h.k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC1901h.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f23905b.f23911a;
                final int i11 = 1;
                final Runnable runnable3 = this.f23906c;
                final C c11 = this.f23907d;
                executorService3.execute(new Runnable() { // from class: ea.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1901h) c11.b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC1901h) c11.b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC1901h scheduledFutureC1901h = (ScheduledFutureC1901h) c11.b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1901h.k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC1901h.l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
