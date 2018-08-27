package com.p000;

import p000.dtp.C5092a;

/* compiled from: OnSubscribeDefer */
/* renamed from: duy */
public final class duy<T> implements C5092a<T> {
    /* renamed from: a */
    final dun<? extends dtp<? extends T>> f23008a;

    public /* synthetic */ void call(Object obj) {
        m29454a((dtv) obj);
    }

    public duy(dun<? extends dtp<? extends T>> dun) {
        this.f23008a = dun;
    }

    /* renamed from: a */
    public void m29454a(dtv<? super T> dtv) {
        try {
            ((dtp) this.f23008a.call()).m29331a(dyd.m29808a((dtv) dtv));
        } catch (Throwable th) {
            dud.m29404a(th, (dtq) dtv);
        }
    }
}
