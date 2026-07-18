package androidx.core.graphics.drawable;

import R1.a;
import R1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p2.C3379i;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f19216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f19217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f19220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f19221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f19222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f19223j;

    public IconCompat() {
        this.f19214a = -1;
        this.f19216c = null;
        this.f19217d = null;
        this.f19218e = 0;
        this.f19219f = 0;
        this.f19220g = null;
        this.f19221h = k;
        this.f19222i = null;
    }

    public static IconCompat a(int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f19218e = i6;
        iconCompat.f19215b = "";
        iconCompat.f19223j = "";
        return iconCompat;
    }

    public final int b() {
        int i6 = this.f19214a;
        if (i6 != -1) {
            if (i6 == 2) {
                return this.f19218e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f19215b;
        if (i10 >= 28) {
            return a.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final int c() {
        int i6 = this.f19214a;
        if (i6 != -1) {
            return i6;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f19215b;
        if (i10 >= 28) {
            return a.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public final Uri d() {
        int i6 = this.f19214a;
        if (i6 != -1) {
            if (i6 == 4 || i6 == 6) {
                return Uri.parse((String) this.f19215b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f19215b;
        if (i10 >= 28) {
            return a.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon e(Context context) {
        Icon iconCreateWithBitmap;
        int i6 = Build.VERSION.SDK_INT;
        int i10 = this.f19214a;
        String strG = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        strG = null;
        strG = null;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.f19215b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f19215b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = this.f19215b;
                    if (i6 >= 28) {
                        strG = a.g(obj);
                    } else {
                        try {
                            strG = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f19223j;
                    strG = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f19215b).split(":", -1)[0] : this.f19223j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strG, this.f19218e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f19215b, this.f19218e, this.f19219f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f19215b);
                break;
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f19215b);
                break;
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i6 >= 30) {
                    iconCreateWithBitmap = b.a(d());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + d());
                    }
                    Uri uriD = d();
                    String scheme = uriD.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD);
                        } catch (Exception e13) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriD, e13);
                        }
                        break;
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f19215b));
                        } catch (FileNotFoundException e14) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriD, e14);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + d());
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.f19220g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f19221h;
        if (mode != k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f19214a == -1) {
            return String.valueOf(this.f19215b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f19214a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f19214a) {
            case 1:
            case C3379i.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f19215b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f19215b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f19223j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f19218e);
                if (this.f19219f != 0) {
                    sb.append(" off=");
                    sb.append(this.f19219f);
                }
                break;
            case 4:
            case C3379i.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f19215b);
                break;
        }
        if (this.f19220g != null) {
            sb.append(" tint=");
            sb.append(this.f19220g);
        }
        if (this.f19221h != k) {
            sb.append(" mode=");
            sb.append(this.f19221h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i6) {
        this.f19216c = null;
        this.f19217d = null;
        this.f19218e = 0;
        this.f19219f = 0;
        this.f19220g = null;
        this.f19221h = k;
        this.f19222i = null;
        this.f19214a = i6;
    }
}
