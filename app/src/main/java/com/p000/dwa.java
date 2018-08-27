package com.p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SingleDelayedProducer */
/* renamed from: dwa */
public final class dwa<T> extends AtomicInteger implements dtr {
    private static final long serialVersionUID = -2873467947112093874L;
    /* renamed from: a */
    final dtv<? super T> f23224a;
    /* renamed from: b */
    T f23225b;

    public dwa(dtv<? super T> dtv) {
        this.f23224a = dtv;
    }

    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0) {
            int i;
            while (true) {
                i = get();
                if (i != 0) {
                    break;
                } else if (compareAndSet(0, 2)) {
                    return;
                }
            }
            if (i == 1 && compareAndSet(1, 3)) {
                dwa.m29580a(this.f23224a, this.f23225b);
            }
        }
    }

    /* renamed from: a */
    public void m29581a(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.f23225b = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                dwa.m29580a(this.f23224a, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    /* renamed from: a */
    private static <T> void m29580a(dtv<? super T> dtv, T t) {
        if (!dtv.isUnsubscribed()) {
            try {
                dtv.onNext(t);
                if (!dtv.isUnsubscribed()) {
                    dtv.onCompleted();
                }
            } catch (Throwable th) {
                dud.m29405a(th, dtv, t);
            }
        }
    }
}
