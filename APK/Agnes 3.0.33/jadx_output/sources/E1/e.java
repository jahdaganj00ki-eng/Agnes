package E1;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3561b;

    public e(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3560a = new Object[i6];
    }

    public Object a() {
        int i6 = this.f3561b;
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        Object[] objArr = this.f3560a;
        Object obj = objArr[i10];
        l.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f3561b--;
        return obj;
    }

    public void b(b bVar) {
        int i6 = this.f3561b;
        Object[] objArr = this.f3560a;
        if (i6 < objArr.length) {
            objArr[i6] = bVar;
            this.f3561b = i6 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        l.f(obj, "instance");
        int i6 = this.f3561b;
        int i10 = 0;
        while (true) {
            objArr = this.f3560a;
            if (i10 >= i6) {
                z2 = false;
                break;
            }
            if (objArr[i10] == obj) {
                z2 = true;
                break;
            }
            i10++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i11 = this.f3561b;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = obj;
        this.f3561b = i11 + 1;
        return true;
    }

    public e() {
        this.f3560a = new Object[256];
    }
}
