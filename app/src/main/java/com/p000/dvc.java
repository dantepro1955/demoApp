package com.p000;

import p000.dtp.C5092a;
import p000.dtp.C5093b;

/* compiled from: OnSubscribeLift */
/* renamed from: dvc */
public final class dvc<T, R> implements C5092a<R> {
    /* renamed from: a */
    final C5092a<T> f23024a;
    /* renamed from: b */
    final C5093b<? extends R, ? super T> f23025b;

    public /* synthetic */ void call(Object obj) {
        m29467a((dtv) obj);
    }

    public dvc(C5092a<T> c5092a, C5093b<? extends R, ? super T> c5093b) {
        this.f23024a = c5092a;
        this.f23025b = c5093b;
    }

    /* renamed from: a */
    public void m29467a(dtv<? super R> dtv) {
        dtv dtv2;
        try {
            dtv2 = (dtv) dyg.m29844a(this.f23025b).mo4103a(dtv);
            dtv2.onStart();
            this.f23024a.call(dtv2);
        } catch (Throwable th) {
            dud.m29409b(th);
            dtv.onError(th);
        }
    }
}
