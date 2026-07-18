package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1667o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f22398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22399b;

    static {
        Charset.forName("US-ASCII");
        f22398a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22399b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
