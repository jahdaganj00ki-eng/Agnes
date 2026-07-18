package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f19276b;

    public /* synthetic */ d(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i6) {
        this.f19275a = i6;
        this.f19276b = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19275a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass3.invoke$lambda$0(this.f19276b);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f19276b);
                break;
        }
    }
}
