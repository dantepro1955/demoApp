package com.p000;

/* renamed from: g */
public abstract class C5334g extends drh implements dze {
    /* renamed from: e */
    private final C4697d f23734e;
    /* renamed from: f */
    private final qz f23735f = new C53301(this);
    /* renamed from: g */
    private rc f23736g = null;
    /* renamed from: h */
    private final rb f23737h;
    /* renamed from: i */
    private final rb f23738i;
    /* renamed from: j */
    private final rb f23739j;
    /* renamed from: k */
    private final rb f23740k;
    /* renamed from: l */
    private final boolean f23741l;
    /* renamed from: m */
    private final boolean f23742m;
    /* renamed from: n */
    private final rd<?> f23743n;
    /* renamed from: o */
    private final qw f23744o = new C53332(this);

    /* renamed from: g$1 */
    class C53301 implements qz {
        /* renamed from: a */
        final /* synthetic */ C5334g f23730a;

        /* renamed from: g$1$1 */
        class C53281 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C53301 f23727a;

            C53281(C53301 c53301) {
                this.f23727a = c53301;
            }

            public final void run() {
                ((C1629c) this.f23727a.f23730a.a).b();
            }
        }

        C53301(C5334g c5334g) {
            this.f23730a = c5334g;
        }

        /* renamed from: a */
        public final void mo4742a() {
            qu.m33922a(new C53281(this));
        }

        /* renamed from: a */
        public final void mo4743a(float f) {
            this.f23730a.f23734e.mo4258a(f);
        }

        /* renamed from: a */
        public final void mo4744a(final int i) {
            qu.m33922a(new Runnable(this) {
                /* renamed from: b */
                private /* synthetic */ C53301 f23729b;

                public final void run() {
                    if (i == 4) {
                        czl.m25831c(this.f23729b.f23730a, "Recorder error");
                        ((C1629c) this.f23729b.f23730a.a).a();
                        return;
                    }
                    ((C1629c) this.f23729b.f23730a.a).c();
                }
            });
        }
    }

    /* renamed from: g$2 */
    class C53332 implements qw {
        /* renamed from: a */
        final /* synthetic */ C5334g f23733a;

        /* renamed from: g$2$1 */
        class C53311 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C53332 f23731a;

            C53311(C53332 c53332) {
                this.f23731a = c53332;
            }

            public final void run() {
                ((C1629c) this.f23731a.f23733a.a).b_();
            }
        }

        /* renamed from: g$2$2 */
        class C53322 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C53332 f23732a;

            C53322(C53332 c53332) {
                this.f23732a = c53332;
            }

            public final void run() {
                ((C1629c) this.f23732a.f23733a.a).c_();
            }
        }

        C53332(C5334g c5334g) {
            this.f23733a = c5334g;
        }

        /* renamed from: a */
        public final void mo4745a(Object obj) {
            czl.m25831c(this.f23733a, "Prompt error");
            qu.m33922a(new C53311(this));
        }

        /* renamed from: b */
        public final void mo4746b(Object obj) {
        }

        /* renamed from: c */
        public final void mo4747c(Object obj) {
            qu.m33922a(new C53322(this));
        }
    }

    public C5334g(dot dot, drj drj, boolean z, boolean z2, String str, qy qyVar, qy qyVar2, qy qyVar3, qy qyVar4, rd<?> rdVar, C4697d c4697d, C0951b c0951b) {
        super(dot, drj, str, c0951b);
        this.f23743n = rdVar;
        this.f23734e = c4697d;
        this.f23741l = z;
        this.f23742m = z2;
        this.f23737h = qyVar == null ? null : new rb(qyVar, drj.m28848a(), this, this.f23744o);
        this.f23738i = qyVar2 == null ? null : new rb(qyVar2, drj.m28848a(), this, this.f23744o);
        this.f23739j = qyVar3 == null ? null : new rb(qyVar3, drj.m28848a(), this, this.f23744o);
        this.f23740k = qyVar4 == null ? null : new rb(qyVar4, drj.m28848a(), this, this.f23744o);
        this.a = new C5256e(this);
    }

    /* renamed from: b */
    protected abstract void mo5163b() throws drk;

    /* renamed from: c */
    protected abstract String mo5164c();

    /* renamed from: d */
    protected abstract String mo5165d();

    final rd<?> d_() {
        return this.f23743n;
    }

    /* renamed from: e */
    protected abstract boolean mo5166e();

    /* renamed from: f */
    public final void mo4480f() {
        ((C1629c) this.a).f();
    }

    /* renamed from: g */
    final boolean m30301g() {
        if (this.f23737h == null) {
            return false;
        }
        this.f23737h.m33956a();
        return true;
    }

    /* renamed from: h */
    final void m30302h() {
        if (this.f23737h != null) {
            this.f23737h.m33957b();
        }
    }

    /* renamed from: i */
    final void m30303i() {
        if (this.f23738i != null) {
            this.f23738i.m33956a();
        }
    }

    /* renamed from: j */
    final void m30304j() {
        if (this.f23739j != null) {
            this.f23739j.m33956a();
        }
    }

    /* renamed from: k */
    final void m30305k() {
        if (this.f23740k != null) {
            this.f23740k.m33956a();
        }
    }

    /* renamed from: l */
    public final void m30306l() {
        this.f23736g = new rc(this.c, this.f23741l, this.f23742m, this, this.d.m28848a(), this.f23735f);
    }

    /* renamed from: m */
    public final void m30307m() {
        this.f23736g.m33971a();
    }

    /* renamed from: n */
    public final void m30308n() throws drk {
        this.f23736g.m33972a(m28824b(mo5165d()));
    }

    /* renamed from: o */
    public final void m30309o() {
        if (this.f23736g != null) {
            this.f23736g.m33973b();
            this.f23736g = null;
        }
    }
}
