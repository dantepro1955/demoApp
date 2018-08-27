package com.p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: awq */
public class awq {
    /* renamed from: a */
    private static final AtomicReference<awq> f4786a = new AtomicReference();

    awq(Context context) {
    }

    /* renamed from: a */
    public static awq m6166a(Context context) {
        f4786a.compareAndSet(null, new awq(context));
        return (awq) f4786a.get();
    }

    /* renamed from: a */
    public void m6167a(btu btu) {
    }
}
