package com.agnes.feature_community.model;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CommentRequest {
    private final boolean changed;
    private final boolean success;

    public CommentRequest(boolean z2, boolean z7) {
        this.changed = z2;
        this.success = z7;
    }

    public static /* synthetic */ CommentRequest copy$default(CommentRequest commentRequest, boolean z2, boolean z7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z2 = commentRequest.changed;
        }
        if ((i6 & 2) != 0) {
            z7 = commentRequest.success;
        }
        return commentRequest.copy(z2, z7);
    }

    public final boolean component1() {
        return this.changed;
    }

    public final boolean component2() {
        return this.success;
    }

    public final CommentRequest copy(boolean z2, boolean z7) {
        return new CommentRequest(z2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentRequest)) {
            return false;
        }
        CommentRequest commentRequest = (CommentRequest) obj;
        return this.changed == commentRequest.changed && this.success == commentRequest.success;
    }

    public final boolean getChanged() {
        return this.changed;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success) + (Boolean.hashCode(this.changed) * 31);
    }

    public String toString() {
        return "CommentRequest(changed=" + this.changed + ", success=" + this.success + ")";
    }
}
