package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f19546a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f19546a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).clear$lifecycle_viewmodel();
        }
        linkedHashMap.clear();
    }
}
