package c8;

import android.content.Context;
import android.util.Log;
import b1.p0;
import ja.AbstractC2556g;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21517c;

    public /* synthetic */ g(int i6) {
        this.f21515a = i6;
    }

    public boolean equals(Object obj) {
        switch (this.f21515a) {
            case 0:
                if (!(obj instanceof X1.b)) {
                    return false;
                }
                ((X1.b) obj).getClass();
                if (this.f21516b != null) {
                    throw null;
                }
                if (this.f21517c == null) {
                    return true;
                }
                throw null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f21515a) {
            case 0:
                String str = this.f21516b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f21517c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f21515a) {
            case 0:
                return "Pair{" + ((Object) this.f21516b) + " " + ((Object) this.f21517c) + "}";
            default:
                return super.toString();
        }
    }

    public g(p0 p0Var) {
        this.f21515a = 1;
        Context context = (Context) p0Var.f20375b;
        int iD = AbstractC2556g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f21516b = "Unity";
            String string = context.getResources().getString(iD);
            this.f21517c = string;
            String strD = T0.a.D("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strD, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f21516b = "Flutter";
                this.f21517c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f21516b = null;
        this.f21517c = null;
    }
}
