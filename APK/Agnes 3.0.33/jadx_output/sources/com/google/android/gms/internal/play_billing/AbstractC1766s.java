package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1766s extends AbstractC1761p implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1763q f22741b = new C1763q(C1774w.f22755e, 0);

    public static C1774w k(int i6, Object[] objArr) {
        return i6 == 0 ? C1774w.f22755e : new C1774w(i6, objArr);
    }

    public static AbstractC1766s m(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        int length = array.length;
        O9.a.T(length, array);
        return k(length, array);
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1761p
    public int b(Object[] objArr) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = get(i6);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (Objects.equals(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                C1763q c1763qListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c1763qListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(c1763qListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1761p
    public final AbstractC1766s f() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode = (iHashCode * 31) + get(i6).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j */
    public AbstractC1766s subList(int i6, int i10) {
        X8.a.t0(i6, i10, size());
        int i11 = i10 - i6;
        return i11 == size() ? this : i11 == 0 ? C1774w.f22755e : new r(this, i6, i11);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C1763q listIterator(int i6) {
        X8.a.s0(i6, size());
        return isEmpty() ? f22741b : new C1763q(this, i6);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }
}
