package com.p000;

import java.util.List;

/* renamed from: cix */
final /* synthetic */ class cix implements dul {
    /* renamed from: a */
    private final cit f9408a;
    /* renamed from: b */
    private final cgc f9409b;

    private cix(cit cit, cgc cgc) {
        this.f9408a = cit;
        this.f9409b = cgc;
    }

    /* renamed from: a */
    public static dul m14041a(cit cit, cgc cgc) {
        return new cix(cit, cgc);
    }

    public void call(Object obj) {
        cit.m14025a(this.f9408a, this.f9409b, (List) obj);
    }
}
