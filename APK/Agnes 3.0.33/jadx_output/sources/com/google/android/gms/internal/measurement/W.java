package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class W extends R8.a {
    public static final Parcelable.Creator<W> CREATOR = new X(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f22171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22172e;

    public W(long j4, long j10, boolean z2, Bundle bundle, String str) {
        this.f22168a = j4;
        this.f22169b = j10;
        this.f22170c = z2;
        this.f22171d = bundle;
        this.f22172e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iW = rc.a.W(parcel, 20293);
        rc.a.V(parcel, 1, 8);
        parcel.writeLong(this.f22168a);
        rc.a.V(parcel, 2, 8);
        parcel.writeLong(this.f22169b);
        rc.a.V(parcel, 3, 4);
        parcel.writeInt(this.f22170c ? 1 : 0);
        rc.a.K(parcel, 7, this.f22171d);
        rc.a.P(parcel, 8, this.f22172e);
        rc.a.X(parcel, iW);
    }
}
