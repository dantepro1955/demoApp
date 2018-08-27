package com.p000;

import com.facebook.stetho.server.http.HttpStatus;

/* renamed from: f */
final class C5304f extends dzb {

    /* renamed from: f$1 */
    class C53031 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C5304f f23684a;

        C53031(C5304f c5304f) {
            this.f23684a = c5304f;
        }

        public final void run() {
            this.f23684a.a.m28819a(new C5437j(this.f23684a.a));
        }
    }

    public C5304f(C5334g c5334g) {
        super(c5334g);
    }

    /* renamed from: l */
    private void m30141l() {
        qu.m33923a(new C53031(this), HttpStatus.HTTP_OK);
    }

    /* renamed from: a */
    public final void mo4710a() {
        m28735a(3);
    }

    public final void b_() {
        m30141l();
    }

    /* renamed from: c */
    public final void mo4712c() {
        m28735a(3);
    }

    public final void c_() {
        m30141l();
    }

    /* renamed from: h */
    public final void mo4550h() {
        if (!this.a.m30301g()) {
            m30141l();
        }
    }

    /* renamed from: i */
    public final void mo4682i() {
        m28735a(5);
    }
}
