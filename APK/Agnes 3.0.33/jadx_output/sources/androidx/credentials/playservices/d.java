package androidx.credentials.playservices;

import t9.InterfaceC3922d;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class d implements InterfaceC3922d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f19286b;

    public /* synthetic */ d(HiddenActivity hiddenActivity, int i6) {
        this.f19285a = i6;
        this.f19286b = hiddenActivity;
    }

    @Override // t9.InterfaceC3922d
    public final void q(Exception exc) {
        switch (this.f19285a) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f19286b, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f19286b, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f19286b, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f19286b, exc);
                break;
        }
    }
}
