package com.p000;

import p000.dtp.C5093b;

/* compiled from: OperatorIgnoreElements */
/* renamed from: dvm */
public class dvm<T> implements C5093b<T, T> {

    /* compiled from: OperatorIgnoreElements */
    /* renamed from: dvm$a */
    static final class C5144a {
        /* renamed from: a */
        static final dvm<?> f23092a = new dvm();
    }

    /* renamed from: a */
    public static <T> dvm<T> m29495a() {
        return C5144a.f23092a;
    }

    dvm() {
    }

    /* renamed from: a */
    public dtv<? super T> m29496a(final dtv<? super T> dtv) {
        Object c51431 = new dtv<T>(this) {
            /* renamed from: b */
            final /* synthetic */ dvm f23091b;

            public void onCompleted() {
                dtv.onCompleted();
            }

            public void onError(Throwable th) {
                dtv.onError(th);
            }

            public void onNext(T t) {
            }
        };
        dtv.add(c51431);
        return c51431;
    }
}
