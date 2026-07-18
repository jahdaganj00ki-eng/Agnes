package com.agnes.feature_game.model;

import T0.a;
import b4.AbstractC1380a;
import java.io.Serializable;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class GameIntroParams implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String backgroundImageUrl;
    private final String bgmUrl;
    private final String description;
    private final String gameIntroTts;
    private final String name;
    private final String openingAnimationUrl;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeUrlText(String str) {
            if (str == null) {
                return null;
            }
            try {
                return URLDecoder.decode(str, StandardCharsets.UTF_8.toString());
            } catch (Exception unused) {
                return str;
            }
        }

        private Companion() {
        }
    }

    public GameIntroParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GameIntroParams copy$default(GameIntroParams gameIntroParams, String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gameIntroParams.name;
        }
        if ((i6 & 2) != 0) {
            str2 = gameIntroParams.description;
        }
        if ((i6 & 4) != 0) {
            str3 = gameIntroParams.backgroundImageUrl;
        }
        if ((i6 & 8) != 0) {
            str4 = gameIntroParams.bgmUrl;
        }
        if ((i6 & 16) != 0) {
            str5 = gameIntroParams.openingAnimationUrl;
        }
        if ((i6 & 32) != 0) {
            str6 = gameIntroParams.gameIntroTts;
        }
        String str7 = str5;
        String str8 = str6;
        return gameIntroParams.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.backgroundImageUrl;
    }

    public final String component4() {
        return this.bgmUrl;
    }

    public final String component5() {
        return this.openingAnimationUrl;
    }

    public final String component6() {
        return this.gameIntroTts;
    }

    public final GameIntroParams copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "name");
        return new GameIntroParams(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameIntroParams)) {
            return false;
        }
        GameIntroParams gameIntroParams = (GameIntroParams) obj;
        return l.b(this.name, gameIntroParams.name) && l.b(this.description, gameIntroParams.description) && l.b(this.backgroundImageUrl, gameIntroParams.backgroundImageUrl) && l.b(this.bgmUrl, gameIntroParams.bgmUrl) && l.b(this.openingAnimationUrl, gameIntroParams.openingAnimationUrl) && l.b(this.gameIntroTts, gameIntroParams.gameIntroTts);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getBgmUrl() {
        return this.bgmUrl;
    }

    public final String getDecodedDescription() {
        return Companion.decodeUrlText(this.description);
    }

    public final String getDecodedName() {
        String strDecodeUrlText = Companion.decodeUrlText(this.name);
        return strDecodeUrlText == null ? this.name : strDecodeUrlText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGameIntroTts() {
        return this.gameIntroTts;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOpeningAnimationUrl() {
        return this.openingAnimationUrl;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundImageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgmUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.openingAnimationUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gameIntroTts;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.backgroundImageUrl;
        String str4 = this.bgmUrl;
        String str5 = this.openingAnimationUrl;
        String str6 = this.gameIntroTts;
        StringBuilder sbJ = AbstractC1380a.j("GameIntroParams(name=", str, ", description=", str2, ", backgroundImageUrl=");
        AbstractC1380a.s(sbJ, str3, ", bgmUrl=", str4, ", openingAnimationUrl=");
        return a.s(sbJ, str5, ", gameIntroTts=", str6, ")");
    }

    public GameIntroParams(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "name");
        this.name = str;
        this.description = str2;
        this.backgroundImageUrl = str3;
        this.bgmUrl = str4;
        this.openingAnimationUrl = str5;
        this.gameIntroTts = str6;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ GameIntroParams(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.f r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agnes.feature_game.model.GameIntroParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}
