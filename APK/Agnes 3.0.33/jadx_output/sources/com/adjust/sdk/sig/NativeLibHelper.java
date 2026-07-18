package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
class NativeLibHelper implements a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e10) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e10.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i6);

    public final void a() {
        nOnResume();
    }

    public final byte[] b(Context context, Map map, byte[] bArr, int i6) {
        return nSign(context, map, bArr, i6);
    }
}
