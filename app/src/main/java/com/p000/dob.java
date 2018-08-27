package com.p000;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: IdentityScopeLong */
/* renamed from: dob */
public class dob<T> implements doa<Long, T> {
    /* renamed from: a */
    private final dog<Reference<T>> f22381a = new dog();
    /* renamed from: b */
    private final ReentrantLock f22382b = new ReentrantLock();

    /* renamed from: a */
    public T m28377a(Long l) {
        return m28376a(l.longValue());
    }

    /* renamed from: b */
    public T m28386b(Long l) {
        return m28385b(l.longValue());
    }

    /* renamed from: a */
    public T m28376a(long j) {
        this.f22382b.lock();
        try {
            Reference reference = (Reference) this.f22381a.m28412a(j);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: b */
    public T m28385b(long j) {
        Reference reference = (Reference) this.f22381a.m28412a(j);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void m28383a(Long l, T t) {
        m28381a(l.longValue(), (Object) t);
    }

    /* renamed from: b */
    public void m28390b(Long l, T t) {
        m28389b(l.longValue(), (Object) t);
    }

    /* renamed from: a */
    public void m28381a(long j, T t) {
        this.f22382b.lock();
        try {
            this.f22381a.m28413a(j, new WeakReference(t));
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: b */
    public void m28389b(long j, T t) {
        this.f22381a.m28413a(j, new WeakReference(t));
    }

    /* renamed from: c */
    public boolean m28395c(Long l, T t) {
        this.f22382b.lock();
        try {
            if (m28377a(l) != t || t == null) {
                this.f22382b.unlock();
                return false;
            }
            m28393c(l);
            return true;
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: c */
    public void m28393c(Long l) {
        this.f22382b.lock();
        try {
            this.f22381a.m28416b(l.longValue());
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: a */
    public void mo4494a(Iterable<Long> iterable) {
        this.f22382b.lock();
        try {
            for (Long longValue : iterable) {
                this.f22381a.m28416b(longValue.longValue());
            }
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: a */
    public void mo4492a() {
        this.f22382b.lock();
        try {
            this.f22381a.m28414a();
        } finally {
            this.f22382b.unlock();
        }
    }

    /* renamed from: b */
    public void mo4497b() {
        this.f22382b.lock();
    }

    /* renamed from: c */
    public void mo4499c() {
        this.f22382b.unlock();
    }

    /* renamed from: a */
    public void mo4493a(int i) {
        this.f22381a.m28417b(i);
    }
}
