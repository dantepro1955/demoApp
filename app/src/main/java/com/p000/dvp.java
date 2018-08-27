package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtl.C5080d;
import p000.dtp.C5093b;
import p000.dwt.C5152a;

/* compiled from: OperatorOnBackpressureBuffer */
/* renamed from: dvp */
public class dvp<T> implements C5093b<T, T> {
    /* renamed from: a */
    private final Long f23144a = null;
    /* renamed from: b */
    private final duk f23145b = null;
    /* renamed from: c */
    private final C5080d f23146c = dtl.f22906b;

    /* compiled from: OperatorOnBackpressureBuffer */
    /* renamed from: dvp$a */
    static final class C5153a<T> extends dtv<T> implements C5152a {
        /* renamed from: a */
        private final ConcurrentLinkedQueue<Object> f23136a = new ConcurrentLinkedQueue();
        /* renamed from: b */
        private final AtomicLong f23137b;
        /* renamed from: c */
        private final dtv<? super T> f23138c;
        /* renamed from: d */
        private final AtomicBoolean f23139d = new AtomicBoolean(false);
        /* renamed from: e */
        private final dwt f23140e;
        /* renamed from: f */
        private final duk f23141f;
        /* renamed from: g */
        private final C5080d f23142g;

        public C5153a(dtv<? super T> dtv, Long l, duk duk, C5080d c5080d) {
            this.f23138c = dtv;
            this.f23137b = l != null ? new AtomicLong(l.longValue()) : null;
            this.f23141f = duk;
            this.f23140e = new dwt(this);
            this.f23142g = c5080d;
        }

        public void onStart() {
            request(Clock.MAX_TIME);
        }

        public void onCompleted() {
            if (!this.f23139d.get()) {
                this.f23140e.m29652a();
            }
        }

        public void onError(Throwable th) {
            if (!this.f23139d.get()) {
                this.f23140e.m29653a(th);
            }
        }

        public void onNext(T t) {
            if (m29530d()) {
                this.f23136a.offer(duw.m29441a((Object) t));
                this.f23140e.m29654b();
            }
        }

        /* renamed from: a */
        public boolean mo4658a(Object obj) {
            return duw.m29443a(this.f23138c, obj);
        }

        /* renamed from: a */
        public void mo4657a(Throwable th) {
            if (th != null) {
                this.f23138c.onError(th);
            } else {
                this.f23138c.onCompleted();
            }
        }

        /* renamed from: a */
        public Object mo4656a() {
            return this.f23136a.peek();
        }

        /* renamed from: b */
        public Object mo4659b() {
            Object poll = this.f23136a.poll();
            if (!(this.f23137b == null || poll == null)) {
                this.f23137b.incrementAndGet();
            }
            return poll;
        }

        /* renamed from: d */
        private boolean m29530d() {
            if (this.f23137b == null) {
                return true;
            }
            long j;
            do {
                j = this.f23137b.get();
                if (j <= 0) {
                    boolean z;
                    try {
                        z = this.f23142g.mo4634a() && mo4659b() != null;
                    } catch (Throwable e) {
                        if (this.f23139d.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f23138c.onError(e);
                        }
                        z = false;
                    }
                    if (this.f23141f != null) {
                        try {
                            this.f23141f.mo4643a();
                        } catch (Throwable e2) {
                            dud.m29409b(e2);
                            this.f23140e.m29653a(e2);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.f23137b.compareAndSet(j, j - 1));
            return true;
        }

        /* renamed from: c */
        protected dtr m29535c() {
            return this.f23140e;
        }
    }

    /* compiled from: OperatorOnBackpressureBuffer */
    /* renamed from: dvp$b */
    static final class C5154b {
        /* renamed from: a */
        static final dvp<?> f23143a = new dvp();
    }

    /* renamed from: a */
    public static <T> dvp<T> m29536a() {
        return C5154b.f23143a;
    }

    dvp() {
    }

    /* renamed from: a */
    public dtv<? super T> m29537a(dtv<? super T> dtv) {
        dtv<? super T> c5153a = new C5153a(dtv, this.f23144a, this.f23145b, this.f23146c);
        dtv.add(c5153a);
        dtv.setProducer(c5153a.m29535c());
        return c5153a;
    }
}
