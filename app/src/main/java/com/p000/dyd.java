package com.p000;

/* compiled from: Subscribers */
/* renamed from: dyd */
public final class dyd {
    /* renamed from: a */
    public static <T> dtv<T> m29806a() {
        return dyd.m29807a(dxz.m29784a());
    }

    /* renamed from: a */
    public static <T> dtv<T> m29807a(final dtq<? super T> dtq) {
        return new dtv<T>() {
            public void onCompleted() {
                dtq.onCompleted();
            }

            public void onError(Throwable th) {
                dtq.onError(th);
            }

            public void onNext(T t) {
                dtq.onNext(t);
            }
        };
    }

    /* renamed from: a */
    public static <T> dtv<T> m29808a(final dtv<? super T> dtv) {
        return new dtv<T>(dtv) {
            public void onCompleted() {
                dtv.onCompleted();
            }

            public void onError(Throwable th) {
                dtv.onError(th);
            }

            public void onNext(T t) {
                dtv.onNext(t);
            }
        };
    }
}
