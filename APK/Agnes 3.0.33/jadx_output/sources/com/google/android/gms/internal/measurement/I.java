package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class I extends AbstractBinderC1713y implements N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f22061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22062e;

    public I() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f22061d = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N
    public final void A(Bundle bundle) {
        AtomicReference atomicReference = this.f22061d;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f22062e = true;
                } finally {
                    this.f22061d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1713y
    public final boolean a(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1718z.a(parcel, Bundle.CREATOR);
        AbstractC1718z.d(parcel);
        A(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle e(long j4) {
        Bundle bundle;
        AtomicReference atomicReference = this.f22061d;
        synchronized (atomicReference) {
            if (!this.f22062e) {
                try {
                    atomicReference.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f22061d.get();
        }
        return bundle;
    }
}
