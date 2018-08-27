package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5092a;

/* compiled from: OnSubscribeRange */
/* renamed from: dve */
public final class dve implements C5092a<Integer> {
    /* renamed from: a */
    private final int f23034a;
    /* renamed from: b */
    private final int f23035b;

    /* compiled from: OnSubscribeRange */
    /* renamed from: dve$a */
    static final class C5128a extends AtomicLong implements dtr {
        private static final long serialVersionUID = 4114392207069098388L;
        /* renamed from: a */
        private final dtv<? super Integer> f23031a;
        /* renamed from: b */
        private final int f23032b;
        /* renamed from: c */
        private long f23033c;

        C5128a(dtv<? super Integer> dtv, int i, int i2) {
            this.f23031a = dtv;
            this.f23033c = (long) i;
            this.f23032b = i2;
        }

        public void request(long j) {
            if (get() != Clock.MAX_TIME) {
                if (j == Clock.MAX_TIME && compareAndSet(0, Clock.MAX_TIME)) {
                    m29469a();
                } else if (j > 0 && dus.m29421a((AtomicLong) this, j) == 0) {
                    m29470a(j);
                }
            }
        }

        /* renamed from: a */
        void m29470a(long j) {
            long j2 = ((long) this.f23032b) + 1;
            long j3 = this.f23033c;
            dtv dtv = this.f23031a;
            long j4 = 0;
            while (true) {
                if (j4 == j || j3 == j2) {
                    if (!dtv.isUnsubscribed()) {
                        if (j3 == j2) {
                            dtv.onCompleted();
                            return;
                        }
                        j = get();
                        if (j == j4) {
                            this.f23033c = j3;
                            j = addAndGet(-j4);
                            if (j != 0) {
                                j4 = 0;
                            } else {
                                return;
                            }
                        }
                        continue;
                    } else {
                        return;
                    }
                } else if (!dtv.isUnsubscribed()) {
                    dtv.onNext(Integer.valueOf((int) j3));
                    j3++;
                    j4++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        void m29469a() {
            long j = ((long) this.f23032b) + 1;
            dtv dtv = this.f23031a;
            long j2 = this.f23033c;
            while (j2 != j) {
                if (!dtv.isUnsubscribed()) {
                    dtv.onNext(Integer.valueOf((int) j2));
                    j2++;
                } else {
                    return;
                }
            }
            if (!dtv.isUnsubscribed()) {
                dtv.onCompleted();
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29471a((dtv) obj);
    }

    public dve(int i, int i2) {
        this.f23034a = i;
        this.f23035b = i2;
    }

    /* renamed from: a */
    public void m29471a(dtv<? super Integer> dtv) {
        dtv.setProducer(new C5128a(dtv, this.f23034a, this.f23035b));
    }
}
