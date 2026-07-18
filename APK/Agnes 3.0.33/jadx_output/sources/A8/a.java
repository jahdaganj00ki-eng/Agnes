package A8;

import X6.AbstractC0998l;
import X6.K;
import X6.M;
import android.os.Build;
import android.webkit.WebView;
import c1.AbstractC1434J;
import c1.RunnableC1470k;
import c1.ViewTreeObserverOnGlobalLayoutListenerC1492v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import q.I;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f363a;

    public /* synthetic */ a(int i6) {
        this.f363a = i6;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        switch (this.f363a) {
            case 0:
                int i6 = AlarmManagerSchedulerBroadcastReceiver.f21911a;
                return;
            case 1:
                return;
            case 2:
                K k = M.f16831b;
                if (k != null && (webView = k.f16828b) != null) {
                    AbstractC0998l.y(webView);
                }
                M.f16831b = null;
                return;
            default:
                I i10 = ViewTreeObserverOnGlobalLayoutListenerC1492v.f21288m1;
                synchronized (i10) {
                    try {
                        int i11 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = i10.f36428a;
                            int i12 = i10.f36429b;
                            while (i11 < i12) {
                                ViewTreeObserverOnGlobalLayoutListenerC1492v viewTreeObserverOnGlobalLayoutListenerC1492v = (ViewTreeObserverOnGlobalLayoutListenerC1492v) objArr[i11];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC1492v.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1492v.f21285j1;
                                viewTreeObserverOnGlobalLayoutListenerC1492v.setShowLayoutBounds(AbstractC1434J.n());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC1492v.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC1492v.post(new RunnableC1470k(viewTreeObserverOnGlobalLayoutListenerC1492v, 2));
                                }
                                i11++;
                            }
                        } else {
                            Object[] objArr2 = i10.f36428a;
                            int i13 = i10.f36429b;
                            while (i11 < i13) {
                                ViewTreeObserverOnGlobalLayoutListenerC1492v viewTreeObserverOnGlobalLayoutListenerC1492v2 = (ViewTreeObserverOnGlobalLayoutListenerC1492v) objArr2[i11];
                                viewTreeObserverOnGlobalLayoutListenerC1492v2.post(new RunnableC1470k(viewTreeObserverOnGlobalLayoutListenerC1492v2, 3));
                                i11++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
