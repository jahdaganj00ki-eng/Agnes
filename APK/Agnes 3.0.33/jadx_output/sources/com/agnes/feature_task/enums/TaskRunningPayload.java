package com.agnes.feature_task.enums;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TaskRunningPayload {

    @SerializedName("retryCount")
    private int retryCount;

    @SerializedName("retryEnabled")
    private Boolean retryEnabled;

    @SerializedName("status")
    private final TaskRunningStatus status;

    public TaskRunningPayload() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ TaskRunningPayload copy$default(TaskRunningPayload taskRunningPayload, TaskRunningStatus taskRunningStatus, int i6, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            taskRunningStatus = taskRunningPayload.status;
        }
        if ((i10 & 2) != 0) {
            i6 = taskRunningPayload.retryCount;
        }
        if ((i10 & 4) != 0) {
            bool = taskRunningPayload.retryEnabled;
        }
        return taskRunningPayload.copy(taskRunningStatus, i6, bool);
    }

    public final TaskRunningStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.retryCount;
    }

    public final Boolean component3() {
        return this.retryEnabled;
    }

    public final TaskRunningPayload copy(TaskRunningStatus taskRunningStatus, int i6, Boolean bool) {
        l.f(taskRunningStatus, "status");
        return new TaskRunningPayload(taskRunningStatus, i6, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskRunningPayload)) {
            return false;
        }
        TaskRunningPayload taskRunningPayload = (TaskRunningPayload) obj;
        return this.status == taskRunningPayload.status && this.retryCount == taskRunningPayload.retryCount && l.b(this.retryEnabled, taskRunningPayload.retryEnabled);
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final Boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    public final TaskRunningStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iF = o0.f(this.retryCount, this.status.hashCode() * 31, 31);
        Boolean bool = this.retryEnabled;
        return iF + (bool == null ? 0 : bool.hashCode());
    }

    public final void setRetryCount(int i6) {
        this.retryCount = i6;
    }

    public final void setRetryEnabled(Boolean bool) {
        this.retryEnabled = bool;
    }

    public String toString() {
        return "TaskRunningPayload(status=" + this.status + ", retryCount=" + this.retryCount + ", retryEnabled=" + this.retryEnabled + ")";
    }

    public TaskRunningPayload(TaskRunningStatus taskRunningStatus, int i6, Boolean bool) {
        l.f(taskRunningStatus, "status");
        this.status = taskRunningStatus;
        this.retryCount = i6;
        this.retryEnabled = bool;
    }

    public /* synthetic */ TaskRunningPayload(TaskRunningStatus taskRunningStatus, int i6, Boolean bool, int i10, f fVar) {
        this((i10 & 1) != 0 ? TaskRunningStatus.Completed : taskRunningStatus, (i10 & 2) != 0 ? 0 : i6, (i10 & 4) != 0 ? Boolean.TRUE : bool);
    }
}
