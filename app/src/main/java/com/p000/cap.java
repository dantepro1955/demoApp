package com.p000;

import p000.caq.C1641a;

/* compiled from: BasePresenter */
/* renamed from: cap */
public class cap<V extends C1641a> implements caq<V> {
    /* renamed from: a */
    private V f8520a;
    /* renamed from: b */
    private boolean f8521b;

    /* renamed from: a */
    public void mo1714a(V v) {
        this.f8520a = v;
        this.f8521b = true;
        if (v != null) {
            v.setPresenter(this);
        }
    }

    /* renamed from: a */
    public void mo1713a() {
        this.f8520a = null;
        this.f8521b = false;
    }

    /* renamed from: b */
    public void mo1715b() {
    }

    /* renamed from: c */
    public void mo1716c() {
    }

    /* renamed from: d */
    public V m12157d() {
        return this.f8520a;
    }
}
