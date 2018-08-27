package com.p000;

import java.util.List;

/* renamed from: cdf */
final /* synthetic */ class cdf implements dul {
    /* renamed from: a */
    private final ccu f8772a;
    /* renamed from: b */
    private final cep f8773b;

    private cdf(ccu ccu, cep cep) {
        this.f8772a = ccu;
        this.f8773b = cep;
    }

    /* renamed from: a */
    public static dul m12605a(ccu ccu, cep cep) {
        return new cdf(ccu, cep);
    }

    public void call(Object obj) {
        ccu.m12570a(this.f8772a, this.f8773b, (List) obj);
    }
}
