package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class VoiceTtsData {

    @SerializedName("duration")
    private final double duration;

    @SerializedName("uri")
    private final String uri;

    public VoiceTtsData() {
        this(null, 0.0d, 3, null);
    }

    public static /* synthetic */ VoiceTtsData copy$default(VoiceTtsData voiceTtsData, String str, double d5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = voiceTtsData.uri;
        }
        if ((i6 & 2) != 0) {
            d5 = voiceTtsData.duration;
        }
        return voiceTtsData.copy(str, d5);
    }

    public final String component1() {
        return this.uri;
    }

    public final double component2() {
        return this.duration;
    }

    public final VoiceTtsData copy(String str, double d5) {
        l.f(str, "uri");
        return new VoiceTtsData(str, d5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceTtsData)) {
            return false;
        }
        VoiceTtsData voiceTtsData = (VoiceTtsData) obj;
        return l.b(this.uri, voiceTtsData.uri) && Double.compare(this.duration, voiceTtsData.duration) == 0;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Double.hashCode(this.duration) + (this.uri.hashCode() * 31);
    }

    public String toString() {
        return "VoiceTtsData(uri=" + this.uri + ", duration=" + this.duration + ")";
    }

    public VoiceTtsData(String str, double d5) {
        l.f(str, "uri");
        this.uri = str;
        this.duration = d5;
    }

    public /* synthetic */ VoiceTtsData(String str, double d5, int i6, f fVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0.0d : d5);
    }
}
