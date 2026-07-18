package c1;

import java.util.HashSet;

/* JADX INFO: renamed from: c1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1452b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21133b;

    public AbstractC1452b() {
        this.f21133b = new int[2];
    }

    public void a() {
        x2.V v10 = (x2.V) this.f21132a;
        U1.b bVar = (U1.b) this.f21133b;
        HashSet hashSet = v10.f40122e;
        if (hashSet.remove(bVar) && hashSet.isEmpty()) {
            v10.b();
        }
    }

    public abstract int[] b(int i6);

    public int[] c(int i6, int i10) {
        if (i6 < 0 || i10 < 0 || i6 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f21133b;
        iArr[0] = i6;
        iArr[1] = i10;
        return iArr;
    }

    public String d() {
        String str = (String) this.f21132a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.l.k("text");
        throw null;
    }

    public abstract int[] e(int i6);

    public AbstractC1452b(x2.V v10, U1.b bVar) {
        this.f21132a = v10;
        this.f21133b = bVar;
    }
}
