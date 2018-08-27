package com.p000;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ImageLoaderEngine */
/* renamed from: cxg */
class cxg {
    /* renamed from: a */
    final cxf f20550a;
    /* renamed from: b */
    private Executor f20551b;
    /* renamed from: c */
    private Executor f20552c;
    /* renamed from: d */
    private Executor f20553d;
    /* renamed from: e */
    private final Map<Integer, String> f20554e;
    /* renamed from: f */
    private final Map<String, ReentrantLock> f20555f;
    /* renamed from: g */
    private final AtomicBoolean f20556g;
    /* renamed from: h */
    private final AtomicBoolean f20557h;
    /* renamed from: i */
    private final AtomicBoolean f20558i;
    /* renamed from: j */
    private final Object f20559j;

    /* renamed from: a */
    void m25508a(final cxi cxi) {
        this.f20553d.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ cxg f20549b;

            public void run() {
                File a = this.f20549b.f20550a.f20542m.m25405a(cxi.m25536a());
                Object obj = (a == null || !a.exists()) ? null : 1;
                this.f20549b.m25503e();
                if (obj != null) {
                    this.f20549b.f20552c.execute(cxi);
                } else {
                    this.f20549b.f20551b.execute(cxi);
                }
            }
        });
    }

    /* renamed from: a */
    void m25509a(cxj cxj) {
        m25503e();
        this.f20552c.execute(cxj);
    }

    /* renamed from: e */
    private void m25503e() {
        if (!this.f20550a.f20536g && ((ExecutorService) this.f20551b).isShutdown()) {
            this.f20551b = m25504f();
        }
        if (!this.f20550a.f20537h && ((ExecutorService) this.f20552c).isShutdown()) {
            this.f20552c = m25504f();
        }
    }

    /* renamed from: f */
    private Executor m25504f() {
        return cxb.m25413a(this.f20550a.f20538i, this.f20550a.f20539j, this.f20550a.f20540k);
    }

    /* renamed from: a */
    String m25505a(cxz cxz) {
        return (String) this.f20554e.get(Integer.valueOf(cxz.mo4230f()));
    }

    /* renamed from: a */
    void m25510a(cxz cxz, String str) {
        this.f20554e.put(Integer.valueOf(cxz.mo4230f()), str);
    }

    /* renamed from: b */
    void m25513b(cxz cxz) {
        this.f20554e.remove(Integer.valueOf(cxz.mo4230f()));
    }

    /* renamed from: a */
    void m25511a(Runnable runnable) {
        this.f20553d.execute(runnable);
    }

    /* renamed from: a */
    ReentrantLock m25507a(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f20555f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        reentrantLock = new ReentrantLock();
        this.f20555f.put(str, reentrantLock);
        return reentrantLock;
    }

    /* renamed from: a */
    AtomicBoolean m25506a() {
        return this.f20556g;
    }

    /* renamed from: b */
    Object m25512b() {
        return this.f20559j;
    }

    /* renamed from: c */
    boolean m25514c() {
        return this.f20557h.get();
    }

    /* renamed from: d */
    boolean m25515d() {
        return this.f20558i.get();
    }
}
