package com.p000;

import android.content.Context;

/* renamed from: bmx */
public class bmx {
    /* renamed from: a */
    private final Context f7042a;
    /* renamed from: b */
    private final Context f7043b;

    public bmx(Context context) {
        aoi.m4679a((Object) context);
        Object applicationContext = context.getApplicationContext();
        aoi.m4680a(applicationContext, (Object) "Application context can't be null");
        this.f7042a = applicationContext;
        this.f7043b = applicationContext;
    }

    /* renamed from: a */
    protected alq m9785a(Context context) {
        return alq.m2506a(context);
    }

    /* renamed from: a */
    public Context m9786a() {
        return this.f7042a;
    }

    /* renamed from: a */
    protected bnl m9787a(bmw bmw) {
        return new bnl(bmw);
    }

    /* renamed from: b */
    public Context m9788b() {
        return this.f7043b;
    }

    /* renamed from: b */
    protected bnb m9789b(bmw bmw) {
        return new bnb(bmw);
    }

    /* renamed from: c */
    protected bmq m9790c(bmw bmw) {
        return new bmq(bmw);
    }

    /* renamed from: d */
    protected bne m9791d(bmw bmw) {
        return new bne(bmw);
    }

    /* renamed from: e */
    protected bog m9792e(bmw bmw) {
        return new bog(bmw);
    }

    /* renamed from: f */
    protected bnx m9793f(bmw bmw) {
        return new bnx(bmw);
    }

    /* renamed from: g */
    protected bni m9794g(bmw bmw) {
        return new bni(bmw);
    }

    /* renamed from: h */
    protected apt m9795h(bmw bmw) {
        return apv.m4885d();
    }

    /* renamed from: i */
    protected alc m9796i(bmw bmw) {
        return new alc(bmw);
    }

    /* renamed from: j */
    bnc m9797j(bmw bmw) {
        return new bnc(bmw, this);
    }

    /* renamed from: k */
    bny m9798k(bmw bmw) {
        return new bny(bmw);
    }

    /* renamed from: l */
    protected bmr m9799l(bmw bmw) {
        return new bmr(bmw, this);
    }

    /* renamed from: m */
    public bna m9800m(bmw bmw) {
        return new bna(bmw);
    }

    /* renamed from: n */
    public bnz m9801n(bmw bmw) {
        return new bnz(bmw);
    }

    /* renamed from: o */
    public bmz m9802o(bmw bmw) {
        return new bmz(bmw);
    }

    /* renamed from: p */
    public bnm m9803p(bmw bmw) {
        return new bnm(bmw);
    }

    /* renamed from: q */
    public boa m9804q(bmw bmw) {
        return new boa(bmw);
    }
}
