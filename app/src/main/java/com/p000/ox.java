package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p000.mx.C5577j;

@TargetApi(9)
/* compiled from: AppCompatTextHelper */
/* renamed from: ox */
public class ox {
    /* renamed from: a */
    final TextView f25008a;
    /* renamed from: b */
    private qd f25009b;
    /* renamed from: c */
    private qd f25010c;
    /* renamed from: d */
    private qd f25011d;
    /* renamed from: e */
    private qd f25012e;

    /* renamed from: a */
    public static ox m33392a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new oy(textView);
        }
        return new ox(textView);
    }

    ox(TextView textView) {
        this.f25008a = textView;
    }

    /* renamed from: a */
    public void mo5413a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        ColorStateList e;
        ColorStateList colorStateList = null;
        Context context = this.f25008a.getContext();
        ot a = ot.m33355a();
        qf a2 = qf.m33777a(context, attributeSet, C5577j.AppCompatTextHelper, i, 0);
        int g = a2.m33793g(C5577j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.m33794g(C5577j.AppCompatTextHelper_android_drawableLeft)) {
            this.f25009b = ox.m33393a(context, a, a2.m33793g(C5577j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.m33794g(C5577j.AppCompatTextHelper_android_drawableTop)) {
            this.f25010c = ox.m33393a(context, a, a2.m33793g(C5577j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.m33794g(C5577j.AppCompatTextHelper_android_drawableRight)) {
            this.f25011d = ox.m33393a(context, a, a2.m33793g(C5577j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.m33794g(C5577j.AppCompatTextHelper_android_drawableBottom)) {
            this.f25012e = ox.m33393a(context, a, a2.m33793g(C5577j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.m33781a();
        boolean z3 = this.f25008a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            qf a3 = qf.m33775a(context, g, C5577j.TextAppearance);
            if (z3 || !a3.m33794g(C5577j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.m33782a(C5577j.TextAppearance_textAllCaps, false);
                z = true;
            }
            if (VERSION.SDK_INT < 23) {
                if (a3.m33794g(C5577j.TextAppearance_android_textColor)) {
                    e = a3.m33790e(C5577j.TextAppearance_android_textColor);
                } else {
                    e = null;
                }
                if (a3.m33794g(C5577j.TextAppearance_android_textColorHint)) {
                    colorStateList = a3.m33790e(C5577j.TextAppearance_android_textColorHint);
                }
            } else {
                e = null;
            }
            a3.m33781a();
        } else {
            e = null;
            z = false;
            z2 = false;
        }
        qf a4 = qf.m33777a(context, attributeSet, C5577j.TextAppearance, i, 0);
        if (!z3 && a4.m33794g(C5577j.TextAppearance_textAllCaps)) {
            z2 = a4.m33782a(C5577j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.m33794g(C5577j.TextAppearance_android_textColor)) {
                e = a4.m33790e(C5577j.TextAppearance_android_textColor);
            }
            if (a4.m33794g(C5577j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.m33790e(C5577j.TextAppearance_android_textColorHint);
            }
        }
        a4.m33781a();
        if (e != null) {
            this.f25008a.setTextColor(e);
        }
        if (colorStateList != null) {
            this.f25008a.setHintTextColor(colorStateList);
        }
        if (!z3 && r0) {
            m33398a(z2);
        }
    }

    /* renamed from: a */
    public void m33395a(Context context, int i) {
        qf a = qf.m33775a(context, i, C5577j.TextAppearance);
        if (a.m33794g(C5577j.TextAppearance_textAllCaps)) {
            m33398a(a.m33782a(C5577j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.m33794g(C5577j.TextAppearance_android_textColor)) {
            ColorStateList e = a.m33790e(C5577j.TextAppearance_android_textColor);
            if (e != null) {
                this.f25008a.setTextColor(e);
            }
        }
        a.m33781a();
    }

    /* renamed from: a */
    public void m33398a(boolean z) {
        this.f25008a.setTransformationMethod(z ? new nf(this.f25008a.getContext()) : null);
    }

    /* renamed from: a */
    public void mo5412a() {
        if (this.f25009b != null || this.f25010c != null || this.f25011d != null || this.f25012e != null) {
            Drawable[] compoundDrawables = this.f25008a.getCompoundDrawables();
            m33396a(compoundDrawables[0], this.f25009b);
            m33396a(compoundDrawables[1], this.f25010c);
            m33396a(compoundDrawables[2], this.f25011d);
            m33396a(compoundDrawables[3], this.f25012e);
        }
    }

    /* renamed from: a */
    final void m33396a(Drawable drawable, qd qdVar) {
        if (drawable != null && qdVar != null) {
            ot.m33358a(drawable, qdVar, this.f25008a.getDrawableState());
        }
    }

    /* renamed from: a */
    protected static qd m33393a(Context context, ot otVar, int i) {
        ColorStateList b = otVar.m33377b(context, i);
        if (b == null) {
            return null;
        }
        qd qdVar = new qd();
        qdVar.f25199d = true;
        qdVar.f25196a = b;
        return qdVar;
    }
}
