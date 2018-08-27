package com.p000;

import p000.dtp.C5092a;

/* compiled from: OnSubscribeFilter */
/* renamed from: dva */
public final class dva<T> implements C5092a<T> {
    /* renamed from: a */
    final dtp<T> f23018a;
    /* renamed from: b */
    final duo<? super T, Boolean> f23019b;

    /* compiled from: OnSubscribeFilter */
    /* renamed from: dva$a */
    static final class C5125a<T> extends dtv<T> {
        /* renamed from: a */
        final dtv<? super T> f23015a;
        /* renamed from: b */
        final duo<? super T, Boolean> f23016b;
        /* renamed from: c */
        boolean f23017c;

        public C5125a(dtv<? super T> dtv, duo<? super T, Boolean> duo) {
            this.f23015a = dtv;
            this.f23016b = duo;
            request(0);
        }

        public void onNext(T t) {
            try {
                if (((Boolean) this.f23016b.mo4103a(t)).booleanValue()) {
                    this.f23015a.onNext(t);
                } else {
                    request(1);
                }
            } catch (Throwable th) {
                dud.m29409b(th);
                unsubscribe();
                onError(dui.m29414a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f23017c) {
                dyg.m29850a(th);
                return;
            }
            this.f23017c = true;
            this.f23015a.onError(th);
        }

        public void onCompleted() {
            if (!this.f23017c) {
                this.f23015a.onCompleted();
            }
        }

        public void setProducer(dtr dtr) {
            super.setProducer(dtr);
            this.f23015a.setProducer(dtr);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29463a((dtv) obj);
    }

    public dva(dtp<T> dtp, duo<? super T, Boolean> duo) {
        this.f23018a = dtp;
        this.f23019b = duo;
    }

    /* renamed from: a */
    public void m29463a(dtv<? super T> dtv) {
        dtv c5125a = new C5125a(dtv, this.f23019b);
        dtv.add(c5125a);
        this.f23018a.m29331a(c5125a);
    }
}
