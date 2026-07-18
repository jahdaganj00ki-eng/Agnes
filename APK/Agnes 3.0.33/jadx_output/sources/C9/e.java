package C9;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2326b;

    public static String c(int i6) {
        return "" + ((char) ((i6 >> 24) & 255)) + ((char) ((i6 >> 16) & 255)) + ((char) ((i6 >> 8) & 255)) + ((char) (i6 & 255));
    }

    public void b(int i6) {
        this.f2326b = i6 | this.f2326b;
    }

    public boolean e(int i6) {
        return (this.f2326b & i6) == i6;
    }

    public abstract int f();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public String toString() {
        switch (this.f2325a) {
            case 1:
                return c(this.f2326b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i6, int i10) {
        this.f2325a = i10;
        this.f2326b = i6;
    }
}
