package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i6) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i6);
        httpsURLConnection.setReadTimeout(i6);
    }
}
