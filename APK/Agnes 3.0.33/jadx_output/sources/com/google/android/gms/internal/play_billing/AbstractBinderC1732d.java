package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractBinderC1732d extends Binder implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22676d;

    public AbstractBinderC1732d(String str, int i6) {
        this.f22676d = i6;
        switch (i6) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public abstract boolean K(int i6, Parcel parcel, Parcel parcel2);

    public abstract boolean L(int i6, Parcel parcel, Parcel parcel2);

    public abstract boolean M(int i6, Parcel parcel, Parcel parcel2);

    public boolean N(int i6, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i6 = this.f22676d;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        boolean zOnTransact;
        switch (this.f22676d) {
            case 0:
                if (i6 > 16777215) {
                    zOnTransact = super.onTransact(i6, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                return K(i6, parcel, parcel2);
            case 1:
                if (i6 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i6, parcel, parcel2, i10)) {
                    return true;
                }
                return M(i6, parcel, parcel2);
            case 2:
                if (i6 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i6, parcel, parcel2, i10)) {
                    return true;
                }
                return L(i6, parcel, parcel2);
            default:
                if (i6 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i6, parcel, parcel2, i10)) {
                    return true;
                }
                return N(i6, parcel, parcel2);
        }
    }
}
