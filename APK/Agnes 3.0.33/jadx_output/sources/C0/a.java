package C0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f1182c;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f1180a = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f1181b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f1182c = aVarArr;
        rc.a.o(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1182c.clone();
    }
}
