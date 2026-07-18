package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import e5.AbstractC1874g;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class SearchGameItem {

    @SerializedName("game_access_type")
    private final int game_access_type;

    @SerializedName("game_active_value")
    private final String game_active_value;

    @SerializedName("game_background_image")
    private final String game_background_image;

    @SerializedName("game_background_image_size")
    private final String game_background_image_size;

    @SerializedName("game_bgm")
    private final String game_bgm;

    @SerializedName("game_category")
    private final String game_category;

    @SerializedName("game_code")
    private final String game_code;

    @SerializedName("game_created_by")
    private final String game_created_by;

    @SerializedName("game_id")
    private final String game_id;

    @SerializedName("game_intro")
    private final String game_intro;

    @SerializedName("game_intro_tts")
    private final String game_intro_tts;

    @SerializedName("game_is_deleted")
    private final boolean game_is_deleted;

    @SerializedName("game_is_teen_mode")
    private final boolean game_is_teen_mode;

    @SerializedName("game_list_image")
    private final String game_list_image;

    @SerializedName("game_list_image_thumbnail")
    private final String game_list_image_thumbnail;

    @SerializedName("game_max_member")
    private final int game_max_member;

    @SerializedName("game_min_member")
    private final int game_min_member;

    @SerializedName("game_name")
    private final String game_name;

    @SerializedName("game_opening_animation")
    private final String game_opening_animation;

    @SerializedName("game_requires_subscription")
    private final boolean game_requires_subscription;

    @SerializedName("game_service_source")
    private final String game_service_source;

    @SerializedName("game_setting_image")
    private final String game_setting_image;

    @SerializedName("game_share_image")
    private final String game_share_image;

    @SerializedName("game_source_type")
    private final int game_source_type;

    @SerializedName("game_thumbnail")
    private final String game_thumbnail;

    @SerializedName("last_game_tim_group_id")
    private final String last_game_tim_group_id;

    @SerializedName("show_type")
    private final int show_type;

    @SerializedName("tag_relation_sort_order")
    private final int tag_relation_sort_order;

    public SearchGameItem() {
        this(0, null, null, null, null, null, null, null, null, null, null, false, false, null, null, 0, 0, null, null, false, null, 0, null, null, null, null, 0, 0, 268435455, null);
    }

    public static /* synthetic */ SearchGameItem copy$default(SearchGameItem searchGameItem, int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z7, String str11, String str12, int i10, int i11, String str13, String str14, boolean z10, String str15, int i12, String str16, String str17, String str18, String str19, int i13, int i14, int i15, Object obj) {
        int i16;
        int i17;
        int i18 = (i15 & 1) != 0 ? searchGameItem.game_access_type : i6;
        String str20 = (i15 & 2) != 0 ? searchGameItem.game_active_value : str;
        String str21 = (i15 & 4) != 0 ? searchGameItem.game_background_image : str2;
        String str22 = (i15 & 8) != 0 ? searchGameItem.game_background_image_size : str3;
        String str23 = (i15 & 16) != 0 ? searchGameItem.game_bgm : str4;
        String str24 = (i15 & 32) != 0 ? searchGameItem.game_category : str5;
        String str25 = (i15 & 64) != 0 ? searchGameItem.game_code : str6;
        String str26 = (i15 & 128) != 0 ? searchGameItem.game_created_by : str7;
        String str27 = (i15 & 256) != 0 ? searchGameItem.game_id : str8;
        String str28 = (i15 & 512) != 0 ? searchGameItem.game_intro : str9;
        String str29 = (i15 & 1024) != 0 ? searchGameItem.game_intro_tts : str10;
        boolean z11 = (i15 & 2048) != 0 ? searchGameItem.game_is_deleted : z2;
        boolean z12 = (i15 & 4096) != 0 ? searchGameItem.game_is_teen_mode : z7;
        String str30 = (i15 & 8192) != 0 ? searchGameItem.game_list_image : str11;
        int i19 = i18;
        String str31 = (i15 & 16384) != 0 ? searchGameItem.game_list_image_thumbnail : str12;
        int i20 = (i15 & 32768) != 0 ? searchGameItem.game_max_member : i10;
        int i21 = (i15 & 65536) != 0 ? searchGameItem.game_min_member : i11;
        String str32 = (i15 & 131072) != 0 ? searchGameItem.game_name : str13;
        String str33 = (i15 & 262144) != 0 ? searchGameItem.game_opening_animation : str14;
        boolean z13 = (i15 & 524288) != 0 ? searchGameItem.game_requires_subscription : z10;
        String str34 = (i15 & 1048576) != 0 ? searchGameItem.game_service_source : str15;
        int i22 = (i15 & 2097152) != 0 ? searchGameItem.game_source_type : i12;
        String str35 = (i15 & 4194304) != 0 ? searchGameItem.game_setting_image : str16;
        String str36 = (i15 & 8388608) != 0 ? searchGameItem.game_share_image : str17;
        String str37 = (i15 & 16777216) != 0 ? searchGameItem.game_thumbnail : str18;
        String str38 = (i15 & 33554432) != 0 ? searchGameItem.last_game_tim_group_id : str19;
        int i23 = (i15 & 67108864) != 0 ? searchGameItem.show_type : i13;
        if ((i15 & 134217728) != 0) {
            i17 = i23;
            i16 = searchGameItem.tag_relation_sort_order;
        } else {
            i16 = i14;
            i17 = i23;
        }
        return searchGameItem.copy(i19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, z11, z12, str30, str31, i20, i21, str32, str33, z13, str34, i22, str35, str36, str37, str38, i17, i16);
    }

    public final int component1() {
        return this.game_access_type;
    }

    public final String component10() {
        return this.game_intro;
    }

    public final String component11() {
        return this.game_intro_tts;
    }

    public final boolean component12() {
        return this.game_is_deleted;
    }

    public final boolean component13() {
        return this.game_is_teen_mode;
    }

    public final String component14() {
        return this.game_list_image;
    }

    public final String component15() {
        return this.game_list_image_thumbnail;
    }

    public final int component16() {
        return this.game_max_member;
    }

    public final int component17() {
        return this.game_min_member;
    }

    public final String component18() {
        return this.game_name;
    }

    public final String component19() {
        return this.game_opening_animation;
    }

    public final String component2() {
        return this.game_active_value;
    }

    public final boolean component20() {
        return this.game_requires_subscription;
    }

    public final String component21() {
        return this.game_service_source;
    }

    public final int component22() {
        return this.game_source_type;
    }

    public final String component23() {
        return this.game_setting_image;
    }

    public final String component24() {
        return this.game_share_image;
    }

    public final String component25() {
        return this.game_thumbnail;
    }

    public final String component26() {
        return this.last_game_tim_group_id;
    }

    public final int component27() {
        return this.show_type;
    }

    public final int component28() {
        return this.tag_relation_sort_order;
    }

    public final String component3() {
        return this.game_background_image;
    }

    public final String component4() {
        return this.game_background_image_size;
    }

    public final String component5() {
        return this.game_bgm;
    }

    public final String component6() {
        return this.game_category;
    }

    public final String component7() {
        return this.game_code;
    }

    public final String component8() {
        return this.game_created_by;
    }

    public final String component9() {
        return this.game_id;
    }

    public final SearchGameItem copy(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z7, String str11, String str12, int i10, int i11, String str13, String str14, boolean z10, String str15, int i12, String str16, String str17, String str18, String str19, int i13, int i14) {
        l.f(str, "game_active_value");
        l.f(str2, "game_background_image");
        l.f(str3, "game_background_image_size");
        l.f(str4, "game_bgm");
        l.f(str5, "game_category");
        l.f(str6, "game_code");
        l.f(str7, "game_created_by");
        l.f(str8, "game_id");
        l.f(str9, "game_intro");
        l.f(str10, "game_intro_tts");
        l.f(str11, "game_list_image");
        l.f(str12, "game_list_image_thumbnail");
        l.f(str13, "game_name");
        l.f(str14, "game_opening_animation");
        l.f(str15, "game_service_source");
        l.f(str16, "game_setting_image");
        l.f(str17, "game_share_image");
        l.f(str18, "game_thumbnail");
        l.f(str19, "last_game_tim_group_id");
        return new SearchGameItem(i6, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z2, z7, str11, str12, i10, i11, str13, str14, z10, str15, i12, str16, str17, str18, str19, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGameItem)) {
            return false;
        }
        SearchGameItem searchGameItem = (SearchGameItem) obj;
        return this.game_access_type == searchGameItem.game_access_type && l.b(this.game_active_value, searchGameItem.game_active_value) && l.b(this.game_background_image, searchGameItem.game_background_image) && l.b(this.game_background_image_size, searchGameItem.game_background_image_size) && l.b(this.game_bgm, searchGameItem.game_bgm) && l.b(this.game_category, searchGameItem.game_category) && l.b(this.game_code, searchGameItem.game_code) && l.b(this.game_created_by, searchGameItem.game_created_by) && l.b(this.game_id, searchGameItem.game_id) && l.b(this.game_intro, searchGameItem.game_intro) && l.b(this.game_intro_tts, searchGameItem.game_intro_tts) && this.game_is_deleted == searchGameItem.game_is_deleted && this.game_is_teen_mode == searchGameItem.game_is_teen_mode && l.b(this.game_list_image, searchGameItem.game_list_image) && l.b(this.game_list_image_thumbnail, searchGameItem.game_list_image_thumbnail) && this.game_max_member == searchGameItem.game_max_member && this.game_min_member == searchGameItem.game_min_member && l.b(this.game_name, searchGameItem.game_name) && l.b(this.game_opening_animation, searchGameItem.game_opening_animation) && this.game_requires_subscription == searchGameItem.game_requires_subscription && l.b(this.game_service_source, searchGameItem.game_service_source) && this.game_source_type == searchGameItem.game_source_type && l.b(this.game_setting_image, searchGameItem.game_setting_image) && l.b(this.game_share_image, searchGameItem.game_share_image) && l.b(this.game_thumbnail, searchGameItem.game_thumbnail) && l.b(this.last_game_tim_group_id, searchGameItem.last_game_tim_group_id) && this.show_type == searchGameItem.show_type && this.tag_relation_sort_order == searchGameItem.tag_relation_sort_order;
    }

    public final int getGame_access_type() {
        return this.game_access_type;
    }

    public final String getGame_active_value() {
        return this.game_active_value;
    }

    public final String getGame_background_image() {
        return this.game_background_image;
    }

    public final String getGame_background_image_size() {
        return this.game_background_image_size;
    }

    public final String getGame_bgm() {
        return this.game_bgm;
    }

    public final String getGame_category() {
        return this.game_category;
    }

    public final String getGame_code() {
        return this.game_code;
    }

    public final String getGame_created_by() {
        return this.game_created_by;
    }

    public final String getGame_id() {
        return this.game_id;
    }

    public final String getGame_intro() {
        return this.game_intro;
    }

    public final String getGame_intro_tts() {
        return this.game_intro_tts;
    }

    public final boolean getGame_is_deleted() {
        return this.game_is_deleted;
    }

    public final boolean getGame_is_teen_mode() {
        return this.game_is_teen_mode;
    }

    public final String getGame_list_image() {
        return this.game_list_image;
    }

    public final String getGame_list_image_thumbnail() {
        return this.game_list_image_thumbnail;
    }

    public final int getGame_max_member() {
        return this.game_max_member;
    }

    public final int getGame_min_member() {
        return this.game_min_member;
    }

    public final String getGame_name() {
        return this.game_name;
    }

    public final String getGame_opening_animation() {
        return this.game_opening_animation;
    }

    public final boolean getGame_requires_subscription() {
        return this.game_requires_subscription;
    }

    public final String getGame_service_source() {
        return this.game_service_source;
    }

    public final String getGame_setting_image() {
        return this.game_setting_image;
    }

    public final String getGame_share_image() {
        return this.game_share_image;
    }

    public final int getGame_source_type() {
        return this.game_source_type;
    }

    public final String getGame_thumbnail() {
        return this.game_thumbnail;
    }

    public final String getLast_game_tim_group_id() {
        return this.last_game_tim_group_id;
    }

    public final int getShow_type() {
        return this.show_type;
    }

    public final int getTag_relation_sort_order() {
        return this.tag_relation_sort_order;
    }

    public int hashCode() {
        return Integer.hashCode(this.tag_relation_sort_order) + o0.f(this.show_type, a.h(a.h(a.h(a.h(o0.f(this.game_source_type, a.h(o0.i(this.game_requires_subscription, a.h(a.h(o0.f(this.game_min_member, o0.f(this.game_max_member, a.h(a.h(o0.i(this.game_is_teen_mode, o0.i(this.game_is_deleted, a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(Integer.hashCode(this.game_access_type) * 31, 31, this.game_active_value), 31, this.game_background_image), 31, this.game_background_image_size), 31, this.game_bgm), 31, this.game_category), 31, this.game_code), 31, this.game_created_by), 31, this.game_id), 31, this.game_intro), 31, this.game_intro_tts), 31), 31), 31, this.game_list_image), 31, this.game_list_image_thumbnail), 31), 31), 31, this.game_name), 31, this.game_opening_animation), 31), 31, this.game_service_source), 31), 31, this.game_setting_image), 31, this.game_share_image), 31, this.game_thumbnail), 31, this.last_game_tim_group_id), 31);
    }

    public String toString() {
        int i6 = this.game_access_type;
        String str = this.game_active_value;
        String str2 = this.game_background_image;
        String str3 = this.game_background_image_size;
        String str4 = this.game_bgm;
        String str5 = this.game_category;
        String str6 = this.game_code;
        String str7 = this.game_created_by;
        String str8 = this.game_id;
        String str9 = this.game_intro;
        String str10 = this.game_intro_tts;
        boolean z2 = this.game_is_deleted;
        boolean z7 = this.game_is_teen_mode;
        String str11 = this.game_list_image;
        String str12 = this.game_list_image_thumbnail;
        int i10 = this.game_max_member;
        int i11 = this.game_min_member;
        String str13 = this.game_name;
        String str14 = this.game_opening_animation;
        boolean z10 = this.game_requires_subscription;
        String str15 = this.game_service_source;
        int i12 = this.game_source_type;
        String str16 = this.game_setting_image;
        String str17 = this.game_share_image;
        String str18 = this.game_thumbnail;
        String str19 = this.last_game_tim_group_id;
        int i13 = this.show_type;
        int i14 = this.tag_relation_sort_order;
        StringBuilder sbN = AbstractC1874g.n(i6, "SearchGameItem(game_access_type=", ", game_active_value=", str, ", game_background_image=");
        AbstractC1380a.s(sbN, str2, ", game_background_image_size=", str3, ", game_bgm=");
        AbstractC1380a.s(sbN, str4, ", game_category=", str5, ", game_code=");
        AbstractC1380a.s(sbN, str6, ", game_created_by=", str7, ", game_id=");
        AbstractC1380a.s(sbN, str8, ", game_intro=", str9, ", game_intro_tts=");
        a.A(sbN, str10, ", game_is_deleted=", z2, ", game_is_teen_mode=");
        sbN.append(z7);
        sbN.append(", game_list_image=");
        sbN.append(str11);
        sbN.append(", game_list_image_thumbnail=");
        sbN.append(str12);
        sbN.append(", game_max_member=");
        sbN.append(i10);
        sbN.append(", game_min_member=");
        AbstractC1874g.u(sbN, i11, ", game_name=", str13, ", game_opening_animation=");
        a.A(sbN, str14, ", game_requires_subscription=", z10, ", game_service_source=");
        sbN.append(str15);
        sbN.append(", game_source_type=");
        sbN.append(i12);
        sbN.append(", game_setting_image=");
        AbstractC1380a.s(sbN, str16, ", game_share_image=", str17, ", game_thumbnail=");
        AbstractC1380a.s(sbN, str18, ", last_game_tim_group_id=", str19, ", show_type=");
        sbN.append(i13);
        sbN.append(", tag_relation_sort_order=");
        sbN.append(i14);
        sbN.append(")");
        return sbN.toString();
    }

    public SearchGameItem(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z7, String str11, String str12, int i10, int i11, String str13, String str14, boolean z10, String str15, int i12, String str16, String str17, String str18, String str19, int i13, int i14) {
        l.f(str, "game_active_value");
        l.f(str2, "game_background_image");
        l.f(str3, "game_background_image_size");
        l.f(str4, "game_bgm");
        l.f(str5, "game_category");
        l.f(str6, "game_code");
        l.f(str7, "game_created_by");
        l.f(str8, "game_id");
        l.f(str9, "game_intro");
        l.f(str10, "game_intro_tts");
        l.f(str11, "game_list_image");
        l.f(str12, "game_list_image_thumbnail");
        l.f(str13, "game_name");
        l.f(str14, "game_opening_animation");
        l.f(str15, "game_service_source");
        l.f(str16, "game_setting_image");
        l.f(str17, "game_share_image");
        l.f(str18, "game_thumbnail");
        l.f(str19, "last_game_tim_group_id");
        this.game_access_type = i6;
        this.game_active_value = str;
        this.game_background_image = str2;
        this.game_background_image_size = str3;
        this.game_bgm = str4;
        this.game_category = str5;
        this.game_code = str6;
        this.game_created_by = str7;
        this.game_id = str8;
        this.game_intro = str9;
        this.game_intro_tts = str10;
        this.game_is_deleted = z2;
        this.game_is_teen_mode = z7;
        this.game_list_image = str11;
        this.game_list_image_thumbnail = str12;
        this.game_max_member = i10;
        this.game_min_member = i11;
        this.game_name = str13;
        this.game_opening_animation = str14;
        this.game_requires_subscription = z10;
        this.game_service_source = str15;
        this.game_source_type = i12;
        this.game_setting_image = str16;
        this.game_share_image = str17;
        this.game_thumbnail = str18;
        this.last_game_tim_group_id = str19;
        this.show_type = i13;
        this.tag_relation_sort_order = i14;
    }

    public /* synthetic */ SearchGameItem(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z7, String str11, String str12, int i10, int i11, String str13, String str14, boolean z10, String str15, int i12, String str16, String str17, String str18, String str19, int i13, int i14, int i15, f fVar) {
        this((i15 & 1) != 0 ? 0 : i6, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? "" : str3, (i15 & 16) != 0 ? "" : str4, (i15 & 32) != 0 ? "" : str5, (i15 & 64) != 0 ? "" : str6, (i15 & 128) != 0 ? "" : str7, (i15 & 256) != 0 ? "" : str8, (i15 & 512) != 0 ? "" : str9, (i15 & 1024) != 0 ? "" : str10, (i15 & 2048) != 0 ? false : z2, (i15 & 4096) != 0 ? false : z7, (i15 & 8192) != 0 ? "" : str11, (i15 & 16384) != 0 ? "" : str12, (i15 & 32768) != 0 ? 0 : i10, (i15 & 65536) != 0 ? 0 : i11, (i15 & 131072) != 0 ? "" : str13, (i15 & 262144) != 0 ? "" : str14, (i15 & 524288) != 0 ? false : z10, (i15 & 1048576) != 0 ? "" : str15, (i15 & 2097152) != 0 ? 0 : i12, (i15 & 4194304) != 0 ? "" : str16, (i15 & 8388608) != 0 ? "" : str17, (i15 & 16777216) != 0 ? "" : str18, (i15 & 33554432) == 0 ? str19 : "", (i15 & 67108864) != 0 ? 0 : i13, (i15 & 134217728) != 0 ? 0 : i14);
    }
}
