package com.p000;

import java.util.Iterator;

/* compiled from: ConcurrentCircularArrayQueue */
/* renamed from: dxg */
public abstract class dxg<E> extends dxh<E> {
    /* renamed from: a */
    protected static final int f23439a = Integer.getInteger("sparse.shift", 0).intValue();
    /* renamed from: d */
    private static final long f23440d = ((long) (dxy.f23451a.arrayBaseOffset(Object[].class) + (32 << (f23441e - f23439a))));
    /* renamed from: e */
    private static final int f23441e;
    /* renamed from: b */
    protected final long f23442b;
    /* renamed from: c */
    protected final E[] f23443c;

    static {
        int arrayIndexScale = dxy.f23451a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f23441e = f23439a + 2;
        } else if (8 == arrayIndexScale) {
            f23441e = f23439a + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public dxg(int i) {
        int a = dxi.m29770a(i);
        this.f23442b = (long) (a - 1);
        this.f23443c = new Object[((a << f23439a) + 64)];
    }

    /* renamed from: a */
    protected final long m29763a(long j) {
        return m29764a(j, this.f23442b);
    }

    /* renamed from: a */
    protected final long m29764a(long j, long j2) {
        return f23440d + ((j & j2) << f23441e);
    }

    /* renamed from: a */
    protected final void m29766a(E[] eArr, long j, E e) {
        dxy.f23451a.putObject(eArr, j, e);
    }

    /* renamed from: b */
    protected final void m29769b(E[] eArr, long j, E e) {
        dxy.f23451a.putOrderedObject(eArr, j, e);
    }

    /* renamed from: a */
    protected final E m29765a(E[] eArr, long j) {
        return dxy.f23451a.getObject(eArr, j);
    }

    /* renamed from: b */
    protected final E m29767b(long j) {
        return m29768b(this.f23443c, j);
    }

    /* renamed from: b */
    protected final E m29768b(E[] eArr, long j) {
        return dxy.f23451a.getObjectVolatile(eArr, j);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
