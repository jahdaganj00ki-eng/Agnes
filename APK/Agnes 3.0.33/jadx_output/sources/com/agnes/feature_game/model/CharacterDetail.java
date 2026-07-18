package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CharacterDetail {

    @SerializedName("appearance_and_clothing")
    private final String appearanceAndClothing;

    @SerializedName("category")
    private final String category;

    @SerializedName("name")
    private final String name;

    public CharacterDetail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CharacterDetail copy$default(CharacterDetail characterDetail, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = characterDetail.name;
        }
        if ((i6 & 2) != 0) {
            str2 = characterDetail.category;
        }
        if ((i6 & 4) != 0) {
            str3 = characterDetail.appearanceAndClothing;
        }
        return characterDetail.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.appearanceAndClothing;
    }

    public final CharacterDetail copy(String str, String str2, String str3) {
        l.f(str, "name");
        l.f(str2, "category");
        l.f(str3, "appearanceAndClothing");
        return new CharacterDetail(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharacterDetail)) {
            return false;
        }
        CharacterDetail characterDetail = (CharacterDetail) obj;
        return l.b(this.name, characterDetail.name) && l.b(this.category, characterDetail.category) && l.b(this.appearanceAndClothing, characterDetail.appearanceAndClothing);
    }

    public final String getAppearanceAndClothing() {
        return this.appearanceAndClothing;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.appearanceAndClothing.hashCode() + a.h(this.name.hashCode() * 31, 31, this.category);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.category;
        return a.r(AbstractC1380a.j("CharacterDetail(name=", str, ", category=", str2, ", appearanceAndClothing="), this.appearanceAndClothing, ")");
    }

    public CharacterDetail(String str, String str2, String str3) {
        l.f(str, "name");
        l.f(str2, "category");
        l.f(str3, "appearanceAndClothing");
        this.name = str;
        this.category = str2;
        this.appearanceAndClothing = str3;
    }

    public /* synthetic */ CharacterDetail(String str, String str2, String str3, int i6, f fVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3);
    }
}
