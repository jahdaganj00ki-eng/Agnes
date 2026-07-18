package com.agnes.bundle_agnes.ui.chat.components.conversation;

import com.sobrr.agnes.data.model.media.MediaData;
import com.sobrr.agnes.data.model.media.MediaType;

/* JADX INFO: renamed from: com.agnes.bundle_agnes.ui.chat.components.conversation.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1569a implements MediaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaType f21752b = MediaType.IMAGE;

    public C1569a(String str) {
        this.f21751a = str;
    }

    public final MediaType getType() {
        return this.f21752b;
    }

    public final String getUrl() {
        return this.f21751a;
    }
}
