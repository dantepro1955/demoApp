package com.p000;

/* renamed from: czh */
abstract class czh<ResultType> {
    /* renamed from: a */
    private final drl f20758a;
    /* renamed from: b */
    private final boolean f20759b;
    /* renamed from: c */
    private final boolean f20760c;
    /* renamed from: d */
    private final String f20761d;
    /* renamed from: e */
    private final C4697d f20762e;
    /* renamed from: f */
    private final C0951b f20763f = new C46901(this);
    /* renamed from: g */
    private dze f20764g;
    /* renamed from: h */
    private rd<ResultType> f20765h;
    /* renamed from: i */
    private boolean f20766i = false;
    /* renamed from: j */
    private cyp f20767j;
    /* renamed from: k */
    private cyp f20768k;
    /* renamed from: l */
    private cyp f20769l;
    /* renamed from: m */
    private cyp f20770m;
    /* renamed from: n */
    private String f20771n;

    /* renamed from: czh$1 */
    class C46901 implements C0951b {
        /* renamed from: a */
        private /* synthetic */ czh f20757a;

        C46901(czh czh) {
            this.f20757a = czh;
        }

        /* renamed from: a */
        public final void m25782a(dre dre) {
            if (this.f20757a.f20764g == dre) {
                this.f20757a.f20764g = null;
            }
        }

        /* renamed from: a */
        public final void m25783a(dre dre, int i, String str, String str2) {
            if (this.f20757a.f20764g == dre) {
                this.f20757a.mo4251a(new czt(i, str, str2));
            }
        }

        public final void a_(dre dre) {
            if (this.f20757a.f20764g == dre) {
                this.f20757a.mo4253b();
            }
        }

        /* renamed from: b */
        public final void m25784b(dre dre) {
            if (this.f20757a.f20764g == dre) {
                this.f20757a.mo4254c();
            }
        }

        /* renamed from: c */
        public final void m25785c(dre dre) {
            if (this.f20757a.f20764g == dre) {
                this.f20757a.mo4252a(this.f20757a.f20765h.mo4245b());
            }
        }
    }

    czh(drl drl, boolean z, boolean z2, String str, String str2, C4697d c4697d) {
        this.f20758a = drl;
        this.f20759b = z;
        this.f20760c = z2;
        this.f20761d = str;
        this.f20762e = c4697d;
        this.f20771n = str2;
    }

    /* renamed from: a */
    protected abstract dze mo4249a(drl drl, boolean z, boolean z2, String str, String str2, C4697d c4697d, qy qyVar, qy qyVar2, qy qyVar3, qy qyVar4, rd<ResultType> rdVar, C0951b c0951b);

    /* renamed from: a */
    protected abstract rd<ResultType> mo4250a();

    /* renamed from: a */
    public final void m25791a(int i, cyp cyp) {
        switch (i) {
            case 0:
                this.f20767j = cyp;
                return;
            case 1:
                this.f20768k = cyp;
                return;
            case 2:
                this.f20769l = cyp;
                return;
            case 3:
                this.f20770m = cyp;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    protected abstract void mo4251a(cys cys);

    /* renamed from: a */
    protected abstract void mo4252a(ResultType resultType);

    /* renamed from: b */
    protected abstract void mo4253b();

    /* renamed from: c */
    protected abstract void mo4254c();

    /* renamed from: d */
    public final void m25796d() {
        if (!this.f20758a.m28899b()) {
            czl.m25831c(this, "Unable to create recognition transaction. Transaction runner is invalid.");
            mo4251a(new czt(0, null, null));
        } else if (!this.f20766i) {
            qy a = this.f20767j == null ? null : this.f20767j.m25654a();
            qy a2 = this.f20768k == null ? null : this.f20768k.m25654a();
            qy a3 = this.f20769l == null ? null : this.f20769l.m25654a();
            qy a4 = this.f20770m == null ? null : this.f20770m.m25654a();
            this.f20765h = mo4250a();
            this.f20764g = mo4249a(this.f20758a, this.f20759b, this.f20760c, this.f20761d, this.f20771n, this.f20762e, a, a2, a3, a4, this.f20765h, this.f20763f);
            if (this.f20764g == null) {
                czl.m25831c(this, "Unable to create recognition transaction");
                mo4251a(new czt(0, null, null));
                return;
            }
            this.f20766i = true;
            this.f20764g.mo4475a();
        }
    }

    /* renamed from: e */
    public final void m25797e() {
        if (this.f20764g != null) {
            this.f20764g.mo4480f();
        }
    }

    /* renamed from: f */
    public final void m25798f() {
        if (this.f20764g != null) {
            this.f20764g.mo4563p();
            this.f20764g = null;
        }
    }
}
