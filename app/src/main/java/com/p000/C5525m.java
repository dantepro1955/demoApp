package com.p000;

import p000.czs.C4711e;

/* renamed from: m */
public final class C5525m extends C5334g {
    /* renamed from: e */
    private final String f24458e;
    /* renamed from: f */
    private C4711e f24459f;

    public C5525m(dot dot, drj drj, String str, boolean z, boolean z2, String str2, C4711e c4711e, qy qyVar, qy qyVar2, qy qyVar3, qy qyVar4, rd<?> rdVar, C4697d c4697d, C0951b c0951b) {
        super(dot, drj, z, z2, str2, qyVar, qyVar2, qyVar3, qyVar4, rdVar, c4697d, c0951b);
        this.f24458e = str;
        this.f24459f = c4711e;
    }

    /* renamed from: a */
    protected final void mo4633a(dni dni) {
        super.mo4633a(dni);
        dni.mo4459b("dictation_language", this.b);
        dni.mo4459b("dictation_type", this.f24458e);
    }

    /* renamed from: b */
    protected final void mo5163b() throws drk {
        dni u = m28833u();
        u.mo4458b("start", 0);
        u.mo4458b("end", 0);
        u.mo4459b("text", "");
        if (this.f24459f != null) {
            u.mo4454a("grammar_list", czl.m25826a((drh) this, new dtk(this.f24459f).m29271b()));
        }
        u.mo4458b("binary_results", 1);
        m28821a("REQUEST_INFO", u);
    }

    /* renamed from: c */
    protected final String mo5164c() {
        return this.d.m28867u();
    }

    /* renamed from: d */
    protected final String mo5165d() {
        return "AUDIO_INFO";
    }

    /* renamed from: e */
    protected final boolean mo5166e() {
        return true;
    }
}
