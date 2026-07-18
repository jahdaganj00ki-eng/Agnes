package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract /* synthetic */ class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21576a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        f21576a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21576a[ActivityKind.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21576a[ActivityKind.ATTRIBUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21576a[ActivityKind.EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21576a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21576a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
