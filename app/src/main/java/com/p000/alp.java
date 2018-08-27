package com.p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: alp */
public abstract class alp<T extends alp> {
    /* renamed from: a */
    protected final aln f1949a;
    /* renamed from: b */
    private final alq f1950b;
    /* renamed from: c */
    private final List<Object> f1951c = new ArrayList();

    protected alp(alq alq, apt apt) {
        aoi.m4679a((Object) alq);
        this.f1950b = alq;
        aln aln = new aln(this, apt);
        aln.m2501k();
        this.f1949a = aln;
    }

    /* renamed from: a */
    protected void mo317a(aln aln) {
    }

    /* renamed from: b */
    protected void m2406b(aln aln) {
        Iterator it = this.f1951c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: k */
    public aln mo318k() {
        aln a = this.f1949a.m2487a();
        m2406b(a);
        return a;
    }

    /* renamed from: l */
    public aln m2408l() {
        return this.f1949a;
    }

    /* renamed from: m */
    public List<alr> m2409m() {
        return this.f1949a.m2493c();
    }

    /* renamed from: n */
    protected alq m2410n() {
        return this.f1950b;
    }
}
