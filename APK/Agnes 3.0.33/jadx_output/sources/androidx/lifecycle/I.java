package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class I extends AbstractC1208i {
    final /* synthetic */ J this$0;

    public static final class a extends AbstractC1208i {
        final /* synthetic */ J this$0;

        public a(J j4) {
            this.this$0 = j4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            J j4 = this.this$0;
            int i6 = j4.f19475a + 1;
            j4.f19475a = i6;
            if (i6 == 1 && j4.f19478d) {
                j4.f19480f.d(EnumC1214o.ON_START);
                j4.f19478d = false;
            }
        }
    }

    public I(J j4) {
        this.this$0 = j4;
    }

    @Override // androidx.lifecycle.AbstractC1208i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = S.f19508b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.l.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((S) fragmentFindFragmentByTag).f19509a = this.this$0.f19482h;
        }
    }

    @Override // androidx.lifecycle.AbstractC1208i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        J j4 = this.this$0;
        int i6 = j4.f19476b - 1;
        j4.f19476b = i6;
        if (i6 == 0) {
            Handler handler = j4.f19479e;
            kotlin.jvm.internal.l.c(handler);
            handler.postDelayed(j4.f19481g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        H.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1208i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        J j4 = this.this$0;
        int i6 = j4.f19475a - 1;
        j4.f19475a = i6;
        if (i6 == 0 && j4.f19477c) {
            j4.f19480f.d(EnumC1214o.ON_STOP);
            j4.f19478d = true;
        }
    }
}
