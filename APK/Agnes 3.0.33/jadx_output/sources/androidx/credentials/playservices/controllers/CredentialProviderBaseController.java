package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import bc.l;
import f2.C1917a;
import f2.b;
import f2.c;
import f2.d;
import f2.e;
import java.util.Set;
import kotlin.jvm.internal.f;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    private final Context context;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> retryables = l.z0(new Integer[]{7, 20});
    private static final int CONTROLLER_REQUEST_CODE = 1;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public final b createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            return kotlin.jvm.internal.l.b(str, CredentialProviderBaseController.CREATE_CANCELED) ? new C1917a(str2, 0) : kotlin.jvm.internal.l.b(str, CredentialProviderBaseController.CREATE_INTERRUPTED) ? new C1917a("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", str2) : new C1917a(str2, 2);
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final d getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new c("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new c(str2, 1);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new c(str2, 0);
                }
            }
            return new e(str2);
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        private Companion() {
        }
    }

    public CredentialProviderBaseController(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return Companion.getCONTROLLER_REQUEST_CODE();
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        kotlin.jvm.internal.l.f(resultReceiver, "resultReceiver");
        kotlin.jvm.internal.l.f(intent, "hiddenIntent");
        kotlin.jvm.internal.l.f(str, "typeTag");
        intent.putExtra(TYPE_TAG, str);
        intent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        intent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(65536);
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t10) {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.l.e(parcelObtain, "obtain()");
        kotlin.jvm.internal.l.c(t10);
        t10.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver;
    }
}
