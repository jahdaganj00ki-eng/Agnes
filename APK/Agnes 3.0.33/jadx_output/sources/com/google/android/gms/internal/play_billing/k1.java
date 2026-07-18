package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public enum k1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22709a;

    k1(int i6) {
        this.f22709a = i6;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22709a);
    }
}
