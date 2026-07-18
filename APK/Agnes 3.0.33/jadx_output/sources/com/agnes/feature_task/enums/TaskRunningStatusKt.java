package com.agnes.feature_task.enums;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TaskRunningStatusKt {
    public static final boolean canRetry(TaskRunningPayload taskRunningPayload, int i6) {
        l.f(taskRunningPayload, "<this>");
        return !l.b(taskRunningPayload.getRetryEnabled(), Boolean.FALSE) && taskRunningPayload.getRetryCount() < i6;
    }

    public static /* synthetic */ boolean canRetry$default(TaskRunningPayload taskRunningPayload, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 3;
        }
        return canRetry(taskRunningPayload, i6);
    }
}
