package com.agnes.feature_billing.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PointsTransactionResponse {

    @SerializedName("list")
    private List<PointsTransactionItem> list;

    @SerializedName("pagination")
    private final PointsPagination pagination;

    public PointsTransactionResponse(PointsPagination pointsPagination, List<PointsTransactionItem> list) {
        l.f(pointsPagination, "pagination");
        l.f(list, "list");
        this.pagination = pointsPagination;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PointsTransactionResponse copy$default(PointsTransactionResponse pointsTransactionResponse, PointsPagination pointsPagination, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            pointsPagination = pointsTransactionResponse.pagination;
        }
        if ((i6 & 2) != 0) {
            list = pointsTransactionResponse.list;
        }
        return pointsTransactionResponse.copy(pointsPagination, list);
    }

    public final PointsPagination component1() {
        return this.pagination;
    }

    public final List<PointsTransactionItem> component2() {
        return this.list;
    }

    public final PointsTransactionResponse copy(PointsPagination pointsPagination, List<PointsTransactionItem> list) {
        l.f(pointsPagination, "pagination");
        l.f(list, "list");
        return new PointsTransactionResponse(pointsPagination, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointsTransactionResponse)) {
            return false;
        }
        PointsTransactionResponse pointsTransactionResponse = (PointsTransactionResponse) obj;
        return l.b(this.pagination, pointsTransactionResponse.pagination) && l.b(this.list, pointsTransactionResponse.list);
    }

    public final List<PointsTransactionItem> getList() {
        return this.list;
    }

    public final PointsPagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        return this.list.hashCode() + (this.pagination.hashCode() * 31);
    }

    public final void setList(List<PointsTransactionItem> list) {
        l.f(list, "<set-?>");
        this.list = list;
    }

    public String toString() {
        return "PointsTransactionResponse(pagination=" + this.pagination + ", list=" + this.list + ")";
    }
}
