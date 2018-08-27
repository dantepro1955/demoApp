package com.p000;

/* compiled from: ActionSubscriber */
/* renamed from: dws */
public final class dws<T> extends dtv<T> {
    /* renamed from: a */
    final dul<? super T> f23342a;
    /* renamed from: b */
    final dul<Throwable> f23343b;
    /* renamed from: c */
    final duk f23344c;

    public dws(dul<? super T> dul, dul<Throwable> dul2, duk duk) {
        this.f23342a = dul;
        this.f23343b = dul2;
        this.f23344c = duk;
    }

    public void onNext(T t) {
        this.f23342a.call(t);
    }

    public void onError(Throwable th) {
        this.f23343b.call(th);
    }

    public void onCompleted() {
        this.f23344c.mo4643a();
    }
}
