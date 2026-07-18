package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class M extends AbstractC1708x implements N {
    public M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.N
    public final void A(Bundle bundle) {
        Parcel parcelL = L();
        AbstractC1718z.b(parcelL, bundle);
        M(parcelL, 1);
    }
}
