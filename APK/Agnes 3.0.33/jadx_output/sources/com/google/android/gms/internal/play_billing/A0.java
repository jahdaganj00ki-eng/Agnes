package com.google.android.gms.internal.play_billing;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f22544a = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22545b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22545b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i6, int i10, int i11, byte[] bArr) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }
}
