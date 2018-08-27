package com.p000;

/* compiled from: SpmcArrayQueue */
/* renamed from: dxk */
abstract class dxk<E> extends dxm<E> {
    /* renamed from: d */
    protected static final long f23445d = dxy.m29782a(dxk.class, "consumerIndex");
    private volatile long consumerIndex;

    public dxk(int i) {
        super(i);
    }

    /* renamed from: a */
    protected final long m29774a() {
        return this.consumerIndex;
    }

    /* renamed from: b */
    protected final boolean m29775b(long j, long j2) {
        return dxy.f23451a.compareAndSwapLong(this, f23445d, j, j2);
    }
}
