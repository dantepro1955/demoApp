package com.p000;

import android.app.Activity;

/* compiled from: OverlayBaseControllerV2 */
/* renamed from: ceq */
public class ceq {
    /* renamed from: a */
    public caf f8941a = caf.m12046a();
    /* renamed from: b */
    private ces f8942b;

    /* renamed from: a */
    public void m12834a(String str, ces ces) {
        this.f8942b = ces;
    }

    /* renamed from: a */
    public void mo1696a() {
        this.f8942b = null;
    }

    /* renamed from: b */
    public ces m12835b() {
        return this.f8942b;
    }

    /* renamed from: c */
    public Activity m12836c() {
        if (this.f8942b == null) {
            return null;
        }
        return this.f8942b.m12878h();
    }

    /* renamed from: d */
    protected cnx m12837d() {
        return this.f8942b.m12878h().getDialogHelper();
    }
}
