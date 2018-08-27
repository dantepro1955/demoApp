package com.p000;

/* compiled from: Functions */
/* renamed from: dur */
public final class dur {
    /* renamed from: a */
    public static <T0, T1, R> duq<R> m29419a(final dup<? super T0, ? super T1, ? extends R> dup) {
        return new duq<R>() {
            /* renamed from: a */
            public R mo4649a(Object... objArr) {
                if (objArr.length == 2) {
                    return dup.mo4116a(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Func2 expecting 2 arguments.");
            }
        };
    }
}
