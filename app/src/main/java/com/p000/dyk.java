package com.p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: RxJavaSchedulersHook */
/* renamed from: dyk */
public class dyk {
    /* renamed from: a */
    private static final dyk f16855a = new dyk();

    /* renamed from: a */
    public static dts m21114a() {
        return dyk.m21115a(new dwy("RxComputationScheduler-"));
    }

    /* renamed from: a */
    public static dts m21115a(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new dwd(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: b */
    public static dts m21116b() {
        return dyk.m21117b(new dwy("RxIoScheduler-"));
    }

    /* renamed from: b */
    public static dts m21117b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new dwc(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: c */
    public static dts m21118c() {
        return dyk.m21119c(new dwy("RxNewThreadScheduler-"));
    }

    /* renamed from: c */
    public static dts m21119c(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new dwi(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: d */
    public dts m21122d() {
        return null;
    }

    /* renamed from: e */
    public dts m21123e() {
        return null;
    }

    /* renamed from: f */
    public dts m21124f() {
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public duk m21121a(duk duk) {
        return duk;
    }

    /* renamed from: g */
    public static dyk m21120g() {
        return f16855a;
    }
}
