package com.adjust.sdk;

import java.util.List;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityPackage f21578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SdkClickHandler f21579c;

    public /* synthetic */ V(SdkClickHandler sdkClickHandler, ActivityPackage activityPackage, int i6) {
        this.f21577a = i6;
        this.f21579c = sdkClickHandler;
        this.f21578b = activityPackage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21577a) {
            case 0:
                SdkClickHandler sdkClickHandler = this.f21579c;
                List list = sdkClickHandler.packageQueue;
                ActivityPackage activityPackage = this.f21578b;
                list.add(activityPackage);
                sdkClickHandler.logger.debug("Added sdk_click %d", Integer.valueOf(sdkClickHandler.packageQueue.size()));
                sdkClickHandler.logger.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                break;
            default:
                ActivityPackage activityPackage2 = this.f21578b;
                SdkClickHandler sdkClickHandler2 = this.f21579c;
                sdkClickHandler2.sendSdkClickI(activityPackage2);
                sdkClickHandler2.sendNextSdkClick();
                break;
        }
    }
}
