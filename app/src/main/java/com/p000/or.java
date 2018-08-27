package com.p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import p000.mx.C5577j;

/* compiled from: AppCompatBackgroundHelper */
/* renamed from: or */
public class or {
    /* renamed from: a */
    private final View f24970a;
    /* renamed from: b */
    private final ot f24971b;
    /* renamed from: c */
    private int f24972c = -1;
    /* renamed from: d */
    private qd f24973d;
    /* renamed from: e */
    private qd f24974e;
    /* renamed from: f */
    private qd f24975f;

    public or(View view) {
        this.f24970a = view;
        this.f24971b = ot.m33355a();
    }

    /* renamed from: a */
    public void m33331a(AttributeSet attributeSet, int i) {
        qf a = qf.m33777a(this.f24970a.getContext(), attributeSet, C5577j.ViewBackgroundHelper, i, 0);
        try {
            if (a.m33794g(C5577j.ViewBackgroundHelper_android_background)) {
                this.f24972c = a.m33793g(C5577j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f24971b.m33377b(this.f24970a.getContext(), this.f24972c);
                if (b != null) {
                    m33333b(b);
                }
            }
            if (a.m33794g(C5577j.ViewBackgroundHelper_backgroundTint)) {
                jd.a(this.f24970a, a.m33790e(C5577j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m33794g(C5577j.ViewBackgroundHelper_backgroundTintMode)) {
                jd.a(this.f24970a, pi.m33599a(a.m33779a(C5577j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            a.m33781a();
        } catch (Throwable th) {
            a.m33781a();
        }
    }

    /* renamed from: a */
    public void m33327a(int i) {
        this.f24972c = i;
        m33333b(this.f24971b != null ? this.f24971b.m33377b(this.f24970a.getContext(), i) : null);
        m33334c();
    }

    /* renamed from: a */
    public void m33330a(Drawable drawable) {
        this.f24972c = -1;
        m33333b(null);
        m33334c();
    }

    /* renamed from: a */
    public void m33328a(ColorStateList colorStateList) {
        if (this.f24974e == null) {
            this.f24974e = new qd();
        }
        this.f24974e.f25196a = colorStateList;
        this.f24974e.f25199d = true;
        m33334c();
    }

    /* renamed from: a */
    public ColorStateList m33326a() {
        return this.f24974e != null ? this.f24974e.f25196a : null;
    }

    /* renamed from: a */
    public void m33329a(Mode mode) {
        if (this.f24974e == null) {
            this.f24974e = new qd();
        }
        this.f24974e.f25197b = mode;
        this.f24974e.f25198c = true;
        m33334c();
    }

    /* renamed from: b */
    public Mode m33332b() {
        return this.f24974e != null ? this.f24974e.f25197b : null;
    }

    /* renamed from: c */
    public void m33334c() {
        Drawable background = this.f24970a.getBackground();
        if (background == null) {
            return;
        }
        if (!m33325d() || !m33324b(background)) {
            if (this.f24974e != null) {
                ot.m33358a(background, this.f24974e, this.f24970a.getDrawableState());
            } else if (this.f24973d != null) {
                ot.m33358a(background, this.f24973d, this.f24970a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    void m33333b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f24973d == null) {
                this.f24973d = new qd();
            }
            this.f24973d.f25196a = colorStateList;
            this.f24973d.f25199d = true;
        } else {
            this.f24973d = null;
        }
        m33334c();
    }

    /* renamed from: d */
    private boolean m33325d() {
        int i = VERSION.SDK_INT;
        if (i < 21) {
            return false;
        }
        if (i == 21 || this.f24973d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m33324b(Drawable drawable) {
        if (this.f24975f == null) {
            this.f24975f = new qd();
        }
        qd qdVar = this.f24975f;
        qdVar.m33774a();
        ColorStateList D = jd.D(this.f24970a);
        if (D != null) {
            qdVar.f25199d = true;
            qdVar.f25196a = D;
        }
        Mode E = jd.E(this.f24970a);
        if (E != null) {
            qdVar.f25198c = true;
            qdVar.f25197b = E;
        }
        if (!qdVar.f25199d && !qdVar.f25198c) {
            return false;
        }
        ot.m33358a(drawable, qdVar, this.f24970a.getDrawableState());
        return true;
    }
}
