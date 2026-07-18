package com.agnes.bundle_agnes.ui.chat.components.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.agnes.bundle_agnes.ui.chat.components.conversation.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1582n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1582n f21826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1582n f21827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1582n f21828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1582n[] f21829d;

    static {
        EnumC1582n enumC1582n = new EnumC1582n("Loading", 0);
        f21826a = enumC1582n;
        EnumC1582n enumC1582n2 = new EnumC1582n("Success", 1);
        f21827b = enumC1582n2;
        EnumC1582n enumC1582n3 = new EnumC1582n("Error", 2);
        f21828c = enumC1582n3;
        EnumC1582n[] enumC1582nArr = {enumC1582n, enumC1582n2, enumC1582n3};
        f21829d = enumC1582nArr;
        rc.a.o(enumC1582nArr);
    }

    public static EnumC1582n valueOf(String str) {
        return (EnumC1582n) Enum.valueOf(EnumC1582n.class, str);
    }

    public static EnumC1582n[] values() {
        return (EnumC1582n[]) f21829d.clone();
    }
}
