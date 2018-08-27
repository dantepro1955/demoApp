package com.p000;

/* renamed from: sw */
public final class sw extends sy {
    /* renamed from: a */
    protected sq f25528a;
    /* renamed from: e */
    private String f25529e = null;
    /* renamed from: f */
    private int f25530f = 1;
    /* renamed from: g */
    private sv f25531g;
    /* renamed from: h */
    private String f25532h;
    /* renamed from: i */
    private String f25533i;
    /* renamed from: j */
    private int f25534j;

    sw(String str, String str2, String str3, int i, st stVar, String str4) {
        super(str4, null, null, stVar);
        this.f25532h = str2;
        this.f25533i = str3;
        this.f25534j = i;
        this.f25528a = null;
        this.f25529e = str;
        this.b = this;
    }

    sw(sv svVar, String str) {
        super(str, null, null, svVar.c);
        this.f25532h = svVar.b.f25532h;
        this.f25533i = svVar.b.f25533i;
        this.f25534j = svVar.b.f25534j;
        this.f25528a = null;
        this.b = this;
        this.f25531g = svVar;
    }

    /* renamed from: a */
    protected final dnj mo5519a() {
        dnj a = super.mo5519a();
        sy.m34142a(a, "Application", this.f25532h);
        sy.m34142a(a, "SchemaVersion", this.f25533i);
        sy.m34142a(a, "RetentionDays", new Integer(this.f25534j));
        return a;
    }

    /* renamed from: b */
    public final String m34155b() {
        return this.f25529e;
    }

    /* renamed from: c */
    protected final void mo5520c() {
        super.mo5520c();
        if (this.f25531g != null) {
            this.f25529e = this.f25531g.m34152b();
        }
    }

    /* renamed from: d */
    public final int m34157d() {
        int i = this.f25530f;
        this.f25530f = i + 1;
        return i;
    }
}
