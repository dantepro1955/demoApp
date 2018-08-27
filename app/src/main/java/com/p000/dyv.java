package com.p000;

/* compiled from: SerialSubscription */
/* renamed from: dyv */
public final class dyv implements dtw {
    /* renamed from: a */
    final dwp f23524a = new dwp();

    public boolean isUnsubscribed() {
        return this.f23524a.isUnsubscribed();
    }

    public void unsubscribe() {
        this.f23524a.unsubscribe();
    }

    /* renamed from: a */
    public void m29891a(dtw dtw) {
        if (dtw == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f23524a.m29650a(dtw);
    }
}
