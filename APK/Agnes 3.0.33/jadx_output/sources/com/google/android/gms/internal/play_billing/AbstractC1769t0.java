package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1769t0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1771u0 f22747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1771u0 f22748b;

    public AbstractC1769t0(AbstractC1771u0 abstractC1771u0) {
        this.f22747a = abstractC1771u0;
        if (abstractC1771u0.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22748b = abstractC1771u0.n();
    }

    public final AbstractC1771u0 a() {
        AbstractC1771u0 abstractC1771u0B = b();
        abstractC1771u0B.getClass();
        if (AbstractC1771u0.i(abstractC1771u0B, true)) {
            return abstractC1771u0B;
        }
        throw new T0();
    }

    public final AbstractC1771u0 b() {
        if (!this.f22748b.h()) {
            return this.f22748b;
        }
        AbstractC1771u0 abstractC1771u0 = this.f22748b;
        abstractC1771u0.getClass();
        O0.f22636c.a(abstractC1771u0.getClass()).a(abstractC1771u0);
        abstractC1771u0.e();
        return this.f22748b;
    }

    public final void c() {
        if (this.f22748b.h()) {
            return;
        }
        AbstractC1771u0 abstractC1771u0N = this.f22747a.n();
        O0.f22636c.a(abstractC1771u0N.getClass()).g(abstractC1771u0N, this.f22748b);
        this.f22748b = abstractC1771u0N;
    }

    public final Object clone() {
        AbstractC1769t0 abstractC1769t0 = (AbstractC1769t0) this.f22747a.j(5);
        abstractC1769t0.f22748b = b();
        return abstractC1769t0;
    }
}
