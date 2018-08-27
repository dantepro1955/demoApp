package com.p000;

/* compiled from: SpmcArrayQueue */
/* renamed from: dxp */
abstract class dxp<E> extends dxl<E> {
    /* renamed from: e */
    protected static final long f23444e = dxy.m29782a(dxp.class, "producerIndex");
    private volatile long producerIndex;

    /* renamed from: b */
    protected final long m29772b() {
        return this.producerIndex;
    }

    /* renamed from: c */
    protected final void m29773c(long j) {
        dxy.f23451a.putOrderedLong(this, f23444e, j);
    }

    public dxp(int i) {
        super(i);
    }
}
