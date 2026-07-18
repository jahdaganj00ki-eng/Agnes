package A6;

import gc.c;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f350c = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f349b = obj;
        this.f351d |= Integer.MIN_VALUE;
        return this.f350c.a(false, this);
    }
}
