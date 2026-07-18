package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y0 f22669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f22672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f22673g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        boolean z2;
        boolean z7;
        Y0 y02;
        Unsafe unsafeI = i();
        f22667a = unsafeI;
        int i6 = AbstractC1752k0.f22703a;
        f22668b = Memory.class;
        Class cls = Long.TYPE;
        boolean zO = o(cls);
        Class cls2 = Integer.TYPE;
        boolean zO2 = o(cls2);
        Y0 w02 = null;
        if (unsafeI != null) {
            if (zO) {
                w02 = new X0(unsafeI);
            } else if (zO2) {
                w02 = new W0(unsafeI);
            }
        }
        f22669c = w02;
        if (w02 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = w02.f22664a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(Z0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f22670d = z2;
        Y0 y03 = f22669c;
        if (y03 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls4 = y03.f22664a.getClass();
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
                Logger.getLogger(Z0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z7 = false;
            }
        }
        f22671e = z7;
        f22672f = p(byte[].class);
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
        if (fieldB != null && (y02 = f22669c) != null) {
            y02.f22664a.objectFieldOffset(fieldB);
        }
        f22673g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f22671e) {
            f22669c.f22664a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i6 = AbstractC1752k0.f22703a;
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
        Unsafe unsafe = f22669c.f22664a;
        long j10 = (-4) & j4;
        int i6 = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (i6 & (~(255 << i10))));
    }

    public static void d(Object obj, long j4, byte b10) {
        Unsafe unsafe = f22669c.f22664a;
        long j10 = (-4) & j4;
        int i6 = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i6) | (unsafe.getInt(obj, j10) & (~(255 << i6))));
    }

    public static int e(long j4, Object obj) {
        return f22669c.f22664a.getInt(obj, j4);
    }

    public static long f(long j4, Object obj) {
        return f22669c.f22664a.getLong(obj, j4);
    }

    public static Object g(Class cls) {
        try {
            return f22667a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object h(long j4, Object obj) {
        return f22669c.f22664a.getObject(obj, j4);
    }

    public static Unsafe i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new V0());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(Z0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void j(long j4, Object obj, int i6) {
        f22669c.f22664a.putInt(obj, j4, i6);
    }

    public static void k(Object obj, long j4, long j10) {
        f22669c.f22664a.putLong(obj, j4, j10);
    }

    public static void l(long j4, Object obj, Object obj2) {
        f22669c.f22664a.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j4, Object obj) {
        return ((byte) ((f22669c.f22664a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j4, Object obj) {
        return ((byte) ((f22669c.f22664a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static boolean o(Class cls) {
        int i6 = AbstractC1752k0.f22703a;
        try {
            Class cls2 = f22668b;
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

    public static int p(Class cls) {
        if (f22671e) {
            return f22669c.f22664a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
