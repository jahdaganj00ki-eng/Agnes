package com.google.android.material.datepicker;

import Q8.J;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new J(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f22987g;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = t.a(calendar);
        this.f22981a = calendarA;
        this.f22982b = calendarA.get(2);
        this.f22983c = calendarA.get(1);
        this.f22984d = calendarA.getMaximum(7);
        this.f22985e = calendarA.getActualMaximum(5);
        this.f22986f = calendarA.getTimeInMillis();
    }

    public static m a(int i6, int i10) {
        Calendar calendarC = t.c(null);
        calendarC.set(1, i6);
        calendarC.set(2, i10);
        return new m(calendarC);
    }

    public static m b(long j4) {
        Calendar calendarC = t.c(null);
        calendarC.setTimeInMillis(j4);
        return new m(calendarC);
    }

    public final String c() {
        if (this.f22987g == null) {
            long timeInMillis = this.f22981a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = t.f23001a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f22987g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f22987g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22981a.compareTo(((m) obj).f22981a);
    }

    public final int d(m mVar) {
        if (!(this.f22981a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (mVar.f22982b - this.f22982b) + ((mVar.f22983c - this.f22983c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f22982b == mVar.f22982b && this.f22983c == mVar.f22983c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22982b), Integer.valueOf(this.f22983c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f22983c);
        parcel.writeInt(this.f22982b);
    }
}
