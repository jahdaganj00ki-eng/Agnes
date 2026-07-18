package com.agnes.feature_game.model;

import bc.v;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class UploadUGCImageResponse {

    @SerializedName("image_urls")
    private final Map<String, String> imageUrls;

    @SerializedName("upload_audit_id")
    private final String uploadAuditId;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadUGCImageResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadUGCImageResponse copy$default(UploadUGCImageResponse uploadUGCImageResponse, Map map, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            map = uploadUGCImageResponse.imageUrls;
        }
        if ((i6 & 2) != 0) {
            str = uploadUGCImageResponse.uploadAuditId;
        }
        return uploadUGCImageResponse.copy(map, str);
    }

    public final Map<String, String> component1() {
        return this.imageUrls;
    }

    public final String component2() {
        return this.uploadAuditId;
    }

    public final UploadUGCImageResponse copy(Map<String, String> map, String str) {
        l.f(map, "imageUrls");
        return new UploadUGCImageResponse(map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadUGCImageResponse)) {
            return false;
        }
        UploadUGCImageResponse uploadUGCImageResponse = (UploadUGCImageResponse) obj;
        return l.b(this.imageUrls, uploadUGCImageResponse.imageUrls) && l.b(this.uploadAuditId, uploadUGCImageResponse.uploadAuditId);
    }

    public final Map<String, String> getImageUrls() {
        return this.imageUrls;
    }

    public final String getUploadAuditId() {
        return this.uploadAuditId;
    }

    public int hashCode() {
        int iHashCode = this.imageUrls.hashCode() * 31;
        String str = this.uploadAuditId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "UploadUGCImageResponse(imageUrls=" + this.imageUrls + ", uploadAuditId=" + this.uploadAuditId + ")";
    }

    public UploadUGCImageResponse(Map<String, String> map, String str) {
        l.f(map, "imageUrls");
        this.imageUrls = map;
        this.uploadAuditId = str;
    }

    public /* synthetic */ UploadUGCImageResponse(Map map, String str, int i6, f fVar) {
        this((i6 & 1) != 0 ? v.a : map, (i6 & 2) != 0 ? null : str);
    }
}
