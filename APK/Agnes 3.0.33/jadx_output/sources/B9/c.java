package B9;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC2528b;
import y0.o;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c extends AbstractC2528b {
    public static final Parcelable.Creator<c> CREATOR = new o(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1116c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.f1116c = parcel.readInt() == 1;
    }

    @Override // j2.AbstractC2528b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f1116c ? 1 : 0);
    }
}
