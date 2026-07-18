package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1202c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f19533b;

    public C1202c(Method method, int i6) {
        this.f19532a = i6;
        this.f19533b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1202c)) {
            return false;
        }
        C1202c c1202c = (C1202c) obj;
        return this.f19532a == c1202c.f19532a && this.f19533b.getName().equals(c1202c.f19533b.getName());
    }

    public final int hashCode() {
        return this.f19533b.getName().hashCode() + (this.f19532a * 31);
    }
}
