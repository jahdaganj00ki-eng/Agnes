package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Q extends AbstractC1708x implements T {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final int c() {
        Parcel parcelK = K(L(), 2);
        int i6 = parcelK.readInt();
        parcelK.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final void o(long j4, Bundle bundle, String str, String str2) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        AbstractC1718z.b(parcelL, bundle);
        parcelL.writeLong(j4);
        M(parcelL, 1);
    }
}
