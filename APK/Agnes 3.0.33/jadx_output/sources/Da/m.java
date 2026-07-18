package da;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class m implements Da.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f23577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f23578b;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        throw r0;
     */
    @Override // Da.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f23578b == null) {
            synchronized (this) {
                try {
                    if (this.f23578b == null) {
                        this.f23578b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f23577a.iterator();
                            while (it.hasNext()) {
                                this.f23578b.add(((Da.b) it.next()).get());
                            }
                            this.f23577a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f23578b);
    }
}
