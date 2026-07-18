package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ConversationList {

    @SerializedName("items")
    private final List<ConversationDetail> conversations;

    @SerializedName("next_page_token")
    private final String nextPageToken;

    public ConversationList(List<ConversationDetail> list, String str) {
        this.conversations = list;
        this.nextPageToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationList copy$default(ConversationList conversationList, List list, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = conversationList.conversations;
        }
        if ((i6 & 2) != 0) {
            str = conversationList.nextPageToken;
        }
        return conversationList.copy(list, str);
    }

    public final List<ConversationDetail> component1() {
        return this.conversations;
    }

    public final String component2() {
        return this.nextPageToken;
    }

    public final ConversationList copy(List<ConversationDetail> list, String str) {
        return new ConversationList(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationList)) {
            return false;
        }
        ConversationList conversationList = (ConversationList) obj;
        return l.b(this.conversations, conversationList.conversations) && l.b(this.nextPageToken, conversationList.nextPageToken);
    }

    public final List<ConversationDetail> getConversations() {
        return this.conversations;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public int hashCode() {
        List<ConversationDetail> list = this.conversations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPageToken;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ConversationList(conversations=" + this.conversations + ", nextPageToken=" + this.nextPageToken + ")";
    }
}
