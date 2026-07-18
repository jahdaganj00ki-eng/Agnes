package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameGroupDetailData {

    @SerializedName("group")
    private final GameGroupInfo group;

    public GameGroupDetailData(GameGroupInfo gameGroupInfo) {
        l.f(gameGroupInfo, "group");
        this.group = gameGroupInfo;
    }

    public static /* synthetic */ GameGroupDetailData copy$default(GameGroupDetailData gameGroupDetailData, GameGroupInfo gameGroupInfo, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gameGroupInfo = gameGroupDetailData.group;
        }
        return gameGroupDetailData.copy(gameGroupInfo);
    }

    public final GameGroupInfo component1() {
        return this.group;
    }

    public final GameGroupDetailData copy(GameGroupInfo gameGroupInfo) {
        l.f(gameGroupInfo, "group");
        return new GameGroupDetailData(gameGroupInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameGroupDetailData) && l.b(this.group, ((GameGroupDetailData) obj).group);
    }

    public final GameGroupInfo getGroup() {
        return this.group;
    }

    public int hashCode() {
        return this.group.hashCode();
    }

    public String toString() {
        return "GameGroupDetailData(group=" + this.group + ")";
    }
}
