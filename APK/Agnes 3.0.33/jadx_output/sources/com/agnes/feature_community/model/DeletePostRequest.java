package com.agnes.feature_community.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class DeletePostRequest {

    @SerializedName("deleted_count")
    private final int deleted_count;

    @SerializedName("success")
    private final boolean success;

    public DeletePostRequest(int i6, boolean z2) {
        this.deleted_count = i6;
        this.success = z2;
    }

    public static /* synthetic */ DeletePostRequest copy$default(DeletePostRequest deletePostRequest, int i6, boolean z2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = deletePostRequest.deleted_count;
        }
        if ((i10 & 2) != 0) {
            z2 = deletePostRequest.success;
        }
        return deletePostRequest.copy(i6, z2);
    }

    public final int component1() {
        return this.deleted_count;
    }

    public final boolean component2() {
        return this.success;
    }

    public final DeletePostRequest copy(int i6, boolean z2) {
        return new DeletePostRequest(i6, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletePostRequest)) {
            return false;
        }
        DeletePostRequest deletePostRequest = (DeletePostRequest) obj;
        return this.deleted_count == deletePostRequest.deleted_count && this.success == deletePostRequest.success;
    }

    public final int getDeleted_count() {
        return this.deleted_count;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success) + (Integer.hashCode(this.deleted_count) * 31);
    }

    public String toString() {
        return "DeletePostRequest(deleted_count=" + this.deleted_count + ", success=" + this.success + ")";
    }
}
