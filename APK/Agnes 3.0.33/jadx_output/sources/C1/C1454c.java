package c1;

import java.text.BreakIterator;

/* JADX INFO: renamed from: c1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1454c extends AbstractC1452b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1454c f21137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C1454c f21138f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f21140d;

    @Override // c1.AbstractC1452b
    public final int[] b(int i6) {
        switch (this.f21139c) {
            case 0:
                int length = d().length();
                if (length <= 0 || i6 >= length) {
                    return null;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f21140d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i6)) {
                        BreakIterator breakIterator2 = this.f21140d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i6);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return c(i6, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f21140d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i6 = breakIterator3.following(i6);
                } while (i6 != -1);
                return null;
            default:
                if (d().length() <= 0 || i6 >= d().length()) {
                    return null;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                while (!h(i6) && (!h(i6) || (i6 != 0 && h(i6 - 1)))) {
                    BreakIterator breakIterator4 = this.f21140d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i6 = breakIterator4.following(i6);
                    if (i6 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f21140d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i6);
                if (iFollowing2 == -1 || !g(iFollowing2)) {
                    return null;
                }
                return c(i6, iFollowing2);
        }
    }

    @Override // c1.AbstractC1452b
    public final int[] e(int i6) {
        switch (this.f21139c) {
            case 0:
                int length = d().length();
                if (length <= 0 || i6 <= 0) {
                    return null;
                }
                if (i6 > length) {
                    i6 = length;
                }
                do {
                    BreakIterator breakIterator = this.f21140d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i6)) {
                        BreakIterator breakIterator2 = this.f21140d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i6);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return c(iPreceding, i6);
                    }
                    BreakIterator breakIterator3 = this.f21140d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i6 = breakIterator3.preceding(i6);
                } while (i6 != -1);
                return null;
            default:
                int length2 = d().length();
                if (length2 <= 0 || i6 <= 0) {
                    return null;
                }
                if (i6 > length2) {
                    i6 = length2;
                }
                while (i6 > 0 && !h(i6 - 1) && !g(i6)) {
                    BreakIterator breakIterator4 = this.f21140d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i6 = breakIterator4.preceding(i6);
                    if (i6 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f21140d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i6);
                if (iPreceding2 == -1 || !h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !h(iPreceding2 - 1)) {
                    return c(iPreceding2, i6);
                }
                return null;
        }
    }

    public final void f(String str) {
        switch (this.f21139c) {
            case 0:
                this.f21132a = str;
                BreakIterator breakIterator = this.f21140d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
            default:
                this.f21132a = str;
                BreakIterator breakIterator2 = this.f21140d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i6) {
        if (i6 <= 0 || !h(i6 - 1)) {
            return false;
        }
        return i6 == d().length() || !h(i6);
    }

    public boolean h(int i6) {
        if (i6 < 0 || i6 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i6));
    }
}
