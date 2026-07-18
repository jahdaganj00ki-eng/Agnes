package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class RolePagination {

    @SerializedName("page")
    private final int page;

    @SerializedName("page_size")
    private final int pageSize;

    @SerializedName("total")
    private final int total;

    @SerializedName("total_pages")
    private final int totalPages;

    public RolePagination() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ RolePagination copy$default(RolePagination rolePagination, int i6, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i6 = rolePagination.total;
        }
        if ((i13 & 2) != 0) {
            i10 = rolePagination.page;
        }
        if ((i13 & 4) != 0) {
            i11 = rolePagination.pageSize;
        }
        if ((i13 & 8) != 0) {
            i12 = rolePagination.totalPages;
        }
        return rolePagination.copy(i6, i10, i11, i12);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.pageSize;
    }

    public final int component4() {
        return this.totalPages;
    }

    public final RolePagination copy(int i6, int i10, int i11, int i12) {
        return new RolePagination(i6, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RolePagination)) {
            return false;
        }
        RolePagination rolePagination = (RolePagination) obj;
        return this.total == rolePagination.total && this.page == rolePagination.page && this.pageSize == rolePagination.pageSize && this.totalPages == rolePagination.totalPages;
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

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPages) + o0.f(this.pageSize, o0.f(this.page, Integer.hashCode(this.total) * 31, 31), 31);
    }

    public String toString() {
        int i6 = this.total;
        int i10 = this.page;
        int i11 = this.pageSize;
        int i12 = this.totalPages;
        StringBuilder sbQ = o0.q(i6, i10, "RolePagination(total=", ", page=", ", pageSize=");
        sbQ.append(i11);
        sbQ.append(", totalPages=");
        sbQ.append(i12);
        sbQ.append(")");
        return sbQ.toString();
    }

    public RolePagination(int i6, int i10, int i11, int i12) {
        this.total = i6;
        this.page = i10;
        this.pageSize = i11;
        this.totalPages = i12;
    }

    public /* synthetic */ RolePagination(int i6, int i10, int i11, int i12, int i13, f fVar) {
        this((i13 & 1) != 0 ? 0 : i6, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
