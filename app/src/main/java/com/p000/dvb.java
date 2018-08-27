package com.p000;

import com.facebook.common.time.Clock;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5092a;

/* compiled from: OnSubscribeFromArray */
/* renamed from: dvb */
public final class dvb<T> implements C5092a<T> {
    /* renamed from: a */
    final T[] f23023a;

    /* compiled from: OnSubscribeFromArray */
    /* renamed from: dvb$a */
    static final class C5126a<T> extends AtomicLong implements dtr {
        private static final long serialVersionUID = 3534218984725836979L;
        /* renamed from: a */
        final dtv<? super T> f23020a;
        /* renamed from: b */
        final T[] f23021b;
        /* renamed from: c */
        int f23022c;

        public C5126a(dtv<? super T> dtv, T[] tArr) {
            this.f23020a = dtv;
            this.f23021b = tArr;
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j == Clock.MAX_TIME) {
                if (dus.m29421a((AtomicLong) this, j) == 0) {
                    m29464a();
                }
            } else if (j != 0 && dus.m29421a((AtomicLong) this, j) == 0) {
                m29465a(j);
            }
        }

        /* renamed from: a */
        void m29464a() {
            dtv dtv = this.f23020a;
            Object[] objArr = this.f23021b;
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (!dtv.isUnsubscribed()) {
                    dtv.onNext(obj);
                    i++;
                } else {
                    return;
                }
            }
            if (!dtv.isUnsubscribed()) {
                dtv.onCompleted();
            }
        }

        /* renamed from: a */
        void m29465a(long j) {
            dtv dtv = this.f23020a;
            Object[] objArr = this.f23021b;
            int length = objArr.length;
            int i = this.f23022c;
            long j2 = 0;
            while (true) {
                if (j == 0 || i == length) {
                    j = get() + j2;
                    if (j == 0) {
                        this.f23022c = i;
                        j = addAndGet(j2);
                        if (j != 0) {
                            j2 = 0;
                        } else {
                            return;
                        }
                    }
                    continue;
                } else if (!dtv.isUnsubscribed()) {
                    dtv.onNext(objArr[i]);
                    i++;
                    if (i == length) {
                        break;
                    }
                    j--;
                    j2--;
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
        m29466a((dtv) obj);
    }

    public dvb(T[] tArr) {
        this.f23023a = tArr;
    }

    /* renamed from: a */
    public void m29466a(dtv<? super T> dtv) {
        dtv.setProducer(new C5126a(dtv, this.f23023a));
    }
}
