package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ChatResumeStreamRequestBody {

    @SerializedName("conversation_id")
    private final String conversationId;

    @SerializedName("from_seq")
    private final Integer seq;

    public ChatResumeStreamRequestBody(String str, Integer num) {
        l.f(str, "conversationId");
        this.conversationId = str;
        this.seq = num;
    }

    public static /* synthetic */ ChatResumeStreamRequestBody copy$default(ChatResumeStreamRequestBody chatResumeStreamRequestBody, String str, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = chatResumeStreamRequestBody.conversationId;
        }
        if ((i6 & 2) != 0) {
            num = chatResumeStreamRequestBody.seq;
        }
        return chatResumeStreamRequestBody.copy(str, num);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final Integer component2() {
        return this.seq;
    }

    public final ChatResumeStreamRequestBody copy(String str, Integer num) {
        l.f(str, "conversationId");
        return new ChatResumeStreamRequestBody(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatResumeStreamRequestBody)) {
            return false;
        }
        ChatResumeStreamRequestBody chatResumeStreamRequestBody = (ChatResumeStreamRequestBody) obj;
        return l.b(this.conversationId, chatResumeStreamRequestBody.conversationId) && l.b(this.seq, chatResumeStreamRequestBody.seq);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Integer getSeq() {
        return this.seq;
    }

    public int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        Integer num = this.seq;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ChatResumeStreamRequestBody(conversationId=" + this.conversationId + ", seq=" + this.seq + ")";
    }
}
