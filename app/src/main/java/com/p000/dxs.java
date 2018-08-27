package com.p000;

/* compiled from: SpscArrayQueue */
/* renamed from: dxs */
abstract class dxs<E> extends dxg<E> {
    /* renamed from: e */
    private static final Integer f23447e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    /* renamed from: d */
    protected final int f23448d;

    public dxs(int i) {
        super(i);
        this.f23448d = Math.min(i / 4, f23447e.intValue());
    }
}
