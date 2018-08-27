package com.p000;

/* renamed from: ui */
class ui implements Runnable {
    /* renamed from: a */
    final /* synthetic */ boolean f25628a;
    /* renamed from: b */
    final /* synthetic */ boolean f25629b;
    /* renamed from: c */
    final /* synthetic */ ug f25630c;

    ui(ug ugVar, boolean z, boolean z2) {
        this.f25630c = ugVar;
        this.f25628a = z;
        this.f25629b = z2;
    }

    public void run() {
        if (this.f25628a && this.f25629b) {
            this.f25630c.m34256k();
        } else {
            this.f25630c.m34255j();
        }
    }
}
