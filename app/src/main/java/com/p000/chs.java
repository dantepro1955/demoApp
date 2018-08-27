package com.p000;

import com.ninegag.android.app.GagApplication;

/* compiled from: UpgradeController */
/* renamed from: chs */
public class chs {
    /* renamed from: a */
    private static chs f9274a = new chs();
    /* renamed from: b */
    private static caf f9275b = caf.m12046a();
    /* renamed from: c */
    private boolean f9276c = false;
    /* renamed from: d */
    private boolean f9277d = false;

    private chs() {
    }

    /* renamed from: a */
    public static chs m13591a() {
        return f9274a;
    }

    /* renamed from: b */
    public void m13594b() {
        if (!this.f9277d) {
            cip h = f9275b.m12077h();
            int aY = h.aY();
            if (aY != GagApplication.f16515c) {
                this.f9276c = true;
                m13593d();
                m13592a(aY, GagApplication.f16515c);
                h.m13982a(GagApplication.f16514b, GagApplication.f16515c);
            }
            this.f9277d = true;
        }
    }

    /* renamed from: c */
    public boolean m13595c() {
        return this.f9276c;
    }

    /* renamed from: d */
    private void m13593d() {
        f9275b.m12075g().m13724d();
        f9275b.m12081k().b();
        dct.a().b();
        ctz.a().c();
        cip h = f9275b.m12077h();
        chr.m13522a().m13563b(true, -1);
        chr.m13522a().m13571c(true, -1);
        h.m13919m(0);
        long a = cqw.a();
        h.m13884f(cae.f8432b + a);
        h.m13963z(null);
        h.m13918m(0);
        h.m13889g(a + cqw.d(2));
        h.m13928o(1);
        h.m13972D();
    }

    /* renamed from: a */
    private void m13592a(int i, int i2) {
        if (i < 100) {
            cip h = f9275b.m12077h();
            h.m14000f(1, "1");
            h.m13904j(0);
        }
        if ((i2 / 100) - (i / 100) != 0) {
            f9275b.m12077h().m13958x(false);
        }
    }
}
