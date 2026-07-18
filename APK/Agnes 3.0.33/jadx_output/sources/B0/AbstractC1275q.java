package b0;

import android.graphics.drawable.AnimatedImageDrawable;
import android.media.MediaMetadataRetriever;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* JADX INFO: renamed from: b0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract /* synthetic */ class AbstractC1275q {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ MediaMetadataRetriever.BitmapParams f() {
        return new MediaMetadataRetriever.BitmapParams();
    }

    public static /* synthetic */ TextClassificationContext.Builder h(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ TextSelection.Request.Builder k(int i6, int i10, CharSequence charSequence) {
        return new TextSelection.Request.Builder(charSequence, i6, i10);
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ boolean w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    public static /* synthetic */ void z() {
    }
}
