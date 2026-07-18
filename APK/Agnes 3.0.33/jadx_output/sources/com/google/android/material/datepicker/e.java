package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f22934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22936c;

    public e() {
        Calendar calendarC = t.c(null);
        this.f22934a = calendarC;
        this.f22935b = calendarC.getMaximum(7);
        this.f22936c = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f22935b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i10 = this.f22935b;
        if (i6 >= i10) {
            return null;
        }
        int i11 = i6 + this.f22936c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131558485, viewGroup, false);
        }
        int i10 = i6 + this.f22936c;
        int i11 = this.f22935b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f22934a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131887744), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i6) {
        Calendar calendarC = t.c(null);
        this.f22934a = calendarC;
        this.f22935b = calendarC.getMaximum(7);
        this.f22936c = i6;
    }
}
