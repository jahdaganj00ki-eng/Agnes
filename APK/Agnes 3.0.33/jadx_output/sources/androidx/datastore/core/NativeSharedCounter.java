package androidx.datastore.core;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i6);

    public final native int nativeGetCounterValue(long j4);

    public final native int nativeIncrementAndGetCounterValue(long j4);

    public final native int nativeTruncateFile(int i6);
}
