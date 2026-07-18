package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Y extends R8.a {
    public static final Parcelable.Creator<Y> CREATOR = new X(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f22192c;

    public Y(int i6, String str, Intent intent) {
        this.f22190a = i6;
        this.f22191b = str;
        this.f22192c = intent;
    }

    public static Y c(Activity activity) {
        return new Y(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y8 = (Y) obj;
        return this.f22190a == y8.f22190a && Objects.equals(this.f22191b, y8.f22191b) && Objects.equals(this.f22192c, y8.f22192c);
    }

    public final int hashCode() {
        return this.f22190a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iW = rc.a.W(parcel, 20293);
        rc.a.V(parcel, 1, 4);
        parcel.writeInt(this.f22190a);
        rc.a.P(parcel, 2, this.f22191b);
        rc.a.O(parcel, 3, this.f22192c, i6);
        rc.a.X(parcel, iW);
    }
}
