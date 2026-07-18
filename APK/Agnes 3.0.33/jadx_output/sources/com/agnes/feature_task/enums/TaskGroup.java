package com.agnes.feature_task.enums;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class TaskGroup {
    public static final Companion Companion = new Companion(null);

    public static final class AssistantTaskGroup extends TaskGroup {
        public static final AssistantTaskGroup INSTANCE = new AssistantTaskGroup();

        private AssistantTaskGroup() {
            super(null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final TaskGroup forToolCall(ToolCallEnum toolCallEnum) {
            l.f(toolCallEnum, "toolName");
            if (toolCallEnum == ToolCallEnum.QueryWeather) {
                return AssistantTaskGroup.INSTANCE;
            }
            return new ThinkingTaskGroup(false, 0.0d, 3, null);
        }

        public final TaskGroup forUserMessage(boolean z2) {
            return z2 ? UserTaskGroup.INSTANCE : AssistantTaskGroup.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class OtherTaskGroup extends TaskGroup {
        public static final OtherTaskGroup INSTANCE = new OtherTaskGroup();

        private OtherTaskGroup() {
            super(null);
        }
    }

    public static final class StandaloneTaskGroup extends TaskGroup {
        public static final StandaloneTaskGroup INSTANCE = new StandaloneTaskGroup();

        private StandaloneTaskGroup() {
            super(null);
        }
    }

    public static final class ThinkingTaskGroup extends TaskGroup {
        private final boolean groupDone;
        private final double groupSeconds;

        public ThinkingTaskGroup() {
            this(false, 0.0d, 3, null);
        }

        public static /* synthetic */ ThinkingTaskGroup copy$default(ThinkingTaskGroup thinkingTaskGroup, boolean z2, double d5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                z2 = thinkingTaskGroup.groupDone;
            }
            if ((i6 & 2) != 0) {
                d5 = thinkingTaskGroup.groupSeconds;
            }
            return thinkingTaskGroup.copy(z2, d5);
        }

        public final boolean component1() {
            return this.groupDone;
        }

        public final double component2() {
            return this.groupSeconds;
        }

        public final ThinkingTaskGroup copy(boolean z2, double d5) {
            return new ThinkingTaskGroup(z2, d5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThinkingTaskGroup)) {
                return false;
            }
            ThinkingTaskGroup thinkingTaskGroup = (ThinkingTaskGroup) obj;
            return this.groupDone == thinkingTaskGroup.groupDone && Double.compare(this.groupSeconds, thinkingTaskGroup.groupSeconds) == 0;
        }

        public final boolean getGroupDone() {
            return this.groupDone;
        }

        public final double getGroupSeconds() {
            return this.groupSeconds;
        }

        public int hashCode() {
            return Double.hashCode(this.groupSeconds) + (Boolean.hashCode(this.groupDone) * 31);
        }

        public String toString() {
            return "ThinkingTaskGroup(groupDone=" + this.groupDone + ", groupSeconds=" + this.groupSeconds + ")";
        }

        public /* synthetic */ ThinkingTaskGroup(boolean z2, double d5, int i6, f fVar) {
            this((i6 & 1) != 0 ? false : z2, (i6 & 2) != 0 ? 0.0d : d5);
        }

        public ThinkingTaskGroup(boolean z2, double d5) {
            super(null);
            this.groupDone = z2;
            this.groupSeconds = d5;
        }
    }

    public static final class UserTaskGroup extends TaskGroup {
        public static final UserTaskGroup INSTANCE = new UserTaskGroup();

        private UserTaskGroup() {
            super(null);
        }
    }

    public /* synthetic */ TaskGroup(f fVar) {
        this();
    }

    private TaskGroup() {
    }
}
