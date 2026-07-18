package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ImageSize {

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

    public ImageSize(int i6, int i10) {
        this.width = i6;
        this.height = i10;
    }

    public static /* synthetic */ ImageSize copy$default(ImageSize imageSize, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = imageSize.width;
        }
        if ((i11 & 2) != 0) {
            i10 = imageSize.height;
        }
        return imageSize.copy(i6, i10);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final ImageSize copy(int i6, int i10) {
        return new ImageSize(i6, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSize)) {
            return false;
        }
        ImageSize imageSize = (ImageSize) obj;
        return this.width == imageSize.width && this.height == imageSize.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public String toString() {
        return "ImageSize(width=" + this.width + ", height=" + this.height + ")";
    }
}
