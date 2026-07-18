package ea;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ea.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1904k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1904k f23921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f23922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1904k[] f23923c;

    static {
        EnumC1904k enumC1904k = new EnumC1904k("INSTANCE", 0);
        f23921a = enumC1904k;
        f23923c = new EnumC1904k[]{enumC1904k};
        f23922b = new Handler(Looper.getMainLooper());
    }

    public static EnumC1904k valueOf(String str) {
        return (EnumC1904k) Enum.valueOf(EnumC1904k.class, str);
    }

    public static EnumC1904k[] values() {
        return (EnumC1904k[]) f23923c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f23922b.post(runnable);
    }
}
