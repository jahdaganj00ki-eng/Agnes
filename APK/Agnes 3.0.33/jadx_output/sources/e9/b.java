package e9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f23888d;

    public b(IBinder iBinder) {
        this.f23888d = iBinder;
    }

    public final Parcel a(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f23888d.transact(i6, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23888d;
    }
}
