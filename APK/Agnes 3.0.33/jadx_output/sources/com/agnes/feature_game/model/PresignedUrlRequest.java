package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PresignedUrlRequest {

    @SerializedName("content_type")
    private final String contentType;

    @SerializedName("expires_sec")
    private final int expiresSec;

    public PresignedUrlRequest(String str, int i6) {
        l.f(str, "contentType");
        this.contentType = str;
        this.expiresSec = i6;
    }

    public static /* synthetic */ PresignedUrlRequest copy$default(PresignedUrlRequest presignedUrlRequest, String str, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presignedUrlRequest.contentType;
        }
        if ((i10 & 2) != 0) {
            i6 = presignedUrlRequest.expiresSec;
        }
        return presignedUrlRequest.copy(str, i6);
    }

    public final String component1() {
        return this.contentType;
    }

    public final int component2() {
        return this.expiresSec;
    }

    public final PresignedUrlRequest copy(String str, int i6) {
        l.f(str, "contentType");
        return new PresignedUrlRequest(str, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresignedUrlRequest)) {
            return false;
        }
        PresignedUrlRequest presignedUrlRequest = (PresignedUrlRequest) obj;
        return l.b(this.contentType, presignedUrlRequest.contentType) && this.expiresSec == presignedUrlRequest.expiresSec;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final int getExpiresSec() {
        return this.expiresSec;
    }

    public int hashCode() {
        return Integer.hashCode(this.expiresSec) + (this.contentType.hashCode() * 31);
    }

    public String toString() {
        return "PresignedUrlRequest(contentType=" + this.contentType + ", expiresSec=" + this.expiresSec + ")";
    }

    public /* synthetic */ PresignedUrlRequest(String str, int i6, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? 600 : i6);
    }
}
