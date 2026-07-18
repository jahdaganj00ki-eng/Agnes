package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1627g2 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1632h2 f22342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1632h2 f22343b;

    public AbstractC1627g2(AbstractC1632h2 abstractC1632h2) {
        this.f22342a = abstractC1632h2;
        if (abstractC1632h2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22343b = (AbstractC1632h2) abstractC1632h2.o(4);
    }

    public static void a(int i6, List list) {
        int size = list.size() - i6;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i6) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f22343b.e()) {
            return;
        }
        AbstractC1632h2 abstractC1632h2 = (AbstractC1632h2) this.f22342a.o(4);
        G2.f22051c.a(abstractC1632h2.getClass()).d(abstractC1632h2, this.f22343b);
        this.f22343b = abstractC1632h2;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC1627g2 clone() {
        AbstractC1627g2 abstractC1627g2 = (AbstractC1627g2) this.f22342a.o(5);
        abstractC1627g2.f22343b = d();
        return abstractC1627g2;
    }

    public final AbstractC1632h2 d() {
        if (!this.f22343b.e()) {
            return this.f22343b;
        }
        this.f22343b.g();
        return this.f22343b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Ac.v */
    public final AbstractC1632h2 e() throws Ac.v {
        AbstractC1632h2 abstractC1632h2D = d();
        abstractC1632h2D.getClass();
        boolean zC = true;
        byte bByteValue = ((Byte) abstractC1632h2D.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                zC = G2.f22051c.a(abstractC1632h2D.getClass()).c(abstractC1632h2D);
                abstractC1632h2D.o(2);
            }
        }
        if (zC) {
            return abstractC1632h2D;
        }
        throw new Ac.v("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(AbstractC1632h2 abstractC1632h2) {
        AbstractC1632h2 abstractC1632h22 = this.f22342a;
        if (abstractC1632h22.equals(abstractC1632h2)) {
            return;
        }
        if (!this.f22343b.e()) {
            AbstractC1632h2 abstractC1632h23 = (AbstractC1632h2) abstractC1632h22.o(4);
            G2.f22051c.a(abstractC1632h23.getClass()).d(abstractC1632h23, this.f22343b);
            this.f22343b = abstractC1632h23;
        }
        AbstractC1632h2 abstractC1632h24 = this.f22343b;
        G2.f22051c.a(abstractC1632h24.getClass()).d(abstractC1632h24, abstractC1632h2);
    }

    public final void g(byte[] bArr, int i6, C1597a2 c1597a2) throws C1677q2 {
        if (!this.f22343b.e()) {
            AbstractC1632h2 abstractC1632h2 = (AbstractC1632h2) this.f22342a.o(4);
            G2.f22051c.a(abstractC1632h2.getClass()).d(abstractC1632h2, this.f22343b);
            this.f22343b = abstractC1632h2;
        }
        try {
            J2 j2A = G2.f22051c.a(this.f22343b.getClass());
            AbstractC1632h2 abstractC1632h22 = this.f22343b;
            V1 v1 = new V1();
            c1597a2.getClass();
            j2A.i(abstractC1632h22, bArr, 0, i6, v1);
        } catch (C1677q2 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1677q2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
