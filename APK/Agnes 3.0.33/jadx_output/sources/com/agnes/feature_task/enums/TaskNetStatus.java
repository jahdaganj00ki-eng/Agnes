package com.agnes.feature_task.enums;

import hc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TaskNetStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskNetStatus[] $VALUES;
    public static final TaskNetStatus Loading = new TaskNetStatus("Loading", 0);
    public static final TaskNetStatus Cache = new TaskNetStatus("Cache", 1);
    public static final TaskNetStatus Network = new TaskNetStatus("Network", 2);
    public static final TaskNetStatus Error = new TaskNetStatus("Error", 3);

    private static final /* synthetic */ TaskNetStatus[] $values() {
        return new TaskNetStatus[]{Loading, Cache, Network, Error};
    }

    static {
        TaskNetStatus[] taskNetStatusArr$values = $values();
        $VALUES = taskNetStatusArr$values;
        $ENTRIES = rc.a.o(taskNetStatusArr$values);
    }

    private TaskNetStatus(String str, int i6) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TaskNetStatus valueOf(String str) {
        return (TaskNetStatus) Enum.valueOf(TaskNetStatus.class, str);
    }

    public static TaskNetStatus[] values() {
        return (TaskNetStatus[]) $VALUES.clone();
    }
}
