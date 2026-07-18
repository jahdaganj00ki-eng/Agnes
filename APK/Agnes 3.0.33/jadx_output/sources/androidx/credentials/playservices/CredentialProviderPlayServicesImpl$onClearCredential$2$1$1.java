package androidx.credentials.playservices;

import Ja.u;
import ac.B;
import android.util.Log;
import e2.g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends m implements pc.a {
    final /* synthetic */ g $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, g gVar) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(g gVar, Exception exc) {
        l.f(gVar, "$callback");
        l.f(exc, "$e");
        String message = exc.getMessage();
        new u(message != null ? message.toString() : null);
        gVar.a();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m3invoke();
        return B.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3invoke() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.$e);
        Executor executor = this.$executor;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.c
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(null, exc);
            }
        });
    }
}
