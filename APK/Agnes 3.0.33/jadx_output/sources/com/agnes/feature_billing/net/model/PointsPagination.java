package com.agnes.feature_billing.net.model;

import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PointsPagination {

    @SerializedName("page")
    private final int page;

    @SerializedName("page_size")
    private final int pageSize;

    @SerializedName("total")
    private final int total;

    public PointsPagination(int i6, int i10, int i11) {
        this.page = i6;
        this.pageSize = i10;
        this.total = i11;
    }

    public static /* synthetic */ PointsPagination copy$default(PointsPagination pointsPagination, int i6, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i6 = pointsPagination.page;
        }
        if ((i12 & 2) != 0) {
            i10 = pointsPagination.pageSize;
        }
        if ((i12 & 4) != 0) {
            i11 = pointsPagination.total;
        }
        return pointsPagination.copy(i6, i10, i11);
    }

    public final int component1() {
        return this.page;
    }

    public final int component2() {
        return this.pageSize;
    }

    public final int component3() {
        return this.total;
    }

    public final PointsPagination copy(int i6, int i10, int i11) {
        return new PointsPagination(i6, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointsPagination)) {
            return false;
        }
        PointsPagination pointsPagination = (PointsPagination) obj;
        return this.page == pointsPagination.page && this.pageSize == pointsPagination.pageSize && this.total == pointsPagination.total;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + o0.f(this.pageSize, Integer.hashCode(this.page) * 31, 31);
    }

    public String toString() {
        int i6 = this.page;
        int i10 = this.pageSize;
        return AbstractC1380a.g(o0.q(i6, i10, "PointsPagination(page=", ", pageSize=", ", total="), this.total, ")");
    }
}
