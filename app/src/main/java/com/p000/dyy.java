package com.p000;

/* renamed from: dyy */
final class dyy extends drg {
    /* renamed from: a */
    private final dti f23527a;

    public dyy(dti dti) {
        super(dti);
        this.f23527a = dti;
    }

    /* renamed from: a */
    protected final void mo4676a(int i, String str, String str2) {
        this.f23527a.m28819a(new drm(this.f23527a, i, str, str2));
    }

    /* renamed from: a */
    public final void mo4677a(dni dni) {
        rd d = this.f23527a.m29267d();
        if (d == null || !d.mo4244a(dni) || d.mo4243a()) {
            m28735a(0);
        } else {
            this.f23527a.m28819a(new drn(this.f23527a));
        }
    }

    /* renamed from: a */
    public final void mo4678a(String str) {
        m28736a(0, str);
    }

    /* renamed from: b */
    public final void mo4679b(String str) {
        mo4676a(2, null, str);
    }

    /* renamed from: d */
    public final void mo4680d() {
        m28735a(0);
    }

    /* renamed from: e */
    public final void mo4681e() {
        m28735a(1);
    }

    /* renamed from: h */
    public final void mo4550h() {
        try {
            this.f23527a.m28830r();
            this.f23527a.m28820a(this.f23527a.m29266c());
            this.f23527a.m29265b();
            this.f23527a.m28832t();
        } catch (Throwable th) {
            czl.m25829a(this, "Error starting PendingState", th);
            m28735a(0);
        }
    }

    /* renamed from: i */
    public final void mo4682i() {
        m28735a(5);
    }
}
