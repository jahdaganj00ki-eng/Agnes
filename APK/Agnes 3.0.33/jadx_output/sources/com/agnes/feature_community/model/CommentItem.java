package com.agnes.feature_community.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import e5.AbstractC1874g;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CommentItem {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("content")
    private final String content;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("game_character_id")
    private final String gameCharacterId;

    @SerializedName("id")
    private final String id;

    @SerializedName("like_count")
    private final int likeCount;

    @SerializedName("name")
    private final String name;

    @SerializedName("owner_id")
    private final String ownerId;

    @SerializedName("post_id")
    private final String postId;

    @SerializedName("reacted_by_viewer")
    private final boolean reactedByViewer;

    @SerializedName("source_type")
    private final int sourceType;

    @SerializedName("updated_at")
    private final String updatedAt;

    public CommentItem() {
        this(null, null, 0, null, null, 0, null, null, false, null, null, null, 4095, null);
    }

    public static /* synthetic */ CommentItem copy$default(CommentItem commentItem, String str, String str2, int i6, String str3, String str4, int i10, String str5, String str6, boolean z2, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commentItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = commentItem.postId;
        }
        if ((i11 & 4) != 0) {
            i6 = commentItem.sourceType;
        }
        if ((i11 & 8) != 0) {
            str3 = commentItem.ownerId;
        }
        if ((i11 & 16) != 0) {
            str4 = commentItem.content;
        }
        if ((i11 & 32) != 0) {
            i10 = commentItem.likeCount;
        }
        if ((i11 & 64) != 0) {
            str5 = commentItem.createdAt;
        }
        if ((i11 & 128) != 0) {
            str6 = commentItem.updatedAt;
        }
        if ((i11 & 256) != 0) {
            z2 = commentItem.reactedByViewer;
        }
        if ((i11 & 512) != 0) {
            str7 = commentItem.name;
        }
        if ((i11 & 1024) != 0) {
            str8 = commentItem.avatar;
        }
        if ((i11 & 2048) != 0) {
            str9 = commentItem.gameCharacterId;
        }
        String str10 = str8;
        String str11 = str9;
        boolean z7 = z2;
        String str12 = str7;
        String str13 = str5;
        String str14 = str6;
        String str15 = str4;
        int i12 = i10;
        return commentItem.copy(str, str2, i6, str3, str15, i12, str13, str14, z7, str12, str10, str11);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.name;
    }

    public final String component11() {
        return this.avatar;
    }

    public final String component12() {
        return this.gameCharacterId;
    }

    public final String component2() {
        return this.postId;
    }

    public final int component3() {
        return this.sourceType;
    }

    public final String component4() {
        return this.ownerId;
    }

    public final String component5() {
        return this.content;
    }

    public final int component6() {
        return this.likeCount;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final boolean component9() {
        return this.reactedByViewer;
    }

    public final CommentItem copy(String str, String str2, int i6, String str3, String str4, int i10, String str5, String str6, boolean z2, String str7, String str8, String str9) {
        l.f(str, "id");
        l.f(str2, "postId");
        l.f(str3, "ownerId");
        l.f(str4, "content");
        l.f(str5, "createdAt");
        l.f(str6, "updatedAt");
        l.f(str7, "name");
        l.f(str8, "avatar");
        l.f(str9, "gameCharacterId");
        return new CommentItem(str, str2, i6, str3, str4, i10, str5, str6, z2, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentItem)) {
            return false;
        }
        CommentItem commentItem = (CommentItem) obj;
        return l.b(this.id, commentItem.id) && l.b(this.postId, commentItem.postId) && this.sourceType == commentItem.sourceType && l.b(this.ownerId, commentItem.ownerId) && l.b(this.content, commentItem.content) && this.likeCount == commentItem.likeCount && l.b(this.createdAt, commentItem.createdAt) && l.b(this.updatedAt, commentItem.updatedAt) && this.reactedByViewer == commentItem.reactedByViewer && l.b(this.name, commentItem.name) && l.b(this.avatar, commentItem.avatar) && l.b(this.gameCharacterId, commentItem.gameCharacterId);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getGameCharacterId() {
        return this.gameCharacterId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final boolean getReactedByViewer() {
        return this.reactedByViewer;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.gameCharacterId.hashCode() + a.h(a.h(o0.i(this.reactedByViewer, a.h(a.h(o0.f(this.likeCount, a.h(a.h(o0.f(this.sourceType, a.h(this.id.hashCode() * 31, 31, this.postId), 31), 31, this.ownerId), 31, this.content), 31), 31, this.createdAt), 31, this.updatedAt), 31), 31, this.name), 31, this.avatar);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.postId;
        int i6 = this.sourceType;
        String str3 = this.ownerId;
        String str4 = this.content;
        int i10 = this.likeCount;
        String str5 = this.createdAt;
        String str6 = this.updatedAt;
        boolean z2 = this.reactedByViewer;
        String str7 = this.name;
        String str8 = this.avatar;
        String str9 = this.gameCharacterId;
        StringBuilder sbJ = AbstractC1380a.j("CommentItem(id=", str, ", postId=", str2, ", sourceType=");
        AbstractC1874g.u(sbJ, i6, ", ownerId=", str3, ", content=");
        sbJ.append(str4);
        sbJ.append(", likeCount=");
        sbJ.append(i10);
        sbJ.append(", createdAt=");
        AbstractC1380a.s(sbJ, str5, ", updatedAt=", str6, ", reactedByViewer=");
        sbJ.append(z2);
        sbJ.append(", name=");
        sbJ.append(str7);
        sbJ.append(", avatar=");
        return a.s(sbJ, str8, ", gameCharacterId=", str9, ")");
    }

    public CommentItem(String str, String str2, int i6, String str3, String str4, int i10, String str5, String str6, boolean z2, String str7, String str8, String str9) {
        l.f(str, "id");
        l.f(str2, "postId");
        l.f(str3, "ownerId");
        l.f(str4, "content");
        l.f(str5, "createdAt");
        l.f(str6, "updatedAt");
        l.f(str7, "name");
        l.f(str8, "avatar");
        l.f(str9, "gameCharacterId");
        this.id = str;
        this.postId = str2;
        this.sourceType = i6;
        this.ownerId = str3;
        this.content = str4;
        this.likeCount = i10;
        this.createdAt = str5;
        this.updatedAt = str6;
        this.reactedByViewer = z2;
        this.name = str7;
        this.avatar = str8;
        this.gameCharacterId = str9;
    }

    public /* synthetic */ CommentItem(String str, String str2, int i6, String str3, String str4, int i10, String str5, String str6, boolean z2, String str7, String str8, String str9, int i11, f fVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0 : i6, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) == 0 ? z2 : false, (i11 & 512) != 0 ? "" : str7, (i11 & 1024) != 0 ? "" : str8, (i11 & 2048) != 0 ? "" : str9);
    }
}
