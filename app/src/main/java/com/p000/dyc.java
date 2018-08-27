package com.p000;

/* compiled from: SerializedSubscriber */
/* renamed from: dyc */
public class dyc<T> extends dtv<T> {
    /* renamed from: a */
    private final dtq<T> f23463a;

    public dyc(dtv<? super T> dtv) {
        this(dtv, true);
    }

    public dyc(dtv<? super T> dtv, boolean z) {
        super(dtv, z);
        this.f23463a = new dyb(dtv);
    }

    public void onCompleted() {
        this.f23463a.onCompleted();
    }

    public void onError(Throwable th) {
        this.f23463a.onError(th);
    }

    public void onNext(T t) {
        this.f23463a.onNext(t);
    }
}
