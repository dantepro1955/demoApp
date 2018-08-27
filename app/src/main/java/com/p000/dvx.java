package com.p000;

import p000.dtp.C5093b;
import p000.dtt.C5095a;
import p000.dvw.C5173a;

/* compiled from: SingleLiftObservableOperator */
/* renamed from: dvx */
public final class dvx<T, R> implements C5095a<R> {
    /* renamed from: a */
    final C5095a<T> f23214a;
    /* renamed from: b */
    final C5093b<? extends R, ? super T> f23215b;

    /* compiled from: SingleLiftObservableOperator */
    /* renamed from: dvx$a */
    static final class C5174a<T> extends dtu<T> {
        /* renamed from: a */
        final dtv<? super T> f23213a;

        C5174a(dtv<? super T> dtv) {
            this.f23213a = dtv;
        }

        /* renamed from: a */
        public void mo4660a(T t) {
            this.f23213a.setProducer(new dwb(this.f23213a, t));
        }

        /* renamed from: a */
        public void mo4661a(Throwable th) {
            this.f23213a.onError(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29570a((dtu) obj);
    }

    /* renamed from: a */
    public void m29570a(dtu<? super R> dtu) {
        dtw c5173a = new C5173a(dtu);
        dtu.m29353a(c5173a);
        try {
            dtv dtv = (dtv) dyg.m29851b(this.f23215b).mo4103a(c5173a);
            dtu a = dvx.m29569a(dtv);
            dtv.onStart();
            this.f23214a.call(a);
        } catch (Throwable th) {
            dud.m29406a(th, (dtu) dtu);
        }
    }

    /* renamed from: a */
    public static <T> dtu<T> m29569a(dtv<T> dtv) {
        Object c5174a = new C5174a(dtv);
        dtv.add(c5174a);
        return c5174a;
    }
}
