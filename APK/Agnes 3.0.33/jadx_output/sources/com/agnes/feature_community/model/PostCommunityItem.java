package com.agnes.feature_community.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import e5.AbstractC1874g;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PostCommunityItem {

    @SerializedName("announcement_type")
    private final int announcementType;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("comment_count")
    private final int commentCount;

    @SerializedName("contents")
    private final List<PostCommunityContent> contents;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("emojis")
    private final List<PostCommunityEmoji> emojis;

    @SerializedName("game_background_image")
    private final String gameBackgroundImage;

    @SerializedName("game_bgm")
    private final String gameBgm;

    @SerializedName("game_id")
    private final String gameId;

    @SerializedName("game_intro")
    private final String gameIntro;

    @SerializedName("game_intro_tts")
    private final String gameIntroTts;

    @SerializedName("game_name")
    private final String gameName;

    @SerializedName("game_npc_id")
    private final String gameNpcId;

    @SerializedName("game_opening_animation")
    private final String gameOpeningAnimation;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("id")
    private final String id;

    @SerializedName("name")
    private final String name;

    @SerializedName("npc_avatar")
    private final String npcAvatar;

    @SerializedName("npc_name")
    private final String npcName;

    @SerializedName("npc_owner_id")
    private final String npcOwerId;

    @SerializedName("owner_id")
    private final String ownerId;

    @SerializedName("post_bgm_url")
    private final String postBgmUrl;

    @SerializedName("post_content")
    private final String postContent;

    @SerializedName("post_status")
    private final int postStatus;

    @SerializedName("source_type")
    private final int sourceType;

    @SerializedName("updated_at")
    private final String updatedAt;

    public PostCommunityItem(int i6, String str, int i10, List<PostCommunityContent> list, String str2, List<PostCommunityEmoji> list2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, String str17, String str18, String str19, String str20) {
        l.f(str, "avatar");
        l.f(list, "contents");
        l.f(str2, "createdAt");
        l.f(list2, "emojis");
        l.f(str3, "gameBackgroundImage");
        l.f(str4, "gameBgm");
        l.f(str5, "gameId");
        l.f(str6, "gameIntro");
        l.f(str7, "gameIntroTts");
        l.f(str8, "gameName");
        l.f(str9, "gameNpcId");
        l.f(str10, "gameOpeningAnimation");
        l.f(str11, "groupId");
        l.f(str12, "id");
        l.f(str13, "name");
        l.f(str14, "ownerId");
        l.f(str15, "postBgmUrl");
        l.f(str16, "postContent");
        l.f(str17, "updatedAt");
        l.f(str18, "npcName");
        l.f(str19, "npcAvatar");
        l.f(str20, "npcOwerId");
        this.announcementType = i6;
        this.avatar = str;
        this.commentCount = i10;
        this.contents = list;
        this.createdAt = str2;
        this.emojis = list2;
        this.gameBackgroundImage = str3;
        this.gameBgm = str4;
        this.gameId = str5;
        this.gameIntro = str6;
        this.gameIntroTts = str7;
        this.gameName = str8;
        this.gameNpcId = str9;
        this.gameOpeningAnimation = str10;
        this.groupId = str11;
        this.id = str12;
        this.name = str13;
        this.ownerId = str14;
        this.postBgmUrl = str15;
        this.postContent = str16;
        this.postStatus = i11;
        this.sourceType = i12;
        this.updatedAt = str17;
        this.npcName = str18;
        this.npcAvatar = str19;
        this.npcOwerId = str20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostCommunityItem copy$default(PostCommunityItem postCommunityItem, int i6, String str, int i10, List list, String str2, List list2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, String str17, String str18, String str19, String str20, int i13, Object obj) {
        String str21;
        String str22;
        int i14 = (i13 & 1) != 0 ? postCommunityItem.announcementType : i6;
        String str23 = (i13 & 2) != 0 ? postCommunityItem.avatar : str;
        int i15 = (i13 & 4) != 0 ? postCommunityItem.commentCount : i10;
        List list3 = (i13 & 8) != 0 ? postCommunityItem.contents : list;
        String str24 = (i13 & 16) != 0 ? postCommunityItem.createdAt : str2;
        List list4 = (i13 & 32) != 0 ? postCommunityItem.emojis : list2;
        String str25 = (i13 & 64) != 0 ? postCommunityItem.gameBackgroundImage : str3;
        String str26 = (i13 & 128) != 0 ? postCommunityItem.gameBgm : str4;
        String str27 = (i13 & 256) != 0 ? postCommunityItem.gameId : str5;
        String str28 = (i13 & 512) != 0 ? postCommunityItem.gameIntro : str6;
        String str29 = (i13 & 1024) != 0 ? postCommunityItem.gameIntroTts : str7;
        String str30 = (i13 & 2048) != 0 ? postCommunityItem.gameName : str8;
        String str31 = (i13 & 4096) != 0 ? postCommunityItem.gameNpcId : str9;
        String str32 = (i13 & 8192) != 0 ? postCommunityItem.gameOpeningAnimation : str10;
        int i16 = i14;
        String str33 = (i13 & 16384) != 0 ? postCommunityItem.groupId : str11;
        String str34 = (i13 & 32768) != 0 ? postCommunityItem.id : str12;
        String str35 = (i13 & 65536) != 0 ? postCommunityItem.name : str13;
        String str36 = (i13 & 131072) != 0 ? postCommunityItem.ownerId : str14;
        String str37 = (i13 & 262144) != 0 ? postCommunityItem.postBgmUrl : str15;
        String str38 = (i13 & 524288) != 0 ? postCommunityItem.postContent : str16;
        int i17 = (i13 & 1048576) != 0 ? postCommunityItem.postStatus : i11;
        int i18 = (i13 & 2097152) != 0 ? postCommunityItem.sourceType : i12;
        String str39 = (i13 & 4194304) != 0 ? postCommunityItem.updatedAt : str17;
        String str40 = (i13 & 8388608) != 0 ? postCommunityItem.npcName : str18;
        String str41 = (i13 & 16777216) != 0 ? postCommunityItem.npcAvatar : str19;
        if ((i13 & 33554432) != 0) {
            str22 = str41;
            str21 = postCommunityItem.npcOwerId;
        } else {
            str21 = str20;
            str22 = str41;
        }
        return postCommunityItem.copy(i16, str23, i15, list3, str24, list4, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, i17, i18, str39, str40, str22, str21);
    }

    public final int component1() {
        return this.announcementType;
    }

    public final String component10() {
        return this.gameIntro;
    }

    public final String component11() {
        return this.gameIntroTts;
    }

    public final String component12() {
        return this.gameName;
    }

    public final String component13() {
        return this.gameNpcId;
    }

    public final String component14() {
        return this.gameOpeningAnimation;
    }

    public final String component15() {
        return this.groupId;
    }

    public final String component16() {
        return this.id;
    }

    public final String component17() {
        return this.name;
    }

    public final String component18() {
        return this.ownerId;
    }

    public final String component19() {
        return this.postBgmUrl;
    }

    public final String component2() {
        return this.avatar;
    }

    public final String component20() {
        return this.postContent;
    }

    public final int component21() {
        return this.postStatus;
    }

    public final int component22() {
        return this.sourceType;
    }

    public final String component23() {
        return this.updatedAt;
    }

    public final String component24() {
        return this.npcName;
    }

    public final String component25() {
        return this.npcAvatar;
    }

    public final String component26() {
        return this.npcOwerId;
    }

    public final int component3() {
        return this.commentCount;
    }

    public final List<PostCommunityContent> component4() {
        return this.contents;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final List<PostCommunityEmoji> component6() {
        return this.emojis;
    }

    public final String component7() {
        return this.gameBackgroundImage;
    }

    public final String component8() {
        return this.gameBgm;
    }

    public final String component9() {
        return this.gameId;
    }

    public final PostCommunityItem copy(int i6, String str, int i10, List<PostCommunityContent> list, String str2, List<PostCommunityEmoji> list2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, String str17, String str18, String str19, String str20) {
        l.f(str, "avatar");
        l.f(list, "contents");
        l.f(str2, "createdAt");
        l.f(list2, "emojis");
        l.f(str3, "gameBackgroundImage");
        l.f(str4, "gameBgm");
        l.f(str5, "gameId");
        l.f(str6, "gameIntro");
        l.f(str7, "gameIntroTts");
        l.f(str8, "gameName");
        l.f(str9, "gameNpcId");
        l.f(str10, "gameOpeningAnimation");
        l.f(str11, "groupId");
        l.f(str12, "id");
        l.f(str13, "name");
        l.f(str14, "ownerId");
        l.f(str15, "postBgmUrl");
        l.f(str16, "postContent");
        l.f(str17, "updatedAt");
        l.f(str18, "npcName");
        l.f(str19, "npcAvatar");
        l.f(str20, "npcOwerId");
        return new PostCommunityItem(i6, str, i10, list, str2, list2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, i11, i12, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostCommunityItem)) {
            return false;
        }
        PostCommunityItem postCommunityItem = (PostCommunityItem) obj;
        return this.announcementType == postCommunityItem.announcementType && l.b(this.avatar, postCommunityItem.avatar) && this.commentCount == postCommunityItem.commentCount && l.b(this.contents, postCommunityItem.contents) && l.b(this.createdAt, postCommunityItem.createdAt) && l.b(this.emojis, postCommunityItem.emojis) && l.b(this.gameBackgroundImage, postCommunityItem.gameBackgroundImage) && l.b(this.gameBgm, postCommunityItem.gameBgm) && l.b(this.gameId, postCommunityItem.gameId) && l.b(this.gameIntro, postCommunityItem.gameIntro) && l.b(this.gameIntroTts, postCommunityItem.gameIntroTts) && l.b(this.gameName, postCommunityItem.gameName) && l.b(this.gameNpcId, postCommunityItem.gameNpcId) && l.b(this.gameOpeningAnimation, postCommunityItem.gameOpeningAnimation) && l.b(this.groupId, postCommunityItem.groupId) && l.b(this.id, postCommunityItem.id) && l.b(this.name, postCommunityItem.name) && l.b(this.ownerId, postCommunityItem.ownerId) && l.b(this.postBgmUrl, postCommunityItem.postBgmUrl) && l.b(this.postContent, postCommunityItem.postContent) && this.postStatus == postCommunityItem.postStatus && this.sourceType == postCommunityItem.sourceType && l.b(this.updatedAt, postCommunityItem.updatedAt) && l.b(this.npcName, postCommunityItem.npcName) && l.b(this.npcAvatar, postCommunityItem.npcAvatar) && l.b(this.npcOwerId, postCommunityItem.npcOwerId);
    }

    public final int getAnnouncementType() {
        return this.announcementType;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final List<PostCommunityContent> getContents() {
        return this.contents;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final List<PostCommunityEmoji> getEmojis() {
        return this.emojis;
    }

    public final String getGameBackgroundImage() {
        return this.gameBackgroundImage;
    }

    public final String getGameBgm() {
        return this.gameBgm;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameIntro() {
        return this.gameIntro;
    }

    public final String getGameIntroTts() {
        return this.gameIntroTts;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final String getGameNpcId() {
        return this.gameNpcId;
    }

    public final String getGameOpeningAnimation() {
        return this.gameOpeningAnimation;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNpcAvatar() {
        return this.npcAvatar;
    }

    public final String getNpcName() {
        return this.npcName;
    }

    public final String getNpcOwerId() {
        return this.npcOwerId;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPostBgmUrl() {
        return this.postBgmUrl;
    }

    public final String getPostContent() {
        return this.postContent;
    }

    public final int getPostStatus() {
        return this.postStatus;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.npcOwerId.hashCode() + a.h(a.h(a.h(o0.f(this.sourceType, o0.f(this.postStatus, a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(a.h(AbstractC1380a.b(a.h(AbstractC1380a.b(o0.f(this.commentCount, a.h(Integer.hashCode(this.announcementType) * 31, 31, this.avatar), 31), 31, this.contents), 31, this.createdAt), 31, this.emojis), 31, this.gameBackgroundImage), 31, this.gameBgm), 31, this.gameId), 31, this.gameIntro), 31, this.gameIntroTts), 31, this.gameName), 31, this.gameNpcId), 31, this.gameOpeningAnimation), 31, this.groupId), 31, this.id), 31, this.name), 31, this.ownerId), 31, this.postBgmUrl), 31, this.postContent), 31), 31), 31, this.updatedAt), 31, this.npcName), 31, this.npcAvatar);
    }

    public String toString() {
        int i6 = this.announcementType;
        String str = this.avatar;
        int i10 = this.commentCount;
        List<PostCommunityContent> list = this.contents;
        String str2 = this.createdAt;
        List<PostCommunityEmoji> list2 = this.emojis;
        String str3 = this.gameBackgroundImage;
        String str4 = this.gameBgm;
        String str5 = this.gameId;
        String str6 = this.gameIntro;
        String str7 = this.gameIntroTts;
        String str8 = this.gameName;
        String str9 = this.gameNpcId;
        String str10 = this.gameOpeningAnimation;
        String str11 = this.groupId;
        String str12 = this.id;
        String str13 = this.name;
        String str14 = this.ownerId;
        String str15 = this.postBgmUrl;
        String str16 = this.postContent;
        int i11 = this.postStatus;
        int i12 = this.sourceType;
        String str17 = this.updatedAt;
        String str18 = this.npcName;
        String str19 = this.npcAvatar;
        String str20 = this.npcOwerId;
        StringBuilder sbN = AbstractC1874g.n(i6, "PostCommunityItem(announcementType=", ", avatar=", str, ", commentCount=");
        sbN.append(i10);
        sbN.append(", contents=");
        sbN.append(list);
        sbN.append(", createdAt=");
        sbN.append(str2);
        sbN.append(", emojis=");
        sbN.append(list2);
        sbN.append(", gameBackgroundImage=");
        AbstractC1380a.s(sbN, str3, ", gameBgm=", str4, ", gameId=");
        AbstractC1380a.s(sbN, str5, ", gameIntro=", str6, ", gameIntroTts=");
        AbstractC1380a.s(sbN, str7, ", gameName=", str8, ", gameNpcId=");
        AbstractC1380a.s(sbN, str9, ", gameOpeningAnimation=", str10, ", groupId=");
        AbstractC1380a.s(sbN, str11, ", id=", str12, ", name=");
        AbstractC1380a.s(sbN, str13, ", ownerId=", str14, ", postBgmUrl=");
        AbstractC1380a.s(sbN, str15, ", postContent=", str16, ", postStatus=");
        a.z(sbN, i11, ", sourceType=", i12, ", updatedAt=");
        AbstractC1380a.s(sbN, str17, ", npcName=", str18, ", npcAvatar=");
        return a.s(sbN, str19, ", npcOwerId=", str20, ")");
    }

    public /* synthetic */ PostCommunityItem(int i6, String str, int i10, List list, String str2, List list2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11, int i12, String str17, String str18, String str19, String str20, int i13, f fVar) {
        this(i6, str, i10, list, str2, list2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, i11, i12, str17, str18, str19, (i13 & 33554432) != 0 ? "" : str20);
    }
}
