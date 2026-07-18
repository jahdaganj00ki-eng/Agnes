package com.google.android.material.floatingactionbutton;

import L1.a;
import L1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v9.AbstractC4080a;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // L1.a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final void c(d dVar) {
        if (dVar.f7976h == 0) {
            dVar.f7976h = 80;
        }
    }

    @Override // L1.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // L1.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i6) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4080a.f39317g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
