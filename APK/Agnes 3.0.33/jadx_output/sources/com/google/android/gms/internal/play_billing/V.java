package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1759o f22660a = new C1759o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f22662c;

    public V(Class cls) {
        this.f22661b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f22662c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f22660a) {
            try {
                Logger logger2 = this.f22662c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f22661b);
                this.f22662c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
