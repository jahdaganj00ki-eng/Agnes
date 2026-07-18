package C5;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.a f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc.a f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc.c f1695c;

    public J(pc.a aVar, pc.a aVar2, pc.c cVar) {
        kotlin.jvm.internal.l.f(aVar, "openPhotoPicker");
        kotlin.jvm.internal.l.f(aVar2, "openFilePicker");
        kotlin.jvm.internal.l.f(cVar, "retryUpload");
        this.f1693a = aVar;
        this.f1694b = aVar2;
        this.f1695c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        return kotlin.jvm.internal.l.b(this.f1693a, j4.f1693a) && kotlin.jvm.internal.l.b(this.f1694b, j4.f1694b) && kotlin.jvm.internal.l.b(this.f1695c, j4.f1695c);
    }

    public final int hashCode() {
        return this.f1695c.hashCode() + ((this.f1694b.hashCode() + (this.f1693a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChatAttachmentPickerState(openPhotoPicker=" + this.f1693a + ", openFilePicker=" + this.f1694b + ", retryUpload=" + this.f1695c + ")";
    }
}
