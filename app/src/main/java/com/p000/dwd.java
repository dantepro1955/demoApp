package com.p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.dts.C5094a;

/* compiled from: EventLoopsScheduler */
/* renamed from: dwd */
public final class dwd extends dts implements dwl {
    /* renamed from: b */
    static final int f23269b;
    /* renamed from: c */
    static final C5187c f23270c = new C5187c(dwy.f23367a);
    /* renamed from: d */
    static final C5186b f23271d = new C5186b(null, 0);
    /* renamed from: e */
    final ThreadFactory f23272e;
    /* renamed from: f */
    final AtomicReference<C5186b> f23273f = new AtomicReference(f23271d);

    /* compiled from: EventLoopsScheduler */
    /* renamed from: dwd$a */
    static final class C5185a extends C5094a {
        /* renamed from: a */
        private final dxa f23262a = new dxa();
        /* renamed from: b */
        private final dyt f23263b = new dyt();
        /* renamed from: c */
        private final dxa f23264c = new dxa(this.f23262a, this.f23263b);
        /* renamed from: d */
        private final C5187c f23265d;

        C5185a(C5187c c5187c) {
            this.f23265d = c5187c;
        }

        public void unsubscribe() {
            this.f23264c.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f23264c.isUnsubscribed();
        }

        /* renamed from: a */
        public dtw mo4644a(final duk duk) {
            if (isUnsubscribed()) {
                return dyw.m29892a();
            }
            return this.f23265d.m29598a(new duk(this) {
                /* renamed from: b */
                final /* synthetic */ C5185a f23259b;

                /* renamed from: a */
                public void mo4643a() {
                    if (!this.f23259b.isUnsubscribed()) {
                        duk.mo4643a();
                    }
                }
            }, 0, null, this.f23262a);
        }

        /* renamed from: a */
        public dtw mo4645a(final duk duk, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return dyw.m29892a();
            }
            return this.f23265d.m29599a(new duk(this) {
                /* renamed from: b */
                final /* synthetic */ C5185a f23261b;

                /* renamed from: a */
                public void mo4643a() {
                    if (!this.f23261b.isUnsubscribed()) {
                        duk.mo4643a();
                    }
                }
            }, j, timeUnit, this.f23263b);
        }
    }

    /* compiled from: EventLoopsScheduler */
    /* renamed from: dwd$b */
    static final class C5186b {
        /* renamed from: a */
        final int f23266a;
        /* renamed from: b */
        final C5187c[] f23267b;
        /* renamed from: c */
        long f23268c;

        C5186b(ThreadFactory threadFactory, int i) {
            this.f23266a = i;
            this.f23267b = new C5187c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f23267b[i2] = new C5187c(threadFactory);
            }
        }

        /* renamed from: a */
        public C5187c m29611a() {
            int i = this.f23266a;
            if (i == 0) {
                return dwd.f23270c;
            }
            C5187c[] c5187cArr = this.f23267b;
            long j = this.f23268c;
            this.f23268c = 1 + j;
            return c5187cArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void m29612b() {
            for (C5187c unsubscribe : this.f23267b) {
                unsubscribe.unsubscribe();
            }
        }
    }

    /* compiled from: EventLoopsScheduler */
    /* renamed from: dwd$c */
    static final class C5187c extends dwj {
        C5187c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f23269b = intValue;
        f23270c.unsubscribe();
    }

    public dwd(ThreadFactory threadFactory) {
        this.f23272e = threadFactory;
        mo4662a();
    }

    public C5094a createWorker() {
        return new C5185a(((C5186b) this.f23273f.get()).m29611a());
    }

    /* renamed from: a */
    public void mo4662a() {
        C5186b c5186b = new C5186b(this.f23272e, f23269b);
        if (!this.f23273f.compareAndSet(f23271d, c5186b)) {
            c5186b.m29612b();
        }
    }

    /* renamed from: b */
    public void mo4663b() {
        C5186b c5186b;
        do {
            c5186b = (C5186b) this.f23273f.get();
            if (c5186b == f23271d) {
                return;
            }
        } while (!this.f23273f.compareAndSet(c5186b, f23271d));
        c5186b.m29612b();
    }

    /* renamed from: a */
    public dtw m29613a(duk duk) {
        return ((C5186b) this.f23273f.get()).m29611a().m29600b(duk, -1, TimeUnit.NANOSECONDS);
    }
}
