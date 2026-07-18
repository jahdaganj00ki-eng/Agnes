package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import f2.d;
import kotlin.jvm.internal.j;
import pc.e;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public /* synthetic */ class CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 extends j implements e {
    public CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;");
    }

    public final d invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((kotlin.jvm.internal.c) this).receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
