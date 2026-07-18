package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R2 f22140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f22143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f22144g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        boolean z2;
        boolean z7;
        R2 r22;
        Unsafe unsafeL = l();
        f22138a = unsafeL;
        int i6 = U1.f22156a;
        f22139b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        R2 p22 = null;
        if (unsafeL != null) {
            if (zM) {
                p22 = new Q2(unsafeL);
            } else if (zM2) {
                p22 = new P2(unsafeL);
            }
        }
        f22140c = p22;
        if (p22 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = p22.f22137a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(S2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f22141d = z2;
        R2 r23 = f22140c;
        if (r23 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls4 = r23.f22137a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z7 = true;
            } catch (Throwable th2) {
                Logger.getLogger(S2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z7 = false;
            }
        }
        f22142e = z7;
        f22143f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (r22 = f22140c) != null) {
            r22.f22137a.objectFieldOffset(fieldB);
        }
        f22144g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f22142e) {
            f22140c.f22137a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i6 = U1.f22156a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void c(Object obj, long j4, byte b10) {
        Unsafe unsafe = f22140c.f22137a;
        long j10 = (-4) & j4;
        int i6 = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (i6 & (~(255 << i10))));
    }

    public static void d(Object obj, long j4, byte b10) {
        Unsafe unsafe = f22140c.f22137a;
        long j10 = (-4) & j4;
        int i6 = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i6) | (unsafe.getInt(obj, j10) & (~(255 << i6))));
    }

    public static Object e(Class cls) {
        try {
            return f22138a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(long j4, Object obj) {
        return f22140c.f22137a.getInt(obj, j4);
    }

    public static void g(long j4, Object obj, int i6) {
        f22140c.f22137a.putInt(obj, j4, i6);
    }

    public static long h(long j4, Object obj) {
        return f22140c.f22137a.getLong(obj, j4);
    }

    public static void i(Object obj, long j4, long j10) {
        f22140c.f22137a.putLong(obj, j4, j10);
    }

    public static Object j(long j4, Object obj) {
        return f22140c.f22137a.getObject(obj, j4);
    }

    public static void k(long j4, Object obj, Object obj2) {
        f22140c.f22137a.putObject(obj, j4, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new O2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i6 = U1.f22156a;
        try {
            Class cls2 = f22139b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(long j4, Object obj) {
        return ((byte) ((f22140c.f22137a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j4, Object obj) {
        return ((byte) ((f22140c.f22137a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f22142e) {
            return f22140c.f22137a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
