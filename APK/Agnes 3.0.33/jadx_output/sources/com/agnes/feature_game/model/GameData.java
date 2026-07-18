package com.agnes.feature_game.model;

import bc.u;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameData {

    @SerializedName("games")
    private final List<GameItem> games;

    @SerializedName("pagination")
    private final PaginationInfo pagination;

    /* JADX WARN: Multi-variable type inference failed */
    public GameData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameData copy$default(GameData gameData, List list, PaginationInfo paginationInfo, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = gameData.games;
        }
        if ((i6 & 2) != 0) {
            paginationInfo = gameData.pagination;
        }
        return gameData.copy(list, paginationInfo);
    }

    public final List<GameItem> component1() {
        return this.games;
    }

    public final PaginationInfo component2() {
        return this.pagination;
    }

    public final GameData copy(List<GameItem> list, PaginationInfo paginationInfo) {
        l.f(list, "games");
        return new GameData(list, paginationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameData)) {
            return false;
        }
        GameData gameData = (GameData) obj;
        return l.b(this.games, gameData.games) && l.b(this.pagination, gameData.pagination);
    }

    public final List<GameItem> getGames() {
        return this.games;
    }

    public final PaginationInfo getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        int iHashCode = this.games.hashCode() * 31;
        PaginationInfo paginationInfo = this.pagination;
        return iHashCode + (paginationInfo == null ? 0 : paginationInfo.hashCode());
    }

    public String toString() {
        return "GameData(games=" + this.games + ", pagination=" + this.pagination + ")";
    }

    public GameData(List<GameItem> list, PaginationInfo paginationInfo) {
        l.f(list, "games");
        this.games = list;
        this.pagination = paginationInfo;
    }

    public /* synthetic */ GameData(List list, PaginationInfo paginationInfo, int i6, f fVar) {
        this((i6 & 1) != 0 ? u.a : list, (i6 & 2) != 0 ? null : paginationInfo);
    }
}
