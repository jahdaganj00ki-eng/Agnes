package com.google.android.gms.common;

import H8.c;
import Q8.A;
import R8.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import f9.e;
import java.util.Arrays;
import p2.C3379i;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ConnectionResult extends a {
    public static final int SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f21968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f21970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f21965f = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new c(19);

    public ConnectionResult(int i6, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f21966a = i6;
        this.f21967b = i10;
        this.f21968c = pendingIntent;
        this.f21969d = str;
        this.f21970e = num;
    }

    public static String c(int i6) {
        if (i6 == 99) {
            return "UNFINISHED";
        }
        if (i6 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i6) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case C3379i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i6) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i6);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f21967b == connectionResult.f21967b && A.j(this.f21968c, connectionResult.f21968c) && A.j(this.f21969d, connectionResult.f21969d) && A.j(this.f21970e, connectionResult.f21970e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21967b), this.f21968c, this.f21969d, this.f21970e});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.l(c(this.f21967b), "statusCode");
        eVar.l(this.f21968c, "resolution");
        eVar.l(this.f21969d, "message");
        eVar.l(this.f21970e, "clientMethodKey");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iW = rc.a.W(parcel, 20293);
        rc.a.V(parcel, 1, 4);
        parcel.writeInt(this.f21966a);
        rc.a.V(parcel, 2, 4);
        parcel.writeInt(this.f21967b);
        rc.a.O(parcel, 3, this.f21968c, i6);
        rc.a.P(parcel, 4, this.f21969d);
        rc.a.N(parcel, 5, this.f21970e);
        rc.a.X(parcel, iW);
    }

    public ConnectionResult(int i6, PendingIntent pendingIntent, String str) {
        this(1, i6, pendingIntent, str, null);
    }
}
