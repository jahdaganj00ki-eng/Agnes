package com.agnes.feature_game.model;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameListResponseKt {
    public static final GameIntroParams toIntroParams(GameItem gameItem) {
        l.f(gameItem, "<this>");
        return new GameIntroParams(gameItem.getName(), gameItem.getDescription(), gameItem.getBackgroundImageUrl(), gameItem.getBgmUrl(), gameItem.getOpeningAnimationUrl(), gameItem.getGameIntroTts());
    }
}
