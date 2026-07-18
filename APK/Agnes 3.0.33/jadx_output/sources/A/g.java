package A;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class g extends gc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gc.c cVar) {
        super(cVar);
        this.f19b = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18a = obj;
        this.f20c |= Integer.MIN_VALUE;
        return h.b(this.f19b, null, 0.0f, 0.0f, null, this);
    }
}
