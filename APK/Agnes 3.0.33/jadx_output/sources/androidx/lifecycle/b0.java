package androidx.lifecycle;

import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class b0 {
    private final G2.d impl = new G2.d();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        kotlin.jvm.internal.l.f(str, "key");
        kotlin.jvm.internal.l.f(autoCloseable, "closeable");
        G2.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.f4974d) {
                G2.d.b(autoCloseable);
                return;
            }
            synchronized (dVar.f4971a) {
                autoCloseable2 = (AutoCloseable) dVar.f4972b.put(str, autoCloseable);
            }
            G2.d.b(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        G2.d dVar = this.impl;
        if (dVar != null && !dVar.f4974d) {
            dVar.f4974d = true;
            synchronized (dVar.f4971a) {
                try {
                    Iterator it = dVar.f4972b.values().iterator();
                    while (it.hasNext()) {
                        G2.d.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f4973c.iterator();
                    while (it2.hasNext()) {
                        G2.d.b((AutoCloseable) it2.next());
                    }
                    dVar.f4973c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t10;
        kotlin.jvm.internal.l.f(str, "key");
        G2.d dVar = this.impl;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f4971a) {
            t10 = (T) dVar.f4972b.get(str);
        }
        return t10;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        kotlin.jvm.internal.l.f(autoCloseable, "closeable");
        G2.d dVar = this.impl;
        if (dVar != null) {
            dVar.a(autoCloseable);
        }
    }

    @ac.c
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.l.f(closeable, "closeable");
        G2.d dVar = this.impl;
        if (dVar != null) {
            dVar.a(closeable);
        }
    }
}
