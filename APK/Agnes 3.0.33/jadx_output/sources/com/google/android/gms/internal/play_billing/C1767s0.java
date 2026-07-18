package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1767s0 implements I0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1767s0 f22742b = new C1767s0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22743a;

    public /* synthetic */ C1767s0(int i6) {
        this.f22743a = i6;
    }

    public static final G0 c(Object obj, Object obj2) {
        G0 g02 = (G0) obj;
        G0 g03 = (G0) obj2;
        if (!g03.isEmpty()) {
            if (!g02.f22591a) {
                if (g02.isEmpty()) {
                    g02 = new G0();
                } else {
                    G0 g04 = new G0(g02);
                    g04.f22591a = true;
                    g02 = g04;
                }
            }
            g02.b();
            if (!g03.isEmpty()) {
                g02.putAll(g03);
            }
        }
        return g02;
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public Q0 a(Class cls) {
        switch (this.f22743a) {
            case 0:
                if (!AbstractC1771u0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Q0) AbstractC1771u0.m(cls.asSubclass(AbstractC1771u0.class)).j(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public boolean b(Class cls) {
        switch (this.f22743a) {
            case 0:
                return AbstractC1771u0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
