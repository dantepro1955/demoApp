package com.p000;

/* compiled from: ActionObserver */
/* renamed from: dwr */
public final class dwr<T> implements dtq<T> {
    /* renamed from: a */
    final dul<? super T> f23339a;
    /* renamed from: b */
    final dul<? super Throwable> f23340b;
    /* renamed from: c */
    final duk f23341c;

    public dwr(dul<? super T> dul, dul<? super Throwable> dul2, duk duk) {
        this.f23339a = dul;
        this.f23340b = dul2;
        this.f23341c = duk;
    }

    public void onNext(T t) {
        this.f23339a.call(t);
    }

    public void onError(Throwable th) {
        this.f23340b.call(th);
    }

    public void onCompleted() {
        this.f23341c.mo4643a();
    }
}
