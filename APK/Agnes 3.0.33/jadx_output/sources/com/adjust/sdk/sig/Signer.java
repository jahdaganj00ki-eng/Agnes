package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21645a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f21646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f21647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f21648d;

    public static String getVersion() {
        return "3.67.0";
    }

    public final synchronized void a() {
        if (this.f21645a) {
            return;
        }
        this.f21646b = new d();
        this.f21648d = new c(Build.VERSION.SDK_INT);
        this.f21647c = new NativeLibHelper();
        this.f21645a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.f21646b;
        a aVar = this.f21647c;
        dVar.getClass();
        if (!d.f21650a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.f21646b;
        c cVar = this.f21648d;
        a aVar = this.f21647c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0191 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0032, B:15:0x0057, B:17:0x0083, B:19:0x008f, B:21:0x0097, B:23:0x009f, B:25:0x00a7, B:28:0x00b1, B:29:0x016c, B:30:0x0174, B:32:0x0191, B:33:0x01b2), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            a();
            d dVar = this.f21646b;
            c cVar = this.f21648d;
            a aVar = this.f21647c;
            dVar.getClass();
            if (map == null || map.isEmpty() || map2 == null || map3 == null) {
                Log.e("SignerInstance", "sign: One or more parameters are null");
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                boolean zEquals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
                if (zEquals) {
                    Log.v("SignerInstance", "SDKv5 Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
                }
                HashMap map4 = new HashMap();
                d.a(map.keySet(), map, map4);
                String str = map2.get("activity_kind");
                String str2 = map2.get("client_sdk");
                if ("b".equals(map2.get("a"))) {
                    d.a(map.keySet(), map, map3);
                    d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                    if (zEquals) {
                    }
                } else {
                    d.a(context, cVar, aVar, map4, str, str2);
                    if (map4.containsKey("signature") && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                        String str3 = (String) map4.get("adj_signing_id");
                        String str4 = (String) map4.get("headers_id");
                        String str5 = (String) map4.get("signature");
                        String str6 = (String) map4.get("algorithm");
                        String str7 = "algorithm=\"" + str6 + "\"";
                        map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str7 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + ((String) map4.get("native_version")) + "\""));
                        d.a(map.keySet(), map, map3);
                        d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                        if (zEquals) {
                            Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
                        }
                    }
                    Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
