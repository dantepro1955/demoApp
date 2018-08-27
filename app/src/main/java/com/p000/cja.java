package com.p000;

import java.util.List;

/* renamed from: cja */
final /* synthetic */ class cja implements dul {
    /* renamed from: a */
    private final cit f9415a;
    /* renamed from: b */
    private final cgc f9416b;

    private cja(cit cit, cgc cgc) {
        this.f9415a = cit;
        this.f9416b = cgc;
    }

    /* renamed from: a */
    public static dul m14045a(cit cit, cgc cgc) {
        return new cja(cit, cgc);
    }

    public void call(Object obj) {
        cit.m14033c(this.f9415a, this.f9416b, (List) obj);
    }
}
