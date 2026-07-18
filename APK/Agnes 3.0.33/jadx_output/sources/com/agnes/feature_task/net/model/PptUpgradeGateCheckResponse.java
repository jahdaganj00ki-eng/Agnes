package com.agnes.feature_task.net.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class PptUpgradeGateCheckResponse {

    @SerializedName("continue_conversation")
    private final boolean continueConversation;

    @SerializedName("keep_card")
    private final boolean keepCard;

    /* JADX WARN: Illegal instructions before constructor call */
    public PptUpgradeGateCheckResponse() {
        boolean z2 = false;
        this(z2, z2, 3, null);
    }

    public static /* synthetic */ PptUpgradeGateCheckResponse copy$default(PptUpgradeGateCheckResponse pptUpgradeGateCheckResponse, boolean z2, boolean z7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z2 = pptUpgradeGateCheckResponse.keepCard;
        }
        if ((i6 & 2) != 0) {
            z7 = pptUpgradeGateCheckResponse.continueConversation;
        }
        return pptUpgradeGateCheckResponse.copy(z2, z7);
    }

    public final boolean component1() {
        return this.keepCard;
    }

    public final boolean component2() {
        return this.continueConversation;
    }

    public final PptUpgradeGateCheckResponse copy(boolean z2, boolean z7) {
        return new PptUpgradeGateCheckResponse(z2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PptUpgradeGateCheckResponse)) {
            return false;
        }
        PptUpgradeGateCheckResponse pptUpgradeGateCheckResponse = (PptUpgradeGateCheckResponse) obj;
        return this.keepCard == pptUpgradeGateCheckResponse.keepCard && this.continueConversation == pptUpgradeGateCheckResponse.continueConversation;
    }

    public final boolean getContinueConversation() {
        return this.continueConversation;
    }

    public final boolean getKeepCard() {
        return this.keepCard;
    }

    public int hashCode() {
        return Boolean.hashCode(this.continueConversation) + (Boolean.hashCode(this.keepCard) * 31);
    }

    public String toString() {
        return "PptUpgradeGateCheckResponse(keepCard=" + this.keepCard + ", continueConversation=" + this.continueConversation + ")";
    }

    public PptUpgradeGateCheckResponse(boolean z2, boolean z7) {
        this.keepCard = z2;
        this.continueConversation = z7;
    }

    public /* synthetic */ PptUpgradeGateCheckResponse(boolean z2, boolean z7, int i6, f fVar) {
        this((i6 & 1) != 0 ? true : z2, (i6 & 2) != 0 ? false : z7);
    }
}
