package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f19273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f19274c;

    public /* synthetic */ c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i6) {
        this.f19272a = i6;
        this.f19273b = credentialProviderCreatePublicKeyCredentialController;
        this.f19274c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19272a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(this.f19273b, this.f19274c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass2.invoke$lambda$0(this.f19273b, this.f19274c);
                break;
        }
    }
}
