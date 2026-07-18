package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1201b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19530a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19531b;

    public C1201b(HashMap map) {
        this.f19531b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1214o enumC1214o = (EnumC1214o) entry.getValue();
            List arrayList = (List) this.f19530a.get(enumC1214o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f19530a.put(enumC1214o, arrayList);
            }
            arrayList.add((C1202c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC1221w interfaceC1221w, EnumC1214o enumC1214o, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1202c c1202c = (C1202c) list.get(size);
                Method method = c1202c.f19533b;
                try {
                    int i6 = c1202c.f19532a;
                    if (i6 == 0) {
                        method.invoke(obj, null);
                    } else if (i6 == 1) {
                        method.invoke(obj, interfaceC1221w);
                    } else if (i6 == 2) {
                        method.invoke(obj, interfaceC1221w, enumC1214o);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
