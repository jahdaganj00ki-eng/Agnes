package com.agnes.feature_community.model;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CancelCommentParam {
    private final long comment_id;

    public CancelCommentParam(long j4) {
        this.comment_id = j4;
    }

    public static /* synthetic */ CancelCommentParam copy$default(CancelCommentParam cancelCommentParam, long j4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j4 = cancelCommentParam.comment_id;
        }
        return cancelCommentParam.copy(j4);
    }

    public final long component1() {
        return this.comment_id;
    }

    public final CancelCommentParam copy(long j4) {
        return new CancelCommentParam(j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelCommentParam) && this.comment_id == ((CancelCommentParam) obj).comment_id;
    }

    public final long getComment_id() {
        return this.comment_id;
    }

    public int hashCode() {
        return Long.hashCode(this.comment_id);
    }

    public String toString() {
        return "CancelCommentParam(comment_id=" + this.comment_id + ")";
    }
}
