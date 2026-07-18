package B0;

import ac.B;
import android.view.ViewStructure;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class p extends kotlin.jvm.internal.m implements pc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ViewStructure viewStructure) {
        super(4);
        this.f500a = viewStructure;
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f500a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return B.a;
    }
}
