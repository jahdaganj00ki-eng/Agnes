package e6;

import com.google.gson.annotations.SerializedName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class EnumC1887i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("image")
    public static final EnumC1887i f23799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("video")
    public static final EnumC1887i f23800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1887i[] f23801c;

    static {
        EnumC1887i enumC1887i = new EnumC1887i("IMAGE", 0);
        f23799a = enumC1887i;
        EnumC1887i enumC1887i2 = new EnumC1887i("VIDEO", 1);
        f23800b = enumC1887i2;
        EnumC1887i[] enumC1887iArr = {enumC1887i, enumC1887i2};
        f23801c = enumC1887iArr;
        rc.a.o(enumC1887iArr);
    }

    public static EnumC1887i valueOf(String str) {
        return (EnumC1887i) Enum.valueOf(EnumC1887i.class, str);
    }

    public static EnumC1887i[] values() {
        return (EnumC1887i[]) f23801c.clone();
    }
}
