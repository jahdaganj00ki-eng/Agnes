package c1;

import j1.C2518l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class N0 implements b1.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f21086c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f21087d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2518l f21088e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2518l f21089f = null;

    public N0(int i6, ArrayList arrayList) {
        this.f21084a = i6;
        this.f21085b = arrayList;
    }

    @Override // b1.t0
    public final boolean v() {
        return this.f21085b.contains(this);
    }
}
