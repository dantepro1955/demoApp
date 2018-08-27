package com.p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.dts.C5094a;

/* compiled from: ExecutorScheduler */
/* renamed from: dwe */
public final class dwe extends dts {
    /* renamed from: b */
    final Executor f23285b;

    /* compiled from: ExecutorScheduler */
    /* renamed from: dwe$a */
    static final class C5190a extends C5094a implements Runnable {
        /* renamed from: a */
        final Executor f23280a;
        /* renamed from: b */
        final dyt f23281b = new dyt();
        /* renamed from: c */
        final ConcurrentLinkedQueue<dwk> f23282c = new ConcurrentLinkedQueue();
        /* renamed from: d */
        final AtomicInteger f23283d = new AtomicInteger();
        /* renamed from: e */
        final ScheduledExecutorService f23284e = dwf.m29620c();

        public C5190a(Executor executor) {
            this.f23280a = executor;
        }

        /* renamed from: a */
        public dtw mo4644a(duk duk) {
            if (isUnsubscribed()) {
                return dyw.m29892a();
            }
            dtw dwk = new dwk(dyg.m29848a(duk), this.f23281b);
            this.f23281b.m29887a(dwk);
            this.f23282c.offer(dwk);
            if (this.f23283d.getAndIncrement() != 0) {
                return dwk;
            }
            try {
                this.f23280a.execute(this);
                return dwk;
            } catch (Throwable e) {
                this.f23281b.m29889b(dwk);
                this.f23283d.decrementAndGet();
                dyg.m29850a(e);
                throw e;
            }
        }

        public void run() {
            while (!this.f23281b.isUnsubscribed()) {
                dwk dwk = (dwk) this.f23282c.poll();
                if (dwk != null) {
                    if (!dwk.isUnsubscribed()) {
                        if (this.f23281b.isUnsubscribed()) {
                            this.f23282c.clear();
                            return;
                        }
                        dwk.run();
                    }
                    if (this.f23283d.decrementAndGet() == 0) {
                        return;
                    }
                }
                return;
            }
            this.f23282c.clear();
        }

        /* renamed from: a */
        public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo4644a(duk);
            }
            if (isUnsubscribed()) {
                return dyw.m29892a();
            }
            final duk a = dyg.m29848a(duk);
            Object dyu = new dyu();
            final dtw dyu2 = new dyu();
            dyu2.m29890a(dyu);
            this.f23281b.m29887a(dyu2);
            final dtw a2 = dyw.m29893a(new duk(this) {
                /* renamed from: b */
                final /* synthetic */ C5190a f23275b;

                /* renamed from: a */
                public void mo4643a() {
                    this.f23275b.f23281b.m29889b(dyu2);
                }
            });
            dwk dwk = new dwk(new duk(this) {
                /* renamed from: d */
                final /* synthetic */ C5190a f23279d;

                /* renamed from: a */
                public void mo4643a() {
                    if (!dyu2.isUnsubscribed()) {
                        dtw a = this.f23279d.mo4644a(a);
                        dyu2.m29890a(a);
                        if (a.getClass() == dwk.class) {
                            ((dwk) a).m29628a(a2);
                        }
                    }
                }
            });
            dyu.m29890a(dwk);
            try {
                dwk.m29631a(this.f23284e.schedule(dwk, j, timeUnit));
                return a2;
            } catch (Throwable e) {
                dyg.m29850a(e);
                throw e;
            }
        }

        public boolean isUnsubscribed() {
            return this.f23281b.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f23281b.unsubscribe();
            this.f23282c.clear();
        }
    }

    public dwe(Executor executor) {
        this.f23285b = executor;
    }

    public C5094a createWorker() {
        return new C5190a(this.f23285b);
    }
}
