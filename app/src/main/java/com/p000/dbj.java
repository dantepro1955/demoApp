package com.p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: HeightAnimation */
/* renamed from: dbj */
class dbj extends Animation {
    /* renamed from: a */
    protected final int f21100a;
    /* renamed from: b */
    protected final View f21101b;
    /* renamed from: c */
    protected float f21102c;

    public dbj(View view, int i, int i2) {
        this.f21101b = view;
        this.f21100a = i;
        this.f21102c = (float) (i2 - i);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.f21101b.getLayoutParams().height = (int) (((float) this.f21100a) + (this.f21102c * f));
        this.f21101b.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
