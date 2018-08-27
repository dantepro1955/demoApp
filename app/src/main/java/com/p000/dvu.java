package com.p000;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p000.dtp.C5093b;

/* compiled from: OperatorTakeLast */
/* renamed from: dvu */
public final class dvu<T> implements C5093b<T, T> {
    /* renamed from: a */
    final int f23192a;

    /* compiled from: OperatorTakeLast */
    /* renamed from: dvu$a */
    static final class C5168a<T> extends dtv<T> implements duo<Object, T> {
        /* renamed from: a */
        final dtv<? super T> f23188a;
        /* renamed from: b */
        final AtomicLong f23189b = new AtomicLong();
        /* renamed from: c */
        final ArrayDeque<Object> f23190c = new ArrayDeque();
        /* renamed from: d */
        final int f23191d;

        public C5168a(dtv<? super T> dtv, int i) {
            this.f23188a = dtv;
            this.f23191d = i;
        }

        public void onNext(T t) {
            if (this.f23190c.size() == this.f23191d) {
                this.f23190c.poll();
            }
            this.f23190c.offer(duw.m29441a((Object) t));
        }

        public void onError(Throwable th) {
            this.f23190c.clear();
            this.f23188a.onError(th);
        }

        public void onCompleted() {
            dus.m29422a(this.f23189b, this.f23190c, this.f23188a, this);
        }

        /* renamed from: a */
        public T mo4103a(Object obj) {
            return duw.m29445c(obj);
        }

        /* renamed from: a */
        void m29557a(long j) {
            if (j > 0) {
                dus.m29424a(this.f23189b, j, this.f23190c, this.f23188a, this);
            }
        }
    }

    public dvu(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("count cannot be negative");
        }
        this.f23192a = i;
    }

    /* renamed from: a */
    public dtv<? super T> m29558a(dtv<? super T> dtv) {
        final dtv<? super T> c5168a = new C5168a(dtv, this.f23192a);
        dtv.add(c5168a);
        dtv.setProducer(new dtr(this) {
            /* renamed from: b */
            final /* synthetic */ dvu f23187b;

            public void request(long j) {
                c5168a.m29557a(j);
            }
        });
        return c5168a;
    }
}
