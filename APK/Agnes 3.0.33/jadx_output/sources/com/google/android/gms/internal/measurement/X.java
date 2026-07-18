package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class X implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22186a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22186a) {
            case 0:
                int iT = ma.u0.T(parcel);
                Bundle bundleS = null;
                String strV = null;
                boolean zI = false;
                long jM = 0;
                long jM2 = 0;
                while (parcel.dataPosition() < iT) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        jM = ma.u0.M(parcel, i6);
                    } else if (c2 == 2) {
                        jM2 = ma.u0.M(parcel, i6);
                    } else if (c2 == 3) {
                        zI = ma.u0.I(parcel, i6);
                    } else if (c2 == 7) {
                        bundleS = ma.u0.s(parcel, i6);
                    } else if (c2 != '\b') {
                        ma.u0.Q(parcel, i6);
                    } else {
                        strV = ma.u0.v(parcel, i6);
                    }
                }
                ma.u0.z(parcel, iT);
                return new W(jM, jM2, zI, bundleS, strV);
            default:
                int iT2 = ma.u0.T(parcel);
                String strV2 = null;
                int iK = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iT2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iK = ma.u0.K(parcel, i10);
                    } else if (c10 == 2) {
                        strV2 = ma.u0.v(parcel, i10);
                    } else if (c10 != 3) {
                        ma.u0.Q(parcel, i10);
                    } else {
                        intent = (Intent) ma.u0.u(parcel, i10, Intent.CREATOR);
                    }
                }
                ma.u0.z(parcel, iT2);
                return new Y(iK, strV2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        switch (this.f22186a) {
            case 0:
                return new W[i6];
            default:
                return new Y[i6];
        }
    }
}
