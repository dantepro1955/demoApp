package com.p000;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ApiTaskController */
/* renamed from: dcx */
public class dcx extends dde {
    /* renamed from: a */
    public static final TimeUnit f21192a = TimeUnit.SECONDS;
    /* renamed from: b */
    static final AtomicLong f21193b = new AtomicLong(0);
    /* renamed from: e */
    private static dcx f21194e = new dcx();
    /* renamed from: c */
    private final BlockingQueue<Runnable> f21195c;
    /* renamed from: d */
    private ThreadPoolExecutor f21196d;

    /* compiled from: ApiTaskController */
    /* renamed from: dcx$a */
    class C4804a extends dee implements Comparable<C4804a> {
        /* renamed from: a */
        final long f21184a = dcx.f21193b.getAndIncrement();
        /* renamed from: b */
        final /* synthetic */ dcx f21185b;

        public /* synthetic */ int compareTo(Object obj) {
            return m26448a((C4804a) obj);
        }

        public C4804a(dcx dcx, Context context, deb deb) {
            this.f21185b = dcx;
            super(context, deb);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4804a) {
                C4804a c4804a = (C4804a) obj;
                deb a = m26447a();
                deb a2 = c4804a.m26447a();
                if (!(a == null || a2 == null)) {
                    return a.equals(a2);
                }
            }
            return false;
        }

        public void run() {
            super.run();
            this.f21185b.m26454e();
        }

        /* renamed from: a */
        public int m26448a(C4804a c4804a) {
            return this.f21184a < c4804a.f21184a ? 1 : -1;
        }
    }

    /* compiled from: ApiTaskController */
    /* renamed from: dcx$b */
    public enum C4805b {
        FIFO,
        LIFO
    }

    /* renamed from: a */
    public static dcx m26455a() {
        return f21194e;
    }

    public dcx() {
        this(C4805b.FIFO);
    }

    public dcx(C4805b c4805b) {
        if (c4805b == C4805b.LIFO) {
            this.f21195c = new PriorityBlockingQueue();
        } else {
            this.f21195c = new LinkedBlockingQueue();
        }
        this.f21196d = new ThreadPoolExecutor(1, 1, 5, f21192a, this.f21195c);
    }

    /* renamed from: b */
    public boolean mo4324b() {
        return this.f21195c.size() == 0;
    }

    /* renamed from: a */
    public void m26456a(deb deb) {
        Runnable c4804a = new C4804a(this, m26453d(), deb);
        if (!this.f21195c.contains(c4804a)) {
            this.f21196d.execute(c4804a);
        }
    }
}
