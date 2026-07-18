package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f19270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONException f19271c;

    public /* synthetic */ b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i6) {
        this.f19269a = i6;
        this.f19270b = credentialProviderCreatePublicKeyCredentialController;
        this.f19271c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19269a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(this.f19270b, this.f19271c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass1.invoke$lambda$0(this.f19270b, this.f19271c);
                break;
        }
    }
}
