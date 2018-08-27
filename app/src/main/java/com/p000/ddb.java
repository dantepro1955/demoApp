package com.p000;

import android.content.Context;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DownloadTaskController */
/* renamed from: ddb */
public class ddb extends dde {
    /* renamed from: a */
    public static final TimeUnit f21223a = TimeUnit.SECONDS;
    /* renamed from: b */
    private static final AtomicInteger f21224b = new AtomicInteger(0);
    /* renamed from: e */
    private static ddb f21225e = new ddb();
    /* renamed from: c */
    private final PriorityBlockingQueue<Runnable> f21226c = new PriorityBlockingQueue(1, new C48131(this));
    /* renamed from: d */
    private ThreadPoolExecutor f21227d = new ThreadPoolExecutor(3, 3, 1, f21223a, this.f21226c);

    /* compiled from: DownloadTaskController */
    /* renamed from: ddb$1 */
    class C48131 implements Comparator {
        /* renamed from: a */
        final /* synthetic */ ddb f21220a;

        C48131(ddb ddb) {
            this.f21220a = ddb;
        }

        public int compare(Object obj, Object obj2) {
            if ((obj instanceof C4814a) && (obj2 instanceof C4814a)) {
                return ((C4814a) obj).m26564a((C4814a) obj2);
            }
            return 0;
        }
    }

    /* compiled from: DownloadTaskController */
    /* renamed from: ddb$a */
    class C4814a extends dee implements Comparable<C4814a> {
        /* renamed from: a */
        final /* synthetic */ ddb f21221a;
        /* renamed from: b */
        private int f21222b;

        public /* synthetic */ int compareTo(Object obj) {
            return m26564a((C4814a) obj);
        }

        public C4814a(ddb ddb, Context context, deb deb) {
            this.f21221a = ddb;
            super(context, deb);
            this.f21222b = 0;
            this.f21222b = ddb.f21224b.getAndIncrement();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4814a) {
                C4814a c4814a = (C4814a) obj;
                deb a = m26447a();
                deb a2 = c4814a.m26447a();
                if (!(a == null || a2 == null)) {
                    return a.equals(a2);
                }
            }
            return false;
        }

        public void run() {
            super.run();
            this.f21221a.m26454e();
        }

        /* renamed from: a */
        public int m26564a(C4814a c4814a) {
            return c4814a.f21222b - this.f21222b;
        }
    }

    /* renamed from: a */
    public static ddb m26565a() {
        return f21225e;
    }

    private ddb() {
    }

    /* renamed from: b */
    public boolean mo4324b() {
        return this.f21226c.size() == 0;
    }

    /* renamed from: a */
    public void m26567a(deb deb) {
        Runnable c4814a = new C4814a(this, m26453d(), deb);
        if (!this.f21226c.contains(c4814a)) {
            this.f21227d.execute(c4814a);
        }
    }
}
