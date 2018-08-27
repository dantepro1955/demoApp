package com.p000;

/* renamed from: chy */
final /* synthetic */ class chy implements Runnable {
    /* renamed from: a */
    private final chx f9313a;

    private chy(chx chx) {
        this.f9313a = chx;
    }

    /* renamed from: a */
    public static Runnable m13635a(chx chx) {
        return new chy(chx);
    }

    public void run() {
        chx.m13623a(this.f9313a);
    }
}
