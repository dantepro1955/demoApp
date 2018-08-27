package com.p000;

import p000.dtp.C5092a;
import p000.dtt.C5095a;
import p000.dvx.C5174a;

/* compiled from: SingleToObservable */
/* renamed from: dvy */
public final class dvy<T> implements C5092a<T> {
    /* renamed from: a */
    final C5095a<T> f23216a;

    public /* synthetic */ void call(Object obj) {
        m29571a((dtv) obj);
    }

    public dvy(C5095a<T> c5095a) {
        this.f23216a = c5095a;
    }

    /* renamed from: a */
    public void m29571a(dtv<? super T> dtv) {
        dtw c5174a = new C5174a(dtv);
        dtv.add(c5174a);
        this.f23216a.call(c5174a);
    }
}
