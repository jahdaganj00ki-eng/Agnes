package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.j;
import pc.e;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public /* synthetic */ class CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 extends j implements e {
    public CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;");
    }

    public final f2.b invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((c) this).receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
