package androidx.datastore.preferences.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1196w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f19439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19440b;

    static {
        Charset.forName("US-ASCII");
        f19439a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19440b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C1182h(bArr, 0, 0, false).i(0);
        } catch (C1198y e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}
