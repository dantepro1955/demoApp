package com.p000;

/* compiled from: SingleSubscriber */
/* renamed from: dtu */
public abstract class dtu<T> implements dtw {
    /* renamed from: a */
    private final dxa f22928a = new dxa();

    /* renamed from: a */
    public abstract void mo4660a(T t);

    /* renamed from: a */
    public abstract void mo4661a(Throwable th);

    /* renamed from: a */
    public final void m29353a(dtw dtw) {
        this.f22928a.m29730a(dtw);
    }

    public final void unsubscribe() {
        this.f22928a.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.f22928a.isUnsubscribed();
    }
}
