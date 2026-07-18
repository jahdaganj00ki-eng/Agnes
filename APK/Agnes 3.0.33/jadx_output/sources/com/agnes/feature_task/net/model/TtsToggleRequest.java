package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class TtsToggleRequest {

    @SerializedName("tts_enabled")
    private final boolean ttsEnabled;

    public TtsToggleRequest(boolean z2) {
        this.ttsEnabled = z2;
    }

    public static /* synthetic */ TtsToggleRequest copy$default(TtsToggleRequest ttsToggleRequest, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z2 = ttsToggleRequest.ttsEnabled;
        }
        return ttsToggleRequest.copy(z2);
    }

    public final boolean component1() {
        return this.ttsEnabled;
    }

    public final TtsToggleRequest copy(boolean z2) {
        return new TtsToggleRequest(z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TtsToggleRequest) && this.ttsEnabled == ((TtsToggleRequest) obj).ttsEnabled;
    }

    public final boolean getTtsEnabled() {
        return this.ttsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.ttsEnabled);
    }

    public String toString() {
        return "TtsToggleRequest(ttsEnabled=" + this.ttsEnabled + ")";
    }
}
