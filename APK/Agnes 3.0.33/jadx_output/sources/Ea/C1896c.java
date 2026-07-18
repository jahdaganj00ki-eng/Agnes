package ea;

import Xb.C;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ea.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class C1896c implements InterfaceC1900g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1899f f23899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f23903f;

    public /* synthetic */ C1896c(ScheduledExecutorServiceC1899f scheduledExecutorServiceC1899f, Runnable runnable, long j4, long j10, TimeUnit timeUnit, int i6) {
        this.f23898a = i6;
        this.f23899b = scheduledExecutorServiceC1899f;
        this.f23900c = runnable;
        this.f23901d = j4;
        this.f23902e = j10;
        this.f23903f = timeUnit;
    }

    @Override // ea.InterfaceC1900g
    public final ScheduledFuture a(C c2) {
        switch (this.f23898a) {
            case 0:
                ScheduledExecutorServiceC1899f scheduledExecutorServiceC1899f = this.f23899b;
                return scheduledExecutorServiceC1899f.f23912b.scheduleAtFixedRate(new RunnableC1897d(scheduledExecutorServiceC1899f, this.f23900c, c2, 0), this.f23901d, this.f23902e, this.f23903f);
            default:
                ScheduledExecutorServiceC1899f scheduledExecutorServiceC1899f2 = this.f23899b;
                return scheduledExecutorServiceC1899f2.f23912b.scheduleWithFixedDelay(new RunnableC1897d(scheduledExecutorServiceC1899f2, this.f23900c, c2, 2), this.f23901d, this.f23902e, this.f23903f);
        }
    }
}
