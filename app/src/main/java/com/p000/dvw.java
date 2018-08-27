package com.p000;

import java.util.NoSuchElementException;
import p000.dtp.C5092a;
import p000.dtt.C5095a;

/* compiled from: SingleFromObservable */
/* renamed from: dvw */
public final class dvw<T> implements C5095a<T> {
    /* renamed from: a */
    final C5092a<T> f23212a;

    /* compiled from: SingleFromObservable */
    /* renamed from: dvw$a */
    static final class C5173a<T> extends dtv<T> {
        /* renamed from: a */
        final dtu<? super T> f23209a;
        /* renamed from: b */
        T f23210b;
        /* renamed from: c */
        int f23211c;

        C5173a(dtu<? super T> dtu) {
            this.f23209a = dtu;
        }

        public void onNext(T t) {
            int i = this.f23211c;
            if (i == 0) {
                this.f23211c = 1;
                this.f23210b = t;
            } else if (i == 1) {
                this.f23211c = 2;
                this.f23209a.mo4661a(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }

        public void onError(Throwable th) {
            if (this.f23211c == 2) {
                dyg.m29850a(th);
                return;
            }
            this.f23210b = null;
            this.f23209a.mo4661a(th);
        }

        public void onCompleted() {
            int i = this.f23211c;
            if (i == 0) {
                this.f23209a.mo4661a(new NoSuchElementException());
            } else if (i == 1) {
                this.f23211c = 2;
                Object obj = this.f23210b;
                this.f23210b = null;
                this.f23209a.mo4660a(obj);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m29566a((dtu) obj);
    }

    public dvw(C5092a<T> c5092a) {
        this.f23212a = c5092a;
    }

    /* renamed from: a */
    public void m29566a(dtu<? super T> dtu) {
        dtw c5173a = new C5173a(dtu);
        dtu.m29353a(c5173a);
        this.f23212a.call(c5173a);
    }
}
