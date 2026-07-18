package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f19386a;

    public i0(Unsafe unsafe) {
        this.f19386a = unsafe;
    }

    public final int a(Class cls) {
        return this.f19386a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f19386a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract double d(long j4, Object obj);

    public abstract float e(long j4, Object obj);

    public final int f(long j4, Object obj) {
        return this.f19386a.getInt(obj, j4);
    }

    public final long g(long j4, Object obj) {
        return this.f19386a.getLong(obj, j4);
    }

    public final Object h(long j4, Object obj) {
        return this.f19386a.getObject(obj, j4);
    }

    public final long i(Field field) {
        return this.f19386a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j4, boolean z2);

    public abstract void k(Object obj, long j4, byte b10);

    public abstract void l(Object obj, long j4, double d5);

    public abstract void m(Object obj, long j4, float f10);

    public final void n(long j4, Object obj, int i6) {
        this.f19386a.putInt(obj, j4, i6);
    }

    public final void o(Object obj, long j4, long j10) {
        this.f19386a.putLong(obj, j4, j10);
    }

    public final void p(long j4, Object obj, Object obj2) {
        this.f19386a.putObject(obj, j4, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f19386a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            j0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
