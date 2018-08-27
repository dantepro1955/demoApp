package com.p000;

import p000.dtp.C5092a;

/* compiled from: OnSubscribeMap */
/* renamed from: dvd */
public final class dvd<T, R> implements C5092a<R> {
    /* renamed from: a */
    final dtp<T> f23029a;
    /* renamed from: b */
    final duo<? super T, ? extends R> f23030b;

    /* compiled from: OnSubscribeMap */
    /* renamed from: dvd$a */
    static final class C5127a<T, R> extends dtv<T> {
        /* renamed from: a */
        final dtv<? super R> f23026a;
        /* renamed from: b */
        final duo<? super T, ? extends R> f23027b;
        /* renamed from: c */
        boolean f23028c;

        public C5127a(dtv<? super R> dtv, duo<? super T, ? extends R> duo) {
            this.f23026a = dtv;
            this.f23027b = duo;
        }

        public void onNext(T t) {
            try {
                this.f23026a.onNext(this.f23027b.mo4103a(t));
            } catch (Throwable th) {
                dud.m29409b(th);
                unsubscribe();
                onError(dui.m29414a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f23028c) {
                dyg.m29850a(th);
                return;
            }
            this.f23028c = true;
            this.f23026a.onError(th);
        }

        public void onCompleted() {
            if (!this.f23028c) {
                this.f23026a.onCompleted();
            }
        }

        public void setProducer(dtr dtr) {
            this.f23026a.setProducer(dtr);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29468a((dtv) obj);
    }

    public dvd(dtp<T> dtp, duo<? super T, ? extends R> duo) {
        this.f23029a = dtp;
        this.f23030b = duo;
    }

    /* renamed from: a */
    public void m29468a(dtv<? super R> dtv) {
        dtv c5127a = new C5127a(dtv, this.f23030b);
        dtv.add(c5127a);
        this.f23029a.m29331a(c5127a);
    }
}
