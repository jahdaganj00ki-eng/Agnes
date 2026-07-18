package D6;

import E6.C0307v;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class I implements Dc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc.a f3018b;

    public /* synthetic */ I(int i6, pc.a aVar) {
        this.f3017a = i6;
        this.f3018b = aVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final Object i(Object obj, ec.c cVar) throws Ac.v {
        switch (this.f3017a) {
            case 0:
                if (!kotlin.jvm.internal.l.b((C) obj, C.f2956a)) {
                    throw new Ac.v();
                }
                this.f3018b.invoke();
                return ac.B.a;
            case 1:
                if (!kotlin.jvm.internal.l.b((C0276w0) obj, C0276w0.f3347a)) {
                    throw new Ac.v();
                }
                this.f3018b.invoke();
                return ac.B.a;
            case 2:
                if (!kotlin.jvm.internal.l.b((C0307v) obj, C0307v.f3887a)) {
                    throw new Ac.v();
                }
                this.f3018b.invoke();
                return ac.B.a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.f3018b.invoke();
                }
                return ac.B.a;
        }
    }
}
