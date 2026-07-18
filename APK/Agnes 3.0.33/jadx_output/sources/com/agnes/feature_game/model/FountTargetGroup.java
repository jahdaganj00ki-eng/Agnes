package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class FountTargetGroup {

    @SerializedName("found")
    private final boolean found;

    @SerializedName("group_id")
    private final String groupId;

    /* JADX WARN: Illegal instructions before constructor call */
    public FountTargetGroup() {
        String str = null;
        this(str, false, 3, str);
    }

    public static /* synthetic */ FountTargetGroup copy$default(FountTargetGroup fountTargetGroup, String str, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = fountTargetGroup.groupId;
        }
        if ((i6 & 2) != 0) {
            z2 = fountTargetGroup.found;
        }
        return fountTargetGroup.copy(str, z2);
    }

    public final String component1() {
        return this.groupId;
    }

    public final boolean component2() {
        return this.found;
    }

    public final FountTargetGroup copy(String str, boolean z2) {
        return new FountTargetGroup(str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FountTargetGroup)) {
            return false;
        }
        FountTargetGroup fountTargetGroup = (FountTargetGroup) obj;
        return l.b(this.groupId, fountTargetGroup.groupId) && this.found == fountTargetGroup.found;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        String str = this.groupId;
        return Boolean.hashCode(this.found) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "FountTargetGroup(groupId=" + this.groupId + ", found=" + this.found + ")";
    }

    public FountTargetGroup(String str, boolean z2) {
        this.groupId = str;
        this.found = z2;
    }

    public /* synthetic */ FountTargetGroup(String str, boolean z2, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? false : z2);
    }
}
