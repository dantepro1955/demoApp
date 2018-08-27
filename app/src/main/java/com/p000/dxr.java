package com.p000;

/* compiled from: SpscArrayQueue */
/* renamed from: dxr */
public final class dxr<E> extends dxw<E> {
    public dxr(int i) {
        super(i);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        Object[] objArr = this.c;
        long j = this.producerIndex;
        long a = m29763a(j);
        if (m29768b(objArr, a) != null) {
            return false;
        }
        m29769b(objArr, a, e);
        m29780c(1 + j);
        return true;
    }

    public E poll() {
        long j = this.consumerIndex;
        long a = m29763a(j);
        Object[] objArr = this.c;
        E b = m29768b(objArr, a);
        if (b == null) {
            return null;
        }
        m29769b(objArr, a, null);
        m29781d(j + 1);
        return b;
    }

    public E peek() {
        return m29767b(m29763a(this.consumerIndex));
    }

    public int size() {
        long b = m29779b();
        while (true) {
            long a = m29778a();
            long b2 = m29779b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public boolean isEmpty() {
        return m29778a() == m29779b();
    }

    /* renamed from: c */
    private void m29780c(long j) {
        dxy.f23451a.putOrderedLong(this, f, j);
    }

    /* renamed from: d */
    private void m29781d(long j) {
        dxy.f23451a.putOrderedLong(this, e, j);
    }

    /* renamed from: a */
    private long m29778a() {
        return dxy.f23451a.getLongVolatile(this, f);
    }

    /* renamed from: b */
    private long m29779b() {
        return dxy.f23451a.getLongVolatile(this, e);
    }
}
