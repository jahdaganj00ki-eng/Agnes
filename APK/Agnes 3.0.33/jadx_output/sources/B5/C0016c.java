package B5;

import com.agnes.feature_task.net.model.ConversationDetail;

/* JADX INFO: renamed from: B5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C0016c implements InterfaceC0023j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConversationDetail f771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f772b;

    public C0016c(ConversationDetail conversationDetail, boolean z2) {
        this.f771a = conversationDetail;
        this.f772b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0016c)) {
            return false;
        }
        C0016c c0016c = (C0016c) obj;
        return kotlin.jvm.internal.l.b(this.f771a, c0016c.f771a) && this.f772b == c0016c.f772b;
    }

    public final int hashCode() {
        ConversationDetail conversationDetail = this.f771a;
        return Boolean.hashCode(this.f772b) + ((conversationDetail == null ? 0 : conversationDetail.hashCode()) * 31);
    }

    public final String toString() {
        return "ConversationChanged(detail=" + this.f771a + ", isCreate=" + this.f772b + ")";
    }
}
