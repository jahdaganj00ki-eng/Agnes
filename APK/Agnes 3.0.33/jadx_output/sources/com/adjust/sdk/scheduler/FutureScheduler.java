package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j4);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j4, long j10);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j4);

    void teardown();
}
