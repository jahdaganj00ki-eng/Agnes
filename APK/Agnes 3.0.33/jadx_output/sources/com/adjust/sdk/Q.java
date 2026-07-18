package com.adjust.sdk;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21571g;

    public Q(ActivityState activityState) {
        this.f21565a = -1;
        this.f21566b = -1;
        this.f21567c = -1;
        this.f21568d = -1L;
        this.f21569e = -1L;
        this.f21570f = null;
        this.f21571g = null;
        if (activityState == null) {
            return;
        }
        this.f21565a = activityState.eventCount;
        this.f21566b = activityState.sessionCount;
        this.f21567c = activityState.subsessionCount;
        this.f21568d = activityState.timeSpent;
        this.f21569e = activityState.sessionLength;
        this.f21570f = activityState.uuid;
        this.f21571g = activityState.pushToken;
    }
}
