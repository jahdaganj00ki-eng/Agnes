package com.agnes.feature_task.net.model;

import Db.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class AgnesMultiConversationList {

    @SerializedName("ai_avatar_url")
    private final String avatarUrl;

    @SerializedName("items")
    private final List<b> conversations;

    @SerializedName("is_latest_running")
    private final boolean isLatestRunning;

    @SerializedName("next_page_token")
    private final String nextPageToken;

    public AgnesMultiConversationList(List<b> list, String str, String str2, boolean z2) {
        this.conversations = list;
        this.nextPageToken = str;
        this.avatarUrl = str2;
        this.isLatestRunning = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgnesMultiConversationList copy$default(AgnesMultiConversationList agnesMultiConversationList, List list, String str, String str2, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = agnesMultiConversationList.conversations;
        }
        if ((i6 & 2) != 0) {
            str = agnesMultiConversationList.nextPageToken;
        }
        if ((i6 & 4) != 0) {
            str2 = agnesMultiConversationList.avatarUrl;
        }
        if ((i6 & 8) != 0) {
            z2 = agnesMultiConversationList.isLatestRunning;
        }
        return agnesMultiConversationList.copy(list, str, str2, z2);
    }

    public final List<b> component1() {
        return this.conversations;
    }

    public final String component2() {
        return this.nextPageToken;
    }

    public final String component3() {
        return this.avatarUrl;
    }

    public final boolean component4() {
        return this.isLatestRunning;
    }

    public final AgnesMultiConversationList copy(List<b> list, String str, String str2, boolean z2) {
        return new AgnesMultiConversationList(list, str, str2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgnesMultiConversationList)) {
            return false;
        }
        AgnesMultiConversationList agnesMultiConversationList = (AgnesMultiConversationList) obj;
        return l.b(this.conversations, agnesMultiConversationList.conversations) && l.b(this.nextPageToken, agnesMultiConversationList.nextPageToken) && l.b(this.avatarUrl, agnesMultiConversationList.avatarUrl) && this.isLatestRunning == agnesMultiConversationList.isLatestRunning;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final List<b> getConversations() {
        return this.conversations;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public int hashCode() {
        List<b> list = this.conversations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPageToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        return Boolean.hashCode(this.isLatestRunning) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isLatestRunning() {
        return this.isLatestRunning;
    }

    public String toString() {
        return "AgnesMultiConversationList(conversations=" + this.conversations + ", nextPageToken=" + this.nextPageToken + ", avatarUrl=" + this.avatarUrl + ", isLatestRunning=" + this.isLatestRunning + ")";
    }

    public /* synthetic */ AgnesMultiConversationList(List list, String str, String str2, boolean z2, int i6, f fVar) {
        this(list, str, str2, (i6 & 8) != 0 ? false : z2);
    }
}
