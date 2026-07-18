package C1;

import java.util.UUID;

/* JADX INFO: renamed from: C1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0069f extends kotlin.jvm.internal.m implements pc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0069f f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0069f f1282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0069f f1283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0069f f1284e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1285a;

    static {
        int i6 = 0;
        f1281b = new C0069f(i6, 0);
        f1282c = new C0069f(i6, 1);
        f1283d = new C0069f(i6, 2);
        f1284e = new C0069f(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0069f(int i6, int i10) {
        super(i6);
        this.f1285a = i10;
    }

    public final Object invoke() {
        switch (this.f1285a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
