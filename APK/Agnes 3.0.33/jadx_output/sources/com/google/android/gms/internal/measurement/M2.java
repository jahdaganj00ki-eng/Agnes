package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class M2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f22095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L2 f22097c;

    public M2(L2 l2, Comparable comparable, Object obj) {
        this.f22097c = l2;
        this.f22095a = comparable;
        this.f22096b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22095a.compareTo(((M2) obj).f22095a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f22095a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f22096b;
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
    public final /* synthetic */ Object getKey() {
        return this.f22095a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22096b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22095a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22096b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22097c.g();
        Object obj2 = this.f22096b;
        this.f22096b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22095a);
        String strValueOf2 = String.valueOf(this.f22096b);
        return o8.o0.p(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
