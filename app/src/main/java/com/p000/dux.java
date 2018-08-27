package com.p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5092a;

/* compiled from: OnSubscribeConcatMap */
/* renamed from: dux */
public final class dux<T, R> implements C5092a<R> {
    /* renamed from: a */
    final dtp<? extends T> f23004a;
    /* renamed from: b */
    final duo<? super T, ? extends dtp<? extends R>> f23005b;
    /* renamed from: c */
    final int f23006c;
    /* renamed from: d */
    final int f23007d;

    /* compiled from: OnSubscribeConcatMap */
    /* renamed from: dux$a */
    static final class C5119a<T, R> implements dtr {
        /* renamed from: a */
        final R f22989a;
        /* renamed from: b */
        final C5121c<T, R> f22990b;
        /* renamed from: c */
        boolean f22991c;

        public C5119a(R r, C5121c<T, R> c5121c) {
            this.f22989a = r;
            this.f22990b = c5121c;
        }

        public void request(long j) {
            if (!this.f22991c && j > 0) {
                this.f22991c = true;
                C5121c c5121c = this.f22990b;
                c5121c.m29448a(this.f22989a);
                c5121c.m29451b(1);
            }
        }
    }

    /* compiled from: OnSubscribeConcatMap */
    /* renamed from: dux$b */
    static final class C5120b<T, R> extends dtv<R> {
        /* renamed from: a */
        final C5121c<T, R> f22992a;
        /* renamed from: b */
        long f22993b;

        public C5120b(C5121c<T, R> c5121c) {
            this.f22992a = c5121c;
        }

        public void setProducer(dtr dtr) {
            this.f22992a.f22997d.m29574a(dtr);
        }

        public void onNext(R r) {
            this.f22993b++;
            this.f22992a.m29448a((Object) r);
        }

        public void onError(Throwable th) {
            this.f22992a.m29450a(th, this.f22993b);
        }

        public void onCompleted() {
            this.f22992a.m29451b(this.f22993b);
        }
    }

    /* compiled from: OnSubscribeConcatMap */
    /* renamed from: dux$c */
    static final class C5121c<T, R> extends dtv<T> {
        /* renamed from: a */
        final dtv<? super R> f22994a;
        /* renamed from: b */
        final duo<? super T, ? extends dtp<? extends R>> f22995b;
        /* renamed from: c */
        final int f22996c;
        /* renamed from: d */
        final dvz f22997d = new dvz();
        /* renamed from: e */
        final Queue<Object> f22998e;
        /* renamed from: f */
        final AtomicInteger f22999f = new AtomicInteger();
        /* renamed from: g */
        final AtomicReference<Throwable> f23000g = new AtomicReference();
        /* renamed from: h */
        final dyv f23001h;
        /* renamed from: i */
        volatile boolean f23002i;
        /* renamed from: j */
        volatile boolean f23003j;

        public C5121c(dtv<? super R> dtv, duo<? super T, ? extends dtp<? extends R>> duo, int i, int i2) {
            Queue dxr;
            this.f22994a = dtv;
            this.f22995b = duo;
            this.f22996c = i2;
            if (dxy.m29783a()) {
                dxr = new dxr(i);
            } else {
                dxr = new dxd(i);
            }
            this.f22998e = dxr;
            this.f23001h = new dyv();
            request((long) i);
        }

        public void onNext(T t) {
            if (this.f22998e.offer(duw.m29441a((Object) t))) {
                m29446a();
                return;
            }
            unsubscribe();
            onError(new due());
        }

        public void onError(Throwable th) {
            if (dwu.m29657a(this.f23000g, th)) {
                this.f23002i = true;
                if (this.f22996c == 0) {
                    Throwable a = dwu.m29655a(this.f23000g);
                    if (!dwu.m29656a(a)) {
                        this.f22994a.onError(a);
                    }
                    this.f23001h.unsubscribe();
                    return;
                }
                m29446a();
                return;
            }
            m29449a(th);
        }

