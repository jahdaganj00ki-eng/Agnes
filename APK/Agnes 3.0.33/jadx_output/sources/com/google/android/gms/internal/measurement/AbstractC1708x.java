package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1708x implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IBinder f22528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22529f;

    public /* synthetic */ AbstractC1708x(IBinder iBinder, String str, int i6) {
        this.f22527d = i6;
        this.f22528e = iBinder;
        this.f22529f = str;
    }

    public Parcel K(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22528e.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel L() {
        switch (this.f22527d) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f22529f);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f22529f);
                return parcelObtain2;
        }
    }

    public void M(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22528e.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void N(Parcel parcel) {
        try {
            this.f22528e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22529f);
        return parcelObtain;
    }

    public Parcel P(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22528e.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22529f);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f22527d) {
        }
        return this.f22528e;
    }

    public void e(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22528e.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel f(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22528e.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
