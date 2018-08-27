package com.p000;

import p000.dtp.C5092a;

/* compiled from: OnSubscribeTakeLastOne */
/* renamed from: dvh */
public final class dvh<T> implements C5092a<T> {
    /* renamed from: a */
    final dtp<T> f23075a;

    /* compiled from: OnSubscribeTakeLastOne */
    /* renamed from: dvh$a */
    static final class C5139a<T> extends duu<T, T> {
        /* renamed from: e */
        static final Object f23074e = new Object();

        public C5139a(dtv<? super T> dtv) {
            super(dtv);
            this.c = f23074e;
        }

        public void onNext(T t) {
            this.c = t;
        }

        public void onCompleted() {
            Object obj = this.c;
            if (obj == f23074e) {
                m29433a();
            } else {
                m29436a(obj);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29486a((dtv) obj);
    }

    public dvh(dtp<T> dtp) {
        this.f23075a = dtp;
    }

    /* renamed from: a */
    public void m29486a(dtv<? super T> dtv) {
        new C5139a(dtv).m29435a(this.f23075a);
    }
}
