package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class AssetData {

    @SerializedName("image")
    private final ImageAsset image;

    @SerializedName("video")
    private final VideoAsset video;

    /* JADX WARN: Multi-variable type inference failed */
    public AssetData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AssetData copy$default(AssetData assetData, ImageAsset imageAsset, VideoAsset videoAsset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            imageAsset = assetData.image;
        }
        if ((i6 & 2) != 0) {
            videoAsset = assetData.video;
        }
        return assetData.copy(imageAsset, videoAsset);
    }

    public final ImageAsset component1() {
        return this.image;
    }

    public final VideoAsset component2() {
        return this.video;
    }

    public final AssetData copy(ImageAsset imageAsset, VideoAsset videoAsset) {
        return new AssetData(imageAsset, videoAsset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetData)) {
            return false;
        }
        AssetData assetData = (AssetData) obj;
        return l.b(this.image, assetData.image) && l.b(this.video, assetData.video);
    }

    public final ImageAsset getImage() {
        return this.image;
    }

    public final VideoAsset getVideo() {
        return this.video;
    }

    public int hashCode() {
        ImageAsset imageAsset = this.image;
        int iHashCode = (imageAsset == null ? 0 : imageAsset.hashCode()) * 31;
        VideoAsset videoAsset = this.video;
        return iHashCode + (videoAsset != null ? videoAsset.hashCode() : 0);
    }

    public String toString() {
        return "AssetData(image=" + this.image + ", video=" + this.video + ")";
    }

    public AssetData(ImageAsset imageAsset, VideoAsset videoAsset) {
        this.image = imageAsset;
        this.video = videoAsset;
    }

    public /* synthetic */ AssetData(ImageAsset imageAsset, VideoAsset videoAsset, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : imageAsset, (i6 & 2) != 0 ? null : videoAsset);
    }
}
