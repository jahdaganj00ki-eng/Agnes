package eb;

import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import xc.i;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f23924a;

    static {
        Pattern patternCompile = Pattern.compile("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])");
        l.e(patternCompile, "compile(...)");
        String strPattern = patternCompile.pattern();
        l.e(strPattern, "pattern(...)");
        f23924a = new i(strPattern.concat("|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])"));
    }
}
