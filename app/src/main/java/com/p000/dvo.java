package com.p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5093b;
import p000.dts.C5094a;

/* compiled from: OperatorObserveOn */
/* renamed from: dvo */
public final class dvo<T> implements C5093b<T, T> {
    /* renamed from: a */
    private final dts f23133a;
    /* renamed from: b */
    private final boolean f23134b;
    /* renamed from: c */
    private final int f23135c;

    /* compiled from: OperatorObserveOn */
    /* renamed from: dvo$a */
    static final class C5151a<T> extends dtv<T> implements duk {
        /* renamed from: a */
        final dtv<? super T> f23123a;
        /* renamed from: b */
        final C5094a f23124b;
        /* renamed from: c */
        final boolean f23125c;
        /* renamed from: d */
        final Queue<Object> f23126d;
        /* renamed from: e */
        final int f23127e;
        /* renamed from: f */
        volatile boolean f23128f;
        /* renamed from: g */
        final AtomicLong f23129g = new AtomicLong();
        /* renamed from: h */
        final AtomicLong f23130h = new AtomicLong();
        /* renamed from: i */
        Throwable f23131i;
        /* renamed from: j */
        long f23132j;

        /* compiled from: OperatorObserveOn */
        /* renamed from: dvo$a$1 */
        class C51501 implements dtr {
            /* renamed from: a */
            final /* synthetic */ C5151a f23122a;

            C51501(C5151a c5151a) {
                this.f23122a = c5151a;
            }

            public void request(long j) {
                if (j > 0) {
                    dus.m29421a(this.f23122a.f23129g, j);
                    this.f23122a.m29523c();
                }
            }
        }

        public C5151a(dts dts, dtv<? super T> dtv, boolean z, int i) {
            this.f23123a = dtv;
            this.f23124b = dts.createWorker();
            this.f23125c = z;
            if (i <= 0) {
                i = dwx.f23363b;
            }
            this.f23127e = i - (i >> 2);
            if (dxy.m29783a()) {
                this.f23126d = new dxr(i);
            } else {
                this.f23126d = new dxd(i);
            }
            request((long) i);
        }

        /* renamed from: b */
        void m29522b() {
            dtv dtv = this.f23123a;
            dtv.setProducer(new C51501(this));
            dtv.add(this.f23124b);
            dtv.add(this);
        }

        public void onNext(T t) {
            if (!isUnsubscribed() && !this.f23128f) {
                if (this.f23126d.offer(duw.m29441a((Object) t))) {
                    m29523c();
                } else {
                    onError(new due());
                }
            }
        }

        public void onCompleted() {
            if (!isUnsubscribed() && !this.f23128f) {
                this.f23128f = true;
                m29523c();
            }
        }

        public void onError(Throwable th) {
            if (isUnsubscribed() || this.f23128f) {
                dyg.m29850a(th);
                return;
            }
            this.f23131i = th;
            this.f23128f = true;
            m29523c();
        }

        /* renamed from: c */
        protected void m29523c() {
            if (this.f23130h.getAndIncrement() == 0) {
                this.f23124b.mo4644a(this);
            }
        }

        /* renamed from: a */
        public void mo4643a() {
            long j = this.f23132j;
            Queue queue = this.f23126d;
            dtv dtv = this.f23123a;
            long j2 = 1;
            do {
                long j3 = this.f23129g.get();
                while (j3 != j) {
                    boolean z = this.f23128f;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!m29521a(z, z2, dtv, queue)) {
                        if (z2) {
                            break;
                        }
                        dtv.onNext(duw.m29445c(poll));
                        long j4 = j + 1;
                        if (j4 == ((long) this.f23127e)) {
                            j = dus.m29425b(this.f23129g, j4);
                            request(j4);
                            j4 = 0;
                        } else {
                            j = j3;
                        }
                        j3 = j;
                        j = j4;
                    } else {
                        return;
                    }
                }
                if (j3 != j || !m29521a(this.f23128f, queue.isEmpty(), dtv, queue)) {
                    this.f23132j = j;
                    j2 = this.f23130h.addAndGet(-j2);
                } else {
                    return;
                }
            } while (j2 != 0);
        }

        /* renamed from: a */
        boolean m29521a(boolean z, boolean z2, dtv<? super T> dtv, Queue<Object> queue) {
            if (dtv.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                if (!this.f23125c) {
                    Throwable th = this.f23131i;
                    if (th != null) {
                        queue.clear();
                        try {
                            dtv.onError(th);
                            return true;
                        } finally {
                            this.f23124b.unsubscribe();
                        }
                    } else if (z2) {
                        try {
                            dtv.onCompleted();
                            return true;
                        } finally {
                            this.f23124b.unsubscribe();
                        }
                    }
                } else if (z2) {
                    Throwable th2 = this.f23131i;
                    if (th2 != null) {
                        try {
                            dtv.onError(th2);
                        } catch (Throwable th3) {
                            this.f23124b.unsubscribe();
                        }
                    } else {
                        dtv.onCompleted();
                    }
                    this.f23124b.unsubscribe();
                }
            }
            return false;
        }
    }

    public dvo(dts dts, boolean z, int i) {
        this.f23133a = dts;
        this.f23134b = z;
        if (i <= 0) {
            i = dwx.f23363b;
        }
        this.f23135c = i;
    }

    /* renamed from: a */
    public dtv<? super T> m29524a(dtv<? super T> dtv) {
        if ((this.f23133a instanceof dwh) || (this.f23133a instanceof dwo)) {
            return dtv;
        }
        dtv c5151a = new C5151a(this.f23133a, dtv, this.f23134b, this.f23135c);
        c5151a.m29522b();
        return c5151a;
    }
}
