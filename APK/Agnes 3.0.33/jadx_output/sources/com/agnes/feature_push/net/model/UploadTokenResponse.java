package com.agnes.feature_push.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class UploadTokenResponse {

    @SerializedName("firebase_token")
    private final String firebaseToken;

    @SerializedName("topics")
    private final List<String> topics;

    public UploadTokenResponse(String str, List<String> list) {
        this.firebaseToken = str;
        this.topics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadTokenResponse copy$default(UploadTokenResponse uploadTokenResponse, String str, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = uploadTokenResponse.firebaseToken;
        }
        if ((i6 & 2) != 0) {
            list = uploadTokenResponse.topics;
        }
        return uploadTokenResponse.copy(str, list);
    }

    public final String component1() {
        return this.firebaseToken;
    }

    public final List<String> component2() {
        return this.topics;
    }

    public final UploadTokenResponse copy(String str, List<String> list) {
        return new UploadTokenResponse(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadTokenResponse)) {
            return false;
        }
        UploadTokenResponse uploadTokenResponse = (UploadTokenResponse) obj;
        return l.b(this.firebaseToken, uploadTokenResponse.firebaseToken) && l.b(this.topics, uploadTokenResponse.topics);
    }

    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public final List<String> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        String str = this.firebaseToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.topics;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UploadTokenResponse(firebaseToken=" + this.firebaseToken + ", topics=" + this.topics + ")";
    }
}
