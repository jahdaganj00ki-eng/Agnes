package com.agnes.feature_game.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CreateNewGroupRequest {

    @SerializedName("game_id")
    private final String gameId;

    @SerializedName("is_user_profile")
    private final boolean isUserProfile;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateNewGroupRequest() {
        String str = null;
        this(str, false, 3, str);
    }

    public static /* synthetic */ CreateNewGroupRequest copy$default(CreateNewGroupRequest createNewGroupRequest, String str, boolean z2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = createNewGroupRequest.gameId;
        }
        if ((i6 & 2) != 0) {
            z2 = createNewGroupRequest.isUserProfile;
        }
        return createNewGroupRequest.copy(str, z2);
    }

    public final String component1() {
        return this.gameId;
    }

    public final boolean component2() {
        return this.isUserProfile;
    }

    public final CreateNewGroupRequest copy(String str, boolean z2) {
        return new CreateNewGroupRequest(str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateNewGroupRequest)) {
            return false;
        }
        CreateNewGroupRequest createNewGroupRequest = (CreateNewGroupRequest) obj;
        return l.b(this.gameId, createNewGroupRequest.gameId) && this.isUserProfile == createNewGroupRequest.isUserProfile;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public int hashCode() {
        String str = this.gameId;
        return Boolean.hashCode(this.isUserProfile) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final boolean isUserProfile() {
        return this.isUserProfile;
    }

    public String toString() {
        return "CreateNewGroupRequest(gameId=" + this.gameId + ", isUserProfile=" + this.isUserProfile + ")";
    }

    public CreateNewGroupRequest(String str, boolean z2) {
        this.gameId = str;
        this.isUserProfile = z2;
    }

    public /* synthetic */ CreateNewGroupRequest(String str, boolean z2, int i6, f fVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? false : z2);
    }
}
