package com.adjust.sdk;

import p2.C3379i;

/* JADX INFO: renamed from: com.adjust.sdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class RunnableC1544a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f21586b;

    public /* synthetic */ RunnableC1544a(ActivityHandler activityHandler, int i6) {
        this.f21585a = i6;
        this.f21586b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21585a) {
            case 0:
                this.f21586b.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                this.f21586b.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                this.f21586b.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                this.f21586b.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                this.f21586b.lambda$sendReftagReferrer$17();
                break;
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                this.f21586b.lambda$removeGlobalCallbackParameters$29();
                break;
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f21586b.lambda$gdprForgetMe$34();
                break;
            case C3379i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f21586b.lambda$gdprForgetMe$35();
                break;
            default:
                this.f21586b.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
