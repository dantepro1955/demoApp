package com.p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p000.dnb.C5005h;

/* compiled from: FixedRatioLayoutHelper */
/* renamed from: dkb */
public class dkb {
    /* renamed from: a */
    private float f21814a;
    /* renamed from: b */
    private ViewGroup f21815b;

    public dkb(ViewGroup viewGroup) {
        this.f21815b = viewGroup;
    }

    /* renamed from: a */
    public void m27661a(float f) {
        this.f21814a = f;
        this.f21815b.requestLayout();
    }

    /* renamed from: a */
    public void m27662a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5005h.U9Widget, 0, 0);
            try {
                this.f21814a = obtainStyledAttributes.getFloat(C5005h.U9Widget_layout_ratio, -1.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    public int m27660a(int i, int i2) {
        if (this.f21814a < 0.0f) {
            return i2;
        }
        int size = (int) (((float) MeasureSpec.getSize(i)) * this.f21814a);
        MeasureSpec.getMode(i2);
        return MeasureSpec.makeMeasureSpec(size, 1073741824);
    }
}
