package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameHelpAnswerData {

    @SerializedName("reason")
    private final String reason;

    @SerializedName("replies")
    private final List<String> replies;

    /* JADX WARN: Multi-variable type inference failed */
    public GameHelpAnswerData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameHelpAnswerData copy$default(GameHelpAnswerData gameHelpAnswerData, List list, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = gameHelpAnswerData.replies;
        }
        if ((i6 & 2) != 0) {
            str = gameHelpAnswerData.reason;
        }
        return gameHelpAnswerData.copy(list, str);
    }

    public final List<String> component1() {
        return this.replies;
    }

    public final String component2() {
        return this.reason;
    }

    public final GameHelpAnswerData copy(List<String> list, String str) {
        return new GameHelpAnswerData(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameHelpAnswerData)) {
            return false;
        }
        GameHelpAnswerData gameHelpAnswerData = (GameHelpAnswerData) obj;
        return l.b(this.replies, gameHelpAnswerData.replies) && l.b(this.reason, gameHelpAnswerData.reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public final List<String> getReplies() {
        return this.replies;
    }

    public int hashCode() {
        List<String> list = this.replies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.reason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GameHelpAnswerData(replies=" + this.replies + ", reason=" + this.reason + ")";
    }

    public GameHelpAnswerData(List<String> list, String str) {
        this.replies = list;
        this.reason = str;
    }

    public /* synthetic */ GameHelpAnswerData(List list, String str, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : list, (i6 & 2) != 0 ? null : str);
    }
}
