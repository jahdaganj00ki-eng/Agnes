package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import e2.i;
import f2.e;
import kotlin.jvm.internal.x;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f19281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19282c;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj, int i6) {
        this.f19280a = i6;
        this.f19281b = credentialProviderGetSignInIntentController;
        this.f19282c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19280a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.f19281b, (i) this.f19282c);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.f19281b, (x) this.f19282c);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.f19281b, (e) this.f19282c);
                break;
            default:
                CredentialProviderGetSignInIntentController.AnonymousClass1.invoke$lambda$0(this.f19281b, (Exception) this.f19282c);
                break;
        }
    }
}
