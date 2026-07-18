package C;

import java.util.concurrent.CancellationException;
import t0.AbstractC3888f;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class b extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i6) {
        super(str);
        this.f1178a = i6;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f1178a) {
            case 0:
                setStackTrace(c.f1179a);
                break;
            case 1:
                setStackTrace(Y0.b.f17192a);
                break;
            default:
                setStackTrace(AbstractC3888f.f38213b);
                break;
        }
        return this;
    }
}
