package com.p000;

import p000.dts.C5094a;

/* compiled from: SleepingAction */
/* renamed from: dwn */
class dwn implements duk {
    /* renamed from: a */
    private final duk f23324a;
    /* renamed from: b */
    private final C5094a f23325b;
    /* renamed from: c */
    private final long f23326c;

    public dwn(duk duk, C5094a c5094a, long j) {
        this.f23324a = duk;
        this.f23325b = c5094a;
        this.f23326c = j;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (!this.f23325b.isUnsubscribed()) {
            long b = this.f23326c - this.f23325b.mo5510b();
            if (b > 0) {
                try {
                    Thread.sleep(b);
                } catch (Throwable e) {
                    Thread.currentThread().interrupt();
                    dud.m29403a(e);
                }
            }
            if (!this.f23325b.isUnsubscribed()) {
                this.f23324a.mo4643a();
            }
        }
    }
}
