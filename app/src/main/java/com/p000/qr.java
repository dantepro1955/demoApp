package com.p000;

/* renamed from: qr */
public final class qr extends drh implements dre {
    /* renamed from: e */
    private final String f25247e;
    /* renamed from: f */
    private final String f25248f;
    /* renamed from: g */
    private final String f25249g;
    /* renamed from: h */
    private final qw f25250h;
    /* renamed from: i */
    private ra f25251i;

    /* renamed from: qr$1 */
    class C56931 implements qw {
        /* renamed from: a */
        final /* synthetic */ qr f25246a;

        /* renamed from: qr$1$1 */
        class C56901 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C56931 f25243a;

            C56901(C56931 c56931) {
                this.f25243a = c56931;
            }

            public final void run() {
                ((qo) this.f25243a.f25246a.a).mo5485a();
            }
        }

        /* renamed from: qr$1$2 */
        class C56912 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C56931 f25244a;

            C56912(C56931 c56931) {
                this.f25244a = c56931;
            }

            public final void run() {
                ((qo) this.f25244a.f25246a.a).mo5486b();
            }
        }

        /* renamed from: qr$1$3 */
        class C56923 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C56931 f25245a;

            C56923(C56931 c56931) {
                this.f25245a = c56931;
            }

            public final void run() {
                ((qo) this.f25245a.f25246a.a).mo5487c();
            }
        }

        C56931(qr qrVar) {
            this.f25246a = qrVar;
        }

        /* renamed from: a */
        public final void mo4745a(Object obj) {
            czl.m25831c(this.f25246a, "Player error");
            qu.m33922a(new C56901(this));
        }

        /* renamed from: b */
        public final void mo4746b(Object obj) {
            qu.m33922a(new C56912(this));
        }

        /* renamed from: c */
        public final void mo4747c(Object obj) {
            qu.m33922a(new C56923(this));
        }
    }

    public qr(dot dot, drj drj, String str, String str2, String str3, boolean z, qn qnVar) {
        super(dot, drj, str3, qnVar);
        this.f25248f = str;
        this.f25249g = z ? "ssml" : "text";
        this.f25247e = str2;
        this.f25250h = new C56931(this);
        this.f25251i = new ra(this.c, this, drj.m28848a(), this.f25250h);
        this.a = new qp(this);
    }

    /* renamed from: a */
    protected final void mo4633a(dni dni) {
        if (this.f25247e != null) {
            dni.mo4459b("tts_voice", this.f25247e);
        } else {
            dni.mo4459b("tts_language", this.b);
        }
    }

    /* renamed from: b */
    public final String m33914b() {
        return this.f25248f;
    }

    /* renamed from: c */
    public final String m33915c() {
        return this.f25249g;
    }

    /* renamed from: d */
    public final void m33916d() {
        this.f25251i.m33948a();
    }

    /* renamed from: e */
    public final void m33917e() {
        this.f25251i.m33949b();
    }

    protected final String e_() {
        return this.d.m28870x();
    }

    /* renamed from: f */
    public final dnk m33918f() {
        return this.f25251i.m33950c();
    }
}
