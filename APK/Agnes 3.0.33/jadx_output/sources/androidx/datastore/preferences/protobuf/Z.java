package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f19340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f19342c;

    public Z(Y y8, Comparable comparable, Object obj) {
        this.f19342c = y8;
        this.f19340a = comparable;
        this.f19341b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19340a.compareTo(((Z) obj).f19340a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f19340a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f19341b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19340a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19341b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19340a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19341b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19342c.b();
        Object obj2 = this.f19341b;
        this.f19341b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f19340a + "=" + this.f19341b;
    }
}