        public void onCompleted() {
            this.f23002i = true;
            m29446a();
        }

        /* renamed from: a */
        void m29447a(long j) {
            if (j > 0) {
                this.f22997d.request(j);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        /* renamed from: a */
        void m29448a(R r) {
            this.f22994a.onNext(r);
        }

        /* renamed from: a */
        void m29450a(Throwable th, long j) {
            if (!dwu.m29657a(this.f23000g, th)) {
                m29449a(th);
            } else if (this.f22996c == 0) {
                Throwable a = dwu.m29655a(this.f23000g);
                if (!dwu.m29656a(a)) {
                    this.f22994a.onError(a);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f22997d.m29573a(j);
                }
                this.f23003j = false;
                m29446a();
            }
        }

        /* renamed from: b */
        void m29451b(long j) {
            if (j != 0) {
                this.f22997d.m29573a(j);
            }
            this.f23003j = false;
            m29446a();
        }

        /* renamed from: a */
        void m29449a(Throwable th) {
            dyg.m29850a(th);
        }

        /* renamed from: a */
        void m29446a() {
            Throwable a;
            if (this.f22999f.getAndIncrement() == 0) {
                int i = this.f22996c;
                while (!this.f22994a.isUnsubscribed()) {
                    if (!this.f23003j) {
                        if (i != 1 || this.f23000g.get() == null) {
                            boolean z = this.f23002i;
                            Object poll = this.f22998e.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                a = dwu.m29655a(this.f23000g);
                                if (a == null) {
                                    this.f22994a.onCompleted();
                                    return;
                                } else if (!dwu.m29656a(a)) {
                                    this.f22994a.onError(a);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    dtp dtp = (dtp) this.f22995b.mo4103a(duw.m29445c(poll));
                                    if (dtp == null) {
                                        m29452b(new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (dtp != dtp.m29321d()) {
                                        if (dtp instanceof dwz) {
                                            dwz dwz = (dwz) dtp;
                                            this.f23003j = true;
                                            this.f22997d.m29574a(new C5119a(dwz.m29700a(), this));
                                        } else {
                                            dtv c5120b = new C5120b(this);
                                            this.f23001h.m29891a(c5120b);
                                            if (!c5120b.isUnsubscribed()) {
                                                this.f23003j = true;
                                                dtp.m29331a(c5120b);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable a2) {
                                    dud.m29409b(a2);
                                    m29452b(a2);
                                    return;
                                }
                            }
                        }
                        a2 = dwu.m29655a(this.f23000g);
                        if (!dwu.m29656a(a2)) {
                            this.f22994a.onError(a2);
                            return;
                        }
                        return;
                    }
                    if (this.f22999f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        void m29452b(Throwable th) {
            unsubscribe();
            if (dwu.m29657a(this.f23000g, th)) {
                Throwable a = dwu.m29655a(this.f23000g);
                if (!dwu.m29656a(a)) {
                    this.f22994a.onError(a);
                    return;
                }
                return;
            }
            m29449a(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29453a((dtv) obj);
    }

    public dux(dtp<? extends T> dtp, duo<? super T, ? extends dtp<? extends R>> duo, int i, int i2) {
        this.f23004a = dtp;
        this.f23005b = duo;
        this.f23006c = i;
        this.f23007d = i2;
    }

    /* renamed from: a */
    public void m29453a(dtv<? super R> dtv) {
        dtv dyc;
        if (this.f23007d == 0) {
            dyc = new dyc(dtv);
        } else {
            dtv<? super R> dtv2 = dtv;
        }
        final dtv c5121c = new C5121c(dyc, this.f23005b, this.f23006c, this.f23007d);
        dtv.add(c5121c);
        dtv.add(c5121c.f23001h);
        dtv.setProducer(new dtr(this) {
            /* renamed from: b */
            final /* synthetic */ dux f22988b;

            public void request(long j) {
                c5121c.m29447a(j);
            }
        });
        if (!dtv.isUnsubscribed()) {
            this.f23004a.m29331a(c5121c);
        }
    }
}
