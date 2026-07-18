package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameGroupInfo {

    @SerializedName("announcement")
    private final String announcement;

    @SerializedName("apply_join_option")
    private final String applyJoinOption;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("custom_attrs")
    private final String customAttrs;

    @SerializedName("description")
    private final String description;

    @SerializedName("group_type")
    private final Number groupType;

    @SerializedName("group_version")
    private final String groupVersion;

    @SerializedName("id")
    private final String id;

    @SerializedName("invite_join_option")
    private final String inviteJoinOption;

    @SerializedName("max_member_count")
    private final Number maxMemberCount;

    @SerializedName("name")
    private final String name;

    @SerializedName("owner_user_id")
    private final String ownerUserId;

    @SerializedName("search_visible")
    private final Number searchVisible;

    @SerializedName("share_code")
    private final String shareCode;

    @SerializedName("tim_group_id")
    private final String timGroupId;

    @SerializedName("tim_group_type")
    private final String timGroupType;

    public GameGroupInfo(String str, String str2, String str3, String str4, Number number, String str5, String str6, String str7, String str8, Number number2, String str9, String str10, Number number3, String str11, String str12, String str13) {
        l.f(str, "id");
        l.f(str2, "timGroupId");
        l.f(str3, "timGroupType");
        l.f(str4, "name");
        l.f(number, "groupType");
        l.f(str5, "ownerUserId");
        l.f(number2, "maxMemberCount");
        l.f(str9, "applyJoinOption");
        l.f(str10, "inviteJoinOption");
        l.f(number3, "searchVisible");
        l.f(str11, "shareCode");
        l.f(str12, "groupVersion");
        this.id = str;
        this.timGroupId = str2;
        this.timGroupType = str3;
        this.name = str4;
        this.groupType = number;
        this.ownerUserId = str5;
        this.avatarUrl = str6;
        this.description = str7;
        this.announcement = str8;
        this.maxMemberCount = number2;
        this.applyJoinOption = str9;
        this.inviteJoinOption = str10;
        this.searchVisible = number3;
        this.shareCode = str11;
        this.groupVersion = str12;
        this.customAttrs = str13;
    }

    public final String component1() {
        return this.id;
    }

    public final Number component10() {
        return this.maxMemberCount;
    }

    public final String component11() {
        return this.applyJoinOption;
    }

    public final String component12() {
        return this.inviteJoinOption;
    }

    public final Number component13() {
        return this.searchVisible;
    }

    public final String component14() {
        return this.shareCode;
    }

    public final String component15() {
        return this.groupVersion;
    }

    public final String component16() {
        return this.customAttrs;
    }

    public final String component2() {
        return this.timGroupId;
    }

    public final String component3() {
        return this.timGroupType;
    }

    public final String component4() {
        return this.name;
    }

    public final Number component5() {
        return this.groupType;
    }

    public final String component6() {
        return this.ownerUserId;
    }

    public final String component7() {
        return this.avatarUrl;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.announcement;
    }

    public final GameGroupInfo copy(String str, String str2, String str3, String str4, Number number, String str5, String str6, String str7, String str8, Number number2, String str9, String str10, Number number3, String str11, String str12, String str13) {
        l.f(str, "id");
        l.f(str2, "timGroupId");
        l.f(str3, "timGroupType");
        l.f(str4, "name");
        l.f(number, "groupType");
        l.f(str5, "ownerUserId");
        l.f(number2, "maxMemberCount");
        l.f(str9, "applyJoinOption");
        l.f(str10, "inviteJoinOption");
        l.f(number3, "searchVisible");
        l.f(str11, "shareCode");
        l.f(str12, "groupVersion");
        return new GameGroupInfo(str, str2, str3, str4, number, str5, str6, str7, str8, number2, str9, str10, number3, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameGroupInfo)) {
            return false;
        }
        GameGroupInfo gameGroupInfo = (GameGroupInfo) obj;
        return l.b(this.id, gameGroupInfo.id) && l.b(this.timGroupId, gameGroupInfo.timGroupId) && l.b(this.timGroupType, gameGroupInfo.timGroupType) && l.b(this.name, gameGroupInfo.name) && l.b(this.groupType, gameGroupInfo.groupType) && l.b(this.ownerUserId, gameGroupInfo.ownerUserId) && l.b(this.avatarUrl, gameGroupInfo.avatarUrl) && l.b(this.description, gameGroupInfo.description) && l.b(this.announcement, gameGroupInfo.announcement) && l.b(this.maxMemberCount, gameGroupInfo.maxMemberCount) && l.b(this.applyJoinOption, gameGroupInfo.applyJoinOption) && l.b(this.inviteJoinOption, gameGroupInfo.inviteJoinOption) && l.b(this.searchVisible, gameGroupInfo.searchVisible) && l.b(this.shareCode, gameGroupInfo.shareCode) && l.b(this.groupVersion, gameGroupInfo.groupVersion) && l.b(this.customAttrs, gameGroupInfo.customAttrs);
    }

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final String getApplyJoinOption() {
        return this.applyJoinOption;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCustomAttrs() {
        return this.customAttrs;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Number getGroupType() {
        return this.groupType;
    }

    public final String getGroupVersion() {
        return this.groupVersion;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInviteJoinOption() {
        return this.inviteJoinOption;
    }

    public final Number getMaxMemberCount() {
        return this.maxMemberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerUserId() {
        return this.ownerUserId;
    }

    public final Number getSearchVisible() {
        return this.searchVisible;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getTimGroupId() {
        return this.timGroupId;
    }

    public final String getTimGroupType() {
        return this.timGroupType;
    }

    public int hashCode() {
        int iH = a.h((this.groupType.hashCode() + a.h(a.h(a.h(this.id.hashCode() * 31, 31, this.timGroupId), 31, this.timGroupType), 31, this.name)) * 31, 31, this.ownerUserId);
        String str = this.avatarUrl;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.announcement;
        int iH2 = a.h(a.h((this.searchVisible.hashCode() + a.h(a.h((this.maxMemberCount.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.applyJoinOption), 31, this.inviteJoinOption)) * 31, 31, this.shareCode), 31, this.groupVersion);
        String str4 = this.customAttrs;
        return iH2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.timGroupId;
        String str3 = this.timGroupType;
        String str4 = this.name;
        Number number = this.groupType;
        String str5 = this.ownerUserId;
        String str6 = this.avatarUrl;
        String str7 = this.description;
        String str8 = this.announcement;
        Number number2 = this.maxMemberCount;
        String str9 = this.applyJoinOption;
        String str10 = this.inviteJoinOption;
        Number number3 = this.searchVisible;
        String str11 = this.shareCode;
        String str12 = this.groupVersion;
        String str13 = this.customAttrs;
        StringBuilder sbJ = AbstractC1380a.j("GameGroupInfo(id=", str, ", timGroupId=", str2, ", timGroupType=");
        AbstractC1380a.s(sbJ, str3, ", name=", str4, ", groupType=");
        sbJ.append(number);
        sbJ.append(", ownerUserId=");
        sbJ.append(str5);
        sbJ.append(", avatarUrl=");
        AbstractC1380a.s(sbJ, str6, ", description=", str7, ", announcement=");
        sbJ.append(str8);
        sbJ.append(", maxMemberCount=");
        sbJ.append(number2);
        sbJ.append(", applyJoinOption=");
        AbstractC1380a.s(sbJ, str9, ", inviteJoinOption=", str10, ", searchVisible=");
        sbJ.append(number3);
        sbJ.append(", shareCode=");
        sbJ.append(str11);
        sbJ.append(", groupVersion=");
        return a.s(sbJ, str12, ", customAttrs=", str13, ")");
    }
}
