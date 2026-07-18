package D6;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f3159a = DateTimeFormatter.ISO_LOCAL_DATE;

    public static String a(String str) {
        String string = str != null ? xc.k.l0(str).toString() : null;
        String str2 = "";
        if (string == null) {
            string = "";
        }
        if (!xc.k.O(string) && !string.equals("-")) {
            Locale locale = Locale.ROOT;
            kotlin.jvm.internal.l.e(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            M0[] m0Arr = M0.f3041c;
            str2 = "male";
            if (!lowerCase.equals("male") && !lowerCase.equals("m") && !lowerCase.equals("man") && !lowerCase.equals("男") && !lowerCase.equals("男性")) {
                str2 = "female";
                if (!lowerCase.equals("female") && !lowerCase.equals("f") && !lowerCase.equals("woman") && !lowerCase.equals("女") && !lowerCase.equals("女性")) {
                    str2 = "other";
                    if (!lowerCase.equals("other") && !lowerCase.equals("non-binary") && !lowerCase.equals("non_binary") && !lowerCase.equals("nonbinary") && !lowerCase.equals("other")) {
                        return lowerCase;
                    }
                }
            }
        }
        return str2;
    }
}
