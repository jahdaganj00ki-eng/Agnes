package com.agnes.bundle_agnes.ui.chat.components.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.agnes.bundle_agnes.ui.chat.components.conversation.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1579k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1579k f21815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1579k[] f21816b;

    static {
        EnumC1579k enumC1579k = new EnumC1579k("Horizontal", 0);
        f21815a = enumC1579k;
        EnumC1579k[] enumC1579kArr = {enumC1579k, new EnumC1579k("VerticalFlow", 1)};
        f21816b = enumC1579kArr;
        rc.a.o(enumC1579kArr);
    }

    public static EnumC1579k valueOf(String str) {
        return (EnumC1579k) Enum.valueOf(EnumC1579k.class, str);
    }

    public static EnumC1579k[] values() {
        return (EnumC1579k[]) f21816b.clone();
    }
}
