package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class OutputParams {

    @SerializedName("data")
    private final AssetData data;

    /* JADX WARN: Illegal instructions before constructor call */
    public OutputParams() {
        AssetData assetData = null;
        this(assetData, 1, assetData);
    }

    public static /* synthetic */ OutputParams copy$default(OutputParams outputParams, AssetData assetData, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            assetData = outputParams.data;
        }
        return outputParams.copy(assetData);
    }

    public final AssetData component1() {
        return this.data;
    }

    public final OutputParams copy(AssetData assetData) {
        return new OutputParams(assetData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutputParams) && l.b(this.data, ((OutputParams) obj).data);
    }

    public final AssetData getData() {
        return this.data;
    }

    public int hashCode() {
        AssetData assetData = this.data;
        if (assetData == null) {
            return 0;
        }
        return assetData.hashCode();
    }

    public String toString() {
        return "OutputParams(data=" + this.data + ")";
    }

    public OutputParams(AssetData assetData) {
        this.data = assetData;
    }

    public /* synthetic */ OutputParams(AssetData assetData, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : assetData);
    }
}
