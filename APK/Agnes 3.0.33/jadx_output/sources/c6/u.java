package C6;

import ac.B;
import j0.Z;
import w6.C4207S;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class u implements pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f2284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f2285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f2286d;

    public /* synthetic */ u(Z z2, Z z7, Z z10, int i6) {
        this.f2283a = i6;
        this.f2284b = z2;
        this.f2285c = z7;
        this.f2286d = z10;
    }

    public final Object invoke(Object obj) {
        switch (this.f2283a) {
            case 0:
                C4207S c4207s = (C4207S) obj;
                kotlin.jvm.internal.l.f(c4207s, "item");
                this.f2284b.setValue(c4207s);
                this.f2285c.setValue(0);
                this.f2286d.setValue("");
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                this.f2284b.setValue(null);
                this.f2285c.setValue(num);
                this.f2286d.setValue(Boolean.TRUE);
                break;
            default:
                String str = (String) obj;
                kotlin.jvm.internal.l.f(str, "text");
                this.f2284b.setValue(str);
                this.f2286d.setValue(Boolean.valueOf(str.length() > 0 && !str.equals((String) this.f2285c.getValue())));
                break;
        }
        return B.a;
    }
}
