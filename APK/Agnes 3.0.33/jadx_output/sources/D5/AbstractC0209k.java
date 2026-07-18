package D5;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: renamed from: D5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC0209k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f2836a = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    public static String a(String str) {
        kotlin.jvm.internal.l.f(str, "path");
        String strE0 = xc.k.e0('/', str, str);
        String strE02 = xc.k.e0('\\', strE0, strE0);
        int iQ = xc.k.Q(strE02, '.', 0, 6);
        if (iQ < 0) {
            return "";
        }
        String strSubstring = strE02.substring(iQ);
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
