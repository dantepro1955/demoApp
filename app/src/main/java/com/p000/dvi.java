package com.p000;

import p000.dtp.C5092a;

/* compiled from: OnSubscribeThrow */
/* renamed from: dvi */
public final class dvi<T> implements C5092a<T> {
    /* renamed from: a */
    private final Throwable f23076a;

    public /* synthetic */ void call(Object obj) {
        m29487a((dtv) obj);
    }

    public dvi(Throwable th) {
        this.f23076a = th;
    }

    /* renamed from: a */
    public void m29487a(dtv<? super T> dtv) {
        dtv.onError(this.f23076a);
    }
}
