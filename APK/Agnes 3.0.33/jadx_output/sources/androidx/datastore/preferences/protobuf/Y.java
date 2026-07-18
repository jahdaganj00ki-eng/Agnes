package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class Y extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19334f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f19335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b0 f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f19339e;

    public static Y g() {
        Y y8 = new Y();
        y8.f19335a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y8.f19336b = map;
        y8.f19339e = map;
        return y8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Comparable comparable) {
        int i6;
        int i10;
        int size = this.f19335a.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i6 = 0;
            while (i6 <= i11) {
                int i12 = (i6 + i11) / 2;
                int iCompareTo = comparable.compareTo(((Z) this.f19335a.get(i12)).f19340a);
                if (iCompareTo < 0) {
                    i11 = i12 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i12;
                    }
                    i6 = i12 + 1;
                }
            }
            i10 = i6 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Z) this.f19335a.get(i11)).f19340a);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i6 = 0;
                while (i6 <= i11) {
                }
                i10 = i6 + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f19337c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f19335a.isEmpty()) {
            this.f19335a.clear();
        }
        if (this.f19336b.isEmpty()) {
            return;
        }
        this.f19336b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f19336b.containsKey(comparable);
    }

    public final Map.Entry d(int i6) {
        return (Map.Entry) this.f19335a.get(i6);
    }

    public final Set e() {
        return this.f19336b.isEmpty() ? Collections.EMPTY_SET : this.f19336b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19338d == null) {
            this.f19338d = new b0(0, this);
        }
        return this.f19338d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y8 = (Y) obj;
        int size = size();
        if (size == y8.size()) {
            int size2 = this.f19335a.size();
            if (size2 != y8.f19335a.size()) {
                return ((AbstractSet) entrySet()).equals(y8.entrySet());
            }
            for (int i6 = 0; i6 < size2; i6++) {
                if (d(i6).equals(y8.d(i6))) {
                }
            }
            if (size2 != size) {
                return this.f19336b.equals(y8.f19336b);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.f19336b.isEmpty() && !(this.f19336b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19336b = treeMap;
            this.f19339e = treeMap.descendingMap();
        }
        return (SortedMap) this.f19336b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Z) this.f19335a.get(iA)).f19341b : this.f19336b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Z) this.f19335a.get(iA)).setValue(obj);
        }
        b();
        if (this.f19335a.isEmpty() && !(this.f19335a instanceof ArrayList)) {
            this.f19335a = new ArrayList(16);
        }
        int i6 = -(iA + 1);
        if (i6 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f19335a.size() == 16) {
            Z z2 = (Z) this.f19335a.remove(15);
            f().put(z2.f19340a, z2.f19341b);
        }
        this.f19335a.add(i6, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f19335a.size();
        int iHashCode = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode += ((Z) this.f19335a.get(i6)).hashCode();
        }
        return this.f19336b.size() > 0 ? this.f19336b.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i6) {
        b();
        Object obj = ((Z) this.f19335a.remove(i6)).f19341b;
        if (!this.f19336b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f19335a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f19336b.isEmpty()) {
            return null;
        }
        return this.f19336b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19336b.size() + this.f19335a.size();
    }
}
