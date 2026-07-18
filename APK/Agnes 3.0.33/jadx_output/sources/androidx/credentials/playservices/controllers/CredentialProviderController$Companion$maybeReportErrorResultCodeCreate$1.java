package androidx.credentials.playservices.controllers;

import ac.B;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import pc.c;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 extends m implements pc.a {
    final /* synthetic */ x $exception;
    final /* synthetic */ c $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(c cVar, x xVar) {
        super(0);
        this.$onError = cVar;
        this.$exception = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m18invoke();
        return B.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m18invoke() {
        this.$onError.invoke(this.$exception.a);
    }
}
