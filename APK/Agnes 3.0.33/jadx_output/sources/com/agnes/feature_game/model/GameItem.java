package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameItem {
    public static final Companion Companion = new Companion(null);

    @SerializedName("game_intro")
    private final String _description;

    @SerializedName("game_name")
    private final String _gameName;

    @SerializedName("game_agnes")
    private final String agnes;

    @SerializedName("game_background_image_size")
    private final String backgroundImageSize;

    @SerializedName("game_background_image")
    private final String backgroundImageUrl;

    @SerializedName("game_bgm")
    private final String bgmUrl;

    @SerializedName("game_billing_type")
    private final Integer billingType;

    @SerializedName(alternate = {"category"}, value = "game_category")
    private final String category;

    @SerializedName("game_icon")
    private final String coverUrl;

    @SerializedName("game_created_by")
    private final String createdBy;

    @SerializedName("game_credits_required")
    private final Integer creditsRequired;

    @SerializedName("game_end_media_type")
    private final String endMediaType;

    @SerializedName("game_code")
    private final String gameCode;

    @SerializedName("game_id")
    private final String gameId;

    @SerializedName("game_intro_tts")
    private final String gameIntroTts;

    @SerializedName("game_list_image_thumbnail")
    private final String gameListImageThumbnail;

    @SerializedName("game_source_type")
    private final Integer gameSourceType;

    @SerializedName("game_subtype")
    private final String gameSubtype;

    @SerializedName("game_is_deleted")
    private final Boolean isDeleted;

    @SerializedName("is_shareable")
    private final Boolean isShareable;

    @SerializedName("game_is_teen_mode")
    private final Boolean isTeenMode;

    @SerializedName("last_game_tim_group_id")
    private final String lastGameTimGroupId;

    @SerializedName("game_list_image")
    private final String listImageUrl;

    @SerializedName("game_max_member")
    private final Integer maxMember;

    @SerializedName("game_min_member")
    private final Integer minMember;

    @SerializedName("game_new_version_list_image_thumbnail")
    private final String newVersionListImageThumbnailUrl;

    @SerializedName("game_new_version_list_image")
    private final String newVersionListImageUrl;

    @SerializedName("game_opening_animation")
    private final String openingAnimationUrl;

    @SerializedName("game_active_value")
    private final Integer popularity;

    @SerializedName("game_price")
    private final String price;

    @SerializedName("game_ready_time")
    private final Integer readyTime;

    @SerializedName("game_requires_subscription")
    private final Boolean requiresSubscription;

    @SerializedName("game_rules")
    private final String rules;

    @SerializedName("game_service_source")
    private final String serviceSource;

    @SerializedName("game_setting_image")
    private final String settingImageUrl;

    @SerializedName("game_share_image")
    private final String shareImageUrl;

    @SerializedName("game_support_midway_join")
    private final Boolean supportMidwayJoin;

    @SerializedName("game_thumbnail")
    private final String thumbnailUrl;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeUrlText(String str) {
            if (str == null) {
                return null;
            }
            try {
                return URLDecoder.decode(str, StandardCharsets.UTF_8.toString());
            } catch (Exception unused) {
                return str;
            }
        }

        private Companion() {
        }
    }

    public GameItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, String str6, Integer num4, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, Boolean bool3, String str13, String str14, String str15, String str16, String str17, Boolean bool4, String str18, Integer num5, Integer num6, Boolean bool5, String str19, Integer num7, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        l.f(str, "gameId");
        l.f(str2, "_gameName");
        this.gameId = str;
        this._gameName = str2;
        this.coverUrl = str3;
        this._description = str4;
        this.category = str5;
        this.popularity = num;
        this.maxMember = num2;
        this.minMember = num3;
        this.requiresSubscription = bool;
        this.gameCode = str6;
        this.readyTime = num4;
        this.agnes = str7;
        this.bgmUrl = str8;
        this.openingAnimationUrl = str9;
        this.rules = str10;
        this.supportMidwayJoin = bool2;
        this.serviceSource = str11;
        this.createdBy = str12;
        this.isDeleted = bool3;
        this.listImageUrl = str13;
        this.backgroundImageUrl = str14;
        this.backgroundImageSize = str15;
        this.settingImageUrl = str16;
        this.shareImageUrl = str17;
        this.isTeenMode = bool4;
        this.endMediaType = str18;
        this.creditsRequired = num5;
        this.gameSourceType = num6;
        this.isShareable = bool5;
        this.gameSubtype = str19;
        this.billingType = num7;
        this.price = str20;
        this.thumbnailUrl = str21;
        this.newVersionListImageUrl = str22;
        this.newVersionListImageThumbnailUrl = str23;
        this.gameListImageThumbnail = str24;
        this.lastGameTimGroupId = str25;
        this.gameIntroTts = str26;
    }

    private final String component2() {
        return this._gameName;
    }

    public static /* synthetic */ GameItem copy$default(GameItem gameItem, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, String str6, Integer num4, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, Boolean bool3, String str13, String str14, String str15, String str16, String str17, Boolean bool4, String str18, Integer num5, Integer num6, Boolean bool5, String str19, Integer num7, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i6, int i10, Object obj) {
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        Boolean bool6;
        String str32;
        Integer num8;
        Integer num9;
        Boolean bool7;
        String str33;
        Integer num10;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        Integer num11;
        Integer num12;
        Boolean bool8;
        String str40;
        Integer num13;
        String str41;
        String str42;
        String str43;
        Boolean bool9;
        String str44;
        String str45;
        Boolean bool10;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        Integer num14;
        String str52 = (i6 & 1) != 0 ? gameItem.gameId : str;
        String str53 = (i6 & 2) != 0 ? gameItem._gameName : str2;
        String str54 = (i6 & 4) != 0 ? gameItem.coverUrl : str3;
        String str55 = (i6 & 8) != 0 ? gameItem._description : str4;
        String str56 = (i6 & 16) != 0 ? gameItem.category : str5;
        Integer num15 = (i6 & 32) != 0 ? gameItem.popularity : num;
        Integer num16 = (i6 & 64) != 0 ? gameItem.maxMember : num2;
        Integer num17 = (i6 & 128) != 0 ? gameItem.minMember : num3;
        Boolean bool11 = (i6 & 256) != 0 ? gameItem.requiresSubscription : bool;
        String str57 = (i6 & 512) != 0 ? gameItem.gameCode : str6;
        Integer num18 = (i6 & 1024) != 0 ? gameItem.readyTime : num4;
        String str58 = (i6 & 2048) != 0 ? gameItem.agnes : str7;
        String str59 = (i6 & 4096) != 0 ? gameItem.bgmUrl : str8;
        String str60 = (i6 & 8192) != 0 ? gameItem.openingAnimationUrl : str9;
        String str61 = str52;
        String str62 = (i6 & 16384) != 0 ? gameItem.rules : str10;
        Boolean bool12 = (i6 & 32768) != 0 ? gameItem.supportMidwayJoin : bool2;
        String str63 = (i6 & 65536) != 0 ? gameItem.serviceSource : str11;
        String str64 = (i6 & 131072) != 0 ? gameItem.createdBy : str12;
        Boolean bool13 = (i6 & 262144) != 0 ? gameItem.isDeleted : bool3;
        String str65 = (i6 & 524288) != 0 ? gameItem.listImageUrl : str13;
        String str66 = (i6 & 1048576) != 0 ? gameItem.backgroundImageUrl : str14;
        String str67 = (i6 & 2097152) != 0 ? gameItem.backgroundImageSize : str15;
        String str68 = (i6 & 4194304) != 0 ? gameItem.settingImageUrl : str16;
        String str69 = (i6 & 8388608) != 0 ? gameItem.shareImageUrl : str17;
        Boolean bool14 = (i6 & 16777216) != 0 ? gameItem.isTeenMode : bool4;
        String str70 = (i6 & 33554432) != 0 ? gameItem.endMediaType : str18;
        Integer num19 = (i6 & 67108864) != 0 ? gameItem.creditsRequired : num5;
        Integer num20 = (i6 & 134217728) != 0 ? gameItem.gameSourceType : num6;
        Boolean bool15 = (i6 & 268435456) != 0 ? gameItem.isShareable : bool5;
        String str71 = (i6 & 536870912) != 0 ? gameItem.gameSubtype : str19;
        Integer num21 = (i6 & 1073741824) != 0 ? gameItem.billingType : num7;
        String str72 = (i6 & Integer.MIN_VALUE) != 0 ? gameItem.price : str20;
        String str73 = (i10 & 1) != 0 ? gameItem.thumbnailUrl : str21;
        String str74 = (i10 & 2) != 0 ? gameItem.newVersionListImageUrl : str22;
        String str75 = (i10 & 4) != 0 ? gameItem.newVersionListImageThumbnailUrl : str23;
        String str76 = (i10 & 8) != 0 ? gameItem.gameListImageThumbnail : str24;
        String str77 = (i10 & 16) != 0 ? gameItem.lastGameTimGroupId : str25;
        if ((i10 & 32) != 0) {
            str28 = str77;
            str27 = gameItem.gameIntroTts;
            str30 = str68;
            str31 = str69;
            bool6 = bool14;
            str32 = str70;
            num8 = num19;
            num9 = num20;
            bool7 = bool15;
            str33 = str71;
            num10 = num21;
            str34 = str72;
            str35 = str73;
            str36 = str74;
            str37 = str75;
            str38 = str76;
            str39 = str62;
            num12 = num17;
            bool8 = bool11;
            str40 = str57;
            num13 = num18;
            str41 = str58;
            str42 = str59;
            str43 = str60;
            bool9 = bool12;
            str44 = str63;
            str45 = str64;
            bool10 = bool13;
            str46 = str65;
            str47 = str66;
            str29 = str67;
            str48 = str53;
            str49 = str54;
            str50 = str55;
            str51 = str56;
            num14 = num15;
            num11 = num16;
        } else {
            str27 = str26;
            str28 = str77;
            str29 = str67;
            str30 = str68;
            str31 = str69;
            bool6 = bool14;
            str32 = str70;
            num8 = num19;
            num9 = num20;
            bool7 = bool15;
            str33 = str71;
            num10 = num21;
            str34 = str72;
            str35 = str73;
            str36 = str74;
            str37 = str75;
            str38 = str76;
            str39 = str62;
            num11 = num16;
            num12 = num17;
            bool8 = bool11;
            str40 = str57;
            num13 = num18;
            str41 = str58;
            str42 = str59;
            str43 = str60;
            bool9 = bool12;
            str44 = str63;
            str45 = str64;
            bool10 = bool13;
            str46 = str65;
            str47 = str66;
            str48 = str53;
            str49 = str54;
            str50 = str55;
            str51 = str56;
            num14 = num15;
        }
        return gameItem.copy(str61, str48, str49, str50, str51, num14, num11, num12, bool8, str40, num13, str41, str42, str43, str39, bool9, str44, str45, bool10, str46, str47, str29, str30, str31, bool6, str32, num8, num9, bool7, str33, num10, str34, str35, str36, str37, str38, str28, str27);
    }

    public final String component1() {
        return this.gameId;
    }

    public final String component10() {
        return this.gameCode;
    }

    public final Integer component11() {
        return this.readyTime;
    }

    public final String component12() {
        return this.agnes;
    }

    public final String component13() {
        return this.bgmUrl;
    }

    public final String component14() {
        return this.openingAnimationUrl;
    }

    public final String component15() {
        return this.rules;
    }

    public final Boolean component16() {
        return this.supportMidwayJoin;
    }

    public final String component17() {
        return this.serviceSource;
    }

    public final String component18() {
        return this.createdBy;
    }

    public final Boolean component19() {
        return this.isDeleted;
    }

    public final String component20() {
        return this.listImageUrl;
    }

    public final String component21() {
        return this.backgroundImageUrl;
    }

    public final String component22() {
        return this.backgroundImageSize;
    }

    public final String component23() {
        return this.settingImageUrl;
    }

    public final String component24() {
        return this.shareImageUrl;
    }

    public final Boolean component25() {
        return this.isTeenMode;
    }

    public final String component26() {
        return this.endMediaType;
    }

    public final Integer component27() {
        return this.creditsRequired;
    }

    public final Integer component28() {
        return this.gameSourceType;
    }

    public final Boolean component29() {
        return this.isShareable;
    }

    public final String component3() {
        return this.coverUrl;
    }

    public final String component30() {
        return this.gameSubtype;
    }

    public final Integer component31() {
        return this.billingType;
    }

    public final String component32() {
        return this.price;
    }

    public final String component33() {
        return this.thumbnailUrl;
    }

    public final String component34() {
        return this.newVersionListImageUrl;
    }

    public final String component35() {
        return this.newVersionListImageThumbnailUrl;
    }

    public final String component36() {
        return this.gameListImageThumbnail;
    }

    public final String component37() {
        return this.lastGameTimGroupId;
    }

    public final String component38() {
        return this.gameIntroTts;
    }

    public final String component4() {
        return this._description;
    }

    public final String component5() {
        return this.category;
    }

    public final Integer component6() {
        return this.popularity;
    }

    public final Integer component7() {
        return this.maxMember;
    }

    public final Integer component8() {
        return this.minMember;
    }

    public final Boolean component9() {
        return this.requiresSubscription;
    }

    public final GameItem copy(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, String str6, Integer num4, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, Boolean bool3, String str13, String str14, String str15, String str16, String str17, Boolean bool4, String str18, Integer num5, Integer num6, Boolean bool5, String str19, Integer num7, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        l.f(str, "gameId");
        l.f(str2, "_gameName");
        return new GameItem(str, str2, str3, str4, str5, num, num2, num3, bool, str6, num4, str7, str8, str9, str10, bool2, str11, str12, bool3, str13, str14, str15, str16, str17, bool4, str18, num5, num6, bool5, str19, num7, str20, str21, str22, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameItem)) {
            return false;
        }
        GameItem gameItem = (GameItem) obj;
        return l.b(this.gameId, gameItem.gameId) && l.b(this._gameName, gameItem._gameName) && l.b(this.coverUrl, gameItem.coverUrl) && l.b(this._description, gameItem._description) && l.b(this.category, gameItem.category) && l.b(this.popularity, gameItem.popularity) && l.b(this.maxMember, gameItem.maxMember) && l.b(this.minMember, gameItem.minMember) && l.b(this.requiresSubscription, gameItem.requiresSubscription) && l.b(this.gameCode, gameItem.gameCode) && l.b(this.readyTime, gameItem.readyTime) && l.b(this.agnes, gameItem.agnes) && l.b(this.bgmUrl, gameItem.bgmUrl) && l.b(this.openingAnimationUrl, gameItem.openingAnimationUrl) && l.b(this.rules, gameItem.rules) && l.b(this.supportMidwayJoin, gameItem.supportMidwayJoin) && l.b(this.serviceSource, gameItem.serviceSource) && l.b(this.createdBy, gameItem.createdBy) && l.b(this.isDeleted, gameItem.isDeleted) && l.b(this.listImageUrl, gameItem.listImageUrl) && l.b(this.backgroundImageUrl, gameItem.backgroundImageUrl) && l.b(this.backgroundImageSize, gameItem.backgroundImageSize) && l.b(this.settingImageUrl, gameItem.settingImageUrl) && l.b(this.shareImageUrl, gameItem.shareImageUrl) && l.b(this.isTeenMode, gameItem.isTeenMode) && l.b(this.endMediaType, gameItem.endMediaType) && l.b(this.creditsRequired, gameItem.creditsRequired) && l.b(this.gameSourceType, gameItem.gameSourceType) && l.b(this.isShareable, gameItem.isShareable) && l.b(this.gameSubtype, gameItem.gameSubtype) && l.b(this.billingType, gameItem.billingType) && l.b(this.price, gameItem.price) && l.b(this.thumbnailUrl, gameItem.thumbnailUrl) && l.b(this.newVersionListImageUrl, gameItem.newVersionListImageUrl) && l.b(this.newVersionListImageThumbnailUrl, gameItem.newVersionListImageThumbnailUrl) && l.b(this.gameListImageThumbnail, gameItem.gameListImageThumbnail) && l.b(this.lastGameTimGroupId, gameItem.lastGameTimGroupId) && l.b(this.gameIntroTts, gameItem.gameIntroTts);
    }

    public final String getAgnes() {
        return this.agnes;
    }

    public final String getBackgroundImageSize() {
        return this.backgroundImageSize;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getBgmUrl() {
        return this.bgmUrl;
    }

    public final Integer getBillingType() {
        return this.billingType;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final Integer getCreditsRequired() {
        return this.creditsRequired;
    }

    public final String getDescription() {
        return Companion.decodeUrlText(this._description);
    }

    public final String getEndMediaType() {
        return this.endMediaType;
    }

    public final String getGameCode() {
        return this.gameCode;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameIntroTts() {
        return this.gameIntroTts;
    }

    public final String getGameListImageThumbnail() {
        return this.gameListImageThumbnail;
    }

    public final Integer getGameSourceType() {
        return this.gameSourceType;
    }

    public final String getGameSubtype() {
        return this.gameSubtype;
    }

    public final String getLastGameTimGroupId() {
        return this.lastGameTimGroupId;
    }

    public final String getListImageUrl() {
        return this.listImageUrl;
    }

    public final Integer getMaxMember() {
        return this.maxMember;
    }

    public final Integer getMinMember() {
        return this.minMember;
    }

    public final String getName() {
        String strDecodeUrlText = Companion.decodeUrlText(this._gameName);
        return strDecodeUrlText == null ? this._gameName : strDecodeUrlText;
    }

    public final String getNewVersionListImageThumbnailUrl() {
        return this.newVersionListImageThumbnailUrl;
    }

    public final String getNewVersionListImageUrl() {
        return this.newVersionListImageUrl;
    }

    public final String getOpeningAnimationUrl() {
        return this.openingAnimationUrl;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final String getPrice() {
        return this.price;
    }

    public final Integer getReadyTime() {
        return this.readyTime;
    }

    public final Boolean getRequiresSubscription() {
        return this.requiresSubscription;
    }

    public final String getRules() {
        return this.rules;
    }

    public final String getServiceSource() {
        return this.serviceSource;
    }

    public final String getSettingImageUrl() {
        return this.settingImageUrl;
    }

    public final String getShareImageUrl() {
        return this.shareImageUrl;
    }

    public final Boolean getSupportMidwayJoin() {
        return this.supportMidwayJoin;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String get_description() {
        return this._description;
    }

    public int hashCode() {
        int iH = a.h(this.gameId.hashCode() * 31, 31, this._gameName);
        String str = this.coverUrl;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.popularity;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxMember;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minMember;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.requiresSubscription;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.gameCode;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.readyTime;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.agnes;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bgmUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.openingAnimationUrl;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rules;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.supportMidwayJoin;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.serviceSource;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.createdBy;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.isDeleted;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str11 = this.listImageUrl;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.backgroundImageUrl;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.backgroundImageSize;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.settingImageUrl;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.shareImageUrl;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool4 = this.isTeenMode;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str16 = this.endMediaType;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num5 = this.creditsRequired;
        int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gameSourceType;
        int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool5 = this.isShareable;
        int iHashCode27 = (iHashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str17 = this.gameSubtype;
        int iHashCode28 = (iHashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num7 = this.billingType;
        int iHashCode29 = (iHashCode28 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str18 = this.price;
        int iHashCode30 = (iHashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.thumbnailUrl;
        int iHashCode31 = (iHashCode30 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.newVersionListImageUrl;
        int iHashCode32 = (iHashCode31 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.newVersionListImageThumbnailUrl;
        int iHashCode33 = (iHashCode32 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.gameListImageThumbnail;
        int iHashCode34 = (iHashCode33 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.lastGameTimGroupId;
        int iHashCode35 = (iHashCode34 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.gameIntroTts;
        return iHashCode35 + (str24 != null ? str24.hashCode() : 0);
    }

    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public final Boolean isShareable() {
        return this.isShareable;
    }

    public final Boolean isTeenMode() {
        return this.isTeenMode;
    }

    public String toString() {
        String str = this.gameId;
        String str2 = this._gameName;
        String str3 = this.coverUrl;
        String str4 = this._description;
        String str5 = this.category;
        Integer num = this.popularity;
        Integer num2 = this.maxMember;
        Integer num3 = this.minMember;
        Boolean bool = this.requiresSubscription;
        String str6 = this.gameCode;
        Integer num4 = this.readyTime;
        String str7 = this.agnes;
        String str8 = this.bgmUrl;
        String str9 = this.openingAnimationUrl;
        String str10 = this.rules;
        Boolean bool2 = this.supportMidwayJoin;
        String str11 = this.serviceSource;
        String str12 = this.createdBy;
        Boolean bool3 = this.isDeleted;
        String str13 = this.listImageUrl;
        String str14 = this.backgroundImageUrl;
        String str15 = this.backgroundImageSize;
        String str16 = this.settingImageUrl;
        String str17 = this.shareImageUrl;
        Boolean bool4 = this.isTeenMode;
        String str18 = this.endMediaType;
        Integer num5 = this.creditsRequired;
        Integer num6 = this.gameSourceType;
        Boolean bool5 = this.isShareable;
        String str19 = this.gameSubtype;
        Integer num7 = this.billingType;
        String str20 = this.price;
        String str21 = this.thumbnailUrl;
        String str22 = this.newVersionListImageUrl;
        String str23 = this.newVersionListImageThumbnailUrl;
        String str24 = this.gameListImageThumbnail;
        String str25 = this.lastGameTimGroupId;
        String str26 = this.gameIntroTts;
        StringBuilder sbJ = AbstractC1380a.j("GameItem(gameId=", str, ", _gameName=", str2, ", coverUrl=");
        AbstractC1380a.s(sbJ, str3, ", _description=", str4, ", category=");
        sbJ.append(str5);
        sbJ.append(", popularity=");
        sbJ.append(num);
        sbJ.append(", maxMember=");
        o0.z(sbJ, num2, ", minMember=", num3, ", requiresSubscription=");
        sbJ.append(bool);
        sbJ.append(", gameCode=");
        sbJ.append(str6);
        sbJ.append(", readyTime=");
        o0.A(sbJ, num4, ", agnes=", str7, ", bgmUrl=");
        AbstractC1380a.s(sbJ, str8, ", openingAnimationUrl=", str9, ", rules=");
        sbJ.append(str10);
        sbJ.append(", supportMidwayJoin=");
        sbJ.append(bool2);
        sbJ.append(", serviceSource=");
        AbstractC1380a.s(sbJ, str11, ", createdBy=", str12, ", isDeleted=");
        sbJ.append(bool3);
        sbJ.append(", listImageUrl=");
        sbJ.append(str13);
        sbJ.append(", backgroundImageUrl=");
        AbstractC1380a.s(sbJ, str14, ", backgroundImageSize=", str15, ", settingImageUrl=");
        AbstractC1380a.s(sbJ, str16, ", shareImageUrl=", str17, ", isTeenMode=");
        sbJ.append(bool4);
        sbJ.append(", endMediaType=");
        sbJ.append(str18);
        sbJ.append(", creditsRequired=");
        o0.z(sbJ, num5, ", gameSourceType=", num6, ", isShareable=");
        sbJ.append(bool5);
        sbJ.append(", gameSubtype=");
        sbJ.append(str19);
        sbJ.append(", billingType=");
        o0.A(sbJ, num7, ", price=", str20, ", thumbnailUrl=");
        AbstractC1380a.s(sbJ, str21, ", newVersionListImageUrl=", str22, ", newVersionListImageThumbnailUrl=");
        AbstractC1380a.s(sbJ, str23, ", gameListImageThumbnail=", str24, ", lastGameTimGroupId=");
        return a.s(sbJ, str25, ", gameIntroTts=", str26, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GameItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, String str6, Integer num4, String str7, String str8, String str9, String str10, Boolean bool2, String str11, String str12, Boolean bool3, String str13, String str14, String str15, String str16, String str17, Boolean bool4, String str18, Integer num5, Integer num6, Boolean bool5, String str19, Integer num7, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i6, int i10, f fVar) {
        this(str, str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? num : num, (i6 & 64) != 0 ? num : num2, (i6 & 128) != 0 ? num : num3, (i6 & 256) != 0 ? Boolean.FALSE : bool, (i6 & 512) != 0 ? "" : str6, (i6 & 1024) != 0 ? num : num4, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? "" : str9, (i6 & 16384) != 0 ? "" : str10, (i6 & 32768) != 0 ? Boolean.FALSE : bool2, (i6 & 65536) != 0 ? "" : str11, (i6 & 131072) != 0 ? "" : str12, (i6 & 262144) != 0 ? Boolean.FALSE : bool3, (i6 & 524288) != 0 ? "" : str13, (i6 & 1048576) != 0 ? "" : str14, (i6 & 2097152) != 0 ? null : str15, (i6 & 4194304) != 0 ? "" : str16, (i6 & 8388608) != 0 ? "" : str17, (i6 & 16777216) != 0 ? Boolean.FALSE : bool4, (i6 & 33554432) != 0 ? "" : str18, (i6 & 67108864) != 0 ? num : num5, (i6 & 134217728) != 0 ? num : num6, (i6 & 268435456) != 0 ? Boolean.FALSE : bool5, (i6 & 536870912) != 0 ? null : str19, (i6 & 1073741824) == 0 ? num7 : 0, (i6 & Integer.MIN_VALUE) != 0 ? "0" : str20, (i10 & 1) != 0 ? "" : str21, (i10 & 2) != 0 ? "" : str22, (i10 & 4) != 0 ? "" : str23, (i10 & 8) == 0 ? str24 : "", (i10 & 16) != 0 ? null : str25, (i10 & 32) != 0 ? null : str26);
    }
}
