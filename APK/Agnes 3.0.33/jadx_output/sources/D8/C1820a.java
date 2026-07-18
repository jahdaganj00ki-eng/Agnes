package d8;

import H.AbstractC0349a0;
import Z7.f;
import Z7.h;
import Z7.l;
import java.util.List;
import p2.C3379i;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1820a extends AbstractC0349a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1820a(List list, int i6) {
        super(2, list);
        this.f23392c = i6;
    }

    @Override // d8.e
    public final Z7.e g() {
        switch (this.f23392c) {
            case 0:
                return new f((List) this.f5326b, 0);
            case 1:
                return new h((List) this.f5326b, 0);
            case 2:
                return new f((List) this.f5326b, 2);
            case 3:
                return new h((List) this.f5326b, 1);
            case 4:
                return new h((List) this.f5326b, 2);
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                return new l((List) this.f5326b);
            default:
                return new f((List) this.f5326b, 3);
        }
    }
}
