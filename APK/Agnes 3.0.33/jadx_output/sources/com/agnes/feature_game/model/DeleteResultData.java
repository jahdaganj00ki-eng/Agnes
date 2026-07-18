package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class DeleteResultData {

    @SerializedName("success")
    private final Boolean success;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeleteResultData() {
        Boolean bool = null;
        this(bool, 1, bool);
    }

    public static /* synthetic */ DeleteResultData copy$default(DeleteResultData deleteResultData, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bool = deleteResultData.success;
        }
        return deleteResultData.copy(bool);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final DeleteResultData copy(Boolean bool) {
        return new DeleteResultData(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteResultData) && l.b(this.success, ((DeleteResultData) obj).success);
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "DeleteResultData(success=" + this.success + ")";
    }

    public DeleteResultData(Boolean bool) {
        this.success = bool;
    }

    public /* synthetic */ DeleteResultData(Boolean bool, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : bool);
    }
}
