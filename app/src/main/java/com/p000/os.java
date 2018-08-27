package com.p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000.mx.C5577j;

/* compiled from: AppCompatCompoundButtonHelper */
/* renamed from: os */
public class os {
    /* renamed from: a */
    private final CompoundButton f24976a;
    /* renamed from: b */
    private ColorStateList f24977b = null;
    /* renamed from: c */
    private Mode f24978c = null;
    /* renamed from: d */
    private boolean f24979d = false;
    /* renamed from: e */
    private boolean f24980e = false;
    /* renamed from: f */
    private boolean f24981f;

    public os(CompoundButton compoundButton) {
        this.f24976a = compoundButton;
    }

    /* renamed from: a */
    public void m33339a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f24976a.getContext().obtainStyledAttributes(attributeSet, C5577j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C5577j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C5577j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f24976a.setButtonDrawable(na.m32939b(this.f24976a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C5577j.CompoundButton_buttonTint)) {
                lb.m32376a(this.f24976a, obtainStyledAttributes.getColorStateList(C5577j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C5577j.CompoundButton_buttonTintMode)) {
                lb.m32377a(this.f24976a, pi.m33599a(obtainStyledAttributes.getInt(C5577j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void m33337a(ColorStateList colorStateList) {
        this.f24977b = colorStateList;
        this.f24979d = true;
        m33342d();
    }

    /* renamed from: a */
    public ColorStateList m33336a() {
        return this.f24977b;
    }

    /* renamed from: a */
    public void m33338a(Mode mode) {
        this.f24978c = mode;
        this.f24980e = true;
        m33342d();
    }

    /* renamed from: b */
    public Mode m33340b() {
        return this.f24978c;
    }

    /* renamed from: c */
    public void m33341c() {
        if (this.f24981f) {
            this.f24981f = false;
            return;
        }
        this.f24981f = true;
        m33342d();
    }

    /* renamed from: d */
    void m33342d() {
        Drawable a = lb.m32375a(this.f24976a);
        if (a == null) {
            return;
        }
        if (this.f24979d || this.f24980e) {
            a = fp.g(a).mutate();
            if (this.f24979d) {
                fp.a(a, this.f24977b);
            }
            if (this.f24980e) {
                fp.a(a, this.f24978c);
            }
            if (a.isStateful()) {
                a.setState(this.f24976a.getDrawableState());
            }
            this.f24976a.setButtonDrawable(a);
        }
    }

    /* renamed from: a */
    public int m33335a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = lb.m32375a(this.f24976a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
