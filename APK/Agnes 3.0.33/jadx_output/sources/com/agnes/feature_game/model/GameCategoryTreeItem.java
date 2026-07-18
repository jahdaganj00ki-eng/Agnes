package com.agnes.feature_game.model;

import bc.u;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameCategoryTreeItem {

    @SerializedName("category")
    private final GameCategoryTreeCategoryItem category;

    @SerializedName("tags")
    private final List<GameCategoryTreeTagItem> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public GameCategoryTreeItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameCategoryTreeItem copy$default(GameCategoryTreeItem gameCategoryTreeItem, GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gameCategoryTreeCategoryItem = gameCategoryTreeItem.category;
        }
        if ((i6 & 2) != 0) {
            list = gameCategoryTreeItem.tags;
        }
        return gameCategoryTreeItem.copy(gameCategoryTreeCategoryItem, list);
    }

    public final GameCategoryTreeCategoryItem component1() {
        return this.category;
    }

    public final List<GameCategoryTreeTagItem> component2() {
        return this.tags;
    }

    public final GameCategoryTreeItem copy(GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem, List<GameCategoryTreeTagItem> list) {
        l.f(list, "tags");
        return new GameCategoryTreeItem(gameCategoryTreeCategoryItem, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCategoryTreeItem)) {
            return false;
        }
        GameCategoryTreeItem gameCategoryTreeItem = (GameCategoryTreeItem) obj;
        return l.b(this.category, gameCategoryTreeItem.category) && l.b(this.tags, gameCategoryTreeItem.tags);
    }

    public final GameCategoryTreeCategoryItem getCategory() {
        return this.category;
    }

    public final List<GameCategoryTreeTagItem> getTags() {
        return this.tags;
    }

    public int hashCode() {
        GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem = this.category;
        return this.tags.hashCode() + ((gameCategoryTreeCategoryItem == null ? 0 : gameCategoryTreeCategoryItem.hashCode()) * 31);
    }

    public String toString() {
        return "GameCategoryTreeItem(category=" + this.category + ", tags=" + this.tags + ")";
    }

    public GameCategoryTreeItem(GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem, List<GameCategoryTreeTagItem> list) {
        l.f(list, "tags");
        this.category = gameCategoryTreeCategoryItem;
        this.tags = list;
    }

    public /* synthetic */ GameCategoryTreeItem(GameCategoryTreeCategoryItem gameCategoryTreeCategoryItem, List list, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : gameCategoryTreeCategoryItem, (i6 & 2) != 0 ? u.a : list);
    }
}
