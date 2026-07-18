package D1;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class b extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i6) {
        super(str);
        this.f2602a = i6;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f2602a) {
            case 0:
                synchronized (this) {
                    break;
                }
                break;
            case 1:
                synchronized (this) {
                    break;
                }
                break;
            case 2:
                synchronized (this) {
                    break;
                }
                break;
            default:
                synchronized (this) {
                    break;
                }
                break;
        }
        return this;
    }
}
