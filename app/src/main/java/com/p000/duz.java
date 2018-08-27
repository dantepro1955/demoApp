package com.p000;

import java.util.Arrays;
import p000.dtp.C5092a;

/* compiled from: OnSubscribeDoOnEach */
/* renamed from: duz */
public class duz<T> implements C5092a<T> {
    /* renamed from: a */
    private final dtq<? super T> f23012a;
    /* renamed from: b */
    private final dtp<T> f23013b;

    /* compiled from: OnSubscribeDoOnEach */
    /* renamed from: duz$a */
    static final class C5122a<T> extends dtv<T> {
        /* renamed from: a */
        private final dtv<? super T> f23009a;
        /* renamed from: b */
        private final dtq<? super T> f23010b;
        /* renamed from: c */
        private boolean f23011c;

        C5122a(dtv<? super T> dtv, dtq<? super T> dtq) {
            super(dtv);
            this.f23009a = dtv;
            this.f23010b = dtq;
        }

        public void onCompleted() {
            if (!this.f23011c) {
                try {
                    this.f23010b.onCompleted();
                    this.f23011c = true;
                    this.f23009a.onCompleted();
                } catch (Throwable th) {
                    dud.m29404a(th, (dtq) this);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f23011c) {
                dyg.m29850a(th);
                return;
            }
            this.f23011c = true;
            try {
                this.f23010b.onError(th);
                this.f23009a.onError(th);
            } catch (Throwable th2) {
                dud.m29409b(th2);
                this.f23009a.onError(new duc(Arrays.asList(new Throwable[]{th, th2})));
            }
        }

        public void onNext(T t) {
            if (!this.f23011c) {
                try {
                    this.f23010b.onNext(t);
                    this.f23009a.onNext(t);
                } catch (Throwable th) {
                    dud.m29405a(th, this, t);
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29455a((dtv) obj);
    }

    public duz(dtp<T> dtp, dtq<? super T> dtq) {
        this.f23013b = dtp;
        this.f23012a = dtq;
    }

    /* renamed from: a */
    public void m29455a(dtv<? super T> dtv) {
        this.f23013b.m29331a(new C5122a(dtv, this.f23012a));
    }
}
