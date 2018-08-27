package com.p000;

/* renamed from: sv */
public final class sv extends su {
    /* renamed from: a */
    protected Boolean f25526a = Boolean.valueOf(false);
    /* renamed from: e */
    private String f25527e;

    sv(sy syVar, String str) {
        super(syVar, str);
    }

    /* renamed from: a */
    protected final dnj mo5519a() {
        dnj a = super.mo5519a();
        sy.m34142a(a, "RefId", this.f25527e + ".1");
        if (this.f25526a.booleanValue()) {
            sy.m34142a(a, "Cancel", new Boolean(true));
        }
        return a;
    }

    /* renamed from: b */
    final String m34152b() {
        return this.f25527e;
    }

    /* renamed from: c */
    protected final void mo5520c() {
        super.mo5520c();
        this.f25527e = this.b.m34155b() + "." + this.d;
    }
}
