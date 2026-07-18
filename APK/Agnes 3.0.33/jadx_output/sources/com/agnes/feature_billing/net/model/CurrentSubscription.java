package com.agnes.feature_billing.net.model;

import T0.a;
import b4.AbstractC1380a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o8.o0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CurrentSubscription {
    public static final Companion Companion = new Companion(null);
    private static final CurrentSubscription EMPTY = new CurrentSubscription(null, null, 0.0d, null, 0, 0.0d, 63, null);

    @SerializedName("duration")
    private final double duration;

    @SerializedName("expires_at")
    private final long expiresAt;

    @SerializedName("level")
    private final double level;

    @SerializedName("level_name")
    private final String levelName;

    @SerializedName("platform_product_id")
    private final String platformProductId;

    @SerializedName("product_id")
    private final String productId;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final CurrentSubscription getEMPTY() {
            return CurrentSubscription.EMPTY;
        }

        private Companion() {
        }
    }

    public CurrentSubscription() {
        this(null, null, 0.0d, null, 0L, 0.0d, 63, null);
    }

    public static /* synthetic */ CurrentSubscription copy$default(CurrentSubscription currentSubscription, String str, String str2, double d5, String str3, long j4, double d10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = currentSubscription.productId;
        }
        if ((i6 & 2) != 0) {
            str2 = currentSubscription.platformProductId;
        }
        if ((i6 & 4) != 0) {
            d5 = currentSubscription.level;
        }
        if ((i6 & 8) != 0) {
            str3 = currentSubscription.levelName;
        }
        if ((i6 & 16) != 0) {
            j4 = currentSubscription.expiresAt;
        }
        if ((i6 & 32) != 0) {
            d10 = currentSubscription.duration;
        }
        String str4 = str3;
        double d11 = d5;
        return currentSubscription.copy(str, str2, d11, str4, j4, d10);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.platformProductId;
    }

    public final double component3() {
        return this.level;
    }

    public final String component4() {
        return this.levelName;
    }

    public final long component5() {
        return this.expiresAt;
    }

    public final double component6() {
        return this.duration;
    }

    public final CurrentSubscription copy(String str, String str2, double d5, String str3, long j4, double d10) {
        l.f(str, "productId");
        l.f(str2, "platformProductId");
        l.f(str3, "levelName");
        return new CurrentSubscription(str, str2, d5, str3, j4, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentSubscription)) {
            return false;
        }
        CurrentSubscription currentSubscription = (CurrentSubscription) obj;
        return l.b(this.productId, currentSubscription.productId) && l.b(this.platformProductId, currentSubscription.platformProductId) && Double.compare(this.level, currentSubscription.level) == 0 && l.b(this.levelName, currentSubscription.levelName) && this.expiresAt == currentSubscription.expiresAt && Double.compare(this.duration, currentSubscription.duration) == 0;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final double getLevel() {
        return this.level;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final String getPlatformProductId() {
        return this.platformProductId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return Double.hashCode(this.duration) + o0.g(a.h((Double.hashCode(this.level) + a.h(this.productId.hashCode() * 31, 31, this.platformProductId)) * 31, 31, this.levelName), 31, this.expiresAt);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.platformProductId;
        double d5 = this.level;
        String str3 = this.levelName;
        long j4 = this.expiresAt;
        double d10 = this.duration;
        StringBuilder sbJ = AbstractC1380a.j("CurrentSubscription(productId=", str, ", platformProductId=", str2, ", level=");
        sbJ.append(d5);
        sbJ.append(", levelName=");
        sbJ.append(str3);
        sbJ.append(", expiresAt=");
        sbJ.append(j4);
        sbJ.append(", duration=");
        sbJ.append(d10);
        sbJ.append(")");
        return sbJ.toString();
    }

    public CurrentSubscription(String str, String str2, double d5, String str3, long j4, double d10) {
        l.f(str, "productId");
        l.f(str2, "platformProductId");
        l.f(str3, "levelName");
        this.productId = str;
        this.platformProductId = str2;
        this.level = d5;
        this.levelName = str3;
        this.expiresAt = j4;
        this.duration = d10;
    }

    public /* synthetic */ CurrentSubscription(String str, String str2, double d5, String str3, long j4, double d10, int i6, f fVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0.0d : d5, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? 0L : j4, (i6 & 32) != 0 ? 0.0d : d10);
    }
}
