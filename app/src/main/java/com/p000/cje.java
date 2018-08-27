package com.p000;

import java.util.List;

/* renamed from: cje */
final /* synthetic */ class cje implements dul {
    /* renamed from: a */
    private final cit f9421a;
    /* renamed from: b */
    private final cgc f9422b;

    private cje(cit cit, cgc cgc) {
        this.f9421a = cit;
        this.f9422b = cgc;
    }

    /* renamed from: a */
    public static dul m14051a(cit cit, cgc cgc) {
        return new cje(cit, cgc);
    }

    public void call(Object obj) {
        cit.m14029b(this.f9421a, this.f9422b, (List) obj);
    }
}
