package b0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class L0 extends gc.i implements pc.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gc.i f19820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(pc.c cVar, ec.c cVar2) {
        super(2, cVar2);
        this.f19820c = (gc.i) cVar;
    }

    public final ec.c create(Object obj, ec.c cVar) {
        return new L0(this.f19820c, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Ac.B) obj, (ec.c) obj2).invokeSuspend(ac.B.a);
    }

    public final Object invokeSuspend(Object obj) {
        fc.a aVar = fc.a.a;
        int i6 = this.f19819b;
        if (i6 == 0) {
            X8.a.n0(obj);
            this.f19819b = 1;
            if (this.f19820c.invoke(this) == aVar) {
                return aVar;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X8.a.n0(obj);
        }
        return ac.B.a;
    }
}
