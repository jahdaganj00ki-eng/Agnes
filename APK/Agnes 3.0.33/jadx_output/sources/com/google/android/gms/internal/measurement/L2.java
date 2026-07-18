package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class L2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f22080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f22082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.b0 f22084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f22085f;

    public L2() {
        Map map = Collections.EMPTY_MAP;
        this.f22082c = map;
        this.f22085f = map;
    }

    public final M2 a(int i6) {
        if (i6 < this.f22081b) {
            return (M2) this.f22080a[i6];
        }
        throw new ArrayIndexOutOfBoundsException(i6);
    }

    public final Set b() {
        return this.f22082c.isEmpty() ? Collections.EMPTY_SET : this.f22082c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f22081b != 0) {
            this.f22080a = null;
            this.f22081b = 0;
        }
        if (this.f22082c.isEmpty()) {
            return;
        }
        this.f22082c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f22082c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((M2) this.f22080a[iF]).setValue(obj);
        }
        g();
        if (this.f22080a == null) {
            this.f22080a = new Object[16];
        }
        int i6 = -(iF + 1);
        if (i6 >= 16) {
            return h().put(comparable, obj);
        }
        if (this.f22081b == 16) {
            M2 m22 = (M2) this.f22080a[15];
            this.f22081b = 15;
            h().put(m22.f22095a, m22.f22096b);
        }
        Object[] objArr = this.f22080a;
        int length = objArr.length;
        System.arraycopy(objArr, i6, objArr, i6 + 1, 15 - i6);
        this.f22080a[i6] = new M2(this, comparable, obj);
        this.f22081b++;
        return null;
    }

    public final Object e(int i6) {
        g();
        Object[] objArr = this.f22080a;
        Object obj = ((M2) objArr[i6]).f22096b;
        System.arraycopy(objArr, i6 + 1, objArr, i6, (this.f22081b - i6) - 1);
        this.f22081b--;
        if (!this.f22082c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.f22080a;
            int i10 = this.f22081b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new M2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f22081b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f22084e == null) {
            this.f22084e = new androidx.datastore.preferences.protobuf.b0(1, this);
        }
        return this.f22084e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return super.equals(obj);
        }
        L2 l2 = (L2) obj;
        int size = size();
        if (size == l2.size()) {
            int i6 = this.f22081b;
            if (i6 != l2.f22081b) {
                return entrySet().equals(l2.entrySet());
            }
            for (int i10 = 0; i10 < i6; i10++) {
                if (a(i10).equals(l2.a(i10))) {
                }
            }
            if (i6 != size) {
                return this.f22082c.equals(l2.f22082c);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i6 = this.f22081b;
        int i10 = i6 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((M2) this.f22080a[i10]).f22095a);
            if (iCompareTo > 0) {
                return -(i6 + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((M2) this.f22080a[i12]).f22095a);
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    public final void g() {
        if (this.f22083d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((M2) this.f22080a[iF]).f22096b : this.f22082c.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.f22082c.isEmpty() && !(this.f22082c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22082c = treeMap;
            this.f22085f = treeMap.descendingMap();
        }
        return (SortedMap) this.f22082c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = this.f22081b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            iHashCode += this.f22080a[i10].hashCode();
        }
        return this.f22082c.size() > 0 ? this.f22082c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return e(iF);
        }
        if (this.f22082c.isEmpty()) {
            return null;
        }
        return this.f22082c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22082c.size() + this.f22081b;
    }
}
