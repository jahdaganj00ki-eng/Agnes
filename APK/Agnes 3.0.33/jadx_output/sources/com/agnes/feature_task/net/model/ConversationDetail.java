package com.agnes.feature_task.net.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ConversationDetail {

    @SerializedName("avatar_bg")
    private final String avatarBg;

    @SerializedName(alternate = {"conversation_id"}, value = "id")
    private final String conversationId;

    @SerializedName("created_at")
    private final Long createdAt;

    @SerializedName("is_favorite")
    private Boolean isFavorite;

    @SerializedName("status")
    private final String status;

    @SerializedName("summary_preview")
    private final String summary;

    @SerializedName("title")
    private String title;

    @SerializedName("updated_at")
    private Long updatedAt;

    public ConversationDetail() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ConversationDetail copy$default(ConversationDetail conversationDetail, String str, String str2, String str3, Boolean bool, Long l2, Long l3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = conversationDetail.conversationId;
        }
        if ((i6 & 2) != 0) {
            str2 = conversationDetail.title;
        }
        if ((i6 & 4) != 0) {
            str3 = conversationDetail.summary;
        }
        if ((i6 & 8) != 0) {
            bool = conversationDetail.isFavorite;
        }
        if ((i6 & 16) != 0) {
            l2 = conversationDetail.createdAt;
        }
        if ((i6 & 32) != 0) {
            l3 = conversationDetail.updatedAt;
        }
        if ((i6 & 64) != 0) {
            str4 = conversationDetail.status;
        }
        if ((i6 & 128) != 0) {
            str5 = conversationDetail.avatarBg;
        }
        String str6 = str4;
        String str7 = str5;
        Long l10 = l2;
        Long l11 = l3;
        return conversationDetail.copy(str, str2, str3, bool, l10, l11, str6, str7);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final Boolean component4() {
        return this.isFavorite;
    }

    public final Long component5() {
        return this.createdAt;
    }

    public final Long component6() {
        return this.updatedAt;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.avatarBg;
    }

    public final ConversationDetail copy(String str, String str2, String str3, Boolean bool, Long l2, Long l3, String str4, String str5) {
        return new ConversationDetail(str, str2, str3, bool, l2, l3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationDetail)) {
            return false;
        }
        ConversationDetail conversationDetail = (ConversationDetail) obj;
        return l.b(this.conversationId, conversationDetail.conversationId) && l.b(this.title, conversationDetail.title) && l.b(this.summary, conversationDetail.summary) && l.b(this.isFavorite, conversationDetail.isFavorite) && l.b(this.createdAt, conversationDetail.createdAt) && l.b(this.updatedAt, conversationDetail.updatedAt) && l.b(this.status, conversationDetail.status) && l.b(this.avatarBg, conversationDetail.avatarBg);
    }

    public final String getAvatarBg() {
        return this.avatarBg;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.conversationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.summary;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updatedAt;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatarBg;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(Boolean bool) {
        this.isFavorite = bool;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUpdatedAt(Long l2) {
        this.updatedAt = l2;
    }

    public String toString() {
        String str = this.conversationId;
        String str2 = this.title;
        String str3 = this.summary;
        Boolean bool = this.isFavorite;
        Long l2 = this.createdAt;
        Long l3 = this.updatedAt;
        String str4 = this.status;
        String str5 = this.avatarBg;
        StringBuilder sbJ = AbstractC1380a.j("ConversationDetail(conversationId=", str, ", title=", str2, ", summary=");
        sbJ.append(str3);
        sbJ.append(", isFavorite=");
        sbJ.append(bool);
        sbJ.append(", createdAt=");
        sbJ.append(l2);
        sbJ.append(", updatedAt=");
        sbJ.append(l3);
        sbJ.append(", status=");
        return a.s(sbJ, str4, ", avatarBg=", str5, ")");
    }

    public ConversationDetail(String str, String str2, String str3, Boolean bool, Long l2, Long l3, String str4, String str5) {
        this.conversationId = str;
        this.title = str2;
        this.summary = str3;
        this.isFavorite = bool;
        this.createdAt = l2;
        this.updatedAt = l3;
        this.status = str4;
        this.avatarBg = str5;
    }

    public /* synthetic */ ConversationDetail(String str, String str2, String str3, Boolean bool, Long l2, Long l3, String str4, String str5, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : bool, (i6 & 16) != 0 ? null : l2, (i6 & 32) != 0 ? null : l3, (i6 & 64) != 0 ? null : str4, (i6 & 128) != 0 ? null : str5);
    }
}
