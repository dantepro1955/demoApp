package com.p000;

import p000.dtp.C5092a;

/* compiled from: EmptyObservableHolder */
/* renamed from: duv */
public enum duv implements C5092a<Object> {
    INSTANCE;
    
    /* renamed from: b */
    static final dtp<Object> f22982b = null;

    static {
        f22982b = dtp.m29310a(INSTANCE);
    }

    /* renamed from: a */
    public static <T> dtp<T> m29438a() {
        return f22982b;
    }

    /* renamed from: a */
    public void m29439a(dtv<? super Object> dtv) {
        dtv.onCompleted();
    }
}
