package com.p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.VisibilityAwareImageButton;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;
import p000.an.C0316d;

/* compiled from: FloatingActionButtonImpl */
/* renamed from: af */
public abstract class af {
    /* renamed from: b */
    static final Interpolator f440b = C5775v.f25658c;
    /* renamed from: j */
    static final int[] f441j = new int[]{16842919, 16842910};
    /* renamed from: k */
    static final int[] f442k = new int[]{16842908, 16842910};
    /* renamed from: l */
    static final int[] f443l = new int[]{16842910};
    /* renamed from: m */
    static final int[] f444m = new int[0];
    /* renamed from: a */
    private final Rect f445a = new Rect();
    /* renamed from: c */
    int f446c = 0;
    /* renamed from: d */
    Drawable f447d;
    /* renamed from: e */
    Drawable f448e;
    /* renamed from: f */
    C5797y f449f;
    /* renamed from: g */
    Drawable f450g;
    /* renamed from: h */
    float f451h;
    /* renamed from: i */
    float f452i;
    /* renamed from: n */
    final VisibilityAwareImageButton f453n;
    /* renamed from: o */
    final aj f454o;
    /* renamed from: p */
    final C0316d f455p;
    /* renamed from: q */
    private OnPreDrawListener f456q;

    /* compiled from: FloatingActionButtonImpl */
    /* renamed from: af$1 */
    class C01401 implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ af f933a;

        C01401(af afVar) {
            this.f933a = afVar;
        }

        public boolean onPreDraw() {
            this.f933a.mo109e();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    /* renamed from: af$a */
    public interface C0141a {
        /* renamed from: a */
        void mo412a();

        /* renamed from: b */
        void mo413b();
    }

    /* renamed from: a */
    public abstract float mo37a();

    /* renamed from: a */
    abstract void mo38a(float f, float f2);

    /* renamed from: a */
    public abstract void mo39a(int i);

    /* renamed from: a */
    public abstract void mo40a(C0141a c0141a, boolean z);

    /* renamed from: a */
    public abstract void mo41a(ColorStateList colorStateList);

    /* renamed from: a */
    public abstract void mo42a(ColorStateList colorStateList, Mode mode, int i, int i2);

    /* renamed from: a */
    public abstract void mo43a(Mode mode);

    /* renamed from: a */
    abstract void mo44a(Rect rect);

    /* renamed from: a */
    public abstract void mo45a(int[] iArr);

    /* renamed from: b */
    public abstract void mo46b();

    /* renamed from: b */
    public abstract void mo47b(C0141a c0141a, boolean z);

    /* renamed from: c */
    public abstract void mo48c();

    af(VisibilityAwareImageButton visibilityAwareImageButton, aj ajVar, C0316d c0316d) {
        this.f453n = visibilityAwareImageButton;
        this.f454o = ajVar;
        this.f455p = c0316d;
    }

    /* renamed from: a */
    public final void m530a(float f) {
        if (this.f451h != f) {
            this.f451h = f;
            mo38a(f, this.f452i);
        }
    }

    /* renamed from: b */
    public final void m540b(float f) {
        if (this.f452i != f) {
            this.f452i = f;
            mo38a(this.f451h, f);
        }
    }

    /* renamed from: f */
    public final Drawable m546f() {
        return this.f450g;
    }

    /* renamed from: g */
    public final void m547g() {
        Rect rect = this.f445a;
        mo44a(rect);
        mo166b(rect);
        this.f454o.mo417a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    void mo166b(Rect rect) {
    }

    /* renamed from: h */
    public void m548h() {
        if (mo108d()) {
            m527o();
            this.f453n.getViewTreeObserver().addOnPreDrawListener(this.f456q);
        }
    }

    /* renamed from: i */
    public void m549i() {
        if (this.f456q != null) {
            this.f453n.getViewTreeObserver().removeOnPreDrawListener(this.f456q);
            this.f456q = null;
        }
    }

    /* renamed from: d */
    boolean mo108d() {
        return false;
    }

    /* renamed from: a */
    C5797y m529a(int i, ColorStateList colorStateList) {
        Context context = this.f453n.getContext();
        C5797y j = mo167j();
        j.a(ew.m21143c(context, n$c.design_fab_stroke_top_outer_color), ew.m21143c(context, n$c.design_fab_stroke_top_inner_color), ew.m21143c(context, n$c.design_fab_stroke_end_inner_color), ew.m21143c(context, n$c.design_fab_stroke_end_outer_color));
        j.a((float) i);
        j.a(colorStateList);
        return j;
    }

    /* renamed from: j */
    C5797y mo167j() {
        return new C5797y();
    }

    /* renamed from: e */
    void mo109e() {
    }

    /* renamed from: o */
    private void m527o() {
        if (this.f456q == null) {
            this.f456q = new C01401(this);
        }
    }

    /* renamed from: k */
    GradientDrawable m551k() {
        GradientDrawable l = mo168l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    /* renamed from: l */
    GradientDrawable mo168l() {
        return new GradientDrawable();
    }

    /* renamed from: m */
    boolean m553m() {
        if (this.f453n.getVisibility() != 0) {
            if (this.f446c == 2) {
                return true;
            }
            return false;
        } else if (this.f446c == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: n */
    boolean m554n() {
        if (this.f453n.getVisibility() == 0) {
            if (this.f446c == 1) {
                return true;
            }
            return false;
        } else if (this.f446c == 2) {
            return false;
        } else {
            return true;
        }
    }
}
