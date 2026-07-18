package c1;

/* JADX INFO: renamed from: c1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1460f extends AbstractC1452b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1460f f21160c;

    @Override // c1.AbstractC1452b
    public final int[] b(int i6) {
        int length = d().length();
        if (length <= 0 || i6 >= length) {
            return null;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < length && d().charAt(i6) == '\n' && (d().charAt(i6) == '\n' || (i6 != 0 && d().charAt(i6 - 1) != '\n'))) {
            i6++;
        }
        if (i6 >= length) {
            return null;
        }
        int i10 = i6 + 1;
        while (i10 < length && !f(i10)) {
            i10++;
        }
        return c(i6, i10);
    }

    @Override // c1.AbstractC1452b
    public final int[] e(int i6) {
        int length = d().length();
        if (length <= 0 || i6 <= 0) {
            return null;
        }
        if (i6 > length) {
            i6 = length;
        }
        while (i6 > 0 && d().charAt(i6 - 1) == '\n' && !f(i6)) {
            i6--;
        }
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        while (i10 > 0 && (d().charAt(i10) == '\n' || (i10 != 0 && d().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return c(i10, i6);
    }

    public final boolean f(int i6) {
        if (i6 <= 0 || d().charAt(i6 - 1) == '\n') {
            return false;
        }
        return i6 == d().length() || d().charAt(i6) == '\n';
    }
}
