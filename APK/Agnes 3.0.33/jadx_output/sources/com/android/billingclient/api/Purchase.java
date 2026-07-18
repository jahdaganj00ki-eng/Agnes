package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f21904c;

    public Purchase(String str, String str2) {
        this.f21902a = str;
        this.f21903b = str2;
        this.f21904c = new JSONObject(str);
    }

    public final String a() {
        String strOptString = this.f21904c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f21904c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i6));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final int c() {
        return this.f21904c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final String d() {
        JSONObject jSONObject = this.f21904c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f21902a, purchase.f21902a) && TextUtils.equals(this.f21903b, purchase.f21903b);
    }

    public final int hashCode() {
        return this.f21902a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f21902a));
    }
}
