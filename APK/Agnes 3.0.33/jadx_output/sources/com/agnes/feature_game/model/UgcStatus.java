package com.agnes.feature_game.model;

import hc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class UgcStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UgcStatus[] $VALUES;
    private final String value;
    public static final UgcStatus UNDER_REVIEW = new UgcStatus("UNDER_REVIEW", 0, "under_review");
    public static final UgcStatus READY = new UgcStatus("READY", 1, "ready");
    public static final UgcStatus REJECTED = new UgcStatus("REJECTED", 2, "rejected");
    public static final UgcStatus ERROR = new UgcStatus("ERROR", 3, "error");
    public static final UgcStatus NONE = new UgcStatus("NONE", 4, "none");

    private static final /* synthetic */ UgcStatus[] $values() {
        return new UgcStatus[]{UNDER_REVIEW, READY, REJECTED, ERROR, NONE};
    }

    static {
        UgcStatus[] ugcStatusArr$values = $values();
        $VALUES = ugcStatusArr$values;
        $ENTRIES = rc.a.o(ugcStatusArr$values);
    }

    private UgcStatus(String str, int i6, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static UgcStatus valueOf(String str) {
        return (UgcStatus) Enum.valueOf(UgcStatus.class, str);
    }

    public static UgcStatus[] values() {
        return (UgcStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
