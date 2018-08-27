package com.p000;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ViewPropertyAnimatorCompat */
/* renamed from: ju */
public final class ju {
    /* renamed from: d */
    static final C5457g f24295d;
    /* renamed from: a */
    Runnable f24296a = null;
    /* renamed from: b */
    Runnable f24297b = null;
    /* renamed from: c */
    int f24298c = -1;
    /* renamed from: e */
    private WeakReference<View> f24299e;

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$g */
    interface C5457g {
        /* renamed from: a */
        long mo5029a(ju juVar, View view);

        /* renamed from: a */
        void mo5030a(ju juVar, View view, float f);

        /* renamed from: a */
        void mo5031a(ju juVar, View view, long j);

        /* renamed from: a */
        void mo5032a(ju juVar, View view, Interpolator interpolator);

        /* renamed from: a */
        void mo5033a(ju juVar, View view, jy jyVar);

        /* renamed from: a */
        void mo5034a(ju juVar, View view, ka kaVar);

        /* renamed from: b */
        void mo5035b(ju juVar, View view);

        /* renamed from: b */
        void mo5036b(ju juVar, View view, float f);

        /* renamed from: b */
        void mo5037b(ju juVar, View view, long j);

        /* renamed from: c */
        void mo5038c(ju juVar, View view);

        /* renamed from: c */
        void mo5039c(ju juVar, View view, float f);

        /* renamed from: d */
        void mo5040d(ju juVar, View view, float f);

        /* renamed from: e */
        void mo5041e(ju juVar, View view, float f);
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$a */
    static class C5458a implements C5457g {
        /* renamed from: a */
        WeakHashMap<View, Runnable> f24291a = null;

        /* compiled from: ViewPropertyAnimatorCompat */
        /* renamed from: ju$a$a */
        class C5456a implements Runnable {
            /* renamed from: a */
            WeakReference<View> f24288a;
            /* renamed from: b */
            ju f24289b;
            /* renamed from: c */
            final /* synthetic */ C5458a f24290c;

            C5456a(C5458a c5458a, ju juVar, View view) {
                this.f24290c = c5458a;
                this.f24288a = new WeakReference(view);
                this.f24289b = juVar;
            }

            public void run() {
                View view = (View) this.f24288a.get();
                if (view != null) {
                    this.f24290c.m31831d(this.f24289b, view);
                }
            }
        }

        C5458a() {
        }

        /* renamed from: a */
        public void mo5031a(ju juVar, View view, long j) {
        }

        /* renamed from: a */
        public void mo5030a(ju juVar, View view, float f) {
            m31819e(juVar, view);
        }

        /* renamed from: b */
        public void mo5036b(ju juVar, View view, float f) {
            m31819e(juVar, view);
        }

        /* renamed from: c */
        public void mo5039c(ju juVar, View view, float f) {
            m31819e(juVar, view);
        }

        /* renamed from: a */
        public long mo5029a(ju juVar, View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo5032a(ju juVar, View view, Interpolator interpolator) {
        }

        /* renamed from: b */
        public void mo5037b(ju juVar, View view, long j) {
        }

        /* renamed from: d */
        public void mo5040d(ju juVar, View view, float f) {
            m31819e(juVar, view);
        }

        /* renamed from: e */
        public void mo5041e(ju juVar, View view, float f) {
            m31819e(juVar, view);
        }

        /* renamed from: b */
        public void mo5035b(ju juVar, View view) {
            m31819e(juVar, view);
        }

        /* renamed from: c */
        public void mo5038c(ju juVar, View view) {
            m31818a(view);
            m31831d(juVar, view);
        }

        /* renamed from: a */
        public void mo5033a(ju juVar, View view, jy jyVar) {
            view.setTag(2113929216, jyVar);
        }

        /* renamed from: a */
        public void mo5034a(ju juVar, View view, ka kaVar) {
        }

        /* renamed from: d */
        void m31831d(ju juVar, View view) {
            jy jyVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof jy) {
                jyVar = (jy) tag;
            } else {
                jyVar = null;
            }
            Runnable runnable = juVar.f24296a;
            Runnable runnable2 = juVar.f24297b;
            juVar.f24296a = null;
            juVar.f24297b = null;
            if (runnable != null) {
                runnable.run();
            }
            if (jyVar != null) {
                jyVar.mo3877a(view);
                jyVar.mo3878b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f24291a != null) {
                this.f24291a.remove(view);
            }
        }

