package com.p000;

import java.util.NoSuchElementException;
import p000.dtt.C5095a;

/* compiled from: OnSubscribeSingle */
/* renamed from: dvg */
public class dvg<T> implements C5095a<T> {
    /* renamed from: a */
    private final dtp<T> f23073a;

    public /* synthetic */ void call(Object obj) {
        m29485a((dtu) obj);
    }

    public dvg(dtp<T> dtp) {
        this.f23073a = dtp;
    }

    /* renamed from: a */
    public void m29485a(final dtu<? super T> dtu) {
        dtv c51381 = new dtv<T>(this) {
            /* renamed from: b */
            final /* synthetic */ dvg f23069b;
            /* renamed from: c */
            private boolean f23070c;
            /* renamed from: d */
            private boolean f23071d;
            /* renamed from: e */
            private T f23072e;

            public void onStart() {
                request(2);
            }

            public void onCompleted() {
                if (!this.f23070c) {
                    if (this.f23071d) {
                        dtu.mo4660a(this.f23072e);
                    } else {
                        dtu.mo4661a(new NoSuchElementException("Observable emitted no items"));
                    }
                }
            }

            public void onError(Throwable th) {
                dtu.mo4661a(th);
                unsubscribe();
            }

            public void onNext(T t) {
                if (this.f23071d) {
                    this.f23070c = true;
                    dtu.mo4661a(new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.f23071d = true;
                this.f23072e = t;
            }
        };
        dtu.m29353a((dtw) c51381);
        this.f23073a.m29331a(c51381);
    }

    /* renamed from: a */
    public static <T> dvg<T> m29484a(dtp<T> dtp) {
        return new dvg(dtp);
    }
}
