package c1;

import V0.C0863a;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: c1.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1432H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1432H f21035a = new C1432H();

    public final void a(View view, V0.q qVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = qVar instanceof C0863a ? PointerIcon.getSystemIcon(context, ((C0863a) qVar).f14978b) : PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.l.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
