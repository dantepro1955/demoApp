package com.p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscUnboundedAtomicArrayQueue */
/* renamed from: dxf */
public final class dxf<T> implements Queue<T> {
    /* renamed from: a */
    static final int f23429a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    /* renamed from: j */
    private static final Object f23430j = new Object();
    /* renamed from: b */
    final AtomicLong f23431b = new AtomicLong();
    /* renamed from: c */
    int f23432c;
    /* renamed from: d */
    long f23433d;
    /* renamed from: e */
    int f23434e;
    /* renamed from: f */
    AtomicReferenceArray<Object> f23435f;
    /* renamed from: g */
    int f23436g;
    /* renamed from: h */
    AtomicReferenceArray<Object> f23437h;
    /* renamed from: i */
    final AtomicLong f23438i = new AtomicLong();

    public dxf(int i) {
        int a = dxi.m29770a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a + 1);
        this.f23435f = atomicReferenceArray;
        this.f23434e = i2;
        m29751a(a);
        this.f23437h = atomicReferenceArray;
        this.f23436g = i2;
        this.f23433d = (long) (i2 - 1);
        m29752a(0);
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        AtomicReferenceArray atomicReferenceArray = this.f23435f;
        long c = m29761c();
        int i = this.f23434e;
        int a = dxf.m29746a(c, i);
        if (c < this.f23433d) {
            return m29756a(atomicReferenceArray, t, c, a);
        }
        int i2 = this.f23432c;
        if (dxf.m29748a(atomicReferenceArray, dxf.m29746a(((long) i2) + c, i)) == null) {
            this.f23433d = (((long) i2) + c) - 1;
            return m29756a(atomicReferenceArray, t, c, a);
        } else if (dxf.m29748a(atomicReferenceArray, dxf.m29746a(1 + c, i)) != null) {
            return m29756a(atomicReferenceArray, t, c, a);
        } else {
            m29754a(atomicReferenceArray, c, a, t, (long) i);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m29756a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m29752a(1 + j);
        dxf.m29753a((AtomicReferenceArray) atomicReferenceArray, i, (Object) t);
        return true;
    }

    /* renamed from: a */
    private void m29754a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f23435f = atomicReferenceArray2;
        this.f23433d = (j + j2) - 1;
        m29752a(j + 1);
        dxf.m29753a(atomicReferenceArray2, i, (Object) t);
        m29755a((AtomicReferenceArray) atomicReferenceArray, atomicReferenceArray2);
        dxf.m29753a((AtomicReferenceArray) atomicReferenceArray, i, f23430j);
    }

    /* renamed from: a */
    private void m29755a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        dxf.m29753a((AtomicReferenceArray) atomicReferenceArray, dxf.m29757b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m29750a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) dxf.m29748a((AtomicReferenceArray) atomicReferenceArray, dxf.m29757b(atomicReferenceArray.length() - 1));
    }

    public T poll() {
        AtomicReferenceArray atomicReferenceArray = this.f23437h;
        long d = m29762d();
        int i = this.f23436g;
        int a = dxf.m29746a(d, i);
        T a2 = dxf.m29748a(atomicReferenceArray, a);
        Object obj = a2 == f23430j ? 1 : null;
        if (a2 == null || obj != null) {
            return obj != null ? m29749a(m29750a(atomicReferenceArray), d, i) : null;
        } else {
            m29760b(d + 1);
            dxf.m29753a(atomicReferenceArray, a, null);
            return a2;
        }
    }

    /* renamed from: a */
    private T m29749a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f23437h = atomicReferenceArray;
        int a = dxf.m29746a(j, i);
        T a2 = dxf.m29748a((AtomicReferenceArray) atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        m29760b(1 + j);
        dxf.m29753a((AtomicReferenceArray) atomicReferenceArray, a, null);
        return a2;
    }

    public T peek() {
        AtomicReferenceArray atomicReferenceArray = this.f23437h;
        long d = m29762d();
        int i = this.f23436g;
        T a = dxf.m29748a(atomicReferenceArray, dxf.m29746a(d, i));
        if (a == f23430j) {
            return m29759b(m29750a(atomicReferenceArray), d, i);
        }
        return a;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: b */
    private T m29759b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f23437h = atomicReferenceArray;
        return dxf.m29748a((AtomicReferenceArray) atomicReferenceArray, dxf.m29746a(j, i));
    }

    public int size() {
        long b = m29758b();
        while (true) {
            long a = m29747a();
            long b2 = m29758b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public boolean isEmpty() {
        return m29747a() == m29758b();
    }

    /* renamed from: a */
    private void m29751a(int i) {
        this.f23432c = Math.min(i / 4, f23429a);
    }

    /* renamed from: a */
    private long m29747a() {
        return this.f23431b.get();
    }

    /* renamed from: b */
    private long m29758b() {
        return this.f23438i.get();
    }

    /* renamed from: c */
    private long m29761c() {
        return this.f23431b.get();
    }

    /* renamed from: d */
    private long m29762d() {
        return this.f23438i.get();
    }

    /* renamed from: a */
    private void m29752a(long j) {
        this.f23431b.lazySet(j);
    }

    /* renamed from: b */
    private void m29760b(long j) {
        this.f23438i.lazySet(j);
    }

    /* renamed from: a */
    private static int m29746a(long j, int i) {
        return dxf.m29757b(((int) j) & i);
    }

    /* renamed from: b */
    private static int m29757b(int i) {
        return i;
    }

    /* renamed from: a */
    private static void m29753a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m29748a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    public T remove() {
        throw new UnsupportedOperationException();
    }

    public T element() {
        throw new UnsupportedOperationException();
    }
}
