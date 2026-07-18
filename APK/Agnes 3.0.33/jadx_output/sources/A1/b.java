package A1;

import java.util.List;
import java.util.NoSuchElementException;
import pc.c;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class b {
    public static String a(List list, String str, c cVar, int i6) {
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i6 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i6 & 4) == 0 ? "\n]" : "";
        if ((i6 & 32) != 0) {
            cVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            if (cVar != null) {
                sb.append((CharSequence) cVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
