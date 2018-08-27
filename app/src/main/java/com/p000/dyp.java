package com.p000;

import p000.dtp.C5092a;

/* compiled from: SerializedSubject */
/* renamed from: dyp */
public class dyp<T, R> extends dyq<T, R> {
    /* renamed from: b */
    private final dyb<T> f23500b;
    /* renamed from: c */
    private final dyq<T, R> f23501c;

    /* compiled from: SerializedSubject */
    /* renamed from: dyp$1 */
    class C52491 implements C5092a<R> {
        /* renamed from: a */
        final /* synthetic */ dyq f23499a;

        C52491(dyq dyq) {
            this.f23499a = dyq;
        }

        public /* synthetic */ void call(Object obj) {
            m29868a((dtv) obj);
        }

        /* renamed from: a */
        public void m29868a(dtv<? super R> dtv) {
            this.f23499a.m29331a((dtv) dtv);
        }
    }

    public dyp(dyq<T, R> dyq) {
        super(new C52491(dyq));
        this.f23501c = dyq;
        this.f23500b = new dyb(dyq);
    }

    public void onCompleted() {
        this.f23500b.onCompleted();
    }

    public void onError(Throwable th) {
        this.f23500b.onError(th);
    }

    public void onNext(T t) {
        this.f23500b.onNext(t);
    }
}
