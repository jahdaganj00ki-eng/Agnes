package com.agnes.feature_task.net.model;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ResponseKt {
    public static final boolean isCancelled(ConversationStatus conversationStatus) {
        l.f(conversationStatus, "<this>");
        return conversationStatus == ConversationStatus.CANCELLED;
    }

    public static final boolean isCompleted(ConversationStatus conversationStatus) {
        l.f(conversationStatus, "<this>");
        return conversationStatus == ConversationStatus.COMPLETED;
    }
}
