package com.agnes.feature_game.model;

import bc.u;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PresetRepliesPayload {

    @SerializedName("is_force")
    private final boolean isForce;

    @SerializedName("tabs")
    private final List<String> tabs;

    /* JADX WARN: Illegal instructions before constructor call */
    public PresetRepliesPayload() {
        List list = null;
        this(list, false, 3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresetRepliesPayload copy$default(PresetRepliesPayload presetRepliesPayload, List list, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = presetRepliesPayload.tabs;
        }
        if ((i6 & 2) != 0) {
            z2 = presetRepliesPayload.isForce;
        }
        return presetRepliesPayload.copy(list, z2);
    }

    public final List<String> component1() {
        return this.tabs;
    }

    public final boolean component2() {
        return this.isForce;
    }

    public final PresetRepliesPayload copy(List<String> list, boolean z2) {
        l.f(list, "tabs");
        return new PresetRepliesPayload(list, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetRepliesPayload)) {
            return false;
        }
        PresetRepliesPayload presetRepliesPayload = (PresetRepliesPayload) obj;
        return l.b(this.tabs, presetRepliesPayload.tabs) && this.isForce == presetRepliesPayload.isForce;
    }

    public final List<String> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isForce) + (this.tabs.hashCode() * 31);
    }

    public final boolean isForce() {
        return this.isForce;
    }

    public String toString() {
        return "PresetRepliesPayload(tabs=" + this.tabs + ", isForce=" + this.isForce + ")";
    }

    public PresetRepliesPayload(List<String> list, boolean z2) {
        l.f(list, "tabs");
        this.tabs = list;
        this.isForce = z2;
    }

    public /* synthetic */ PresetRepliesPayload(List list, boolean z2, int i6, f fVar) {
        this((i6 & 1) != 0 ? u.a : list, (i6 & 2) != 0 ? false : z2);
    }
}
