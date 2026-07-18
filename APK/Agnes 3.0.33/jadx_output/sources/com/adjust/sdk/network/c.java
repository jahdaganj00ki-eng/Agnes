package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class c implements UtilNetworking.IHttpsURLConnectionProvider {
    @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
    public final HttpsURLConnection generateHttpsURLConnection(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }
}
