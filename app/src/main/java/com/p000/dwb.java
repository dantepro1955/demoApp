package com.p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SingleProducer */
/* renamed from: dwb */
public final class dwb<T> extends AtomicBoolean implements dtr {
    private static final long serialVersionUID = -3353584923995471404L;
    /* renamed from: a */
    final dtv<? super T> f23226a;
    /* renamed from: b */
    final T f23227b;

    public dwb(dtv<? super T> dtv, T t) {
        this.f23226a = dtv;
        this.f23227b = t;
    }

    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0 && compareAndSet(false, true)) {
            dtq dtq = this.f23226a;
            if (!dtq.isUnsubscribed()) {
                Object obj = this.f23227b;
                try {
                    dtq.onNext(obj);
                    if (!dtq.isUnsubscribed()) {
                        dtq.onCompleted();
                    }
                } catch (Throwable th) {
                    dud.m29405a(th, dtq, obj);
                }
            }
        }
    }
}
