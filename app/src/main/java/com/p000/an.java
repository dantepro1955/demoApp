package com.p000;

import android.view.animation.Interpolator;

/* compiled from: ValueAnimatorCompat */
/* renamed from: an */
public class an {
    /* renamed from: a */
    private final C0317e f2096a;

    /* compiled from: ValueAnimatorCompat */
    /* renamed from: an$a */
    public interface C0077a {
        /* renamed from: b */
        void mo32b(an anVar);

        /* renamed from: c */
        void mo33c(an anVar);

        /* renamed from: d */
        void mo34d(an anVar);
    }

    /* compiled from: ValueAnimatorCompat */
    /* renamed from: an$b */
    public static class C0078b implements C0077a {
        protected C0078b() {
        }

        /* renamed from: c */
        public void mo33c(an anVar) {
        }

        /* renamed from: b */
        public void mo32b(an anVar) {
        }

        /* renamed from: d */
        public void mo34d(an anVar) {
        }
    }

    /* compiled from: ValueAnimatorCompat */
    /* renamed from: an$c */
    public interface C0079c {
        /* renamed from: a */
        void mo35a(an anVar);
    }

    /* compiled from: ValueAnimatorCompat */
    /* renamed from: an$d */
    public interface C0316d {
        /* renamed from: a */
        an mo715a();
    }

    /* compiled from: ValueAnimatorCompat */
    /* renamed from: an$e */
    static abstract class C0317e {

        /* compiled from: ValueAnimatorCompat */
        /* renamed from: an$e$b */
        interface C0312b {
            /* renamed from: a */
            void mo357a();
        }

        /* compiled from: ValueAnimatorCompat */
        /* renamed from: an$e$a */
        interface C0314a {
            /* renamed from: a */
            void mo358a();

            /* renamed from: b */
            void mo359b();

            /* renamed from: c */
            void mo360c();
        }

        /* renamed from: a */
        abstract void mo574a();

        /* renamed from: a */
        abstract void mo575a(float f, float f2);

        /* renamed from: a */
        abstract void mo576a(int i, int i2);

        /* renamed from: a */
        abstract void mo577a(long j);

        /* renamed from: a */
        abstract void mo578a(C0314a c0314a);

        /* renamed from: a */
        abstract void mo579a(C0312b c0312b);

        /* renamed from: a */
        abstract void mo580a(Interpolator interpolator);

        /* renamed from: b */
        abstract boolean mo581b();

        /* renamed from: c */
        abstract int mo582c();

        /* renamed from: d */
        abstract float mo583d();

        /* renamed from: e */
        abstract void mo584e();

        /* renamed from: f */
        abstract float mo585f();

        /* renamed from: g */
        abstract void mo586g();

        /* renamed from: h */
        abstract long mo587h();

        C0317e() {
        }
    }

    an(C0317e c0317e) {
        this.f2096a = c0317e;
    }

    /* renamed from: a */
    public void m2792a() {
        this.f2096a.mo574a();
    }

    /* renamed from: b */
    public boolean m2799b() {
        return this.f2096a.mo581b();
    }

    /* renamed from: a */
    public void m2798a(Interpolator interpolator) {
        this.f2096a.mo580a(interpolator);
    }

    /* renamed from: a */
    public void m2797a(final C0079c c0079c) {
        if (c0079c != null) {
            this.f2096a.mo579a(new C0312b(this) {
                /* renamed from: b */
                final /* synthetic */ an f2093b;

                /* renamed from: a */
                public void mo357a() {
                    c0079c.mo35a(this.f2093b);
                }
            });
        } else {
            this.f2096a.mo579a(null);
        }
    }

    /* renamed from: a */
    public void m2796a(final C0077a c0077a) {
        if (c0077a != null) {
            this.f2096a.mo578a(new C0314a(this) {
                /* renamed from: b */
                final /* synthetic */ an f2095b;

                /* renamed from: a */
                public void mo358a() {
                    c0077a.mo33c(this.f2095b);
                }

                /* renamed from: b */
                public void mo359b() {
                    c0077a.mo32b(this.f2095b);
                }

                /* renamed from: c */
                public void mo360c() {
                    c0077a.mo34d(this.f2095b);
                }
            });
        } else {
            this.f2096a.mo578a(null);
        }
    }

    /* renamed from: a */
    public void m2794a(int i, int i2) {
        this.f2096a.mo576a(i, i2);
    }

    /* renamed from: c */
    public int m2800c() {
        return this.f2096a.mo582c();
    }

    /* renamed from: a */
    public void m2793a(float f, float f2) {
        this.f2096a.mo575a(f, f2);
    }

    /* renamed from: d */
    public float m2801d() {
        return this.f2096a.mo583d();
    }

    /* renamed from: a */
    public void m2795a(long j) {
        this.f2096a.mo577a(j);
    }

    /* renamed from: e */
    public void m2802e() {
        this.f2096a.mo584e();
    }

    /* renamed from: f */
    public float m2803f() {
        return this.f2096a.mo585f();
    }

    /* renamed from: g */
    public void m2804g() {
        this.f2096a.mo586g();
    }

    /* renamed from: h */
    public long m2805h() {
        return this.f2096a.mo587h();
    }
}
