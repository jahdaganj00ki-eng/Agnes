package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameCategoryTreeTagItem {

    @SerializedName("category_code")
    private final String categoryCode;

    @SerializedName("code")
    private final String code;

    @SerializedName("i18n_code")
    private final String i18nCode;

    @SerializedName("id")
    private final String id;

    @SerializedName("name")
    private final String name;

    @SerializedName("sort_order")
    private final Integer sortOrder;

    public GameCategoryTreeTagItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GameCategoryTreeTagItem copy$default(GameCategoryTreeTagItem gameCategoryTreeTagItem, String str, String str2, String str3, String str4, String str5, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gameCategoryTreeTagItem.id;
        }
        if ((i6 & 2) != 0) {
            str2 = gameCategoryTreeTagItem.code;
        }
        if ((i6 & 4) != 0) {
            str3 = gameCategoryTreeTagItem.i18nCode;
        }
        if ((i6 & 8) != 0) {
            str4 = gameCategoryTreeTagItem.categoryCode;
        }
        if ((i6 & 16) != 0) {
            str5 = gameCategoryTreeTagItem.name;
        }
        if ((i6 & 32) != 0) {
            num = gameCategoryTreeTagItem.sortOrder;
        }
        String str6 = str5;
        Integer num2 = num;
        return gameCategoryTreeTagItem.copy(str, str2, str3, str4, str6, num2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.i18nCode;
    }

    public final String component4() {
        return this.categoryCode;
    }

    public final String component5() {
        return this.name;
    }

    public final Integer component6() {
        return this.sortOrder;
    }

    public final GameCategoryTreeTagItem copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        l.f(str, "id");
        l.f(str2, "code");
        return new GameCategoryTreeTagItem(str, str2, str3, str4, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCategoryTreeTagItem)) {
            return false;
        }
        GameCategoryTreeTagItem gameCategoryTreeTagItem = (GameCategoryTreeTagItem) obj;
        return l.b(this.id, gameCategoryTreeTagItem.id) && l.b(this.code, gameCategoryTreeTagItem.code) && l.b(this.i18nCode, gameCategoryTreeTagItem.i18nCode) && l.b(this.categoryCode, gameCategoryTreeTagItem.categoryCode) && l.b(this.name, gameCategoryTreeTagItem.name) && l.b(this.sortOrder, gameCategoryTreeTagItem.sortOrder);
    }

    public final String getCategoryCode() {
        return this.categoryCode;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getI18nCode() {
        return this.i18nCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        int iH = a.h(this.id.hashCode() * 31, 31, this.code);
        String str = this.i18nCode;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categoryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.sortOrder;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.code;
        String str3 = this.i18nCode;
        String str4 = this.categoryCode;
        String str5 = this.name;
        Integer num = this.sortOrder;
        StringBuilder sbJ = AbstractC1380a.j("GameCategoryTreeTagItem(id=", str, ", code=", str2, ", i18nCode=");
        AbstractC1380a.s(sbJ, str3, ", categoryCode=", str4, ", name=");
        sbJ.append(str5);
        sbJ.append(", sortOrder=");
        sbJ.append(num);
        sbJ.append(")");
        return sbJ.toString();
    }

    public GameCategoryTreeTagItem(String str, String str2, String str3, String str4, String str5, Integer num) {
        l.f(str, "id");
        l.f(str2, "code");
        this.id = str;
        this.code = str2;
        this.i18nCode = str3;
        this.categoryCode = str4;
        this.name = str5;
        this.sortOrder = num;
    }

    public /* synthetic */ GameCategoryTreeTagItem(String str, String str2, String str3, String str4, String str5, Integer num, int i6, f fVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5, (i6 & 32) != 0 ? null : num);
    }
}
