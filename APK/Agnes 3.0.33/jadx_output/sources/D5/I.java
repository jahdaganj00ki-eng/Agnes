package D5;

import android.content.Context;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2806a;

    public I(Context context) {
        this.f2806a = context;
    }

    public static final String a(I i6, String str, String str2) {
        i6.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[^\\w\\s-]");
            kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll("");
            kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
            String string = xc.k.l0(strReplaceAll).toString();
            if (string != null && string.length() > 0) {
                str3 = string;
            }
        }
        if (str3 == null) {
            return "agnes_" + jCurrentTimeMillis + "." + str2;
        }
        return str3 + "_" + jCurrentTimeMillis + "." + str2;
    }
}
