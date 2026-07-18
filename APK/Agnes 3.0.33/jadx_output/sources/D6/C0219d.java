package D6;

import java.util.Locale;

/* JADX INFO: renamed from: D6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0219d implements InterfaceC0222e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0219d f3185a = new C0219d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0219d f3186b = new C0219d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0219d f3187c = new C0219d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0219d f3188d = new C0219d();

    public static A a(String str) {
        Object next;
        kotlin.jvm.internal.l.f(str, "code");
        Locale locale = Locale.ROOT;
        kotlin.jvm.internal.l.e(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        String strG0 = xc.k.g0(xc.r.y(lowerCase, '_', '-'), '-');
        if (xc.k.O(strG0)) {
            strG0 = str.toLowerCase(locale);
            kotlin.jvm.internal.l.e(strG0, "toLowerCase(...)");
        }
        hc.b bVar = A.f2924f;
        bVar.getClass();
        Mc.i iVar = new Mc.i(6, bVar);
        while (true) {
            if (!iVar.hasNext()) {
                next = null;
                break;
            }
            next = iVar.next();
            if (((A) next).f2925a.equals(strG0)) {
                break;
            }
        }
        A a10 = (A) next;
        return a10 == null ? xc.r.C(strG0, "zh", false) ? A.f2922d : A.f2921c : a10;
    }

    public static B b(String str) {
        Object next;
        hc.b bVar = B.f2934g;
        bVar.getClass();
        Mc.i iVar = new Mc.i(6, bVar);
        while (true) {
            if (!iVar.hasNext()) {
                next = null;
                break;
            }
            next = iVar.next();
            if (((B) next).f2935a.equals(str)) {
                break;
            }
        }
        B b10 = (B) next;
        return b10 == null ? B.f2930c : b10;
    }
}
