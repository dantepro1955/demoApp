package com.p000;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: IdentityScopeObject */
/* renamed from: doc */
public class doc<K, T> implements doa<K, T> {
    /* renamed from: a */
    private final HashMap<K, Reference<T>> f22383a = new HashMap();
    /* renamed from: b */
    private final ReentrantLock f22384b = new ReentrantLock();

    /* renamed from: a */
    public T mo4491a(K k) {
        this.f22384b.lock();
        try {
            Reference reference = (Reference) this.f22383a.get(k);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: b */
    public T mo4496b(K k) {
        Reference reference = (Reference) this.f22383a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo4495a(K k, T t) {
        this.f22384b.lock();
        try {
            this.f22383a.put(k, new WeakReference(t));
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: b */
    public void mo4498b(K k, T t) {
        this.f22383a.put(k, new WeakReference(t));
    }

    /* renamed from: c */
    public boolean mo4501c(K k, T t) {
        this.f22384b.lock();
        try {
            if (mo4491a((Object) k) != t || t == null) {
                this.f22384b.unlock();
                return false;
            }
            mo4500c(k);
            return true;
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: c */
    public void mo4500c(K k) {
        this.f22384b.lock();
        try {
            this.f22383a.remove(k);
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: a */
    public void mo4494a(Iterable<K> iterable) {
        this.f22384b.lock();
        try {
            for (K remove : iterable) {
                this.f22383a.remove(remove);
            }
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: a */
    public void mo4492a() {
        this.f22384b.lock();
        try {
            this.f22383a.clear();
        } finally {
            this.f22384b.unlock();
        }
    }

    /* renamed from: b */
    public void mo4497b() {
        this.f22384b.lock();
    }

    /* renamed from: c */
    public void mo4499c() {
        this.f22384b.unlock();
    }

    /* renamed from: a */
    public void mo4493a(int i) {
    }
}
