package A0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class j extends kotlin.jvm.internal.m implements pc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f71a = new j(2);

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        p pVar = (p) obj2;
        if (str.length() == 0) {
            return pVar.toString();
        }
        return str + ", " + pVar;
    }
}
