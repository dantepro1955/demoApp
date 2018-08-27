package com.p000;

import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;

/* renamed from: ckw */
final /* synthetic */ class ckw implements Interceptor {
    /* renamed from: a */
    private static final ckw f9619a = new ckw();

    private ckw() {
    }

    /* renamed from: a */
    public static Interceptor m14216a() {
        return f9619a;
    }

    public Response intercept(Chain chain) {
        return ckv.m14213a(chain);
    }
}
