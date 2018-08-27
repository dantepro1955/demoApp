package com.p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscExactAtomicArrayQueue */
/* renamed from: dxe */
public final class dxe<T> extends AtomicReferenceArray<T> implements Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    /* renamed from: a */
    final int f23425a;
    /* renamed from: b */
    final int f23426b;
    /* renamed from: c */
    final AtomicLong f23427c = new AtomicLong();
    /* renamed from: d */
    final AtomicLong f23428d = new AtomicLong();

    public dxe(int i) {
        super(dxi.m29770a(i));
        int length = length();
        this.f23425a = length - 1;
        this.f23426b = length - i;
    }

    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        long j = this.f23427c.get();
        int i = this.f23425a;
        if (get(((int) (((long) this.f23426b) + j)) & i) != null) {
            return false;
        }
        i &= (int) j;
        this.f23427c.lazySet(j + 1);
        lazySet(i, t);
        return true;
    }

    public T poll() {
        long j = this.f23428d.get();
        int i = this.f23425a & ((int) j);
        T t = get(i);
        if (t == null) {
            return null;
        }
        this.f23428d.lazySet(j + 1);
        lazySet(i, null);
        return t;
    }

    public T peek() {
        return get(((int) this.f23428d.get()) & this.f23425a);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f23427c == this.f23428d;
    }

    public int size() {
        long j = this.f23428d.get();
        while (true) {
            long j2 = this.f23427c.get();
            long j3 = this.f23428d.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Iterator<T> iterator() {
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
