package com.p000;

/* renamed from: bnb */
public class bnb extends bmu {
    /* renamed from: a */
    private final bmd f7072a = new bmd();

    bnb(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    public void m9872a() {
        bog zzmB = zzmB();
        String b = zzmB.m10147b();
        if (b != null) {
            this.f7072a.m9615a(b);
        }
        String a = zzmB.m10145a();
        if (a != null) {
            this.f7072a.m9617b(a);
        }
    }

    /* renamed from: b */
    public bmd m9873b() {
        zzob();
        return this.f7072a;
    }

    protected void zzmS() {
        zznU().m2512a().m9614a(this.f7072a);
        m9872a();
    }
}
