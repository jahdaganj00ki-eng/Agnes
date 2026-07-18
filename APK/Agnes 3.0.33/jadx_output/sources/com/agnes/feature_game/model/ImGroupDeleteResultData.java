package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ImGroupDeleteResultData {

    @SerializedName("success")
    private final Boolean success;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImGroupDeleteResultData() {
        Boolean bool = null;
        this(bool, 1, bool);
    }

    public static /* synthetic */ ImGroupDeleteResultData copy$default(ImGroupDeleteResultData imGroupDeleteResultData, Boolean bool, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bool = imGroupDeleteResultData.success;
        }
        return imGroupDeleteResultData.copy(bool);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final ImGroupDeleteResultData copy(Boolean bool) {
        return new ImGroupDeleteResultData(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImGroupDeleteResultData) && l.b(this.success, ((ImGroupDeleteResultData) obj).success);
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
        return "ImGroupDeleteResultData(success=" + this.success + ")";
    }

    public ImGroupDeleteResultData(Boolean bool) {
        this.success = bool;
    }

    public /* synthetic */ ImGroupDeleteResultData(Boolean bool, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : bool);
    }
}
