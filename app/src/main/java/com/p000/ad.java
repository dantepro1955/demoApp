package com.p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.widget.VisibilityAwareImageButton;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import p000.C5775v.C5774a;
import p000.af.C0141a;
import p000.an.C0077a;
import p000.an.C0078b;
import p000.an.C0079c;
import p000.an.C0316d;

/* compiled from: FloatingActionButtonGingerbread */
/* renamed from: ad */
public class ad extends af {
    /* renamed from: a */
    ai f457a;
    /* renamed from: q */
    private final al f458q = new al();

    /* compiled from: FloatingActionButtonGingerbread */
    /* renamed from: ad$d */
    abstract class C0080d extends C0078b implements C0079c {
        /* renamed from: a */
        private boolean f433a;
        /* renamed from: b */
        final /* synthetic */ ad f434b;
        /* renamed from: c */
        private float f435c;
        /* renamed from: d */
        private float f436d;

        /* renamed from: a */
        protected abstract float mo36a();

        private C0080d(ad adVar) {
            this.f434b = adVar;
        }

        /* renamed from: a */
        public void mo35a(an anVar) {
            if (!this.f433a) {
                this.f435c = this.f434b.f457a.m1650a();
                this.f436d = mo36a();
                this.f433a = true;
            }
            this.f434b.f457a.m1654b(this.f435c + ((this.f436d - this.f435c) * anVar.m2803f()));
        }

        /* renamed from: b */
        public void mo32b(an anVar) {
            this.f434b.f457a.m1654b(this.f436d);
            this.f433a = false;
        }
    }

    /* compiled from: FloatingActionButtonGingerbread */
    /* renamed from: ad$a */
    class C0081a extends C0080d {
        /* renamed from: a */
        final /* synthetic */ ad f437a;

        C0081a(ad adVar) {
            this.f437a = adVar;
            super();
        }

        /* renamed from: a */
        protected float mo36a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonGingerbread */
    /* renamed from: ad$b */
    class C0082b extends C0080d {
        /* renamed from: a */
        final /* synthetic */ ad f438a;

        C0082b(ad adVar) {
            this.f438a = adVar;
            super();
        }

        /* renamed from: a */
        protected float mo36a() {
            return this.f438a.h + this.f438a.i;
        }
    }

    /* compiled from: FloatingActionButtonGingerbread */
    /* renamed from: ad$c */
    class C0083c extends C0080d {
        /* renamed from: a */
        final /* synthetic */ ad f439a;

        C0083c(ad adVar) {
            this.f439a = adVar;
            super();
        }

        /* renamed from: a */
        protected float mo36a() {
            return this.f439a.h;
        }
    }

    public ad(VisibilityAwareImageButton visibilityAwareImageButton, aj ajVar, C0316d c0316d) {
        super(visibilityAwareImageButton, ajVar, c0316d);
        this.f458q.m2399a(j, m555a(new C0082b(this)));
        this.f458q.m2399a(k, m555a(new C0082b(this)));
        this.f458q.m2399a(l, m555a(new C0083c(this)));
        this.f458q.m2399a(m, m555a(new C0081a(this)));
    }

    /* renamed from: a */
    void mo42a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.d = fp.m21159g(m551k());
        fp.m21148a(this.d, colorStateList);
        if (mode != null) {
            fp.m21151a(this.d, mode);
        }
        this.e = fp.m21159g(m551k());
        fp.m21148a(this.e, ad.m556b(i));
        if (i2 > 0) {
            this.f = m529a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f, this.d, this.e};
        } else {
            this.f = null;
            drawableArr = new Drawable[]{this.d, this.e};
        }
        this.g = new LayerDrawable(drawableArr);
        this.f457a = new ai(this.n.getContext(), this.g, this.o.mo416a(), this.h, this.h + this.i);
        this.f457a.m1653a(false);
        this.o.mo418a(this.f457a);
    }

    /* renamed from: a */
    void mo41a(ColorStateList colorStateList) {
        if (this.d != null) {
            fp.m21148a(this.d, colorStateList);
        }
        if (this.f != null) {
            this.f.a(colorStateList);
        }
    }

    /* renamed from: a */
    void mo43a(Mode mode) {
        if (this.d != null) {
            fp.m21151a(this.d, mode);
        }
    }

    /* renamed from: a */
    void mo39a(int i) {
        if (this.e != null) {
            fp.m21148a(this.e, ad.m556b(i));
        }
    }

    /* renamed from: a */
    float mo37a() {
        return this.h;
    }

    /* renamed from: a */
    void mo38a(float f, float f2) {
        if (this.f457a != null) {
            this.f457a.m1652a(f, this.i + f);
            m547g();
        }
    }

    /* renamed from: a */
    void mo45a(int[] iArr) {
        this.f458q.m2398a(iArr);
    }

    /* renamed from: b */
    void mo46b() {
        this.f458q.m2397a();
    }

    /* renamed from: a */
    void mo40a(final C0141a c0141a, final boolean z) {
        if (!m554n()) {
            this.c = 1;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.n.getContext(), n$a.design_fab_out);
            loadAnimation.setInterpolator(C5775v.f25658c);
            loadAnimation.setDuration(200);
            loadAnimation.setAnimationListener(new C5774a(this) {
                /* renamed from: c */
                final /* synthetic */ ad f430c;

                public void onAnimationEnd(Animation animation) {
                    this.f430c.c = 0;
                    this.f430c.n.m3176a(z ? 8 : 4, z);
                    if (c0141a != null) {
                        c0141a.mo413b();
                    }
                }
            });
            this.n.startAnimation(loadAnimation);
        }
    }

    /* renamed from: b */
    void mo47b(final C0141a c0141a, boolean z) {
        if (!m553m()) {
            this.c = 2;
            this.n.m3176a(0, z);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.n.getContext(), n$a.design_fab_in);
            loadAnimation.setDuration(200);
            loadAnimation.setInterpolator(C5775v.f25659d);
            loadAnimation.setAnimationListener(new C5774a(this) {
                /* renamed from: b */
                final /* synthetic */ ad f432b;

                public void onAnimationEnd(Animation animation) {
                    this.f432b.c = 0;
                    if (c0141a != null) {
                        c0141a.mo412a();
                    }
                }
            });
            this.n.startAnimation(loadAnimation);
        }
    }

    /* renamed from: c */
    void mo48c() {
    }

    /* renamed from: a */
    void mo44a(Rect rect) {
        this.f457a.getPadding(rect);
    }

    /* renamed from: a */
    private an m555a(C0080d c0080d) {
        an a = this.p.mo715a();
        a.m2798a(b);
        a.m2795a(100);
        a.m2796a((C0077a) c0080d);
        a.m2797a((C0079c) c0080d);
        a.m2793a(0.0f, 1.0f);
        return a;
    }

    /* renamed from: b */
    private static ColorStateList m556b(int i) {
        r0 = new int[3][];
        int[] iArr = new int[]{k, i, j};
        iArr[1] = i;
        r0[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r0, iArr);
    }
}
