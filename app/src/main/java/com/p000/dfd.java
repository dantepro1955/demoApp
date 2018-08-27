package com.p000;

import android.content.Context;

/* compiled from: FeedbackModule */
/* renamed from: dfd */
public class dfd {
    /* renamed from: g */
    private static dfd f21469g = new dfd();
    /* renamed from: a */
    public Context f21470a;
    /* renamed from: b */
    dfh f21471b;
    /* renamed from: c */
    dfe f21472c = new dfe();
    /* renamed from: d */
    dfk f21473d = new dfk();
    /* renamed from: e */
    dfn f21474e;
    /* renamed from: f */
    boolean f21475f = false;
    /* renamed from: h */
    private djt f21476h;

    /* renamed from: a */
    public static dfd m26954a() {
        return f21469g;
    }

    private dfd() {
    }

    /* renamed from: a */
    public void m26955a(Context context) {
        if (!this.f21475f) {
            this.f21476h = new djt(context);
            this.f21473d.m27015a(this, this.f21476h.m27619a("feedback-types"));
            this.f21470a = context;
            this.f21475f = true;
        }
    }

    /* renamed from: b */
    public dfh m26958b() {
        return this.f21471b;
    }

    /* renamed from: a */
    public void m26956a(dfh dfh) {
        this.f21471b = dfh;
    }

    /* renamed from: c */
    public dfn m26959c() {
        return this.f21474e;
    }

    /* renamed from: a */
    public void m26957a(dfn dfn) {
        this.f21474e = dfn;
    }

    /* renamed from: d */
    public dfe m26960d() {
        return this.f21472c;
    }

    /* renamed from: e */
    public dfk m26961e() {
        return this.f21473d;
    }
}
