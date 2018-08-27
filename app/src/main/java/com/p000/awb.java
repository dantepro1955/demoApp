package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awb */
public class awb extends axp {
    public awb(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.e) {
            this.e.f4402c = Long.valueOf(-1);
            this.e.f4402c = (Long) this.f.invoke(null, new Object[]{this.b.m6093a()});
        }
    }
}
