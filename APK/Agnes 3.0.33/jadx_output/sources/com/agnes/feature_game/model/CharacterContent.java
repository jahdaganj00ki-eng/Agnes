package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CharacterContent {

    @SerializedName("image_1")
    private final CharacterDetail image1;

    @SerializedName("image_2")
    private final CharacterDetail image2;

    /* JADX WARN: Illegal instructions before constructor call */
    public CharacterContent() {
        CharacterDetail characterDetail = null;
        this(characterDetail, characterDetail, 3, characterDetail);
    }

    public static /* synthetic */ CharacterContent copy$default(CharacterContent characterContent, CharacterDetail characterDetail, CharacterDetail characterDetail2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            characterDetail = characterContent.image1;
        }
        if ((i6 & 2) != 0) {
            characterDetail2 = characterContent.image2;
        }
        return characterContent.copy(characterDetail, characterDetail2);
    }

    public final CharacterDetail component1() {
        return this.image1;
    }

    public final CharacterDetail component2() {
        return this.image2;
    }

    public final CharacterContent copy(CharacterDetail characterDetail, CharacterDetail characterDetail2) {
        return new CharacterContent(characterDetail, characterDetail2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharacterContent)) {
            return false;
        }
        CharacterContent characterContent = (CharacterContent) obj;
        return l.b(this.image1, characterContent.image1) && l.b(this.image2, characterContent.image2);
    }

    public final CharacterDetail getImage1() {
        return this.image1;
    }

    public final CharacterDetail getImage2() {
        return this.image2;
    }

    public int hashCode() {
        CharacterDetail characterDetail = this.image1;
        int iHashCode = (characterDetail == null ? 0 : characterDetail.hashCode()) * 31;
        CharacterDetail characterDetail2 = this.image2;
        return iHashCode + (characterDetail2 != null ? characterDetail2.hashCode() : 0);
    }

    public String toString() {
        return "CharacterContent(image1=" + this.image1 + ", image2=" + this.image2 + ")";
    }

    public CharacterContent(CharacterDetail characterDetail, CharacterDetail characterDetail2) {
        this.image1 = characterDetail;
        this.image2 = characterDetail2;
    }

    public /* synthetic */ CharacterContent(CharacterDetail characterDetail, CharacterDetail characterDetail2, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : characterDetail, (i6 & 2) != 0 ? null : characterDetail2);
    }
}
