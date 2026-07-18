package d3;

import T9.W;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: d3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1806k implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f23317a;

    public C1806k(p pVar) {
        this.f23317a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        W w4 = p.k;
        this.f23317a.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        W w4 = p.k;
        this.f23317a.g();
    }
}
