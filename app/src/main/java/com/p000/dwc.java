package com.p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.dts.C5094a;

/* compiled from: CachedThreadScheduler */
/* renamed from: dwc */
public final class dwc extends dts implements dwl {
    /* renamed from: b */
    static final C5182c f23252b = new C5182c(dwy.f23367a);
    /* renamed from: c */
    static final C5179a f23253c = new C5179a(null, 0, null);
    /* renamed from: f */
    private static final long f23254f = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());
    /* renamed from: g */
    private static final TimeUnit f23255g = TimeUnit.SECONDS;
    /* renamed from: d */
    final ThreadFactory f23256d;
    /* renamed from: e */
    final AtomicReference<C5179a> f23257e = new AtomicReference(f23253c);

    /* compiled from: CachedThreadScheduler */
    /* renamed from: dwc$a */
    static final class C5179a {
        /* renamed from: a */
        private final ThreadFactory f23231a;
        /* renamed from: b */
        private final long f23232b;
        /* renamed from: c */
        private final ConcurrentLinkedQueue<C5182c> f23233c;
        /* renamed from: d */
        private final dyt f23234d;
        /* renamed from: e */
        private final ScheduledExecutorService f23235e;
        /* renamed from: f */
        private final Future<?> f23236f;

        /* compiled from: CachedThreadScheduler */
        /* renamed from: dwc$a$2 */
        class C51782 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C5179a f23230a;

            C51782(C5179a c5179a) {
                this.f23230a = c5179a;
            }

            public void run() {
                this.f23230a.m29584b();
            }
        }

        C5179a(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            Future scheduleWithFixedDelay;
            ScheduledExecutorService scheduledExecutorService = null;
            this.f23231a = threadFactory;
            this.f23232b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f23233c = new ConcurrentLinkedQueue();
            this.f23234d = new dyt();
            if (timeUnit != null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactory(this) {
                    /* renamed from: b */
                    final /* synthetic */ C5179a f23229b;

                    public Thread newThread(Runnable runnable) {
                        Thread newThread = threadFactory.newThread(runnable);
                        newThread.setName(newThread.getName() + " (Evictor)");
                        return newThread;
                    }
                });
                dwj.m29593b(newScheduledThreadPool);
                scheduledExecutorService = newScheduledThreadPool;
                scheduleWithFixedDelay = newScheduledThreadPool.scheduleWithFixedDelay(new C51782(this), this.f23232b, this.f23232b, TimeUnit.NANOSECONDS);
            } else {
                scheduleWithFixedDelay = null;
            }
            this.f23235e = scheduledExecutorService;
            this.f23236f = scheduleWithFixedDelay;
        }

        /* renamed from: a */
        C5182c m29582a() {
            if (this.f23234d.isUnsubscribed()) {
                return dwc.f23252b;
            }
            while (!this.f23233c.isEmpty()) {
                C5182c c5182c = (C5182c) this.f23233c.poll();
                if (c5182c != null) {
                    return c5182c;
                }
            }
            dtw c5182c2 = new C5182c(this.f23231a);
            this.f23234d.m29887a(c5182c2);
            return c5182c2;
        }

        /* renamed from: a */
        void m29583a(C5182c c5182c) {
            c5182c.m29602a(m29585c() + this.f23232b);
            this.f23233c.offer(c5182c);
        }

        /* renamed from: b */
        void m29584b() {
            if (!this.f23233c.isEmpty()) {
                long c = m29585c();
                Iterator it = this.f23233c.iterator();
                while (it.hasNext()) {
                    C5182c c5182c = (C5182c) it.next();
                    if (c5182c.m29601a() > c) {
                        return;
                    }
                    if (this.f23233c.remove(c5182c)) {
                        this.f23234d.m29889b(c5182c);
                    }
                }
            }
        }

        /* renamed from: c */
        long m29585c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m29586d() {
            try {
                if (this.f23236f != null) {
                    this.f23236f.cancel(true);
                }
                if (this.f23235e != null) {
                    this.f23235e.shutdownNow();
                }
                this.f23234d.unsubscribe();
            } catch (Throwable th) {
                this.f23234d.unsubscribe();
            }
        }
    }

    /* compiled from: CachedThreadScheduler */
    /* renamed from: dwc$b */
    static final class C5181b extends C5094a implements duk {
        /* renamed from: a */
        final AtomicBoolean f23239a;
        /* renamed from: b */
        private final dyt f23240b = new dyt();
        /* renamed from: c */
        private final C5179a f23241c;
        /* renamed from: d */
        private final C5182c f23242d;

        C5181b(C5179a c5179a) {
            this.f23241c = c5179a;
            this.f23239a = new AtomicBoolean();
            this.f23242d = c5179a.m29582a();
        }

        public void unsubscribe() {
            if (this.f23239a.compareAndSet(false, true)) {
                this.f23242d.mo4644a((duk) this);
            }
            this.f23240b.unsubscribe();
        }

        /* renamed from: a */
        public void mo4643a() {
            this.f23241c.m29583a(this.f23242d);
        }

        public boolean isUnsubscribed() {
            return this.f23240b.isUnsubscribed();
        }

        /* renamed from: a */
        public dtw mo4644a(duk duk) {
            return mo4645a(duk, 0, null);
        }

        /* renamed from: a */
        public dtw mo4645a(final duk duk, long j, TimeUnit timeUnit) {
            if (this.f23240b.isUnsubscribed()) {
                return dyw.m29892a();
            }
            dtw b = this.f23242d.m29600b(new duk(this) {
                /* renamed from: b */
                final /* synthetic */ C5181b f23238b;

                /* renamed from: a */
                public void mo4643a() {
                    if (!this.f23238b.isUnsubscribed()) {
                        duk.mo4643a();
                    }
                }
            }, j, timeUnit);
            this.f23240b.m29887a(b);
            b.m29629a(this.f23240b);
            return b;
        }
    }

    /* compiled from: CachedThreadScheduler */
    /* renamed from: dwc$c */
    static final class C5182c extends dwj {
        /* renamed from: c */
        private long f23251c = 0;

        C5182c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public long m29601a() {
            return this.f23251c;
        }

        /* renamed from: a */
        public void m29602a(long j) {
            this.f23251c = j;
        }
    }

    static {
        f23252b.unsubscribe();
        f23253c.m29586d();
    }

    public dwc(ThreadFactory threadFactory) {
        this.f23256d = threadFactory;
        mo4662a();
    }

    /* renamed from: a */
    public void mo4662a() {
        C5179a c5179a = new C5179a(this.f23256d, f23254f, f23255g);
        if (!this.f23257e.compareAndSet(f23253c, c5179a)) {
            c5179a.m29586d();
        }
    }

    /* renamed from: b */
    public void mo4663b() {
        C5179a c5179a;
        do {
            c5179a = (C5179a) this.f23257e.get();
            if (c5179a == f23253c) {
                return;
            }
        } while (!this.f23257e.compareAndSet(c5179a, f23253c));
        c5179a.m29586d();
    }

    public C5094a createWorker() {
        return new C5181b((C5179a) this.f23257e.get());
    }
}
