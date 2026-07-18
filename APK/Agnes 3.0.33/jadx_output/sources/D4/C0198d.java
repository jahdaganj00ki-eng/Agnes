package D4;

import bc.G;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: D4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0198d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f2708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ac.q f2710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ac.q f2711g;

    public C0198d(List list, List list2, List list3, List list4, List list5) {
        this.f2705a = list;
        this.f2706b = list2;
        this.f2707c = list3;
        this.f2708d = list4;
        this.f2709e = list5;
        final int i6 = 0;
        this.f2710f = G.B(new pc.a(this) { // from class: D4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0198d f2702b;

            {
                this.f2702b = this;
            }

            public final Object invoke() {
                switch (i6) {
                    case 0:
                        C0198d c0198d = this.f2702b;
                        List list6 = c0198d.f2708d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            bc.r.h0(arrayList, (List) ((pc.a) list6.get(i10)).invoke());
                        }
                        c0198d.f2708d = bc.u.a;
                        return arrayList;
                    default:
                        C0198d c0198d2 = this.f2702b;
                        List list7 = c0198d2.f2709e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            bc.r.h0(arrayList2, (List) ((pc.a) list7.get(i11)).invoke());
                        }
                        c0198d2.f2709e = bc.u.a;
                        return arrayList2;
                }
            }
        });
        final int i10 = 1;
        this.f2711g = G.B(new pc.a(this) { // from class: D4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0198d f2702b;

            {
                this.f2702b = this;
            }

            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C0198d c0198d = this.f2702b;
                        List list6 = c0198d.f2708d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i102 = 0; i102 < size; i102++) {
                            bc.r.h0(arrayList, (List) ((pc.a) list6.get(i102)).invoke());
                        }
                        c0198d.f2708d = bc.u.a;
                        return arrayList;
                    default:
                        C0198d c0198d2 = this.f2702b;
                        List list7 = c0198d2.f2709e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            bc.r.h0(arrayList2, (List) ((pc.a) list7.get(i11)).invoke());
                        }
                        c0198d2.f2709e = bc.u.a;
                        return arrayList2;
                }
            }
        });
    }
}
