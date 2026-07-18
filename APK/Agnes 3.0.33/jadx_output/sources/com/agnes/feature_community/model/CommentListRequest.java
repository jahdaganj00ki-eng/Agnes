package com.agnes.feature_community.model;

import bc.u;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CommentListRequest {

    @SerializedName("items")
    private final List<CommentItem> items;

    @SerializedName("total")
    private final int total;

    /* JADX WARN: Illegal instructions before constructor call */
    public CommentListRequest() {
        List list = null;
        this(list, 0, 3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentListRequest copy$default(CommentListRequest commentListRequest, List list, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = commentListRequest.items;
        }
        if ((i10 & 2) != 0) {
            i6 = commentListRequest.total;
        }
        return commentListRequest.copy(list, i6);
    }

    public final List<CommentItem> component1() {
        return this.items;
    }

    public final int component2() {
        return this.total;
    }

    public final CommentListRequest copy(List<CommentItem> list, int i6) {
        l.f(list, "items");
        return new CommentListRequest(list, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentListRequest)) {
            return false;
        }
        CommentListRequest commentListRequest = (CommentListRequest) obj;
        return l.b(this.items, commentListRequest.items) && this.total == commentListRequest.total;
    }

    public final List<CommentItem> getItems() {
        return this.items;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + (this.items.hashCode() * 31);
    }

    public String toString() {
        return "CommentListRequest(items=" + this.items + ", total=" + this.total + ")";
    }

    public CommentListRequest(List<CommentItem> list, int i6) {
        l.f(list, "items");
        this.items = list;
        this.total = i6;
    }

    public /* synthetic */ CommentListRequest(List list, int i6, int i10, f fVar) {
        this((i10 & 1) != 0 ? u.a : list, (i10 & 2) != 0 ? 0 : i6);
    }
}
