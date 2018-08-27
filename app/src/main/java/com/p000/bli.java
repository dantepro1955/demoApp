package com.p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p000.blh.C0242c;
import p000.blh.C0892a;

@bhd
/* renamed from: bli */
public class bli<T> implements blh<T> {
    /* renamed from: a */
    protected int f5794a = 0;
    /* renamed from: b */
    protected final BlockingQueue<C1319a> f5795b = new LinkedBlockingQueue();
    /* renamed from: c */
    protected T f5796c;
    /* renamed from: d */
    private final Object f5797d = new Object();

    /* renamed from: bli$a */
    class C1319a {
        /* renamed from: a */
        public final C0242c<T> f6819a;
        /* renamed from: b */
        public final C0892a f6820b;

        public C1319a(bli bli, C0242c<T> c0242c, C0892a c0892a) {
            this.f6819a = c0242c;
            this.f6820b = c0892a;
        }
    }

    /* renamed from: a */
    public void mo1034a() {
        synchronized (this.f5797d) {
            if (this.f5794a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f5794a = -1;
            for (C1319a c1319a : this.f5795b) {
                c1319a.f6820b.mo852a();
            }
            this.f5795b.clear();
        }
    }

    /* renamed from: a */
    public void mo1032a(C0242c<T> c0242c, C0892a c0892a) {
        synchronized (this.f5797d) {
            if (this.f5794a == 1) {
                c0242c.mo289a(this.f5796c);
            } else if (this.f5794a == -1) {
                c0892a.mo852a();
            } else if (this.f5794a == 0) {
                this.f5795b.add(new C1319a(this, c0242c, c0892a));
            }
        }
    }

    /* renamed from: a */
    public void mo1033a(T t) {
        synchronized (this.f5797d) {
            if (this.f5794a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f5796c = t;
            this.f5794a = 1;
            for (C1319a c1319a : this.f5795b) {
                c1319a.f6819a.mo289a(t);
            }
            this.f5795b.clear();
        }
    }

    /* renamed from: b */
    public int mo1035b() {
        return this.f5794a;
    }
}
