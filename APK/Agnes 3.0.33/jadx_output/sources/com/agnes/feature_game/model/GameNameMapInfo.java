package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameNameMapInfo {

    @SerializedName("game_name_map")
    private final Map<String, String> gameNameMap;

    public GameNameMapInfo(Map<String, String> map) {
        l.f(map, "gameNameMap");
        this.gameNameMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameNameMapInfo copy$default(GameNameMapInfo gameNameMapInfo, Map map, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            map = gameNameMapInfo.gameNameMap;
        }
        return gameNameMapInfo.copy(map);
    }

    public final Map<String, String> component1() {
        return this.gameNameMap;
    }

    public final GameNameMapInfo copy(Map<String, String> map) {
        l.f(map, "gameNameMap");
        return new GameNameMapInfo(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameNameMapInfo) && l.b(this.gameNameMap, ((GameNameMapInfo) obj).gameNameMap);
    }

    public final Map<String, String> getGameNameMap() {
        return this.gameNameMap;
    }

    public int hashCode() {
        return this.gameNameMap.hashCode();
    }

    public String toString() {
        return "GameNameMapInfo(gameNameMap=" + this.gameNameMap + ")";
    }
}
