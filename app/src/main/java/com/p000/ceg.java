package com.p000;

import android.app.Activity;

/* compiled from: OverlayBaseController */
/* renamed from: ceg */
public class ceg {
    /* renamed from: a */
    public caf f8876a = caf.m12046a();
    /* renamed from: b */
    private cei f8877b;

    /* renamed from: a */
    public void m12735a(String str, cei cei) {
        this.f8877b = cei;
    }

    /* renamed from: a */
    public void mo1689a() {
        this.f8877b = null;
    }

    /* renamed from: b */
    public cei m12736b() {
        return this.f8877b;
    }

    /* renamed from: c */
    public Activity m12737c() {
        if (this.f8877b == null) {
            return null;
        }
        return this.f8877b.m12774h();
    }

    /* renamed from: d */
    protected cnx m12738d() {
        return this.f8877b.m12774h().getDialogHelper();
    }
}
