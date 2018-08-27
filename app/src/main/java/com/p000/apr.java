package com.p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: apr */
public class apr<E> extends AbstractSet<E> {
    /* renamed from: a */
    private final hh<E, E> f3928a;

    public apr() {
        this.f3928a = new hh();
    }

    public apr(int i) {
        this.f3928a = new hh(i);
    }

    public apr(Collection<E> collection) {
        this(collection.size());
        addAll(collection);
    }

    /* renamed from: a */
    public boolean m4872a(apr<? extends E> apr) {
        int size = size();
        this.f3928a.a(apr.f3928a);
        return size() > size;
    }

    public boolean add(E e) {
        if (this.f3928a.containsKey(e)) {
            return false;
        }
        this.f3928a.put(e, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        return collection instanceof apr ? m4872a((apr) collection) : super.addAll(collection);
    }

    public void clear() {
        this.f3928a.clear();
    }

    public boolean contains(Object obj) {
        return this.f3928a.containsKey(obj);
    }

    public Iterator<E> iterator() {
        return this.f3928a.keySet().iterator();
    }

    public boolean remove(Object obj) {
        if (!this.f3928a.containsKey(obj)) {
            return false;
        }
        this.f3928a.remove(obj);
        return true;
    }

    public int size() {
        return this.f3928a.size();
    }
}
