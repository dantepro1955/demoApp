package com.p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscAtomicArrayQueue */
/* renamed from: dxd */
public final class dxd<E> extends dxc<E> {
    /* renamed from: g */
    private static final Integer f23420g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    /* renamed from: c */
    final AtomicLong f23421c = new AtomicLong();
    /* renamed from: d */
    long f23422d;
    /* renamed from: e */
    final AtomicLong f23423e = new AtomicLong();
    /* renamed from: f */
    final int f23424f;

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public dxd(int i) {
        super(i);
        this.f23424f = Math.min(i / 4, f23420g.intValue());
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.a;
        int i = this.b;
        long j = this.f23421c.get();
        int a = m29738a(j, i);
        if (j >= this.f23422d) {
            int i2 = this.f23424f;
            if (m29740a(atomicReferenceArray, m29738a(((long) i2) + j, i)) == null) {
                this.f23422d = ((long) i2) + j;
            } else if (m29740a(atomicReferenceArray, a) != null) {
                return false;
            }
        }
        m29741a(atomicReferenceArray, a, e);
        m29744b(1 + j);
        return true;
    }

    public E poll() {
        long j = this.f23423e.get();
        int a = m29737a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        E a2 = m29740a(atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        m29741a(atomicReferenceArray, a, null);
        m29745c(j + 1);
        return a2;
    }

    public E peek() {
        return m29739a(m29737a(this.f23423e.get()));
    }

    public int size() {
        long a = m29742a();
        while (true) {
            long b = m29743b();
            long a2 = m29742a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    public boolean isEmpty() {
        return m29743b() == m29742a();
    }

    /* renamed from: b */
    private void m29744b(long j) {
        this.f23421c.lazySet(j);
    }

    /* renamed from: c */
    private void m29745c(long j) {
        this.f23423e.lazySet(j);
    }

    /* renamed from: a */
    private long m29742a() {
        return this.f23423e.get();
    }

    /* renamed from: b */
    private long m29743b() {
        return this.f23421c.get();
    }
}
