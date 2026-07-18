package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameCategoryTreeCategoryItem {

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

    public GameCategoryTreeCategoryItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GameCategoryTreeCategoryItem copy$default(GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem, String str, String str2, String str3, String str4, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gameCategoryTreeCategoryItem.id;
        }
        if ((i6 & 2) != 0) {
            str2 = gameCategoryTreeCategoryItem.code;
        }
        if ((i6 & 4) != 0) {
            str3 = gameCategoryTreeCategoryItem.i18nCode;
        }
        if ((i6 & 8) != 0) {
            str4 = gameCategoryTreeCategoryItem.name;
        }
        if ((i6 & 16) != 0) {
            num = gameCategoryTreeCategoryItem.sortOrder;
        }
        Integer num2 = num;
        String str5 = str3;
        return gameCategoryTreeCategoryItem.copy(str, str2, str5, str4, num2);
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
        return this.name;
    }

    public final Integer component5() {
        return this.sortOrder;
    }

    public final GameCategoryTreeCategoryItem copy(String str, String str2, String str3, String str4, Integer num) {
        l.f(str, "id");
        l.f(str2, "code");
        return new GameCategoryTreeCategoryItem(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCategoryTreeCategoryItem)) {
            return false;
        }
        GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem = (GameCategoryTreeCategoryItem) obj;
        return l.b(this.id, gameCategoryTreeCategoryItem.id) && l.b(this.code, gameCategoryTreeCategoryItem.code) && l.b(this.i18nCode, gameCategoryTreeCategoryItem.i18nCode) && l.b(this.name, gameCategoryTreeCategoryItem.name) && l.b(this.sortOrder, gameCategoryTreeCategoryItem.sortOrder);
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
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sortOrder;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.code;
        String str3 = this.i18nCode;
        String str4 = this.name;
        Integer num = this.sortOrder;
        StringBuilder sbJ = AbstractC1380a.j("GameCategoryTreeCategoryItem(id=", str, ", code=", str2, ", i18nCode=");
        AbstractC1380a.s(sbJ, str3, ", name=", str4, ", sortOrder=");
        sbJ.append(num);
        sbJ.append(")");
        return sbJ.toString();
    }

    public GameCategoryTreeCategoryItem(String str, String str2, String str3, String str4, Integer num) {
        l.f(str, "id");
        l.f(str2, "code");
        this.id = str;
        this.code = str2;
        this.i18nCode = str3;
        this.name = str4;
        this.sortOrder = num;
    }

    public /* synthetic */ GameCategoryTreeCategoryItem(String str, String str2, String str3, String str4, Integer num, int i6, f fVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : num);
    }
}
