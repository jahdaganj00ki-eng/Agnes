package com.agnes.feature_game.model;

import hc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class UgcRejectReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UgcRejectReason[] $VALUES;
    public static final UgcRejectReason character_name = new UgcRejectReason("character_name", 0);
    public static final UgcRejectReason image_gen_prompt = new UgcRejectReason("image_gen_prompt", 1);
    public static final UgcRejectReason input_char_intro = new UgcRejectReason("input_char_intro", 2);
    public static final UgcRejectReason first_message = new UgcRejectReason("first_message", 3);
    public static final UgcRejectReason avatar_url = new UgcRejectReason("avatar_url", 4);
    public static final UgcRejectReason profile_image = new UgcRejectReason("profile_image", 5);
    public static final UgcRejectReason upload_image = new UgcRejectReason("upload_image", 6);

    private static final /* synthetic */ UgcRejectReason[] $values() {
        return new UgcRejectReason[]{character_name, image_gen_prompt, input_char_intro, first_message, avatar_url, profile_image, upload_image};
    }

    static {
        UgcRejectReason[] ugcRejectReasonArr$values = $values();
        $VALUES = ugcRejectReasonArr$values;
        $ENTRIES = rc.a.o(ugcRejectReasonArr$values);
    }

    private UgcRejectReason(String str, int i6) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static UgcRejectReason valueOf(String str) {
        return (UgcRejectReason) Enum.valueOf(UgcRejectReason.class, str);
    }

    public static UgcRejectReason[] values() {
        return (UgcRejectReason[]) $VALUES.clone();
    }
}
