package com.p000;

/* renamed from: qq */
final class qq extends qs {
    /* renamed from: c */
    private boolean f25241c = false;
    /* renamed from: d */
    private boolean f25242d = false;

    public qq(qr qrVar) {
        super(qrVar);
    }

    /* renamed from: a */
    public final void mo5485a() {
        m28736a(4, "audioError");
    }

    /* renamed from: a */
    public final void mo4677a(dni dni) {
        this.f25241c = true;
        if (this.f25242d) {
            this.a.m28819a(new qm(this.a));
        }
    }

    /* renamed from: a */
    public final void mo4678a(String str) {
        m28736a(4, str);
    }

    /* renamed from: b */
    public final void mo5486b() {
        m33894f().b_(this.a);
    }

    /* renamed from: b */
    public final void mo4679b(String str) {
        mo4676a(2, null, str);
    }

    /* renamed from: c */
    public final void mo5487c() {
        this.f25242d = true;
        if (this.f25241c) {
            this.a.m28819a(new qm(this.a));
        }
    }

    /* renamed from: d */
    public final void mo4680d() {
        m28736a(4, "createCommandFailed");
    }

    /* renamed from: e */
    public final void mo4681e() {
        m28735a(1);
    }

    /* renamed from: h */
    public final void mo4550h() {
        try {
            this.a.m28830r();
            this.a.m28820a(this.a.e_());
            this.a.m28823a(this.a.m33915c(), this.a.m33914b(), this.a.m33918f());
            this.a.m28832t();
            this.a.m33916d();
        } catch (Throwable th) {
            czl.m25829a(this, "Error starting PlayingState", th);
            m28735a(4);
        }
    }

    /* renamed from: i */
    public final void mo4682i() {
        m28735a(5);
    }

    /* renamed from: k */
    public final void mo4940k() {
        this.a.m33917e();
    }
}
