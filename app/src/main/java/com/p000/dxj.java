package com.p000;

/* compiled from: SpmcArrayQueue */
/* renamed from: dxj */
public final class dxj<E> extends dxn<E> {
    public dxj(int i) {
        super(i);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        Object[] objArr = this.c;
        long j = this.b;
        long b = m29772b();
        long a = m29763a(b);
        if (m29768b(objArr, a) == null) {
            m29766a(objArr, a, e);
            m29773c(1 + b);
        } else if (b - m29774a() > j) {
            return false;
        } else {
            do {
            } while (m29768b(objArr, a) != null);
        }
        m29766a(objArr, a, e);
        m29773c(1 + b);
        return true;
    }

    public E poll() {
        long a;
        long c = m29776c();
        do {
            a = m29774a();
            if (a >= c) {
                long b = m29772b();
                if (a >= b) {
                    return null;
                }
                m29777d(b);
            }
        } while (!m29775b(a, 1 + a));
        c = m29763a(a);
        Object[] objArr = this.c;
        E a2 = m29765a(objArr, c);
        m29769b(objArr, c, null);
        return a2;
    }

    public E peek() {
        E b;
        long c = m29776c();
        do {
            long a = m29774a();
            if (a >= c) {
                long b2 = m29772b();
                if (a >= b2) {
                    return null;
                }
                m29777d(b2);
            }
            b = m29767b(m29763a(a));
        } while (b == null);
        return b;
    }

    public int size() {
        long a = m29774a();
        while (true) {
            long b = m29772b();
            long a2 = m29774a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    public boolean isEmpty() {
        return m29774a() == m29772b();
    }
}
