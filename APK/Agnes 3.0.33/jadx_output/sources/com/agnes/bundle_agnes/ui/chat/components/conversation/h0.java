package com.agnes.bundle_agnes.ui.chat.components.conversation;

import com.agnes.feature_task.enums.ToolCallEnum;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21799a;

    static {
        int[] iArr = new int[ToolCallEnum.values().length];
        try {
            iArr[ToolCallEnum.WebSearch.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToolCallEnum.ImageSearch.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21799a = iArr;
    }
}
