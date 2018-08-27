package com.p000;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: AtomicReferenceArrayQueue */
/* renamed from: dxc */
abstract class dxc<E> extends AbstractQueue<E> {
    /* renamed from: a */
    protected final AtomicReferenceArray<E> f23418a;
    /* renamed from: b */
    protected final int f23419b;

    public dxc(int i) {
        int a = dxi.m29770a(i);
        this.f23419b = a - 1;
        this.f23418a = new AtomicReferenceArray(a);
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

    /* renamed from: a */
    protected final int m29738a(long j, int i) {
        return ((int) j) & i;
    }

    /* renamed from: a */
    protected final int m29737a(long j) {
        return ((int) j) & this.f23419b;
    }

    /* renamed from: a */
    protected final E m29740a(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    protected final void m29741a(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    /* renamed from: a */
    protected final E m29739a(int i) {
        return m29740a(this.f23418a, i);
    }
}
