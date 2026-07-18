package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1192s implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1194u f19427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1194u f19428b;

    public AbstractC1192s(AbstractC1194u abstractC1194u) {
        this.f19427a = abstractC1194u;
        if (abstractC1194u.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19428b = abstractC1194u.i();
    }

    public final AbstractC1194u a() {
        AbstractC1194u abstractC1194uB = b();
        abstractC1194uB.getClass();
        if (AbstractC1194u.f(abstractC1194uB, true)) {
            return abstractC1194uB;
        }
        throw new c0();
    }

    public final AbstractC1194u b() {
        if (!this.f19428b.g()) {
            return this.f19428b;
        }
        AbstractC1194u abstractC1194u = this.f19428b;
        abstractC1194u.getClass();
        T t10 = T.f19321c;
        t10.getClass();
        t10.a(abstractC1194u.getClass()).c(abstractC1194u);
        abstractC1194u.h();
        return this.f19428b;
    }

    public final void c() {
        if (this.f19428b.g()) {
            return;
        }
        AbstractC1194u abstractC1194uI = this.f19427a.i();
        AbstractC1194u abstractC1194u = this.f19428b;
        T t10 = T.f19321c;
        t10.getClass();
        t10.a(abstractC1194uI.getClass()).a(abstractC1194uI, abstractC1194u);
        this.f19428b = abstractC1194uI;
    }

    public final Object clone() {
        AbstractC1192s abstractC1192s = (AbstractC1192s) this.f19427a.c(5);
        abstractC1192s.f19428b = b();
        return abstractC1192s;
    }
}
