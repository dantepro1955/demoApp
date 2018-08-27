package com.p000;

/* compiled from: Observers */
/* renamed from: dxz */
public final class dxz {
    /* renamed from: a */
    private static final dtq<Object> f23453a = new C52301();

    /* compiled from: Observers */
    /* renamed from: dxz$1 */
    static class C52301 implements dtq<Object> {
        C52301() {
        }

        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            throw new duh(th);
        }

        public final void onNext(Object obj) {
        }
    }

    /* renamed from: a */
    public static <T> dtq<T> m29784a() {
        return f23453a;
    }
}
