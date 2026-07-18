package com.agnes.feature_billing.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PointsTransactionItem {

    @SerializedName("amount")
    private final int amount;

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("description")
    private final String description;

    @SerializedName("direction")
    private final int direction;

    public PointsTransactionItem(String str, int i6, int i10, long j4) {
        l.f(str, "description");
        this.description = str;
        this.amount = i6;
        this.direction = i10;
        this.createdAt = j4;
    }

    public static /* synthetic */ PointsTransactionItem copy$default(PointsTransactionItem pointsTransactionItem, String str, int i6, int i10, long j4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pointsTransactionItem.description;
        }
        if ((i11 & 2) != 0) {
            i6 = pointsTransactionItem.amount;
        }
        if ((i11 & 4) != 0) {
            i10 = pointsTransactionItem.direction;
        }
        if ((i11 & 8) != 0) {
            j4 = pointsTransactionItem.createdAt;
        }
        int i12 = i10;
        return pointsTransactionItem.copy(str, i6, i12, j4);
    }

    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.amount;
    }

    public final int component3() {
        return this.direction;
    }

    public final long component4() {
        return this.createdAt;
    }

    public final PointsTransactionItem copy(String str, int i6, int i10, long j4) {
        l.f(str, "description");
        return new PointsTransactionItem(str, i6, i10, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointsTransactionItem)) {
            return false;
        }
        PointsTransactionItem pointsTransactionItem = (PointsTransactionItem) obj;
        return l.b(this.description, pointsTransactionItem.description) && this.amount == pointsTransactionItem.amount && this.direction == pointsTransactionItem.direction && this.createdAt == pointsTransactionItem.createdAt;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDirection() {
        return this.direction;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + o0.f(this.direction, o0.f(this.amount, this.description.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "PointsTransactionItem(description=" + this.description + ", amount=" + this.amount + ", direction=" + this.direction + ", createdAt=" + this.createdAt + ")";
    }
}
