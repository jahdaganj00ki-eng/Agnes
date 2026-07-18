package com.agnes.feature_task.enums;

import com.google.gson.annotations.SerializedName;
import hc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TaskRunningStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskRunningStatus[] $VALUES;

    @SerializedName("running")
    public static final TaskRunningStatus Running = new TaskRunningStatus("Running", 0);

    @SerializedName("completed")
    public static final TaskRunningStatus Completed = new TaskRunningStatus("Completed", 1);

    @SerializedName("failed")
    public static final TaskRunningStatus Failed = new TaskRunningStatus("Failed", 2);

    private static final /* synthetic */ TaskRunningStatus[] $values() {
        return new TaskRunningStatus[]{Running, Completed, Failed};
    }

    static {
        TaskRunningStatus[] taskRunningStatusArr$values = $values();
        $VALUES = taskRunningStatusArr$values;
        $ENTRIES = rc.a.o(taskRunningStatusArr$values);
    }

    private TaskRunningStatus(String str, int i6) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TaskRunningStatus valueOf(String str) {
        return (TaskRunningStatus) Enum.valueOf(TaskRunningStatus.class, str);
    }

    public static TaskRunningStatus[] values() {
        return (TaskRunningStatus[]) $VALUES.clone();
    }
}
