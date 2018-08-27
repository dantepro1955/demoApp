package com.p000;

/* renamed from: czn */
abstract class czn<ResultType> extends C0000a implements czd {
    /* renamed from: b */
    private czh<ResultType> f20780b;
    /* renamed from: c */
    private final czv f20781c;
    /* renamed from: d */
    private float f20782d = 0.0f;
    /* renamed from: e */
    private Runnable f20783e;
    /* renamed from: f */
    private String f20784f;
    /* renamed from: g */
    private final Object f20785g = new Object();

    /* renamed from: czn$2 */
    class C46982 implements C4697d {
        /* renamed from: a */
        private /* synthetic */ czn f20794a;

        C46982(czn czn) {
            this.f20794a = czn;
        }

        /* renamed from: a */
        public final void mo4258a(float f) {
            synchronized (this.f20794a.f20785g) {
                this.f20794a.f20782d = f;
            }
        }
    }

    /* renamed from: czn$4 */
    class C47004 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czn f20798a;

        C47004(czn czn) {
            this.f20798a = czn;
        }

        public final void run() {
            this.f20798a.f20780b.m25796d();
        }
    }

    /* renamed from: czn$5 */
    class C47015 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czn f20799a;

        C47015(czn czn) {
            this.f20799a = czn;
        }

        public final void run() {
            this.f20799a.f20780b.m25797e();
        }
    }

    /* renamed from: czn$6 */
    class C47026 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ czn f20800a;

        C47026(czn czn) {
            this.f20800a = czn;
        }

        public final void run() {
            this.f20800a.f20780b.m25798f();
        }
    }

    public czn(czv czv, final String str, final int i, final String str2, String str3, Object obj) {
        super(obj);
        this.f20781c = czv;
        this.f20784f = str3;
        this.f20783e = new Runnable(this) {
            /* renamed from: d */
            private /* synthetic */ czn f20793d;

            public final void run() {
                boolean z = true;
                czn czn = this.f20793d;
                czn czn2 = this.f20793d;
                drl b = this.f20793d.f20781c.m25903b();
                String str = str;
                boolean z2 = i == 1;
                if (i != 2) {
                    z = false;
                }
                czn.f20780b = czn2.mo4256a(b, str, z2, z, str2, this.f20793d.f20784f, new C46982(this.f20793d));
            }
        };
    }

    /* renamed from: a */
    protected abstract czh<ResultType> mo4256a(drl drl, String str, boolean z, boolean z2, String str2, String str3, C4697d c4697d);

    /* renamed from: a */
    public void m25812a() {
        this.f20781c.m25905d();
        qu.m33922a(new C47004(this));
    }

    /* renamed from: a */
    public void mo4255a(final int i, final cyp cyp) {
        this.f20781c.m25905d();
        qu.m33922a(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ czn f20797c;

            public final void run() {
                this.f20797c.f20780b.m25791a(i, cyp);
            }
        });
    }

    /* renamed from: b */
    public void m25814b() {
        this.f20781c.m25905d();
        qu.m33922a(new C47015(this));
    }

    /* renamed from: c */
    public void m25815c() {
        this.f20781c.m25905d();
        qu.m33922a(new C47026(this));
    }

    /* renamed from: d */
    public float m25816d() {
        float f;
        synchronized (this.f20785g) {
            f = this.f20782d;
        }
        return f;
    }

    /* renamed from: e */
    protected final void m25817e() {
        if (this.f20783e != null) {
            qu.m33922a(this.f20783e);
            this.f20783e = null;
        }
    }
}
