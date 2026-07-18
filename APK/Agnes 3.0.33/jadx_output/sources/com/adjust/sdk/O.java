package com.adjust.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class O implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21562b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f21563c = new LinkedBlockingQueue(1);

    public O(long j4) {
        this.f21561a = j4;
    }

    public final IBinder a() {
        if (this.f21562b) {
            throw new IllegalStateException();
        }
        this.f21562b = true;
        return (IBinder) this.f21563c.poll(this.f21561a, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f21563c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
