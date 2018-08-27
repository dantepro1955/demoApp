package com.p000;

import p000.ccp.C1679c;

/* renamed from: cfy */
final /* synthetic */ class cfy implements Runnable {
    /* renamed from: a */
    private final cfv f9114a;
    /* renamed from: b */
    private final C1679c f9115b;

    private cfy(cfv cfv, C1679c c1679c) {
        this.f9114a = cfv;
        this.f9115b = c1679c;
    }

    /* renamed from: a */
    public static Runnable m13067a(cfv cfv, C1679c c1679c) {
        return new cfy(cfv, c1679c);
    }

    public void run() {
        cfv.m13044a(this.f9114a, this.f9115b);
    }
}
