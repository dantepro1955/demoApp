package com.p000;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator */
/* renamed from: ky */
abstract class ky implements Interpolator {
    /* renamed from: a */
    private final float[] f24351a;
    /* renamed from: b */
    private final float f24352b = (1.0f / ((float) (this.f24351a.length - 1)));

    public ky(float[] fArr) {
        this.f24351a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f24351a.length - 1)) * f), this.f24351a.length - 2);
        float f2 = (f - (((float) min) * this.f24352b)) / this.f24352b;
        return ((this.f24351a[min + 1] - this.f24351a[min]) * f2) + this.f24351a[min];
    }
}
