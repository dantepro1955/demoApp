package com.p000;

import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0346c;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;

/* compiled from: BottomNavigationBehavior */
/* renamed from: dca */
public class dca<V extends View> extends dcj<V> {
    /* renamed from: a */
    private static final Interpolator f21131a = new kx();
    /* renamed from: b */
    private final int f21132b;
    /* renamed from: c */
    private final int f21133c;
    /* renamed from: d */
    private boolean f21134d = false;
    /* renamed from: e */
    private ju f21135e;
    /* renamed from: f */
    private boolean f21136f = false;
    /* renamed from: g */
    private int f21137g = -1;
    /* renamed from: h */
    private final C4787a f21138h;
    /* renamed from: i */
    private boolean f21139i;

    /* compiled from: BottomNavigationBehavior */
    /* renamed from: dca$a */
    interface C4787a {
        /* renamed from: a */
        void mo4316a(CoordinatorLayout coordinatorLayout, View view, View view2);
    }

    /* compiled from: BottomNavigationBehavior */
    /* renamed from: dca$b */
    class C4788b implements C4787a {
        /* renamed from: a */
        final /* synthetic */ dca f21125a;

        private C4788b(dca dca) {
            this.f21125a = dca;
        }

        /* renamed from: a */
        public void mo4316a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!this.f21125a.f21134d && (view instanceof SnackbarLayout)) {
                if (this.f21125a.f21137g == -1) {
                    this.f21125a.f21137g = view.getHeight();
                }
                if (jd.n(view2) == 0.0f) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (this.f21125a.f21137g + this.f21125a.f21132b) - this.f21125a.f21133c);
                }
            }
        }
    }

    /* compiled from: BottomNavigationBehavior */
    /* renamed from: dca$c */
    class C4789c implements C4787a {
        /* renamed from: a */
        final /* synthetic */ dca f21126a;

        private C4789c(dca dca) {
            this.f21126a = dca;
        }

        /* renamed from: a */
        public void mo4316a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!this.f21126a.f21134d && (view instanceof SnackbarLayout)) {
                if (this.f21126a.f21137g == -1) {
                    this.f21126a.f21137g = view.getHeight();
                }
                if (jd.n(view2) == 0.0f) {
                    ((MarginLayoutParams) view.getLayoutParams()).bottomMargin = (this.f21126a.f21132b + this.f21126a.f21137g) - this.f21126a.f21133c;
                    view2.bringToFront();
                    view2.getParent().requestLayout();
                    if (VERSION.SDK_INT < 19) {
                        ((View) view2.getParent()).invalidate();
                    }
                }
            }
        }
    }

    public dca(int i, int i2, boolean z) {
        this.f21138h = VERSION.SDK_INT >= 21 ? new C4788b() : new C4789c();
        this.f21139i = true;
        this.f21132b = i;
        this.f21133c = i2;
        this.f21134d = z;
    }

    /* renamed from: b */
    public boolean m26348b(CoordinatorLayout coordinatorLayout, V v, View view) {
        this.f21138h.mo4316a(coordinatorLayout, view, v);
        return view instanceof SnackbarLayout;
    }

    /* renamed from: a */
    public void mo4317a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void m26350d(CoordinatorLayout coordinatorLayout, V v, View view) {
        m26341b(view, true);
        super.d(coordinatorLayout, v, view);
    }

    /* renamed from: b */
    private void m26341b(View view, boolean z) {
        if (!this.f21134d && (view instanceof SnackbarLayout)) {
            this.f21139i = z;
        }
    }

    /* renamed from: c */
    public boolean m26349c(CoordinatorLayout coordinatorLayout, V v, View view) {
        m26341b(view, false);
        return super.c(coordinatorLayout, v, view);
    }

    /* renamed from: a */
    public void mo4318a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        m26336a((View) v, i3);
    }

    /* renamed from: a */
    private void m26336a(V v, int i) {
        if (!this.f21139i) {
            return;
        }
        if (i == -1 && this.f21136f) {
            this.f21136f = false;
            m26340b((View) v, this.f21133c);
        } else if (i == 1 && !this.f21136f) {
            this.f21136f = true;
            m26340b((View) v, this.f21132b + this.f21133c);
        }
    }

    /* renamed from: a */
    protected boolean mo4319a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i) {
        m26336a((View) v, i);
        return true;
    }

    /* renamed from: b */
    private void m26340b(V v, int i) {
        m26339b((View) v);
        this.f21135e.m31860c((float) i).m31861c();
    }

    /* renamed from: b */
    private void m26339b(V v) {
        if (this.f21135e == null) {
            this.f21135e = jd.r(v);
            this.f21135e.m31853a(300);
            this.f21135e.m31854a(f21131a);
            return;
        }
        this.f21135e.m31859b();
    }

    /* renamed from: a */
    void m26346a(V v, boolean z) {
        if (!z && this.f21136f) {
            m26340b((View) v, this.f21133c);
        } else if (z && !this.f21136f) {
            m26340b((View) v, this.f21132b + this.f21133c);
        }
        this.f21136f = z;
    }

    /* renamed from: a */
    static <V extends View> dca<V> m26335a(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0346c) {
            Behavior b = ((C0346c) layoutParams).b();
            if (b instanceof dca) {
                return (dca) b;
            }
            throw new IllegalArgumentException("The view is not associated with BottomNavigationBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
}
