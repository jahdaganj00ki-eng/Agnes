package com.agnes.feature_community.model;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CommentParam {
    private final long comment_id;
    private final int source_type;

    public CommentParam(long j4, int i6) {
        this.comment_id = j4;
        this.source_type = i6;
    }

    public static /* synthetic */ CommentParam copy$default(CommentParam commentParam, long j4, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = commentParam.comment_id;
        }
        if ((i10 & 2) != 0) {
            i6 = commentParam.source_type;
        }
        return commentParam.copy(j4, i6);
    }

    public final long component1() {
        return this.comment_id;
    }

    public final int component2() {
        return this.source_type;
    }

    public final CommentParam copy(long j4, int i6) {
        return new CommentParam(j4, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentParam)) {
            return false;
        }
        CommentParam commentParam = (CommentParam) obj;
        return this.comment_id == commentParam.comment_id && this.source_type == commentParam.source_type;
    }

    public final long getComment_id() {
        return this.comment_id;
    }

    public final int getSource_type() {
        return this.source_type;
    }

    public int hashCode() {
        return Integer.hashCode(this.source_type) + (Long.hashCode(this.comment_id) * 31);
    }

    public String toString() {
        return "CommentParam(comment_id=" + this.comment_id + ", source_type=" + this.source_type + ")";
    }
}
