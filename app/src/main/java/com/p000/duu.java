package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DeferredScalarSubscriber */
/* renamed from: duu */
public abstract class duu<T, R> extends dtv<T> {
    /* renamed from: a */
    protected final dtv<? super R> f22977a;
    /* renamed from: b */
    protected boolean f22978b;
    /* renamed from: c */
    protected R f22979c;
    /* renamed from: d */
    final AtomicInteger f22980d = new AtomicInteger();

    /* compiled from: DeferredScalarSubscriber */
    /* renamed from: duu$a */
    static final class C5114a implements dtr {
        /* renamed from: a */
        final duu<?, ?> f22976a;

        public C5114a(duu<?, ?> duu) {
            this.f22976a = duu;
        }

        public void request(long j) {
            this.f22976a.m29434a(j);
        }
    }

    public duu(dtv<? super R> dtv) {
        this.f22977a = dtv;
    }

    public void onError(Throwable th) {
        this.f22979c = null;
        this.f22977a.onError(th);
    }

    public void onCompleted() {
        if (this.f22978b) {
            m29436a(this.f22979c);
        } else {
            m29433a();
        }
    }

    /* renamed from: a */
    protected final void m29433a() {
        this.f22977a.onCompleted();
    }

    /* renamed from: a */
    protected final void m29436a(R r) {
        dtv dtv = this.f22977a;
        do {
            int i = this.f22980d.get();
            if (i != 2 && i != 3 && !dtv.isUnsubscribed()) {
                if (i == 1) {
                    dtv.onNext(r);
                    if (!dtv.isUnsubscribed()) {
                        dtv.onCompleted();
                    }
                    this.f22980d.lazySet(3);
                    return;
                }
                this.f22979c = r;
            } else {
                return;
            }
        } while (!this.f22980d.compareAndSet(0, 2));
    }

    /* renamed from: a */
    final void m29434a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        } else if (j != 0) {
            dtv dtv = this.f22977a;
            do {
                int i = this.f22980d.get();
                if (i != 1 && i != 3 && !dtv.isUnsubscribed()) {
                    if (i == 2) {
                        if (this.f22980d.compareAndSet(2, 3)) {
                            dtv.onNext(this.f22979c);
                            if (!dtv.isUnsubscribed()) {
                                dtv.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f22980d.compareAndSet(0, 1));
        }
    }

    public final void setProducer(dtr dtr) {
        dtr.request(Clock.MAX_TIME);
    }

    /* renamed from: a */
    public final void m29435a(dtp<? extends T> dtp) {
        m29437b();
        dtp.m29331a((dtv) this);
    }

    /* renamed from: b */
    final void m29437b() {
        dtv dtv = this.f22977a;
        dtv.add(this);
        dtv.setProducer(new C5114a(this));
    }
}
