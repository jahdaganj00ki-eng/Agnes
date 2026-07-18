package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ConversationHistory {

    @SerializedName("items")
    private final List<ConversationDetail> conversations;

    @SerializedName("next_page_token")
    private final String nextPageToken;

    public ConversationHistory(List<ConversationDetail> list, String str) {
        this.conversations = list;
        this.nextPageToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationHistory copy$default(ConversationHistory conversationHistory, List list, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = conversationHistory.conversations;
        }
        if ((i6 & 2) != 0) {
            str = conversationHistory.nextPageToken;
        }
        return conversationHistory.copy(list, str);
    }

    public final List<ConversationDetail> component1() {
        return this.conversations;
    }

    public final String component2() {
        return this.nextPageToken;
    }

    public final ConversationHistory copy(List<ConversationDetail> list, String str) {
        return new ConversationHistory(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationHistory)) {
            return false;
        }
        ConversationHistory conversationHistory = (ConversationHistory) obj;
        return l.b(this.conversations, conversationHistory.conversations) && l.b(this.nextPageToken, conversationHistory.nextPageToken);
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
        return "ConversationHistory(conversations=" + this.conversations + ", nextPageToken=" + this.nextPageToken + ")";
    }
}
