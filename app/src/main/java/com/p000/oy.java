package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import p000.mx.C5577j;

@TargetApi(17)
/* compiled from: AppCompatTextHelperV17 */
/* renamed from: oy */
class oy extends ox {
    /* renamed from: b */
    private qd f25013b;
    /* renamed from: c */
    private qd f25014c;

    oy(TextView textView) {
        super(textView);
    }

    /* renamed from: a */
    void mo5413a(AttributeSet attributeSet, int i) {
        super.mo5413a(attributeSet, i);
        Context context = this.a.getContext();
        ot a = ot.m33355a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5577j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTextHelper_android_drawableStart)) {
            this.f25013b = ox.m33393a(context, a, obtainStyledAttributes.getResourceId(C5577j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C5577j.AppCompatTextHelper_android_drawableEnd)) {
            this.f25014c = ox.m33393a(context, a, obtainStyledAttributes.getResourceId(C5577j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    void mo5412a() {
        super.mo5412a();
        if (this.f25013b != null || this.f25014c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m33396a(compoundDrawablesRelative[0], this.f25013b);
            m33396a(compoundDrawablesRelative[2], this.f25014c);
        }
    }
}
