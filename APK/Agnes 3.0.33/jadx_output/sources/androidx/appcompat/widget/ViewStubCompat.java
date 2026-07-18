package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.AbstractC2355a;
import java.lang.ref.WeakReference;
import n.InterfaceC3028H0;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f19155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f19156d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19153a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2355a.f27585u, 0, 0);
        this.f19154b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f19153a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f19154b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f19156d;
    }

    public int getLayoutResource() {
        return this.f19153a;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f19154b = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f19156d = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f19153a = i6;
    }

    public void setOnInflateListener(InterfaceC3028H0 interfaceC3028H0) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference weakReference = this.f19155c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f19153a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflaterFrom = this.f19156d;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
            }
            View viewInflate = layoutInflaterFrom.inflate(this.f19153a, viewGroup, false);
            int i10 = this.f19154b;
            if (i10 != -1) {
                viewInflate.setId(i10);
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(viewInflate, iIndexOfChild);
            }
            this.f19155c = new WeakReference(viewInflate);
        }
    }
}
