package androidx.credentials.playservices;

import t9.InterfaceC3923e;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class a implements InterfaceC3923e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc.c f19253b;

    public /* synthetic */ a(int i6, pc.c cVar) {
        this.f19252a = i6;
        this.f19253b = cVar;
    }

    @Override // t9.InterfaceC3923e
    public final void onSuccess(Object obj) {
        switch (this.f19252a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(this.f19253b, obj);
                break;
            case 1:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(this.f19253b, obj);
                break;
            case 2:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(this.f19253b, obj);
                break;
            case 3:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(this.f19253b, obj);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(this.f19253b, obj);
                break;
        }
    }
}
