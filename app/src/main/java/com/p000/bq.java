package com.p000;

import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.graphics.Rect;

@TargetApi(14)
/* compiled from: RectEvaluator */
/* renamed from: bq */
class bq implements TypeEvaluator<Rect> {
    /* renamed from: a */
    private Rect f7389a;

    public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m10382a(f, (Rect) obj, (Rect) obj2);
    }

    /* renamed from: a */
    public Rect m10382a(float f, Rect rect, Rect rect2) {
        int i = ((int) (((float) (rect2.left - rect.left)) * f)) + rect.left;
        int i2 = ((int) (((float) (rect2.top - rect.top)) * f)) + rect.top;
        int i3 = ((int) (((float) (rect2.right - rect.right)) * f)) + rect.right;
        int i4 = ((int) (((float) (rect2.bottom - rect.bottom)) * f)) + rect.bottom;
        if (this.f7389a == null) {
            return new Rect(i, i2, i3, i4);
        }
        this.f7389a.set(i, i2, i3, i4);
        return this.f7389a;
    }
}
