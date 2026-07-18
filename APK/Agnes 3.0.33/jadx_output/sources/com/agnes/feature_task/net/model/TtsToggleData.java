package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TtsToggleData {

    @SerializedName("show_tts_speaker")
    private final Boolean showTtsSpeaker;

    @SerializedName("tts_enabled")
    private final Boolean ttsEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    public TtsToggleData() {
        Boolean bool = null;
        this(bool, bool, 3, bool);
    }

    public static /* synthetic */ TtsToggleData copy$default(TtsToggleData ttsToggleData, Boolean bool, Boolean bool2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bool = ttsToggleData.showTtsSpeaker;
        }
        if ((i6 & 2) != 0) {
            bool2 = ttsToggleData.ttsEnabled;
        }
        return ttsToggleData.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.showTtsSpeaker;
    }

    public final Boolean component2() {
        return this.ttsEnabled;
    }

    public final TtsToggleData copy(Boolean bool, Boolean bool2) {
        return new TtsToggleData(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsToggleData)) {
            return false;
        }
        TtsToggleData ttsToggleData = (TtsToggleData) obj;
        return l.b(this.showTtsSpeaker, ttsToggleData.showTtsSpeaker) && l.b(this.ttsEnabled, ttsToggleData.ttsEnabled);
    }

    public final Boolean getShowTtsSpeaker() {
        return this.showTtsSpeaker;
    }

    public final Boolean getTtsEnabled() {
        return this.ttsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.showTtsSpeaker;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.ttsEnabled;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "TtsToggleData(showTtsSpeaker=" + this.showTtsSpeaker + ", ttsEnabled=" + this.ttsEnabled + ")";
    }

    public TtsToggleData(Boolean bool, Boolean bool2) {
        this.showTtsSpeaker = bool;
        this.ttsEnabled = bool2;
    }

    public /* synthetic */ TtsToggleData(Boolean bool, Boolean bool2, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : bool, (i6 & 2) != 0 ? null : bool2);
    }
}