        /* renamed from: a */
        private void m31818a(View view) {
            if (this.f24291a != null) {
                Runnable runnable = (Runnable) this.f24291a.get(view);
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }

        /* renamed from: e */
        private void m31819e(ju juVar, View view) {
            Runnable runnable = null;
            if (this.f24291a != null) {
                runnable = (Runnable) this.f24291a.get(view);
            }
            if (runnable == null) {
                runnable = new C5456a(this, juVar, view);
                if (this.f24291a == null) {
                    this.f24291a = new WeakHashMap();
                }
                this.f24291a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$b */
    static class C5460b extends C5458a {
        /* renamed from: b */
        WeakHashMap<View, Integer> f24294b = null;

        /* compiled from: ViewPropertyAnimatorCompat */
        /* renamed from: ju$b$a */
        static class C5459a implements jy {
            /* renamed from: a */
            ju f24292a;
            /* renamed from: b */
            boolean f24293b;

            C5459a(ju juVar) {
                this.f24292a = juVar;
            }

            /* renamed from: a */
            public void mo3877a(View view) {
                jy jyVar;
                this.f24293b = false;
                if (this.f24292a.f24298c >= 0) {
                    jd.a(view, 2, null);
                }
                if (this.f24292a.f24296a != null) {
                    Runnable runnable = this.f24292a.f24296a;
                    this.f24292a.f24296a = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof jy) {
                    jyVar = (jy) tag;
                } else {
                    jyVar = null;
                }
                if (jyVar != null) {
                    jyVar.mo3877a(view);
                }
            }

            /* renamed from: b */
            public void mo3878b(View view) {
                if (this.f24292a.f24298c >= 0) {
                    jd.a(view, this.f24292a.f24298c, null);
                    this.f24292a.f24298c = -1;
                }
                if (VERSION.SDK_INT >= 16 || !this.f24293b) {
                    jy jyVar;
                    if (this.f24292a.f24297b != null) {
                        Runnable runnable = this.f24292a.f24297b;
                        this.f24292a.f24297b = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(2113929216);
                    if (tag instanceof jy) {
                        jyVar = (jy) tag;
                    } else {
                        jyVar = null;
                    }
                    if (jyVar != null) {
                        jyVar.mo3878b(view);
                    }
                    this.f24293b = true;
                }
            }

            /* renamed from: c */
            public void mo3879c(View view) {
                jy jyVar;
                Object tag = view.getTag(2113929216);
                if (tag instanceof jy) {
                    jyVar = (jy) tag;
                } else {
                    jyVar = null;
                }
                if (jyVar != null) {
                    jyVar.mo3879c(view);
                }
            }
        }

        C5460b() {
        }

        /* renamed from: a */
        public void mo5031a(ju juVar, View view, long j) {
            jv.m31866a(view, j);
        }

        /* renamed from: a */
        public void mo5030a(ju juVar, View view, float f) {
            jv.m31865a(view, f);
        }

        /* renamed from: b */
        public void mo5036b(ju juVar, View view, float f) {
            jv.m31870b(view, f);
        }

        /* renamed from: c */
        public void mo5039c(ju juVar, View view, float f) {
            jv.m31873c(view, f);
        }

        /* renamed from: a */
        public long mo5029a(ju juVar, View view) {
            return jv.m31864a(view);
        }

        /* renamed from: a */
        public void mo5032a(ju juVar, View view, Interpolator interpolator) {
            jv.m31867a(view, interpolator);
        }

        /* renamed from: b */
        public void mo5037b(ju juVar, View view, long j) {
            jv.m31871b(view, j);
        }

        /* renamed from: d */
        public void mo5040d(ju juVar, View view, float f) {
            jv.m31874d(view, f);
        }

        /* renamed from: e */
        public void mo5041e(ju juVar, View view, float f) {
            jv.m31875e(view, f);
        }

        /* renamed from: b */
        public void mo5035b(ju juVar, View view) {
            jv.m31869b(view);
        }

        /* renamed from: c */
        public void mo5038c(ju juVar, View view) {
            jv.m31872c(view);
        }

        /* renamed from: a */
        public void mo5033a(ju juVar, View view, jy jyVar) {
            view.setTag(2113929216, jyVar);
            jv.m31868a(view, new C5459a(juVar));
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$d */
    static class C5461d extends C5460b {
        C5461d() {
        }

        /* renamed from: a */
        public void mo5033a(ju juVar, View view, jy jyVar) {
            jw.m31876a(view, jyVar);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$c */
    static class C5462c extends C5461d {
        C5462c() {
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$e */
    static class C5463e extends C5462c {
        C5463e() {
        }

        /* renamed from: a */
        public void mo5034a(ju juVar, View view, ka kaVar) {
            jx.m31877a(view, kaVar);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    /* renamed from: ju$f */
    static class C5464f extends C5463e {
        C5464f() {
        }
    }

    ju(View view) {
        this.f24299e = new WeakReference(view);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f24295d = new C5464f();
        } else if (i >= 19) {
            f24295d = new C5463e();
        } else if (i >= 18) {
            f24295d = new C5462c();
        } else if (i >= 16) {
            f24295d = new C5461d();
        } else if (i >= 14) {
            f24295d = new C5460b();
        } else {
            f24295d = new C5458a();
        }
    }

    /* renamed from: a */
    public ju m31853a(long j) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5031a(this, view, j);
        }
        return this;
    }

    /* renamed from: a */
    public ju m31852a(float f) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5030a(this, view, f);
        }
        return this;
    }

    /* renamed from: b */
    public ju m31857b(float f) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5036b(this, view, f);
        }
        return this;
    }

    /* renamed from: c */
    public ju m31860c(float f) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5039c(this, view, f);
        }
        return this;
    }

    /* renamed from: a */
    public long m31851a() {
        View view = (View) this.f24299e.get();
        if (view != null) {
            return f24295d.mo5029a(this, view);
        }
        return 0;
    }

    /* renamed from: a */
    public ju m31854a(Interpolator interpolator) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5032a(this, view, interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public ju m31858b(long j) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5037b(this, view, j);
        }
        return this;
    }

    /* renamed from: d */
    public ju m31862d(float f) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5040d(this, view, f);
        }
        return this;
    }

    /* renamed from: e */
    public ju m31863e(float f) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5041e(this, view, f);
        }
        return this;
    }

    /* renamed from: b */
    public void m31859b() {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5035b(this, view);
        }
    }

    /* renamed from: c */
    public void m31861c() {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5038c(this, view);
        }
    }

    /* renamed from: a */
    public ju m31855a(jy jyVar) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5033a(this, view, jyVar);
        }
        return this;
    }

    /* renamed from: a */
    public ju m31856a(ka kaVar) {
        View view = (View) this.f24299e.get();
        if (view != null) {
            f24295d.mo5034a(this, view, kaVar);
        }
        return this;
    }
}
