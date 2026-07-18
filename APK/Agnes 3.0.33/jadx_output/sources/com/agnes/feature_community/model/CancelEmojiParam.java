package com.agnes.feature_community.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CancelEmojiParam {

    @SerializedName("emoji_key")
    private final String emoji_key;

    @SerializedName("post_id")
    private final long post_id;

    public CancelEmojiParam(String str, long j4) {
        l.f(str, "emoji_key");
        this.emoji_key = str;
        this.post_id = j4;
    }

    public static /* synthetic */ CancelEmojiParam copy$default(CancelEmojiParam cancelEmojiParam, String str, long j4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = cancelEmojiParam.emoji_key;
        }
        if ((i6 & 2) != 0) {
            j4 = cancelEmojiParam.post_id;
        }
        return cancelEmojiParam.copy(str, j4);
    }

    public final String component1() {
        return this.emoji_key;
    }

    public final long component2() {
        return this.post_id;
    }

    public final CancelEmojiParam copy(String str, long j4) {
        l.f(str, "emoji_key");
        return new CancelEmojiParam(str, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelEmojiParam)) {
            return false;
        }
        CancelEmojiParam cancelEmojiParam = (CancelEmojiParam) obj;
        return l.b(this.emoji_key, cancelEmojiParam.emoji_key) && this.post_id == cancelEmojiParam.post_id;
    }

    public final String getEmoji_key() {
        return this.emoji_key;
    }

    public final long getPost_id() {
        return this.post_id;
    }

    public int hashCode() {
        return Long.hashCode(this.post_id) + (this.emoji_key.hashCode() * 31);
    }

    public String toString() {
        return "CancelEmojiParam(emoji_key=" + this.emoji_key + ", post_id=" + this.post_id + ")";
    }
}
