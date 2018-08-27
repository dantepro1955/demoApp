package com.p000;

import p000.dtp.C5092a;

/* compiled from: Subject */
/* renamed from: dyq */
public abstract class dyq<T, R> extends dtp<R> implements dtq<T> {
    protected dyq(C5092a<R> c5092a) {
        super(c5092a);
    }

    /* renamed from: k */
    public final dyp<T, R> m29430k() {
        if (getClass() == dyp.class) {
            return (dyp) this;
        }
        return new dyp(this);
    }
}
