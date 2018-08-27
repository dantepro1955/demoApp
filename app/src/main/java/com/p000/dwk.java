package com.p000;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ScheduledAction */
/* renamed from: dwk */
public final class dwk extends AtomicReference<Thread> implements dtw, Runnable {
    private static final long serialVersionUID = -3962399486978279857L;
    /* renamed from: a */
    final dxa f23303a;
    /* renamed from: b */
    final duk f23304b;

    /* compiled from: ScheduledAction */
    /* renamed from: dwk$a */
    final class C5193a implements dtw {
        /* renamed from: a */
        final /* synthetic */ dwk f23297a;
        /* renamed from: b */
        private final Future<?> f23298b;

        C5193a(dwk dwk, Future<?> future) {
            this.f23297a = dwk;
            this.f23298b = future;
        }

        public void unsubscribe() {
            if (this.f23297a.get() != Thread.currentThread()) {
                this.f23298b.cancel(true);
            } else {
                this.f23298b.cancel(false);
            }
        }

        public boolean isUnsubscribed() {
            return this.f23298b.isCancelled();
        }
    }

    /* compiled from: ScheduledAction */
    /* renamed from: dwk$b */
    static final class C5194b extends AtomicBoolean implements dtw {
        private static final long serialVersionUID = 247232374289553518L;
        /* renamed from: a */
        final dwk f23299a;
        /* renamed from: b */
        final dyt f23300b;

        public C5194b(dwk dwk, dyt dyt) {
            this.f23299a = dwk;
            this.f23300b = dyt;
        }

        public boolean isUnsubscribed() {
            return this.f23299a.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f23300b.m29889b(this.f23299a);
            }
        }
    }

    /* compiled from: ScheduledAction */
    /* renamed from: dwk$c */
    static final class C5195c extends AtomicBoolean implements dtw {
        private static final long serialVersionUID = 247232374289553518L;
        /* renamed from: a */
        final dwk f23301a;
        /* renamed from: b */
        final dxa f23302b;

        public C5195c(dwk dwk, dxa dxa) {
            this.f23301a = dwk;
            this.f23302b = dxa;
        }

        public boolean isUnsubscribed() {
            return this.f23301a.isUnsubscribed();
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f23302b.m29731b(this.f23301a);
            }
        }
    }

    public dwk(duk duk) {
        this.f23304b = duk;
        this.f23303a = new dxa();
    }

    public dwk(duk duk, dyt dyt) {
        this.f23304b = duk;
        this.f23303a = new dxa(new C5194b(this, dyt));
    }

    public dwk(duk duk, dxa dxa) {
        this.f23304b = duk;
        this.f23303a = new dxa(new C5195c(this, dxa));
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.f23304b.mo4643a();
        } catch (Throwable e) {
            m29630a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable e2) {
            m29630a(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", e2));
        } finally {
            unsubscribe();
        }
    }

    /* renamed from: a */
    void m29630a(Throwable th) {
        dyg.m29850a(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public boolean isUnsubscribed() {
        return this.f23303a.isUnsubscribed();
    }

    public void unsubscribe() {
        if (!this.f23303a.isUnsubscribed()) {
            this.f23303a.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m29628a(dtw dtw) {
        this.f23303a.m29730a(dtw);
    }

    /* renamed from: a */
    public void m29631a(Future<?> future) {
        this.f23303a.m29730a(new C5193a(this, future));
    }

    /* renamed from: a */
    public void m29629a(dyt dyt) {
        this.f23303a.m29730a(new C5194b(this, dyt));
    }
}
