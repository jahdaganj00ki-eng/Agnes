package com.agnes.feature_task.net.model;

import hc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ConversationStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConversationStatus[] $VALUES;
    public static final ConversationStatus RUNNING = new ConversationStatus("RUNNING", 0);
    public static final ConversationStatus COMPLETED = new ConversationStatus("COMPLETED", 1);
    public static final ConversationStatus CANCELLED = new ConversationStatus("CANCELLED", 2);

    private static final /* synthetic */ ConversationStatus[] $values() {
        return new ConversationStatus[]{RUNNING, COMPLETED, CANCELLED};
    }

    static {
        ConversationStatus[] conversationStatusArr$values = $values();
        $VALUES = conversationStatusArr$values;
        $ENTRIES = rc.a.o(conversationStatusArr$values);
    }

    private ConversationStatus(String str, int i6) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConversationStatus valueOf(String str) {
        return (ConversationStatus) Enum.valueOf(ConversationStatus.class, str);
    }

    public static ConversationStatus[] values() {
        return (ConversationStatus[]) $VALUES.clone();
    }
}
